/*
 * Copyright 2016-2018 Matteo Catena
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

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

/**
 * A Java implementation of groupvarint, described by J.Dean in "Challenges in
 * Building Large-Scale Information Retrieval Systems" at WSDM'09
 * 
 * @author Matteo Catena
 * 
 */
public final class GroupVarint {

	private final static byte[] NUM_BYTES = { 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 1,
			1, 1, 1, 1, 1, 1, 1, 1 };

	private final static int[] MASKS = { 0xFF, 0xFFFF, 0xFFFFFF, 0xFFFFFFFF };

	public static final VarHandle LITTLE_ENDIAN_INT = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.LITTLE_ENDIAN);

	private GroupVarint() {}

	private static int getNumOfBytes(final int v) {
		return NUM_BYTES[Integer.numberOfLeadingZeros(v)];
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
	public static int compress(final int[] in, final int inOffset, final int length, final byte[] out,
			final int outOffset) {

		final int loopBound = length / Integer.BYTES * Integer.BYTES;

		int writtenInts = 0;
		int writtenBytes = 0;

		while (writtenInts < loopBound) {

			final int selectorOffset = outOffset + writtenBytes;
			final int nb0 = getNumOfBytes(in[inOffset + writtenInts]);
			LITTLE_ENDIAN_INT.set(out, outOffset + writtenBytes + 1, in[inOffset + writtenInts]);
			writtenBytes += nb0;
			final int nb1 = getNumOfBytes(in[inOffset + writtenInts + 1]);
			LITTLE_ENDIAN_INT.set(out, outOffset + writtenBytes + 1, in[inOffset + writtenInts + 1]);
			writtenBytes += nb1;
			final int nb2 = getNumOfBytes(in[inOffset + writtenInts + 2]);
			LITTLE_ENDIAN_INT.set(out, outOffset + writtenBytes + 1, in[inOffset + writtenInts + 2]);
			writtenBytes += nb2;
			final int nb3 = getNumOfBytes(in[inOffset + writtenInts + 3]);
			LITTLE_ENDIAN_INT.set(out, outOffset + writtenBytes + 1, in[inOffset + writtenInts + 3]);
			writtenBytes += nb3;
			out[selectorOffset] = (byte) (((nb0 - 1) << 6) | ((nb1 - 1) << 4) | ((nb2 - 1) << 2) | (nb3 - 1));
			writtenBytes += 1;

			writtenInts += 4;
		}

		for (int i = 0; i < length - loopBound; i++) {

			LITTLE_ENDIAN_INT.set(out, outOffset + writtenBytes, in[inOffset + writtenInts]);
			writtenBytes += Integer.BYTES;
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
	public static int decompress(final byte[] in, final int inOffset, final int[] out, final int outOffset,
			final int length) {

		final int loopBound = length / Integer.BYTES * Integer.BYTES;

		int readBytes = 0;
		int readInts = 0;

		while (readInts < loopBound) {

			final int selector = 0xFF & in[inOffset + readBytes];
			readBytes += 1;

			final int s0 = selector >>> 6;
			out[outOffset + readInts] = ((int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes)) & MASKS[s0];
			readBytes += s0 + 1;
			final int s1 = 0x3 & (selector >>> 4);
			out[outOffset + readInts + 1] = ((int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes)) & MASKS[s1];
			readBytes += s1 + 1;
			final int s2 = 0x3 & (selector >>> 2);
			out[outOffset + readInts + 2] = ((int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes)) & MASKS[s2];
			readBytes += s2 + 1;
			final int s3 = 0x3 & selector;
			out[outOffset + readInts + 3] = ((int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes)) & MASKS[s3];
			readBytes += s3 + 1;

			readInts += 4;
		}

		for (int i = 0; i < length - loopBound; i++) {

			out[outOffset + readInts] = (int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes);
			readBytes += Integer.BYTES;
			readInts += 1;
		}

		return readBytes;
	}

	/**
	 * This method estimates the length of the compressed byte array
	 * 
	 * @param num
	 *            Number of ints in the uncompressed int array
	 * @return Upperbound on the number of bytes in the compressed byte array
	 */
	public static int getCompressedSize(final int num) {

		if (num < 4)
			return num * 4;
		else
			return (num / 4) + // selectors
					(num * 4) + // worst case compression
					3 + // some room to read a whole int
					((num % 4) * 4); // remaining int to leave uncompress
	}
}
