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

public class EncodeFunctions {

	// instantiate the lookup table
	private static final int[][][][] M = new int[4][4][4][4];
	static {
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					for (int z = 0; z < 4; z++)
						M[i][j][k][z] = (i << 6) | (j << 4) | (k << 2) | z;
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

	/*
	 * Unfortunately, this big switch seems to be a huge bottleneck! :-(
	 */
	protected final int encode(final int[] in, final int inOffset,
			final byte[] out, final int outOffset) {

		final int m0 = this.getNumOfBytes(in[inOffset]) - 1;
		final int m1 = this.getNumOfBytes(in[inOffset + 1]) - 1;
		final int m2 = this.getNumOfBytes(in[inOffset + 2]) - 1;
		final int m3 = this.getNumOfBytes(in[inOffset + 3]) - 1;
		final int code = M[m0][m1][m2][m3];

		switch (code) {
		case 0:
			return encode0(in, inOffset, code, out, outOffset);
		case 1:
			return encode1(in, inOffset, code, out, outOffset);
		case 2:
			return encode2(in, inOffset, code, out, outOffset);
		case 3:
			return encode3(in, inOffset, code, out, outOffset);
		case 4:
			return encode4(in, inOffset, code, out, outOffset);
		case 5:
			return encode5(in, inOffset, code, out, outOffset);
		case 6:
			return encode6(in, inOffset, code, out, outOffset);
		case 7:
			return encode7(in, inOffset, code, out, outOffset);
		case 8:
			return encode8(in, inOffset, code, out, outOffset);
		case 9:
			return encode9(in, inOffset, code, out, outOffset);
		case 10:
			return encode10(in, inOffset, code, out, outOffset);
		case 11:
			return encode11(in, inOffset, code, out, outOffset);
		case 12:
			return encode12(in, inOffset, code, out, outOffset);
		case 13:
			return encode13(in, inOffset, code, out, outOffset);
		case 14:
			return encode14(in, inOffset, code, out, outOffset);
		case 15:
			return encode15(in, inOffset, code, out, outOffset);
		case 16:
			return encode16(in, inOffset, code, out, outOffset);
		case 17:
			return encode17(in, inOffset, code, out, outOffset);
		case 18:
			return encode18(in, inOffset, code, out, outOffset);
		case 19:
			return encode19(in, inOffset, code, out, outOffset);
		case 20:
			return encode20(in, inOffset, code, out, outOffset);
		case 21:
			return encode21(in, inOffset, code, out, outOffset);
		case 22:
			return encode22(in, inOffset, code, out, outOffset);
		case 23:
			return encode23(in, inOffset, code, out, outOffset);
		case 24:
			return encode24(in, inOffset, code, out, outOffset);
		case 25:
			return encode25(in, inOffset, code, out, outOffset);
		case 26:
			return encode26(in, inOffset, code, out, outOffset);
		case 27:
			return encode27(in, inOffset, code, out, outOffset);
		case 28:
			return encode28(in, inOffset, code, out, outOffset);
		case 29:
			return encode29(in, inOffset, code, out, outOffset);
		case 30:
			return encode30(in, inOffset, code, out, outOffset);
		case 31:
			return encode31(in, inOffset, code, out, outOffset);
		case 32:
			return encode32(in, inOffset, code, out, outOffset);
		case 33:
			return encode33(in, inOffset, code, out, outOffset);
		case 34:
			return encode34(in, inOffset, code, out, outOffset);
		case 35:
			return encode35(in, inOffset, code, out, outOffset);
		case 36:
			return encode36(in, inOffset, code, out, outOffset);
		case 37:
			return encode37(in, inOffset, code, out, outOffset);
		case 38:
			return encode38(in, inOffset, code, out, outOffset);
		case 39:
			return encode39(in, inOffset, code, out, outOffset);
		case 40:
			return encode40(in, inOffset, code, out, outOffset);
		case 41:
			return encode41(in, inOffset, code, out, outOffset);
		case 42:
			return encode42(in, inOffset, code, out, outOffset);
		case 43:
			return encode43(in, inOffset, code, out, outOffset);
		case 44:
			return encode44(in, inOffset, code, out, outOffset);
		case 45:
			return encode45(in, inOffset, code, out, outOffset);
		case 46:
			return encode46(in, inOffset, code, out, outOffset);
		case 47:
			return encode47(in, inOffset, code, out, outOffset);
		case 48:
			return encode48(in, inOffset, code, out, outOffset);
		case 49:
			return encode49(in, inOffset, code, out, outOffset);
		case 50:
			return encode50(in, inOffset, code, out, outOffset);
		case 51:
			return encode51(in, inOffset, code, out, outOffset);
		case 52:
			return encode52(in, inOffset, code, out, outOffset);
		case 53:
			return encode53(in, inOffset, code, out, outOffset);
		case 54:
			return encode54(in, inOffset, code, out, outOffset);
		case 55:
			return encode55(in, inOffset, code, out, outOffset);
		case 56:
			return encode56(in, inOffset, code, out, outOffset);
		case 57:
			return encode57(in, inOffset, code, out, outOffset);
		case 58:
			return encode58(in, inOffset, code, out, outOffset);
		case 59:
			return encode59(in, inOffset, code, out, outOffset);
		case 60:
			return encode60(in, inOffset, code, out, outOffset);
		case 61:
			return encode61(in, inOffset, code, out, outOffset);
		case 62:
			return encode62(in, inOffset, code, out, outOffset);
		case 63:
			return encode63(in, inOffset, code, out, outOffset);
		case 64:
			return encode64(in, inOffset, code, out, outOffset);
		case 65:
			return encode65(in, inOffset, code, out, outOffset);
		case 66:
			return encode66(in, inOffset, code, out, outOffset);
		case 67:
			return encode67(in, inOffset, code, out, outOffset);
		case 68:
			return encode68(in, inOffset, code, out, outOffset);
		case 69:
			return encode69(in, inOffset, code, out, outOffset);
		case 70:
			return encode70(in, inOffset, code, out, outOffset);
		case 71:
			return encode71(in, inOffset, code, out, outOffset);
		case 72:
			return encode72(in, inOffset, code, out, outOffset);
		case 73:
			return encode73(in, inOffset, code, out, outOffset);
		case 74:
			return encode74(in, inOffset, code, out, outOffset);
		case 75:
			return encode75(in, inOffset, code, out, outOffset);
		case 76:
			return encode76(in, inOffset, code, out, outOffset);
		case 77:
			return encode77(in, inOffset, code, out, outOffset);
		case 78:
			return encode78(in, inOffset, code, out, outOffset);
		case 79:
			return encode79(in, inOffset, code, out, outOffset);
		case 80:
			return encode80(in, inOffset, code, out, outOffset);
		case 81:
			return encode81(in, inOffset, code, out, outOffset);
		case 82:
			return encode82(in, inOffset, code, out, outOffset);
		case 83:
			return encode83(in, inOffset, code, out, outOffset);
		case 84:
			return encode84(in, inOffset, code, out, outOffset);
		case 85:
			return encode85(in, inOffset, code, out, outOffset);
		case 86:
			return encode86(in, inOffset, code, out, outOffset);
		case 87:
			return encode87(in, inOffset, code, out, outOffset);
		case 88:
			return encode88(in, inOffset, code, out, outOffset);
		case 89:
			return encode89(in, inOffset, code, out, outOffset);
		case 90:
			return encode90(in, inOffset, code, out, outOffset);
		case 91:
			return encode91(in, inOffset, code, out, outOffset);
		case 92:
			return encode92(in, inOffset, code, out, outOffset);
		case 93:
			return encode93(in, inOffset, code, out, outOffset);
		case 94:
			return encode94(in, inOffset, code, out, outOffset);
		case 95:
			return encode95(in, inOffset, code, out, outOffset);
		case 96:
			return encode96(in, inOffset, code, out, outOffset);
		case 97:
			return encode97(in, inOffset, code, out, outOffset);
		case 98:
			return encode98(in, inOffset, code, out, outOffset);
		case 99:
			return encode99(in, inOffset, code, out, outOffset);
		case 100:
			return encode100(in, inOffset, code, out, outOffset);
		case 101:
			return encode101(in, inOffset, code, out, outOffset);
		case 102:
			return encode102(in, inOffset, code, out, outOffset);
		case 103:
			return encode103(in, inOffset, code, out, outOffset);
		case 104:
			return encode104(in, inOffset, code, out, outOffset);
		case 105:
			return encode105(in, inOffset, code, out, outOffset);
		case 106:
			return encode106(in, inOffset, code, out, outOffset);
		case 107:
			return encode107(in, inOffset, code, out, outOffset);
		case 108:
			return encode108(in, inOffset, code, out, outOffset);
		case 109:
			return encode109(in, inOffset, code, out, outOffset);
		case 110:
			return encode110(in, inOffset, code, out, outOffset);
		case 111:
			return encode111(in, inOffset, code, out, outOffset);
		case 112:
			return encode112(in, inOffset, code, out, outOffset);
		case 113:
			return encode113(in, inOffset, code, out, outOffset);
		case 114:
			return encode114(in, inOffset, code, out, outOffset);
		case 115:
			return encode115(in, inOffset, code, out, outOffset);
		case 116:
			return encode116(in, inOffset, code, out, outOffset);
		case 117:
			return encode117(in, inOffset, code, out, outOffset);
		case 118:
			return encode118(in, inOffset, code, out, outOffset);
		case 119:
			return encode119(in, inOffset, code, out, outOffset);
		case 120:
			return encode120(in, inOffset, code, out, outOffset);
		case 121:
			return encode121(in, inOffset, code, out, outOffset);
		case 122:
			return encode122(in, inOffset, code, out, outOffset);
		case 123:
			return encode123(in, inOffset, code, out, outOffset);
		case 124:
			return encode124(in, inOffset, code, out, outOffset);
		case 125:
			return encode125(in, inOffset, code, out, outOffset);
		case 126:
			return encode126(in, inOffset, code, out, outOffset);
		case 127:
			return encode127(in, inOffset, code, out, outOffset);
		case 128:
			return encode128(in, inOffset, code, out, outOffset);
		case 129:
			return encode129(in, inOffset, code, out, outOffset);
		case 130:
			return encode130(in, inOffset, code, out, outOffset);
		case 131:
			return encode131(in, inOffset, code, out, outOffset);
		case 132:
			return encode132(in, inOffset, code, out, outOffset);
		case 133:
			return encode133(in, inOffset, code, out, outOffset);
		case 134:
			return encode134(in, inOffset, code, out, outOffset);
		case 135:
			return encode135(in, inOffset, code, out, outOffset);
		case 136:
			return encode136(in, inOffset, code, out, outOffset);
		case 137:
			return encode137(in, inOffset, code, out, outOffset);
		case 138:
			return encode138(in, inOffset, code, out, outOffset);
		case 139:
			return encode139(in, inOffset, code, out, outOffset);
		case 140:
			return encode140(in, inOffset, code, out, outOffset);
		case 141:
			return encode141(in, inOffset, code, out, outOffset);
		case 142:
			return encode142(in, inOffset, code, out, outOffset);
		case 143:
			return encode143(in, inOffset, code, out, outOffset);
		case 144:
			return encode144(in, inOffset, code, out, outOffset);
		case 145:
			return encode145(in, inOffset, code, out, outOffset);
		case 146:
			return encode146(in, inOffset, code, out, outOffset);
		case 147:
			return encode147(in, inOffset, code, out, outOffset);
		case 148:
			return encode148(in, inOffset, code, out, outOffset);
		case 149:
			return encode149(in, inOffset, code, out, outOffset);
		case 150:
			return encode150(in, inOffset, code, out, outOffset);
		case 151:
			return encode151(in, inOffset, code, out, outOffset);
		case 152:
			return encode152(in, inOffset, code, out, outOffset);
		case 153:
			return encode153(in, inOffset, code, out, outOffset);
		case 154:
			return encode154(in, inOffset, code, out, outOffset);
		case 155:
			return encode155(in, inOffset, code, out, outOffset);
		case 156:
			return encode156(in, inOffset, code, out, outOffset);
		case 157:
			return encode157(in, inOffset, code, out, outOffset);
		case 158:
			return encode158(in, inOffset, code, out, outOffset);
		case 159:
			return encode159(in, inOffset, code, out, outOffset);
		case 160:
			return encode160(in, inOffset, code, out, outOffset);
		case 161:
			return encode161(in, inOffset, code, out, outOffset);
		case 162:
			return encode162(in, inOffset, code, out, outOffset);
		case 163:
			return encode163(in, inOffset, code, out, outOffset);
		case 164:
			return encode164(in, inOffset, code, out, outOffset);
		case 165:
			return encode165(in, inOffset, code, out, outOffset);
		case 166:
			return encode166(in, inOffset, code, out, outOffset);
		case 167:
			return encode167(in, inOffset, code, out, outOffset);
		case 168:
			return encode168(in, inOffset, code, out, outOffset);
		case 169:
			return encode169(in, inOffset, code, out, outOffset);
		case 170:
			return encode170(in, inOffset, code, out, outOffset);
		case 171:
			return encode171(in, inOffset, code, out, outOffset);
		case 172:
			return encode172(in, inOffset, code, out, outOffset);
		case 173:
			return encode173(in, inOffset, code, out, outOffset);
		case 174:
			return encode174(in, inOffset, code, out, outOffset);
		case 175:
			return encode175(in, inOffset, code, out, outOffset);
		case 176:
			return encode176(in, inOffset, code, out, outOffset);
		case 177:
			return encode177(in, inOffset, code, out, outOffset);
		case 178:
			return encode178(in, inOffset, code, out, outOffset);
		case 179:
			return encode179(in, inOffset, code, out, outOffset);
		case 180:
			return encode180(in, inOffset, code, out, outOffset);
		case 181:
			return encode181(in, inOffset, code, out, outOffset);
		case 182:
			return encode182(in, inOffset, code, out, outOffset);
		case 183:
			return encode183(in, inOffset, code, out, outOffset);
		case 184:
			return encode184(in, inOffset, code, out, outOffset);
		case 185:
			return encode185(in, inOffset, code, out, outOffset);
		case 186:
			return encode186(in, inOffset, code, out, outOffset);
		case 187:
			return encode187(in, inOffset, code, out, outOffset);
		case 188:
			return encode188(in, inOffset, code, out, outOffset);
		case 189:
			return encode189(in, inOffset, code, out, outOffset);
		case 190:
			return encode190(in, inOffset, code, out, outOffset);
		case 191:
			return encode191(in, inOffset, code, out, outOffset);
		case 192:
			return encode192(in, inOffset, code, out, outOffset);
		case 193:
			return encode193(in, inOffset, code, out, outOffset);
		case 194:
			return encode194(in, inOffset, code, out, outOffset);
		case 195:
			return encode195(in, inOffset, code, out, outOffset);
		case 196:
			return encode196(in, inOffset, code, out, outOffset);
		case 197:
			return encode197(in, inOffset, code, out, outOffset);
		case 198:
			return encode198(in, inOffset, code, out, outOffset);
		case 199:
			return encode199(in, inOffset, code, out, outOffset);
		case 200:
			return encode200(in, inOffset, code, out, outOffset);
		case 201:
			return encode201(in, inOffset, code, out, outOffset);
		case 202:
			return encode202(in, inOffset, code, out, outOffset);
		case 203:
			return encode203(in, inOffset, code, out, outOffset);
		case 204:
			return encode204(in, inOffset, code, out, outOffset);
		case 205:
			return encode205(in, inOffset, code, out, outOffset);
		case 206:
			return encode206(in, inOffset, code, out, outOffset);
		case 207:
			return encode207(in, inOffset, code, out, outOffset);
		case 208:
			return encode208(in, inOffset, code, out, outOffset);
		case 209:
			return encode209(in, inOffset, code, out, outOffset);
		case 210:
			return encode210(in, inOffset, code, out, outOffset);
		case 211:
			return encode211(in, inOffset, code, out, outOffset);
		case 212:
			return encode212(in, inOffset, code, out, outOffset);
		case 213:
			return encode213(in, inOffset, code, out, outOffset);
		case 214:
			return encode214(in, inOffset, code, out, outOffset);
		case 215:
			return encode215(in, inOffset, code, out, outOffset);
		case 216:
			return encode216(in, inOffset, code, out, outOffset);
		case 217:
			return encode217(in, inOffset, code, out, outOffset);
		case 218:
			return encode218(in, inOffset, code, out, outOffset);
		case 219:
			return encode219(in, inOffset, code, out, outOffset);
		case 220:
			return encode220(in, inOffset, code, out, outOffset);
		case 221:
			return encode221(in, inOffset, code, out, outOffset);
		case 222:
			return encode222(in, inOffset, code, out, outOffset);
		case 223:
			return encode223(in, inOffset, code, out, outOffset);
		case 224:
			return encode224(in, inOffset, code, out, outOffset);
		case 225:
			return encode225(in, inOffset, code, out, outOffset);
		case 226:
			return encode226(in, inOffset, code, out, outOffset);
		case 227:
			return encode227(in, inOffset, code, out, outOffset);
		case 228:
			return encode228(in, inOffset, code, out, outOffset);
		case 229:
			return encode229(in, inOffset, code, out, outOffset);
		case 230:
			return encode230(in, inOffset, code, out, outOffset);
		case 231:
			return encode231(in, inOffset, code, out, outOffset);
		case 232:
			return encode232(in, inOffset, code, out, outOffset);
		case 233:
			return encode233(in, inOffset, code, out, outOffset);
		case 234:
			return encode234(in, inOffset, code, out, outOffset);
		case 235:
			return encode235(in, inOffset, code, out, outOffset);
		case 236:
			return encode236(in, inOffset, code, out, outOffset);
		case 237:
			return encode237(in, inOffset, code, out, outOffset);
		case 238:
			return encode238(in, inOffset, code, out, outOffset);
		case 239:
			return encode239(in, inOffset, code, out, outOffset);
		case 240:
			return encode240(in, inOffset, code, out, outOffset);
		case 241:
			return encode241(in, inOffset, code, out, outOffset);
		case 242:
			return encode242(in, inOffset, code, out, outOffset);
		case 243:
			return encode243(in, inOffset, code, out, outOffset);
		case 244:
			return encode244(in, inOffset, code, out, outOffset);
		case 245:
			return encode245(in, inOffset, code, out, outOffset);
		case 246:
			return encode246(in, inOffset, code, out, outOffset);
		case 247:
			return encode247(in, inOffset, code, out, outOffset);
		case 248:
			return encode248(in, inOffset, code, out, outOffset);
		case 249:
			return encode249(in, inOffset, code, out, outOffset);
		case 250:
			return encode250(in, inOffset, code, out, outOffset);
		case 251:
			return encode251(in, inOffset, code, out, outOffset);
		case 252:
			return encode252(in, inOffset, code, out, outOffset);
		case 253:
			return encode253(in, inOffset, code, out, outOffset);
		case 254:
			return encode254(in, inOffset, code, out, outOffset);
		case 255:
			return encode255(in, inOffset, code, out, outOffset);
		default:
			throw new RuntimeException("Wrong code: " + code);
		}

	}

	private int encode0(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) in[inOffset + 2];
		out[outOffset + 4] = (byte) in[inOffset + 3];
		return 5;
	}

	private int encode1(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) in[inOffset + 2];
		out[outOffset + 4] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 3];
		return 6;
	}

	private int encode2(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) in[inOffset + 2];
		out[outOffset + 4] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode3(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) in[inOffset + 2];
		out[outOffset + 4] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode4(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) in[inOffset + 3];
		return 6;
	}

	private int encode5(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode6(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode7(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode8(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode9(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode10(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode11(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode12(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode13(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode14(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode15(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) in[inOffset + 1];
		out[outOffset + 3] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode16(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) in[inOffset + 3];
		return 6;
	}

	private int encode17(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode18(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode19(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode20(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode21(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode22(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode23(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode24(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode25(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode26(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode27(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode28(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode29(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode30(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode31(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode32(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode33(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode34(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode35(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode36(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode37(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode38(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode39(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode40(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode41(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode42(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode43(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode44(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode45(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode46(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode47(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode48(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode49(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode50(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode51(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode52(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode53(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode54(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode55(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode56(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode57(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode58(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode59(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode60(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode61(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode62(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode63(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) in[inOffset + 0];
		out[outOffset + 2] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode64(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) in[inOffset + 3];
		return 6;
	}

	private int encode65(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode66(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode67(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) in[inOffset + 2];
		out[outOffset + 5] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode68(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode69(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode70(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode71(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode72(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode73(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode74(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode75(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode76(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode77(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode78(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode79(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) in[inOffset + 1];
		out[outOffset + 4] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode80(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode81(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode82(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode83(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode84(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode85(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode86(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode87(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode88(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode89(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode90(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode91(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode92(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode93(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode94(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode95(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode96(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode97(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode98(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode99(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode100(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode101(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode102(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode103(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode104(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode105(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode106(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode107(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode108(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode109(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode110(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode111(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode112(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode113(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode114(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode115(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode116(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode117(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode118(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode119(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode120(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode121(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode122(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode123(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode124(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode125(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode126(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode127(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 2] = (byte) in[inOffset + 0];
		out[outOffset + 3] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode128(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) in[inOffset + 3];
		return 7;
	}

	private int encode129(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode130(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode131(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) in[inOffset + 2];
		out[outOffset + 6] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode132(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode133(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode134(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode135(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode136(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode137(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode138(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode139(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode140(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode141(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode142(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode143(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) in[inOffset + 1];
		out[outOffset + 5] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode144(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode145(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode146(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode147(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode148(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode149(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode150(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode151(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode152(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode153(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode154(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode155(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode156(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode157(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode158(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode159(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode160(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode161(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode162(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode163(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode164(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode165(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode166(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode167(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode168(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode169(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode170(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode171(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode172(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode173(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode174(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode175(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode176(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode177(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode178(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode179(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode180(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode181(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode182(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode183(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode184(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode185(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode186(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode187(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode188(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode189(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode190(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode191(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 3] = (byte) in[inOffset + 0];
		out[outOffset + 4] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 14] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 15] = (byte) in[inOffset + 3];
		return 16;
	}

	private int encode192(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) in[inOffset + 3];
		return 8;
	}

	private int encode193(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode194(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode195(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) in[inOffset + 2];
		out[outOffset + 7] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode196(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode197(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode198(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode199(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode200(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode201(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode202(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode203(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode204(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode205(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode206(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode207(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) in[inOffset + 1];
		out[outOffset + 6] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode208(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) in[inOffset + 3];
		return 9;
	}

	private int encode209(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode210(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode211(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) in[inOffset + 2];
		out[outOffset + 8] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode212(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode213(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode214(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode215(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode216(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode217(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode218(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode219(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode220(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode221(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode222(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode223(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 6] = (byte) in[inOffset + 1];
		out[outOffset + 7] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode224(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) in[inOffset + 3];
		return 10;
	}

	private int encode225(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode226(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode227(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) in[inOffset + 2];
		out[outOffset + 9] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode228(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode229(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode230(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode231(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode232(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode233(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode234(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode235(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode236(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode237(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode238(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode239(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 7] = (byte) in[inOffset + 1];
		out[outOffset + 8] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 14] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 15] = (byte) in[inOffset + 3];
		return 16;
	}

	private int encode240(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) in[inOffset + 3];
		return 11;
	}

	private int encode241(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode242(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode243(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) in[inOffset + 2];
		out[outOffset + 10] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode244(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) in[inOffset + 3];
		return 12;
	}

	private int encode245(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode246(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode247(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 10] = (byte) in[inOffset + 2];
		out[outOffset + 11] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode248(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) in[inOffset + 3];
		return 13;
	}

	private int encode249(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode250(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode251(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 11] = (byte) in[inOffset + 2];
		out[outOffset + 12] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 14] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 15] = (byte) in[inOffset + 3];
		return 16;
	}

	private int encode252(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 2];
		out[outOffset + 13] = (byte) in[inOffset + 3];
		return 14;
	}

	private int encode253(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 2];
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 14] = (byte) in[inOffset + 3];
		return 15;
	}

	private int encode254(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 2];
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 14] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 15] = (byte) in[inOffset + 3];
		return 16;
	}

	private int encode255(final int[] in, final int inOffset,
			final int code, final byte[] out, final int outOffset) {
		out[outOffset + 0] = (byte) code;
		out[outOffset + 1] = (byte) (in[inOffset + 0] >>> 24);
		out[outOffset + 2] = (byte) (in[inOffset + 0] >>> 16);
		out[outOffset + 3] = (byte) (in[inOffset + 0] >>> 8);
		out[outOffset + 4] = (byte) in[inOffset + 0];
		out[outOffset + 5] = (byte) (in[inOffset + 1] >>> 24);
		out[outOffset + 6] = (byte) (in[inOffset + 1] >>> 16);
		out[outOffset + 7] = (byte) (in[inOffset + 1] >>> 8);
		out[outOffset + 8] = (byte) in[inOffset + 1];
		out[outOffset + 9] = (byte) (in[inOffset + 2] >>> 24);
		out[outOffset + 10] = (byte) (in[inOffset + 2] >>> 16);
		out[outOffset + 11] = (byte) (in[inOffset + 2] >>> 8);
		out[outOffset + 12] = (byte) in[inOffset + 2];
		out[outOffset + 13] = (byte) (in[inOffset + 3] >>> 24);
		out[outOffset + 14] = (byte) (in[inOffset + 3] >>> 16);
		out[outOffset + 15] = (byte) (in[inOffset + 3] >>> 8);
		out[outOffset + 16] = (byte) in[inOffset + 3];
		return 17;
	}

	protected final void writeUncompressedInt(int i, byte[] out, int outOffset) {

		out[outOffset++] = (byte) ((i >>> 24) & 0xFF);
		out[outOffset++] = (byte) ((i >>> 16) & 0xFF);
		out[outOffset++] = (byte) ((i >>> 8) & 0xFF);
		out[outOffset] = (byte) (i & 0xFF);
	}

}