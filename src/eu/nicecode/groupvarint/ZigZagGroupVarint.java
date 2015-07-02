/*
 * Copyright 2014 Matteo Catena
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
public class ZigZagGroupVarint {

	private GroupVarint groupVarint;
	
	public ZigZagGroupVarint() {
		
		groupVarint = new GroupVarint();
	}

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
	public final int compress(int[] in, int inOffset, int length, byte[] out,
			int outOffset) {

		for (int i = 0; i < length; i++)
			in[inOffset + i] = zig(in[inOffset + i]);
		return groupVarint.compress(in, inOffset, length, out, outOffset);
	}

	/**
	 * See {@link GroupVarint#uncompress(byte[], int, int[], int, int)}
	 * 
	 * @param in
	 * @param inOffset
	 * @param out
	 * @param outOffset
	 * @param length
	 * @return new offset in in[]
	 */
	public final int uncompress(byte[] in, int inOffset, int[] out,
			int outOffset, int length) {

		int rtn = groupVarint.uncompress(in, inOffset, out, outOffset, length);
		for (int i = 0; i < length; i++)
			out[outOffset + i] = zag(out[outOffset + i]);
		return rtn;
	}

	/** From two's complement to zigzag. */
	private int zig(int n) {
		return (n << 1) ^ (n >> 31);
	}

	/** From zigzag to two's complement. */
	private int zag(int n) {
		return (n >>> 1) ^ -(n & 1);
	}

}
