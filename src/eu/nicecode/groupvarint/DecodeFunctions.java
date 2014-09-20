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

public class DecodeFunctions {

	public static final int decode(final byte[] in, final int inOffset,
			final int code, final int[] out, final int outOffset) {

		switch (code) {
		case 0:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = 0xFF & in[inOffset + 2];
			out[outOffset + 3] = 0xFF & in[inOffset + 3];
			return 4;
		case 1:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = 0xFF & in[inOffset + 2];
			out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			return 5;
		case 2:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = 0xFF & in[inOffset + 2];
			out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			return 6;
		case 3:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = 0xFF & in[inOffset + 2];
			out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			return 7;
		case 4:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 3] = 0xFF & in[inOffset + 4];
			return 5;
		case 5:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			return 6;
		case 6:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			return 7;
		case 7:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 8:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 9:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 10:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 11:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 12:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 13:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 14:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 15:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = 0xFF & in[inOffset + 1];
			out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 16:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = 0xFF & in[inOffset + 4];
			return 5;
		case 17:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			return 6;
		case 18:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			return 7;
		case 19:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 20:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 21:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 22:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 23:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 24:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 25:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 26:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 27:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 28:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 29:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 30:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 31:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
					| (0xFF & in[inOffset + 2]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 32:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 33:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 34:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 35:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 36:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 37:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 38:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 39:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 40:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 41:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 42:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 43:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 44:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 45:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 46:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 47:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 48:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 49:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 50:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 51:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 52:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 53:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 54:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 55:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 56:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 57:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 58:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 59:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 60:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 61:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 62:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 63:
			out[outOffset + 0] = 0xFF & in[inOffset + 0];
			out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
					| ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 64:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = 0xFF & in[inOffset + 4];
			return 5;
		case 65:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			return 6;
		case 66:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			return 7;
		case 67:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = 0xFF & in[inOffset + 3];
			out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 68:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 69:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 70:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 71:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 72:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 73:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 74:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 75:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 76:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 77:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 78:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 79:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = 0xFF & in[inOffset + 2];
			out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 80:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 81:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 82:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 83:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 84:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 85:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 86:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 87:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 88:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 89:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 90:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 91:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 92:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 93:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 94:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 95:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
					| (0xFF & in[inOffset + 3]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 96:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 97:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 98:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 99:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 100:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 101:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 102:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 103:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 104:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 105:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 106:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 107:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 108:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 109:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 110:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 111:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
					| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 112:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 113:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 114:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 115:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 116:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 117:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 118:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 119:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 120:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 121:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 122:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 123:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 124:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 125:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 126:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 127:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
					| (0xFF & in[inOffset + 1]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
					| ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 128:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = 0xFF & in[inOffset + 5];
			return 6;
		case 129:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			return 7;
		case 130:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			return 8;
		case 131:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = 0xFF & in[inOffset + 4];
			out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 132:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 133:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 134:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 135:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 136:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 137:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 138:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 139:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 140:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 141:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 142:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 143:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = 0xFF & in[inOffset + 3];
			out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 144:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 145:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 146:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 147:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 148:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 149:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 150:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 151:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 152:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 153:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 154:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 155:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 156:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 157:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 158:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 159:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
					| (0xFF & in[inOffset + 4]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 160:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 161:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 162:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 163:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 164:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 165:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 166:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 167:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 168:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 169:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 170:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 171:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 172:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 173:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 174:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 175:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
					| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 176:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 177:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 178:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 179:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 180:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 181:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 182:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 183:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 184:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 185:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 186:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 187:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 188:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = 0xFF & in[inOffset + 11];
			return 12;
		case 189:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 190:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 191:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
					| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
					| ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
					| ((0xFF & in[inOffset + 12]) << 16)
					| ((0xFF & in[inOffset + 13]) << 8)
					| (0xFF & in[inOffset + 14]);
			return 15;
		case 192:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = 0xFF & in[inOffset + 6];
			return 7;
		case 193:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			return 8;
		case 194:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			return 9;
		case 195:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = 0xFF & in[inOffset + 5];
			out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 196:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 197:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 198:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 199:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
					| (0xFF & in[inOffset + 6]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 200:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 201:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 202:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 203:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 204:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 205:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 206:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 207:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = 0xFF & in[inOffset + 4];
			out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
					| ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 208:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = 0xFF & in[inOffset + 7];
			return 8;
		case 209:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			return 9;
		case 210:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			return 10;
		case 211:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = 0xFF & in[inOffset + 6];
			out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 212:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 213:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 214:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 215:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
					| (0xFF & in[inOffset + 7]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 216:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 217:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 218:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 219:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
					| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 220:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 221:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 222:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 223:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
					| (0xFF & in[inOffset + 5]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
					| ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 224:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = 0xFF & in[inOffset + 8];
			return 9;
		case 225:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			return 10;
		case 226:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			return 11;
		case 227:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = 0xFF & in[inOffset + 7];
			out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 228:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 229:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 230:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 231:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
					| (0xFF & in[inOffset + 8]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 232:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 233:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 234:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 235:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
					| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 236:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = 0xFF & in[inOffset + 11];
			return 12;
		case 237:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 238:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 239:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
					| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 24)
					| ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
					| ((0xFF & in[inOffset + 12]) << 16)
					| ((0xFF & in[inOffset + 13]) << 8)
					| (0xFF & in[inOffset + 14]);
			return 15;
		case 240:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = 0xFF & in[inOffset + 8];
			out[outOffset + 3] = 0xFF & in[inOffset + 9];
			return 10;
		case 241:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = 0xFF & in[inOffset + 8];
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
					| (0xFF & in[inOffset + 10]);
			return 11;
		case 242:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = 0xFF & in[inOffset + 8];
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 243:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = 0xFF & in[inOffset + 8];
			out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 24)
					| ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 244:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = 0xFF & in[inOffset + 10];
			return 11;
		case 245:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			return 12;
		case 246:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 16)
					| ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 247:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 8)
					| (0xFF & in[inOffset + 9]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 10]) << 24)
					| ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 248:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = 0xFF & in[inOffset + 11];
			return 12;
		case 249:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 8)
					| (0xFF & in[inOffset + 12]);
			return 13;
		case 250:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 16)
					| ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 251:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 16)
					| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 11]) << 24)
					| ((0xFF & in[inOffset + 12]) << 16)
					| ((0xFF & in[inOffset + 13]) << 8)
					| (0xFF & in[inOffset + 14]);
			return 15;
		case 252:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			out[outOffset + 3] = 0xFF & in[inOffset + 12];
			return 13;
		case 253:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 8)
					| (0xFF & in[inOffset + 13]);
			return 14;
		case 254:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 16)
					| ((0xFF & in[inOffset + 13]) << 8)
					| (0xFF & in[inOffset + 14]);
			return 15;
		case 255:
			out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
					| ((0xFF & in[inOffset + 1]) << 16)
					| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
			out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
					| ((0xFF & in[inOffset + 5]) << 16)
					| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
			out[outOffset + 2] = ((0xFF & in[inOffset + 8]) << 24)
					| ((0xFF & in[inOffset + 9]) << 16)
					| ((0xFF & in[inOffset + 10]) << 8)
					| (0xFF & in[inOffset + 11]);
			out[outOffset + 3] = ((0xFF & in[inOffset + 12]) << 24)
					| ((0xFF & in[inOffset + 13]) << 16)
					| ((0xFF & in[inOffset + 14]) << 8)
					| (0xFF & in[inOffset + 15]);
			return 16;
		default:
			throw new RuntimeException("Wrong code: " + code);
		}
	}


	public static final int readUncompressedInt(byte[] in, int inOffset) {
		
		int i = (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset++] & 0xFF);
		i = (i << 8) | (in[inOffset] & 0xFF);
		
		return i;
	}

}