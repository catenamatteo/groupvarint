/*
 * Copyright 2016 Matteo Catena
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.nicecode.groupvarint;

import java.lang.reflect.Field;
import java.nio.ByteOrder;

import sun.misc.Unsafe;

@SuppressWarnings("restriction")
/**
 * A Java implementation of groupvarint, described by J.Dean in
 * "Challenges in Building Large-Scale Information Retrieval Systems" at WSDM'09
 * 
 * @author Matteo Catena
 * 
 */
public class GroupVarint {

	private final static byte[] NUM_BYTES = { 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3,
			3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	private final static int[] MASKS = { 0xFF, 0xFFFF, 0xFFFFFF, 0xFFFFFFFF };
	private final static boolean IS_LITTLE_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;

	private Unsafe theUnsafe;

	public GroupVarint() {

		Unsafe tmpUnsafe = null;

		try {

			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			tmpUnsafe = (Unsafe) f.get(null);

		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		theUnsafe = tmpUnsafe;
	}

	private int getNumOfBytes(int v) {

		int x = Integer.numberOfLeadingZeros(v);
		return NUM_BYTES[x];
	}

	/**
	 * Compress an int array into a byte array
	 * 
	 * @param in
	 *            the uncompressed int array (origin)
	 * @param inOffset
	 *            {@code in} starting offset
	 * @param length
	 *            the number of ints to be compressed, starting from
	 *            {@code inOffset}
	 * @param out
	 *            the compressed byte array (destination)
	 * @param outOffset
	 *            {@code out} starting offset
	 * @return num of written bytes
	 */
	public int compress(int[] in, int inOffset, int length, byte[] out,
			int outOffset) {

		int cond = length / 4 * 4;

		int writtenInts = 0;
		int writtenBytes = 0;

		while (writtenInts < cond) {

			int nb0 = getNumOfBytes(in[inOffset + writtenInts]);
			int nb1 = getNumOfBytes(in[inOffset + writtenInts + 1]);
			int nb2 = getNumOfBytes(in[inOffset + writtenInts + 2]);
			int nb3 = getNumOfBytes(in[inOffset + writtenInts + 3]);
			byte selector = (byte) (((nb0 - 1) << 6) | ((nb1 - 1) << 4)
					| ((nb2 - 1) << 2) | (nb3 - 1));

			out[outOffset + writtenBytes] = selector;
			writtenBytes += 1;

			writeInt(out, outOffset + writtenBytes, in[inOffset + writtenInts]);
			writtenBytes += nb0;
			writeInt(out, outOffset + writtenBytes, in[inOffset + writtenInts + 1]);
			writtenBytes += nb1;
			writeInt(out, outOffset + writtenBytes, in[inOffset + writtenInts + 2]);
			writtenBytes += nb2;
			writeInt(out, outOffset + writtenBytes, in[inOffset + writtenInts + 3]);
			writtenBytes += nb3;

			writtenInts += 4;
		}

		for (int i = 0; i < length - cond; i++) {

			writeInt(out, outOffset + writtenBytes, in[inOffset + writtenInts]);
			writtenBytes += 4;
			writtenInts += 1;
		}

		return writtenBytes;
	}

	/**
	 * Uncompress a byte array into an int array
	 * 
	 * @param in
	 *            the compressed byte array (origin)
	 * @param inOffset
	 *            {@code in} starting offset
	 * @param out
	 *            the uncompressed int array (destination)
	 * @param outOffset
	 *            {@code out} starting offset
	 * @param length
	 *            number of ints to be decompressed
	 * @return num of read bytes
	 */
	public int decompress(byte[] in, int inOffset,
			int[] out, int outOffset, int length) {

		int cond = length / 4 * 4;

		int readBytes = 0;
		int readInts = 0;

		while (readInts < cond) {

			int selector = 0xFF & in[inOffset + readBytes];
			readBytes += 1;

			int s0 = selector >>> 6;
			int s1 = 0x3 & (selector >>> 4);
			int s2 = 0x3 & (selector >>> 2);
			int s3 = 0x3 & selector;

			out[outOffset + readInts] = readInt(in, inOffset + readBytes) & MASKS[s0];
			readBytes += s0 + 1;
			out[outOffset + readInts + 1] = readInt(in, inOffset + readBytes) & MASKS[s1];
			readBytes += s1 + 1;
			out[outOffset + readInts + 2] = readInt(in, inOffset + readBytes) & MASKS[s2];
			readBytes += s2 + 1;
			out[outOffset + readInts + 3] = readInt(in, inOffset + readBytes) & MASKS[s3];
			readBytes += s3 + 1;
			
			readInts += 4;
		}

		for (int i = 0; i < length - cond; i++) {

			out[outOffset + readInts] = readInt(in, inOffset + readBytes);
			readBytes += 4;
			readInts += 1;
		}

		return readBytes;
	}

	private void writeInt(byte[] out, int outOffset, int v) {

		v = (IS_LITTLE_ENDIAN) ? v : Integer.reverseBytes(v);
		theUnsafe.putInt(out, (long) Unsafe.ARRAY_BYTE_BASE_OFFSET + (outOffset
				* Unsafe.ARRAY_BYTE_INDEX_SCALE), v);

	}

	private int readInt(byte[] in, int inOffset) {
		
		int v = theUnsafe.getInt(in, (long) Unsafe.ARRAY_BYTE_BASE_OFFSET + (inOffset * Unsafe.ARRAY_BYTE_INDEX_SCALE));
		return (IS_LITTLE_ENDIAN) ? v : Integer.reverseBytes(v);
	}

	/**
	 * This method estimates the length of the compressed byte array
	 * 
	 * @param num
	 *            Number of ints in the uncompressed int array
	 * @return Upperbound on the number of bytes in the compressed byte array
	 */
	public static int getCompressedSize(int num) {

		if (num < 4)
			return num * 4;
		else
			return (num / 4) + // selectors
					(num * 4) + // worst case compression
					3 + // some room to read a whole int
					((num % 4) * 4); // remaining int to leave uncompress
	}
}
