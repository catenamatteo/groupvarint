package eu.nicecode.groupvarint.benchmark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import me.lemire.integercompression.ByteIntegerCODEC;
import me.lemire.integercompression.IntWrapper;
import me.lemire.integercompression.VariableByte;
import me.lemire.integercompression.differential.Delta;
import me.lemire.integercompression.differential.IntegratedByteIntegerCODEC;
import me.lemire.integercompression.synth.ClusteredDataGenerator;

/**
 * 
 * Simple class meant to compare the speed of different schemes.
 * 
 * @author Daniel Lemire (edited by Matteo Catena)
 * 
 */
public class Benchmark {

        /**
         * Standard benchmark byte byte-aligned schemes
         * 
         * @param csvLog
         *                Writer for CSV log.
         * @param c
         *                the codec
         * @param data
         *                arrays of input data
         * @param repeat
         *                How many times to repeat the test
         * @param verbose
         *                whether to output result on screen
         */
        private static void testByteCodec(PrintWriter csvLog, int sparsity,
                ByteIntegerCODEC c, int[][] data, int repeat, boolean verbose) {
                if (verbose) {
                        System.out.println("# " + c.toString());
                        System.out
                                .println("# bits per int, compress speed (mis), decompression speed (mis) ");
                }

                int N = data.length;

                int totalSize = 0;
                int maxLength = 0;
                for (int k = 0; k < N; ++k) {
                        totalSize += data[k].length;
                        if (data[k].length > maxLength) {
                                maxLength = data[k].length;
                        }
                }

                byte[] compressBuffer = new byte[8 * maxLength + 1024];
                int[] decompressBuffer = new int[maxLength + 1024];

                // These variables hold time in microseconds (10^-6).
                long compressTime = 0;
                long decompressTime = 0;

                int size = 0;
                IntWrapper inpos = new IntWrapper();
                IntWrapper outpos = new IntWrapper();

                for (int r = 0; r < repeat; ++r) {
                        size = 0;
                        for (int k = 0; k < N; ++k) {
                                int[] backupdata = Arrays.copyOf(data[k],
                                        data[k].length);

                                // compress data.
                                long beforeCompress = System.nanoTime() / 1000;
                                inpos.set(1);
                                outpos.set(0);
                                if (!(c instanceof IntegratedByteIntegerCODEC)) {
                                        Delta.delta(backupdata);
                                }
                                c.compress(backupdata, inpos, backupdata.length
                                        - inpos.get(), compressBuffer, outpos);
                                long afterCompress = System.nanoTime() / 1000;

                                // measure time of compression.
                                compressTime += afterCompress - beforeCompress;
                                final int thiscompsize = outpos.get() + 1;
                                size += thiscompsize;

                                // extract (uncompress) data
                                long beforeDecompress = System.nanoTime() / 1000;
                                inpos.set(0);
                                outpos.set(1);
                                decompressBuffer[0] = backupdata[0];
                                c.uncompress(compressBuffer, inpos,
                                        thiscompsize - 1, decompressBuffer,
                                        outpos);
                                if (!(c instanceof IntegratedByteIntegerCODEC))
                                        Delta.fastinverseDelta(decompressBuffer);
                                long afterDecompress = System.nanoTime() / 1000;

                                // measure time of extraction (uncompression).
                                decompressTime += afterDecompress
                                        - beforeDecompress;
                                if (outpos.get() != data[k].length)
                                        throw new RuntimeException(
                                                "we have a bug (diff length) "
                                                        + c + " expected "
                                                        + data[k].length
                                                        + " got "
                                                        + outpos.get());

                                // verify: compare original array with
                                // compressed and
                                // uncompressed.
                                for (int m = 0; m < outpos.get(); ++m) {
                                        if (decompressBuffer[m] != data[k][m]) {
                                                throw new RuntimeException(
                                                        "we have a bug (actual difference), expected "
                                                                + data[k][m]
                                                                + " found "
                                                                + decompressBuffer[m]
                                                                + " at " + m);
                                        }
                                }
                        }
                }

                if (verbose) {
                        double bitsPerInt = size * 8.0 / totalSize;
                        long compressSpeed = totalSize * repeat
                                / (compressTime);
                        long decompressSpeed = totalSize * repeat
                                / (decompressTime);
                        System.out.println(String.format(
                                "\t%1$.2f\t%2$d\t%3$d", bitsPerInt,
                                compressSpeed, decompressSpeed));
                        csvLog.format("\"%1$s\",%2$d,%3$.2f,%4$d,%5$d\n",
                                c.toString(), sparsity, bitsPerInt,
                                compressSpeed, decompressSpeed);
                        csvLog.flush();
                }
        }

        /**
         * Main method.
         * 
         * @param args
         *                command-line arguments
         * @throws FileNotFoundException when we fail to create a new file
         */
        public static void main(String args[]) throws FileNotFoundException  {
                System.out
                        .println("# benchmark based on the ClusterData model from:");
                System.out.println("# 	 Vo Ngoc Anh and Alistair Moffat. ");
                System.out.println("#	 Index compression using 64-bit words.");
                System.out
                        .println("# 	 Softw. Pract. Exper.40, 2 (February 2010), 131-147. ");
                System.out.println();

                PrintWriter writer = null;
                try {
                        File csvFile = new File(
                                String.format(
                                        "benchmark-%1$tY%1$tm%1$tdT%1$tH%1$tM%1$tS.csv",
                                        System.currentTimeMillis()));
                        writer = new PrintWriter(csvFile);
                        System.out
                                .println("# Results will be written into a CSV file: "
                                        + csvFile.getName());
                        System.out.println();
                        test(writer, 20, 18, 10);
                        System.out.println();
                        System.out
                                .println("Results were written into a CSV file: "
                                        + csvFile.getName());
                } finally {
                        if (writer != null) {
                                writer.close();
                        }
                }
        }

        /**
         * Generate test data.
         * 
         * @param N
         *                How many input arrays to generate
         * @param nbr
         *                How big (in log2) should the arrays be
         * @param sparsity
         *                How sparse test data generated
         */
        private static int[][] generateTestData(ClusteredDataGenerator dataGen,
                int N, int nbr, int sparsity) {
                final int[][] data = new int[N][];
                final int dataSize = (1 << (nbr + sparsity));
                for (int i = 0; i < N; ++i) {
                        data[i] = dataGen.generateClustered((1 << nbr),
                                dataSize);
                }
                return data;
        }

        /**
         * Generates data and calls other tests.
         * 
         * @param csvLog
         *                Writer for CSV log.
         * @param N
         *                How many input arrays to generate
         * @param nbr
         *                how big (in log2) should the arrays be
         * @param repeat
         *                How many times should we repeat tests.
         */
        private static void test(PrintWriter csvLog, int N, int nbr, int repeat) {
                csvLog.format("\"Algorithm\",\"Sparsity\",\"Bits per int\",\"Compress speed (MiS)\",\"Decompress speed (MiS)\"\n");
                ClusteredDataGenerator cdg = new ClusteredDataGenerator();
                final int max_sparsity = 31 - nbr;
                for (int sparsity = 1; sparsity < max_sparsity; ++sparsity) {
                        System.out.println("# sparsity " + sparsity);
                        System.out.println("# generating random data...");
                        int[][] data = generateTestData(cdg, N, nbr, sparsity);
                        System.out.println("# generating random data... ok.");

                        testByteCodec(csvLog, sparsity, new VariableByte(),
                                data, repeat, false);
                        testByteCodec(csvLog, sparsity, new VariableByte(),
                                data, repeat, false);
                        testByteCodec(csvLog, sparsity, new VariableByte(),
                                data, repeat, true);
                        System.out.println();
                        
                        testByteCodec(csvLog, sparsity, new GV(),
                                data, repeat, false);
                        testByteCodec(csvLog, sparsity, new GV(),
                                data, repeat, false);
                        testByteCodec(csvLog, sparsity, new GV(),
                                data, repeat, true);
                        System.out.println();
                }
        }
}