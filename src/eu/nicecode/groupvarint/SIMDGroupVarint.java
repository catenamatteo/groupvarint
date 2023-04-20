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

import jdk.incubator.vector.ByteVector;
import jdk.incubator.vector.VectorMask;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;


public final class SIMDGroupVarint {


	private static final VarHandle LITTLE_ENDIAN_INT = MethodHandles.byteArrayViewVarHandle(int[].class, ByteOrder.LITTLE_ENDIAN);

	private static final VectorMask[] EXPAND_MASK;
	private static final byte[] NUM_BYTES_TO_LOAD;
	private static final VectorMask[] BYTES_TO_LOAD;


	static {
		EXPAND_MASK = new VectorMask[256];
		NUM_BYTES_TO_LOAD = new byte[256];
		BYTES_TO_LOAD = new VectorMask[16];
		for (int a = 0; a < 4; a ++) {
			for (int b = 0; b < 4; b++) {
				for (int c = 0; c < 4; c++) {
					for (int d = 0; d < 4; d++) {
						final int selector = (a << 6) | (b << 4) | (c << 2) | d;
						final int numBytesToLoad = 4 + a + b + c + d;
						final VectorMask<Byte> mask = ByteVector.SPECIES_128.indexInRange(0, a + 1)
							.or(ByteVector.SPECIES_128.indexInRange(-4, b + 1))
							.or(ByteVector.SPECIES_128.indexInRange(-8, c + 1))
							.or(ByteVector.SPECIES_128.indexInRange(-12, d + 1));
						EXPAND_MASK[selector] = mask;
						NUM_BYTES_TO_LOAD[selector] = (byte) numBytesToLoad;
						BYTES_TO_LOAD[numBytesToLoad - 4] = ByteVector.SPECIES_128.indexInRange(0, numBytesToLoad);
					}
				}
			}
		}
	}
	private SIMDGroupVarint() {}

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

		return GroupVarint.compress(in, inOffset, length, out, outOffset);
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

			VectorMask<Byte> byteVectorMask = (VectorMask<Byte>) EXPAND_MASK[selector];
			final int numBytesToLoad = NUM_BYTES_TO_LOAD[selector];

			ByteVector byteVector = ByteVector.fromArray(ByteVector.SPECIES_128, in, inOffset + readBytes, BYTES_TO_LOAD[numBytesToLoad - 4]);
			byteVector.expand(byteVectorMask).reinterpretAsInts().intoArray(out, outOffset + readInts);

			readBytes += numBytesToLoad;
			readInts += 4;
		}

		for (int i = 0; i < length - loopBound; i++) {

			out[outOffset + readInts] = (int) LITTLE_ENDIAN_INT.get(in, inOffset + readBytes);
			readBytes += Integer.BYTES;
			readInts += 1;
		}

		return readBytes;
	}
}
