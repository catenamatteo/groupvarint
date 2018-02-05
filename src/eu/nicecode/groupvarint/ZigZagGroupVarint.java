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


/**
 * A wrapper for GroupVarint which uses zig-zag encoding. Useful when dealing
 * with negatives number, to improve compression ratio.
 * 
 * @author Matteo Catena
 *
 */
public final class ZigZagGroupVarint {

	
	private ZigZagGroupVarint() {}

	/**
	 * See {@link GroupVarint#compress(int[], int, int, byte[], int)} Be
	 * careful!! This method modifies {@code in} content!!
	 * 
	 * @param in
	 * @param inOffset
	 * @param length
	 * @param out
	 * @param outOffset
	 * @return new offset in out[]
	 */
	public static int compress(final int[] in, final int inOffset, final int length, final byte[] out,
			final int outOffset) {

		for (int i = 0; i < length; i++)
			in[inOffset + i] = zig(in[inOffset + i]);
		return GroupVarint.compress(in, inOffset, length, out, outOffset);
	}

	/**
	 * See {@link GroupVarint#decompress(byte[], int, int[], int, int)}
	 * 
	 * @param in
	 * @param inOffset
	 * @param out
	 * @param outOffset
	 * @param num
	 * @return new offset in in[]
	 */
	public static int decompress(final byte[] in, final int inOffset, final int[] out,
			final int outOffset, final int num) {

		int rtn = GroupVarint.decompress(in, inOffset, out, outOffset, num);
		for (int i = 0; i < num; i++)
			out[outOffset + i] = zag(out[outOffset + i]);
		return rtn;
	}

	/** From two's complement to zigzag. */
	private static int zig(final int n) {
		return (n << 1) ^ (n >> 31);
	}

	/** From zigzag to two's complement. */
	private static int zag(final int n) {
		return (n >>> 1) ^ -(n & 1);
	}

}
