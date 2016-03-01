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
 * A Java implementation of groupvarint, described by J.Dean in
 * "Challenges in Building Large-Scale Information Retrieval Systems" at WSDM'09
 * 
 * @author Matteo Catena
 * 
 */
public class GroupVarint {

	static interface EncodeFunction {
		
		void e(int in, byte[] out, int outOffset);		
	}
	
	static interface DecodeFunction {
		
		int d(byte[] in, int inOffset);
		
	}
	
	private EncodeFunction[] encodeFns;
	private DecodeFunction[] decodeFns;
	
	public GroupVarint() {

		
		encodeFns = new EncodeFunction[4];
		decodeFns = new DecodeFunction[4];
		try {

			
			encodeFns[0] = this::encode00;
			encodeFns[1] = this::encode01;
			encodeFns[2] = this::encode10;
			encodeFns[3] = this::encode11;

			decodeFns[0] = this::decode00;
			decodeFns[1] = this::decode01;
			decodeFns[2] = this::decode10;
			decodeFns[3] = this::decode11;

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int getNumOfBytes(final int v) {

		if ((v & 0xFFFFFF00) == 0)
			return 1;
		if ((v & 0xFFFF0000) == 0)
			return 2;
		if ((v & 0xFF000000) == 0)
			return 3;
		return 4;
	}

	private int encode(int in0, int in1, int in2, int in3, byte[] out,
			int outOffset) {

		int c0 = this.getNumOfBytes(in0) - 1;
		int c1 = this.getNumOfBytes(in1) - 1;
		int c2 = this.getNumOfBytes(in2) - 1;
		int c3 = this.getNumOfBytes(in3) - 1;
		byte code = (byte) ((c0 << 6) | (c1 << 4) | (c2 << 2) | c3);

		out[outOffset++] = code;

		try {

			encodeFns[c0].e(in0, out, outOffset);
			outOffset += c0 + 1;
			encodeFns[c1].e(in1, out, outOffset);
			outOffset += c1 + 1;
			encodeFns[c2].e(in2, out, outOffset);
			outOffset += c2 + 1;
			encodeFns[c3].e(in3, out, outOffset);
			outOffset += c3 + 1;

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c0 + c1 + c2 + c3 + 5;

	}

	private void encode00(int in, byte[] out, int outOffset) {

		out[outOffset] = (byte) in;
	}

	private void encode01(int in, byte[] out, int outOffset) {

		out[outOffset] = (byte) (in >>> 8);
		out[outOffset + 1] = (byte) in;
	}

	private void encode10(int in, byte[] out, int outOffset) {

		out[outOffset] = (byte) (in >>> 16);
		out[outOffset + 1] = (byte) (in >>> 8);
		out[outOffset + 2] = (byte) in;
	}

	private void encode11(int in, byte[] out, int outOffset) {

		out[outOffset] = (byte) (in >>> 24);
		out[outOffset + 1] = (byte) (in >>> 16);
		out[outOffset + 2] = (byte) (in >>> 8);
		out[outOffset + 3] = (byte) in;
	}
	
	private void writeUncompressedInt(int in, byte[] out, int outOffset) {

		out[outOffset++] = (byte) ((in >>> 24) & 0xFF);
		out[outOffset++] = (byte) ((in >>> 16) & 0xFF);
		out[outOffset++] = (byte) ((in >>> 8) & 0xFF);
		out[outOffset] = (byte) (in & 0xFF);
	}

	private int decode(byte[] in, int inOffset, int[] out, int outOffset) {

		int code = 0xFF & in[inOffset++];

		int c0 = 0x3 & (code >>> 6);
		int c1 = 0x3 & (code >>> 4);
		int c2 = 0x3 & (code >>> 2);
		int c3 = 0x3 & code;

		try {

			out[outOffset] = decodeFns[c0].d(in, inOffset);
			inOffset += c0 + 1;
			out[outOffset + 1] = decodeFns[c1].d(in, inOffset);
			inOffset += c1 + 1;
			out[outOffset + 2] = decodeFns[c2].d(in, inOffset);
			inOffset += c2 + 1;
			out[outOffset + 3] = decodeFns[c3].d(in, inOffset);
			inOffset += c3 + 1;

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c0 + c1 + c2 + c3 + 5;

	}

	private final int decode00(final byte[] in, final int inOffset) {

		return 0xFF & in[inOffset];
	}

	private final int decode01(final byte[] in, final int inOffset) {

		return ((0xFF & in[inOffset]) << 8) | (0xFF & in[inOffset + 1]);
	}

	private final int decode10(final byte[] in, final int inOffset) {

		return ((0xFF & in[inOffset]) << 16) | ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
	}

	private final int decode11(final byte[] in, final int inOffset) {

		return ((0xFF & in[inOffset]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
	}

	private int readUncompressedInt(byte[] in, int inOffset) {

		int i = (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset] & 0xFF);

		return i;
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
	 * @return new offset in out[]
	 * 
	 */
	public final int compress(int[] in, int inOffset, int length, byte[] out,
			int outOffset) {

		final int cond = length / 4 * 4;

		while (inOffset < cond) {

			outOffset += encode(in[inOffset], in[inOffset + 1],
					in[inOffset + 2], in[inOffset + 3], out, outOffset);
			inOffset += 4;
		}

		for (int i = 0; i < length - cond; i++) {
			
			writeUncompressedInt(in[i + inOffset], out, outOffset);
			outOffset += 4;
		}

		return outOffset;
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
	 *            number of ints to be uncompressed
	 * @return new offset in in[]
	 */
	public final int uncompress(byte[] in, int inOffset, int[] out,
			int outOffset, int length) {

		final int cond = length / 4 * 4;
		while (outOffset < cond) {

			inOffset += decode(in, inOffset, out, outOffset);
			outOffset += 4;
		}

		for (int i = 0; i < length - cond; i++) {

			out[outOffset++] = readUncompressedInt(in, inOffset);
			inOffset += 4;
		}

		return inOffset;
	}

	/**
	 * This method estimates the length of the compressed byte array
	 * 
	 * @param num
	 *            Number of ints in the uncompressed int array
	 * @return Upperbound on the number of bytes in the compressed byte array
	 */
	public static final int getSafeCompressedLength(int num) {

		return (num * 4) + (num / 4) + 12;
	}
}
