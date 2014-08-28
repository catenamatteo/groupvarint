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
			return decode0(in, inOffset, out, outOffset);
		case 1:
			return decode1(in, inOffset, out, outOffset);
		case 2:
			return decode2(in, inOffset, out, outOffset);
		case 3:
			return decode3(in, inOffset, out, outOffset);
		case 4:
			return decode4(in, inOffset, out, outOffset);
		case 5:
			return decode5(in, inOffset, out, outOffset);
		case 6:
			return decode6(in, inOffset, out, outOffset);
		case 7:
			return decode7(in, inOffset, out, outOffset);
		case 8:
			return decode8(in, inOffset, out, outOffset);
		case 9:
			return decode9(in, inOffset, out, outOffset);
		case 10:
			return decode10(in, inOffset, out, outOffset);
		case 11:
			return decode11(in, inOffset, out, outOffset);
		case 12:
			return decode12(in, inOffset, out, outOffset);
		case 13:
			return decode13(in, inOffset, out, outOffset);
		case 14:
			return decode14(in, inOffset, out, outOffset);
		case 15:
			return decode15(in, inOffset, out, outOffset);
		case 16:
			return decode16(in, inOffset, out, outOffset);
		case 17:
			return decode17(in, inOffset, out, outOffset);
		case 18:
			return decode18(in, inOffset, out, outOffset);
		case 19:
			return decode19(in, inOffset, out, outOffset);
		case 20:
			return decode20(in, inOffset, out, outOffset);
		case 21:
			return decode21(in, inOffset, out, outOffset);
		case 22:
			return decode22(in, inOffset, out, outOffset);
		case 23:
			return decode23(in, inOffset, out, outOffset);
		case 24:
			return decode24(in, inOffset, out, outOffset);
		case 25:
			return decode25(in, inOffset, out, outOffset);
		case 26:
			return decode26(in, inOffset, out, outOffset);
		case 27:
			return decode27(in, inOffset, out, outOffset);
		case 28:
			return decode28(in, inOffset, out, outOffset);
		case 29:
			return decode29(in, inOffset, out, outOffset);
		case 30:
			return decode30(in, inOffset, out, outOffset);
		case 31:
			return decode31(in, inOffset, out, outOffset);
		case 32:
			return decode32(in, inOffset, out, outOffset);
		case 33:
			return decode33(in, inOffset, out, outOffset);
		case 34:
			return decode34(in, inOffset, out, outOffset);
		case 35:
			return decode35(in, inOffset, out, outOffset);
		case 36:
			return decode36(in, inOffset, out, outOffset);
		case 37:
			return decode37(in, inOffset, out, outOffset);
		case 38:
			return decode38(in, inOffset, out, outOffset);
		case 39:
			return decode39(in, inOffset, out, outOffset);
		case 40:
			return decode40(in, inOffset, out, outOffset);
		case 41:
			return decode41(in, inOffset, out, outOffset);
		case 42:
			return decode42(in, inOffset, out, outOffset);
		case 43:
			return decode43(in, inOffset, out, outOffset);
		case 44:
			return decode44(in, inOffset, out, outOffset);
		case 45:
			return decode45(in, inOffset, out, outOffset);
		case 46:
			return decode46(in, inOffset, out, outOffset);
		case 47:
			return decode47(in, inOffset, out, outOffset);
		case 48:
			return decode48(in, inOffset, out, outOffset);
		case 49:
			return decode49(in, inOffset, out, outOffset);
		case 50:
			return decode50(in, inOffset, out, outOffset);
		case 51:
			return decode51(in, inOffset, out, outOffset);
		case 52:
			return decode52(in, inOffset, out, outOffset);
		case 53:
			return decode53(in, inOffset, out, outOffset);
		case 54:
			return decode54(in, inOffset, out, outOffset);
		case 55:
			return decode55(in, inOffset, out, outOffset);
		case 56:
			return decode56(in, inOffset, out, outOffset);
		case 57:
			return decode57(in, inOffset, out, outOffset);
		case 58:
			return decode58(in, inOffset, out, outOffset);
		case 59:
			return decode59(in, inOffset, out, outOffset);
		case 60:
			return decode60(in, inOffset, out, outOffset);
		case 61:
			return decode61(in, inOffset, out, outOffset);
		case 62:
			return decode62(in, inOffset, out, outOffset);
		case 63:
			return decode63(in, inOffset, out, outOffset);
		case 64:
			return decode64(in, inOffset, out, outOffset);
		case 65:
			return decode65(in, inOffset, out, outOffset);
		case 66:
			return decode66(in, inOffset, out, outOffset);
		case 67:
			return decode67(in, inOffset, out, outOffset);
		case 68:
			return decode68(in, inOffset, out, outOffset);
		case 69:
			return decode69(in, inOffset, out, outOffset);
		case 70:
			return decode70(in, inOffset, out, outOffset);
		case 71:
			return decode71(in, inOffset, out, outOffset);
		case 72:
			return decode72(in, inOffset, out, outOffset);
		case 73:
			return decode73(in, inOffset, out, outOffset);
		case 74:
			return decode74(in, inOffset, out, outOffset);
		case 75:
			return decode75(in, inOffset, out, outOffset);
		case 76:
			return decode76(in, inOffset, out, outOffset);
		case 77:
			return decode77(in, inOffset, out, outOffset);
		case 78:
			return decode78(in, inOffset, out, outOffset);
		case 79:
			return decode79(in, inOffset, out, outOffset);
		case 80:
			return decode80(in, inOffset, out, outOffset);
		case 81:
			return decode81(in, inOffset, out, outOffset);
		case 82:
			return decode82(in, inOffset, out, outOffset);
		case 83:
			return decode83(in, inOffset, out, outOffset);
		case 84:
			return decode84(in, inOffset, out, outOffset);
		case 85:
			return decode85(in, inOffset, out, outOffset);
		case 86:
			return decode86(in, inOffset, out, outOffset);
		case 87:
			return decode87(in, inOffset, out, outOffset);
		case 88:
			return decode88(in, inOffset, out, outOffset);
		case 89:
			return decode89(in, inOffset, out, outOffset);
		case 90:
			return decode90(in, inOffset, out, outOffset);
		case 91:
			return decode91(in, inOffset, out, outOffset);
		case 92:
			return decode92(in, inOffset, out, outOffset);
		case 93:
			return decode93(in, inOffset, out, outOffset);
		case 94:
			return decode94(in, inOffset, out, outOffset);
		case 95:
			return decode95(in, inOffset, out, outOffset);
		case 96:
			return decode96(in, inOffset, out, outOffset);
		case 97:
			return decode97(in, inOffset, out, outOffset);
		case 98:
			return decode98(in, inOffset, out, outOffset);
		case 99:
			return decode99(in, inOffset, out, outOffset);
		case 100:
			return decode100(in, inOffset, out, outOffset);
		case 101:
			return decode101(in, inOffset, out, outOffset);
		case 102:
			return decode102(in, inOffset, out, outOffset);
		case 103:
			return decode103(in, inOffset, out, outOffset);
		case 104:
			return decode104(in, inOffset, out, outOffset);
		case 105:
			return decode105(in, inOffset, out, outOffset);
		case 106:
			return decode106(in, inOffset, out, outOffset);
		case 107:
			return decode107(in, inOffset, out, outOffset);
		case 108:
			return decode108(in, inOffset, out, outOffset);
		case 109:
			return decode109(in, inOffset, out, outOffset);
		case 110:
			return decode110(in, inOffset, out, outOffset);
		case 111:
			return decode111(in, inOffset, out, outOffset);
		case 112:
			return decode112(in, inOffset, out, outOffset);
		case 113:
			return decode113(in, inOffset, out, outOffset);
		case 114:
			return decode114(in, inOffset, out, outOffset);
		case 115:
			return decode115(in, inOffset, out, outOffset);
		case 116:
			return decode116(in, inOffset, out, outOffset);
		case 117:
			return decode117(in, inOffset, out, outOffset);
		case 118:
			return decode118(in, inOffset, out, outOffset);
		case 119:
			return decode119(in, inOffset, out, outOffset);
		case 120:
			return decode120(in, inOffset, out, outOffset);
		case 121:
			return decode121(in, inOffset, out, outOffset);
		case 122:
			return decode122(in, inOffset, out, outOffset);
		case 123:
			return decode123(in, inOffset, out, outOffset);
		case 124:
			return decode124(in, inOffset, out, outOffset);
		case 125:
			return decode125(in, inOffset, out, outOffset);
		case 126:
			return decode126(in, inOffset, out, outOffset);
		case 127:
			return decode127(in, inOffset, out, outOffset);
		case 128:
			return decode128(in, inOffset, out, outOffset);
		case 129:
			return decode129(in, inOffset, out, outOffset);
		case 130:
			return decode130(in, inOffset, out, outOffset);
		case 131:
			return decode131(in, inOffset, out, outOffset);
		case 132:
			return decode132(in, inOffset, out, outOffset);
		case 133:
			return decode133(in, inOffset, out, outOffset);
		case 134:
			return decode134(in, inOffset, out, outOffset);
		case 135:
			return decode135(in, inOffset, out, outOffset);
		case 136:
			return decode136(in, inOffset, out, outOffset);
		case 137:
			return decode137(in, inOffset, out, outOffset);
		case 138:
			return decode138(in, inOffset, out, outOffset);
		case 139:
			return decode139(in, inOffset, out, outOffset);
		case 140:
			return decode140(in, inOffset, out, outOffset);
		case 141:
			return decode141(in, inOffset, out, outOffset);
		case 142:
			return decode142(in, inOffset, out, outOffset);
		case 143:
			return decode143(in, inOffset, out, outOffset);
		case 144:
			return decode144(in, inOffset, out, outOffset);
		case 145:
			return decode145(in, inOffset, out, outOffset);
		case 146:
			return decode146(in, inOffset, out, outOffset);
		case 147:
			return decode147(in, inOffset, out, outOffset);
		case 148:
			return decode148(in, inOffset, out, outOffset);
		case 149:
			return decode149(in, inOffset, out, outOffset);
		case 150:
			return decode150(in, inOffset, out, outOffset);
		case 151:
			return decode151(in, inOffset, out, outOffset);
		case 152:
			return decode152(in, inOffset, out, outOffset);
		case 153:
			return decode153(in, inOffset, out, outOffset);
		case 154:
			return decode154(in, inOffset, out, outOffset);
		case 155:
			return decode155(in, inOffset, out, outOffset);
		case 156:
			return decode156(in, inOffset, out, outOffset);
		case 157:
			return decode157(in, inOffset, out, outOffset);
		case 158:
			return decode158(in, inOffset, out, outOffset);
		case 159:
			return decode159(in, inOffset, out, outOffset);
		case 160:
			return decode160(in, inOffset, out, outOffset);
		case 161:
			return decode161(in, inOffset, out, outOffset);
		case 162:
			return decode162(in, inOffset, out, outOffset);
		case 163:
			return decode163(in, inOffset, out, outOffset);
		case 164:
			return decode164(in, inOffset, out, outOffset);
		case 165:
			return decode165(in, inOffset, out, outOffset);
		case 166:
			return decode166(in, inOffset, out, outOffset);
		case 167:
			return decode167(in, inOffset, out, outOffset);
		case 168:
			return decode168(in, inOffset, out, outOffset);
		case 169:
			return decode169(in, inOffset, out, outOffset);
		case 170:
			return decode170(in, inOffset, out, outOffset);
		case 171:
			return decode171(in, inOffset, out, outOffset);
		case 172:
			return decode172(in, inOffset, out, outOffset);
		case 173:
			return decode173(in, inOffset, out, outOffset);
		case 174:
			return decode174(in, inOffset, out, outOffset);
		case 175:
			return decode175(in, inOffset, out, outOffset);
		case 176:
			return decode176(in, inOffset, out, outOffset);
		case 177:
			return decode177(in, inOffset, out, outOffset);
		case 178:
			return decode178(in, inOffset, out, outOffset);
		case 179:
			return decode179(in, inOffset, out, outOffset);
		case 180:
			return decode180(in, inOffset, out, outOffset);
		case 181:
			return decode181(in, inOffset, out, outOffset);
		case 182:
			return decode182(in, inOffset, out, outOffset);
		case 183:
			return decode183(in, inOffset, out, outOffset);
		case 184:
			return decode184(in, inOffset, out, outOffset);
		case 185:
			return decode185(in, inOffset, out, outOffset);
		case 186:
			return decode186(in, inOffset, out, outOffset);
		case 187:
			return decode187(in, inOffset, out, outOffset);
		case 188:
			return decode188(in, inOffset, out, outOffset);
		case 189:
			return decode189(in, inOffset, out, outOffset);
		case 190:
			return decode190(in, inOffset, out, outOffset);
		case 191:
			return decode191(in, inOffset, out, outOffset);
		case 192:
			return decode192(in, inOffset, out, outOffset);
		case 193:
			return decode193(in, inOffset, out, outOffset);
		case 194:
			return decode194(in, inOffset, out, outOffset);
		case 195:
			return decode195(in, inOffset, out, outOffset);
		case 196:
			return decode196(in, inOffset, out, outOffset);
		case 197:
			return decode197(in, inOffset, out, outOffset);
		case 198:
			return decode198(in, inOffset, out, outOffset);
		case 199:
			return decode199(in, inOffset, out, outOffset);
		case 200:
			return decode200(in, inOffset, out, outOffset);
		case 201:
			return decode201(in, inOffset, out, outOffset);
		case 202:
			return decode202(in, inOffset, out, outOffset);
		case 203:
			return decode203(in, inOffset, out, outOffset);
		case 204:
			return decode204(in, inOffset, out, outOffset);
		case 205:
			return decode205(in, inOffset, out, outOffset);
		case 206:
			return decode206(in, inOffset, out, outOffset);
		case 207:
			return decode207(in, inOffset, out, outOffset);
		case 208:
			return decode208(in, inOffset, out, outOffset);
		case 209:
			return decode209(in, inOffset, out, outOffset);
		case 210:
			return decode210(in, inOffset, out, outOffset);
		case 211:
			return decode211(in, inOffset, out, outOffset);
		case 212:
			return decode212(in, inOffset, out, outOffset);
		case 213:
			return decode213(in, inOffset, out, outOffset);
		case 214:
			return decode214(in, inOffset, out, outOffset);
		case 215:
			return decode215(in, inOffset, out, outOffset);
		case 216:
			return decode216(in, inOffset, out, outOffset);
		case 217:
			return decode217(in, inOffset, out, outOffset);
		case 218:
			return decode218(in, inOffset, out, outOffset);
		case 219:
			return decode219(in, inOffset, out, outOffset);
		case 220:
			return decode220(in, inOffset, out, outOffset);
		case 221:
			return decode221(in, inOffset, out, outOffset);
		case 222:
			return decode222(in, inOffset, out, outOffset);
		case 223:
			return decode223(in, inOffset, out, outOffset);
		case 224:
			return decode224(in, inOffset, out, outOffset);
		case 225:
			return decode225(in, inOffset, out, outOffset);
		case 226:
			return decode226(in, inOffset, out, outOffset);
		case 227:
			return decode227(in, inOffset, out, outOffset);
		case 228:
			return decode228(in, inOffset, out, outOffset);
		case 229:
			return decode229(in, inOffset, out, outOffset);
		case 230:
			return decode230(in, inOffset, out, outOffset);
		case 231:
			return decode231(in, inOffset, out, outOffset);
		case 232:
			return decode232(in, inOffset, out, outOffset);
		case 233:
			return decode233(in, inOffset, out, outOffset);
		case 234:
			return decode234(in, inOffset, out, outOffset);
		case 235:
			return decode235(in, inOffset, out, outOffset);
		case 236:
			return decode236(in, inOffset, out, outOffset);
		case 237:
			return decode237(in, inOffset, out, outOffset);
		case 238:
			return decode238(in, inOffset, out, outOffset);
		case 239:
			return decode239(in, inOffset, out, outOffset);
		case 240:
			return decode240(in, inOffset, out, outOffset);
		case 241:
			return decode241(in, inOffset, out, outOffset);
		case 242:
			return decode242(in, inOffset, out, outOffset);
		case 243:
			return decode243(in, inOffset, out, outOffset);
		case 244:
			return decode244(in, inOffset, out, outOffset);
		case 245:
			return decode245(in, inOffset, out, outOffset);
		case 246:
			return decode246(in, inOffset, out, outOffset);
		case 247:
			return decode247(in, inOffset, out, outOffset);
		case 248:
			return decode248(in, inOffset, out, outOffset);
		case 249:
			return decode249(in, inOffset, out, outOffset);
		case 250:
			return decode250(in, inOffset, out, outOffset);
		case 251:
			return decode251(in, inOffset, out, outOffset);
		case 252:
			return decode252(in, inOffset, out, outOffset);
		case 253:
			return decode253(in, inOffset, out, outOffset);
		case 254:
			return decode254(in, inOffset, out, outOffset);
		case 255:
			return decode255(in, inOffset, out, outOffset);
		default:
			throw new RuntimeException("Wrong code: " + code);
		}
	}

	private static final int decode0(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = 0xFF & in[inOffset + 3];
		return 4;
	}

	private static final int decode1(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		return 5;
	}

	private static final int decode2(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		return 6;
	}

	private static final int decode3(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = 0xFF & in[inOffset + 2];
		out[outOffset + 3] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode4(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private static final int decode5(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private static final int decode6(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode7(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode8(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode9(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode10(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode11(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode12(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode13(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode14(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode15(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = 0xFF & in[inOffset + 1];
		out[outOffset + 2] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode16(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private static final int decode17(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private static final int decode18(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode19(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode20(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode21(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode22(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode23(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode24(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode25(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode26(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode27(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode28(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode29(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode30(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode31(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode32(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode33(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode34(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode35(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode36(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode37(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode38(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode39(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode40(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode41(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode42(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode43(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode44(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode45(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode46(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode47(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode48(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode49(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode50(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode51(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode52(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode53(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode54(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode55(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode56(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode57(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode58(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode59(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode60(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = 0xFF & in[inOffset + 0];
		out[outOffset + 1] = ((0xFF & in[inOffset + 1]) << 24)
				| ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode61(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode62(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode63(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode64(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = 0xFF & in[inOffset + 4];
		return 5;
	}

	private static final int decode65(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		return 6;
	}

	private static final int decode66(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode67(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = 0xFF & in[inOffset + 3];
		out[outOffset + 3] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode68(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode69(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode70(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode71(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode72(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode73(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode74(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode75(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode76(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode77(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode78(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = 0xFF & in[inOffset + 2];
		out[outOffset + 2] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode79(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode80(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode81(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode82(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode83(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode84(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode85(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode86(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode87(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode88(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode89(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode90(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode91(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode92(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 8)
				| (0xFF & in[inOffset + 3]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode93(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode94(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode95(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode96(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode97(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode98(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode99(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode100(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode101(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode102(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode103(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode104(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode105(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode106(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode107(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode108(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 16)
				| ((0xFF & in[inOffset + 3]) << 8) | (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode109(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode110(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode111(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode112(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode113(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode114(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode115(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode116(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode117(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode118(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode119(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode120(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 8)
				| (0xFF & in[inOffset + 1]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 2]) << 24)
				| ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode121(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode122(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode123(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode124(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode125(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode126(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode127(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode128(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = 0xFF & in[inOffset + 5];
		return 6;
	}

	private static final int decode129(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		return 7;
	}

	private static final int decode130(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode131(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = 0xFF & in[inOffset + 4];
		out[outOffset + 3] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode132(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode133(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode134(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode135(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode136(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode137(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode138(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode139(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode140(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode141(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode142(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = 0xFF & in[inOffset + 3];
		out[outOffset + 2] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode143(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode144(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode145(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode146(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode147(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode148(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode149(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode150(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode151(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode152(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode153(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode154(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode155(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode156(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 8)
				| (0xFF & in[inOffset + 4]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode157(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode158(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode159(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode160(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode161(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode162(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode163(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 24)
				| ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode164(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode165(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode166(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode167(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode168(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode169(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 9]) << 8)
				| (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode170(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode171(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode172(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 16)
				| ((0xFF & in[inOffset + 4]) << 8) | (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private static final int decode173(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode174(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode175(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode176(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode177(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode178(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode179(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode180(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode181(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode182(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode183(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode184(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 16)
				| ((0xFF & in[inOffset + 1]) << 8) | (0xFF & in[inOffset + 2]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 3]) << 24)
				| ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private static final int decode185(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode186(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode187(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode188(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode189(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode190(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode191(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode192(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = 0xFF & in[inOffset + 6];
		return 7;
	}

	private static final int decode193(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		return 8;
	}

	private static final int decode194(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode195(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = 0xFF & in[inOffset + 5];
		out[outOffset + 3] = ((0xFF & in[inOffset + 6]) << 24)
				| ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode196(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode197(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode198(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 8)
				| (0xFF & in[inOffset + 6]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode199(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode200(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode201(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode202(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode203(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode204(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = 0xFF & in[inOffset + 4];
		out[outOffset + 2] = ((0xFF & in[inOffset + 5]) << 24)
				| ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode205(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode206(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode207(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode208(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = 0xFF & in[inOffset + 7];
		return 8;
	}

	private static final int decode209(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		return 9;
	}

	private static final int decode210(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = 0xFF & in[inOffset + 6];
		out[outOffset + 3] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode211(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode212(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 8)
				| (0xFF & in[inOffset + 7]);
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode213(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode214(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode215(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode216(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 8)
				| (0xFF & in[inOffset + 5]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 6]) << 16)
				| ((0xFF & in[inOffset + 7]) << 8) | (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode217(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode218(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode219(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode220(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode221(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode222(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode223(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode224(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = 0xFF & in[inOffset + 8];
		return 9;
	}

	private static final int decode225(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 8)
				| (0xFF & in[inOffset + 9]);
		return 10;
	}

	private static final int decode226(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = 0xFF & in[inOffset + 7];
		out[outOffset + 3] = ((0xFF & in[inOffset + 8]) << 16)
				| ((0xFF & in[inOffset + 9]) << 8) | (0xFF & in[inOffset + 10]);
		return 11;
	}

	private static final int decode227(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode228(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 8)
				| (0xFF & in[inOffset + 8]);
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode229(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode230(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode231(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode232(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 16)
				| ((0xFF & in[inOffset + 5]) << 8) | (0xFF & in[inOffset + 6]);
		out[outOffset + 2] = ((0xFF & in[inOffset + 7]) << 16)
				| ((0xFF & in[inOffset + 8]) << 8) | (0xFF & in[inOffset + 9]);
		out[outOffset + 3] = 0xFF & in[inOffset + 10];
		return 11;
	}

	private static final int decode233(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode234(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode235(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode236(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode237(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode238(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode239(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode240(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
		out[outOffset + 0] = ((0xFF & in[inOffset + 0]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
		out[outOffset + 1] = ((0xFF & in[inOffset + 4]) << 24)
				| ((0xFF & in[inOffset + 5]) << 16)
				| ((0xFF & in[inOffset + 6]) << 8) | (0xFF & in[inOffset + 7]);
		out[outOffset + 2] = 0xFF & in[inOffset + 8];
		out[outOffset + 3] = 0xFF & in[inOffset + 9];
		return 10;
	}

	private static final int decode241(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode242(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode243(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode244(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode245(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode246(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode247(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode248(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode249(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode250(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode251(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode252(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode253(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode254(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	private static final int decode255(final byte[] in, final int inOffset,
			final int[] out, final int outOffset) {
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
	}

	public static final int readUncompressedInt(byte[] in, int inOffset) {
		
		int i = in[inOffset++];
		i = (i << 8) | in[inOffset++];
		i = (i << 8) | in[inOffset++];
		i = (i << 8) | in[inOffset];
		
		return i;
	}

}