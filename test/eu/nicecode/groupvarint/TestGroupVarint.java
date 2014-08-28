package eu.nicecode.groupvarint;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestGroupVarint {

	@Test
	public void test4() {
		
		int a[] = {1, 2, 3 , 4};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}

	@Test
	public void testMoreThan4() {
		
		int a[] = {1, 2, 3 , 4, 5, 6, 7, 8};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testLessThan4() {
		
		int a[] = {1, 2, 3};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}

	@Test
	public void testMoreThan4LessThan8() {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testBig() {
		
		int a[] = {Integer.MAX_VALUE - 3, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testNegative() {
		
		int a[] = {-1, 0, Integer.MIN_VALUE, Integer.MIN_VALUE-2};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		
		GroupVarint.compress(a, 0, a.length, b, 0);
		GroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testZigZag() {
		
		int a[] = {0, 1, 2, -1, -2, Integer.MAX_VALUE, Integer.MIN_VALUE};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		int support[] = Arrays.copyOf(a, a.length);
		
		ZigZagGroupVarint.compress(support, 0, support.length, b, 0);
		ZigZagGroupVarint.uncompress(b, 0, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testUncompressedOffset() {
		
		int a[] = {1, 2, 3, 4, 5, 6};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)];
		int c[] = new int[a.length];
		c[0] = 1;
		
		GroupVarint.compress(a, 1, a.length - 1, b, 0);
		GroupVarint.uncompress(b, 0, c, 1, a.length - 1);
		
		assertArrayEquals(a, c);
	}
	
	@Test
	public void testCompressedOffset() {
		
		int a[] = {1, 2, 3, 4, 5, 6};
		byte b[] = new byte[GroupVarint.getSafeCompressedLength(a.length)+10];
		int c[] = new int[a.length];
		c[0] = 1;
		
		GroupVarint.compress(a, 0, a.length, b, 10);
		GroupVarint.uncompress(b, 10, c, 0, a.length);
		
		assertArrayEquals(a, c);
	}
	

}
