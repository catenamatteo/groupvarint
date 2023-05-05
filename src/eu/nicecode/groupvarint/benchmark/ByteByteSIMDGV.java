package eu.nicecode.groupvarint.benchmark;

import eu.nicecode.groupvarint.SIMDGroupVarint;
import me.lemire.integercompression.ByteIntegerCODEC;
import me.lemire.integercompression.IntWrapper;

public class ByteByteSIMDGV implements ByteByteCODEC {
	
	private void writeUncompressedInt(int in, byte[] out, int outOffset) {

		out[outOffset++] = (byte) ((in >>> 24) & 0xFF);
		out[outOffset++] = (byte) ((in >>> 16) & 0xFF);
		out[outOffset++] = (byte) ((in >>> 8) & 0xFF);
		out[outOffset] = (byte) (in & 0xFF);
	}
	
	private int readUncompressedInt(byte[] in, int inOffset) {

		int i = (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset] & 0xFF);

		return i;
	}
	
	@Override
	public void compress(int[] in, IntWrapper inpos, int inlength, byte[] out,
			IntWrapper outpos) {

		int inOffset = inpos.get();
		int outOffset = outpos.get();
		
		writeUncompressedInt(inlength, out, outOffset);
		outOffset+=Integer.BYTES;
		
		int offset = SIMDGroupVarint.compress(in, inOffset, inlength, out, outOffset);
		outOffset+=offset;
		inOffset+=inlength;
		
		inpos.set(inOffset);
		outpos.set(outOffset);
	}

	@Override
	public void uncompress(byte[] in, IntWrapper inpos, int inlength, byte[] out, IntWrapper outpos) {
		int inOffset = inpos.get();
		int outOffset = outpos.get();

		int len = readUncompressedInt(in, inOffset);
		inOffset+=Integer.BYTES;

		int offset = SIMDGroupVarint.decompress(in, inOffset, out, outOffset, len);
		inOffset+=offset;
		outOffset+=len * Integer.BYTES;

		inpos.set(inOffset);
		outpos.set(outOffset);
	}
	
	public String toString() {
		
		return "ByteByteSIMDGroupVarint";
	}

}
