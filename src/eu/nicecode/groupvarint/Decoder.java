package eu.nicecode.groupvarint;

public class Decoder {

	public int decode(byte[] in, int inOffset, int[] out, int outOffset) {

		int code = 0xFF & in[inOffset++];
		return decodeFnt[code].decode(in, inOffset, out, outOffset) + 1;

	}
	
	static interface DecodeFunction {
		
		int decode(byte[] in, int inOffset, int[] out, int outOffset);
	}
	
	private int decode1(byte[] in, int inOffset) {

		return 0xFF & in[inOffset];
	}

	private int decode2(byte[] in, int inOffset) {

		return ((0xFF & in[inOffset]) << 8) | (0xFF & in[inOffset + 1]);
	}

	private int decode3(byte[] in, int inOffset) {

		return ((0xFF & in[inOffset]) << 16) | ((0xFF & in[inOffset + 1]) << 8)
				| (0xFF & in[inOffset + 2]);
	}

	private int decode4(byte[] in, int inOffset) {

		return ((0xFF & in[inOffset]) << 24)
				| ((0xFF & in[inOffset + 1]) << 16)
				| ((0xFF & in[inOffset + 2]) << 8) | (0xFF & in[inOffset + 3]);
	}
	
	private DecodeFunction decodeFnt[];

	public Decoder() {

		decodeFnt = new DecodeFunction[256];

		decodeFnt[0] = this::decode1111;
		decodeFnt[1] = this::decode1112;
		decodeFnt[2] = this::decode1113;
		decodeFnt[3] = this::decode1114;
		decodeFnt[4] = this::decode1121;
		decodeFnt[5] = this::decode1122;
		decodeFnt[6] = this::decode1123;
		decodeFnt[7] = this::decode1124;
		decodeFnt[8] = this::decode1131;
		decodeFnt[9] = this::decode1132;
		decodeFnt[10] = this::decode1133;
		decodeFnt[11] = this::decode1134;
		decodeFnt[12] = this::decode1141;
		decodeFnt[13] = this::decode1142;
		decodeFnt[14] = this::decode1143;
		decodeFnt[15] = this::decode1144;
		decodeFnt[16] = this::decode1211;
		decodeFnt[17] = this::decode1212;
		decodeFnt[18] = this::decode1213;
		decodeFnt[19] = this::decode1214;
		decodeFnt[20] = this::decode1221;
		decodeFnt[21] = this::decode1222;
		decodeFnt[22] = this::decode1223;
		decodeFnt[23] = this::decode1224;
		decodeFnt[24] = this::decode1231;
		decodeFnt[25] = this::decode1232;
		decodeFnt[26] = this::decode1233;
		decodeFnt[27] = this::decode1234;
		decodeFnt[28] = this::decode1241;
		decodeFnt[29] = this::decode1242;
		decodeFnt[30] = this::decode1243;
		decodeFnt[31] = this::decode1244;
		decodeFnt[32] = this::decode1311;
		decodeFnt[33] = this::decode1312;
		decodeFnt[34] = this::decode1313;
		decodeFnt[35] = this::decode1314;
		decodeFnt[36] = this::decode1321;
		decodeFnt[37] = this::decode1322;
		decodeFnt[38] = this::decode1323;
		decodeFnt[39] = this::decode1324;
		decodeFnt[40] = this::decode1331;
		decodeFnt[41] = this::decode1332;
		decodeFnt[42] = this::decode1333;
		decodeFnt[43] = this::decode1334;
		decodeFnt[44] = this::decode1341;
		decodeFnt[45] = this::decode1342;
		decodeFnt[46] = this::decode1343;
		decodeFnt[47] = this::decode1344;
		decodeFnt[48] = this::decode1411;
		decodeFnt[49] = this::decode1412;
		decodeFnt[50] = this::decode1413;
		decodeFnt[51] = this::decode1414;
		decodeFnt[52] = this::decode1421;
		decodeFnt[53] = this::decode1422;
		decodeFnt[54] = this::decode1423;
		decodeFnt[55] = this::decode1424;
		decodeFnt[56] = this::decode1431;
		decodeFnt[57] = this::decode1432;
		decodeFnt[58] = this::decode1433;
		decodeFnt[59] = this::decode1434;
		decodeFnt[60] = this::decode1441;
		decodeFnt[61] = this::decode1442;
		decodeFnt[62] = this::decode1443;
		decodeFnt[63] = this::decode1444;
		decodeFnt[64] = this::decode2111;
		decodeFnt[65] = this::decode2112;
		decodeFnt[66] = this::decode2113;
		decodeFnt[67] = this::decode2114;
		decodeFnt[68] = this::decode2121;
		decodeFnt[69] = this::decode2122;
		decodeFnt[70] = this::decode2123;
		decodeFnt[71] = this::decode2124;
		decodeFnt[72] = this::decode2131;
		decodeFnt[73] = this::decode2132;
		decodeFnt[74] = this::decode2133;
		decodeFnt[75] = this::decode2134;
		decodeFnt[76] = this::decode2141;
		decodeFnt[77] = this::decode2142;
		decodeFnt[78] = this::decode2143;
		decodeFnt[79] = this::decode2144;
		decodeFnt[80] = this::decode2211;
		decodeFnt[81] = this::decode2212;
		decodeFnt[82] = this::decode2213;
		decodeFnt[83] = this::decode2214;
		decodeFnt[84] = this::decode2221;
		decodeFnt[85] = this::decode2222;
		decodeFnt[86] = this::decode2223;
		decodeFnt[87] = this::decode2224;
		decodeFnt[88] = this::decode2231;
		decodeFnt[89] = this::decode2232;
		decodeFnt[90] = this::decode2233;
		decodeFnt[91] = this::decode2234;
		decodeFnt[92] = this::decode2241;
		decodeFnt[93] = this::decode2242;
		decodeFnt[94] = this::decode2243;
		decodeFnt[95] = this::decode2244;
		decodeFnt[96] = this::decode2311;
		decodeFnt[97] = this::decode2312;
		decodeFnt[98] = this::decode2313;
		decodeFnt[99] = this::decode2314;
		decodeFnt[100] = this::decode2321;
		decodeFnt[101] = this::decode2322;
		decodeFnt[102] = this::decode2323;
		decodeFnt[103] = this::decode2324;
		decodeFnt[104] = this::decode2331;
		decodeFnt[105] = this::decode2332;
		decodeFnt[106] = this::decode2333;
		decodeFnt[107] = this::decode2334;
		decodeFnt[108] = this::decode2341;
		decodeFnt[109] = this::decode2342;
		decodeFnt[110] = this::decode2343;
		decodeFnt[111] = this::decode2344;
		decodeFnt[112] = this::decode2411;
		decodeFnt[113] = this::decode2412;
		decodeFnt[114] = this::decode2413;
		decodeFnt[115] = this::decode2414;
		decodeFnt[116] = this::decode2421;
		decodeFnt[117] = this::decode2422;
		decodeFnt[118] = this::decode2423;
		decodeFnt[119] = this::decode2424;
		decodeFnt[120] = this::decode2431;
		decodeFnt[121] = this::decode2432;
		decodeFnt[122] = this::decode2433;
		decodeFnt[123] = this::decode2434;
		decodeFnt[124] = this::decode2441;
		decodeFnt[125] = this::decode2442;
		decodeFnt[126] = this::decode2443;
		decodeFnt[127] = this::decode2444;
		decodeFnt[128] = this::decode3111;
		decodeFnt[129] = this::decode3112;
		decodeFnt[130] = this::decode3113;
		decodeFnt[131] = this::decode3114;
		decodeFnt[132] = this::decode3121;
		decodeFnt[133] = this::decode3122;
		decodeFnt[134] = this::decode3123;
		decodeFnt[135] = this::decode3124;
		decodeFnt[136] = this::decode3131;
		decodeFnt[137] = this::decode3132;
		decodeFnt[138] = this::decode3133;
		decodeFnt[139] = this::decode3134;
		decodeFnt[140] = this::decode3141;
		decodeFnt[141] = this::decode3142;
		decodeFnt[142] = this::decode3143;
		decodeFnt[143] = this::decode3144;
		decodeFnt[144] = this::decode3211;
		decodeFnt[145] = this::decode3212;
		decodeFnt[146] = this::decode3213;
		decodeFnt[147] = this::decode3214;
		decodeFnt[148] = this::decode3221;
		decodeFnt[149] = this::decode3222;
		decodeFnt[150] = this::decode3223;
		decodeFnt[151] = this::decode3224;
		decodeFnt[152] = this::decode3231;
		decodeFnt[153] = this::decode3232;
		decodeFnt[154] = this::decode3233;
		decodeFnt[155] = this::decode3234;
		decodeFnt[156] = this::decode3241;
		decodeFnt[157] = this::decode3242;
		decodeFnt[158] = this::decode3243;
		decodeFnt[159] = this::decode3244;
		decodeFnt[160] = this::decode3311;
		decodeFnt[161] = this::decode3312;
		decodeFnt[162] = this::decode3313;
		decodeFnt[163] = this::decode3314;
		decodeFnt[164] = this::decode3321;
		decodeFnt[165] = this::decode3322;
		decodeFnt[166] = this::decode3323;
		decodeFnt[167] = this::decode3324;
		decodeFnt[168] = this::decode3331;
		decodeFnt[169] = this::decode3332;
		decodeFnt[170] = this::decode3333;
		decodeFnt[171] = this::decode3334;
		decodeFnt[172] = this::decode3341;
		decodeFnt[173] = this::decode3342;
		decodeFnt[174] = this::decode3343;
		decodeFnt[175] = this::decode3344;
		decodeFnt[176] = this::decode3411;
		decodeFnt[177] = this::decode3412;
		decodeFnt[178] = this::decode3413;
		decodeFnt[179] = this::decode3414;
		decodeFnt[180] = this::decode3421;
		decodeFnt[181] = this::decode3422;
		decodeFnt[182] = this::decode3423;
		decodeFnt[183] = this::decode3424;
		decodeFnt[184] = this::decode3431;
		decodeFnt[185] = this::decode3432;
		decodeFnt[186] = this::decode3433;
		decodeFnt[187] = this::decode3434;
		decodeFnt[188] = this::decode3441;
		decodeFnt[189] = this::decode3442;
		decodeFnt[190] = this::decode3443;
		decodeFnt[191] = this::decode3444;
		decodeFnt[192] = this::decode4111;
		decodeFnt[193] = this::decode4112;
		decodeFnt[194] = this::decode4113;
		decodeFnt[195] = this::decode4114;
		decodeFnt[196] = this::decode4121;
		decodeFnt[197] = this::decode4122;
		decodeFnt[198] = this::decode4123;
		decodeFnt[199] = this::decode4124;
		decodeFnt[200] = this::decode4131;
		decodeFnt[201] = this::decode4132;
		decodeFnt[202] = this::decode4133;
		decodeFnt[203] = this::decode4134;
		decodeFnt[204] = this::decode4141;
		decodeFnt[205] = this::decode4142;
		decodeFnt[206] = this::decode4143;
		decodeFnt[207] = this::decode4144;
		decodeFnt[208] = this::decode4211;
		decodeFnt[209] = this::decode4212;
		decodeFnt[210] = this::decode4213;
		decodeFnt[211] = this::decode4214;
		decodeFnt[212] = this::decode4221;
		decodeFnt[213] = this::decode4222;
		decodeFnt[214] = this::decode4223;
		decodeFnt[215] = this::decode4224;
		decodeFnt[216] = this::decode4231;
		decodeFnt[217] = this::decode4232;
		decodeFnt[218] = this::decode4233;
		decodeFnt[219] = this::decode4234;
		decodeFnt[220] = this::decode4241;
		decodeFnt[221] = this::decode4242;
		decodeFnt[222] = this::decode4243;
		decodeFnt[223] = this::decode4244;
		decodeFnt[224] = this::decode4311;
		decodeFnt[225] = this::decode4312;
		decodeFnt[226] = this::decode4313;
		decodeFnt[227] = this::decode4314;
		decodeFnt[228] = this::decode4321;
		decodeFnt[229] = this::decode4322;
		decodeFnt[230] = this::decode4323;
		decodeFnt[231] = this::decode4324;
		decodeFnt[232] = this::decode4331;
		decodeFnt[233] = this::decode4332;
		decodeFnt[234] = this::decode4333;
		decodeFnt[235] = this::decode4334;
		decodeFnt[236] = this::decode4341;
		decodeFnt[237] = this::decode4342;
		decodeFnt[238] = this::decode4343;
		decodeFnt[239] = this::decode4344;
		decodeFnt[240] = this::decode4411;
		decodeFnt[241] = this::decode4412;
		decodeFnt[242] = this::decode4413;
		decodeFnt[243] = this::decode4414;
		decodeFnt[244] = this::decode4421;
		decodeFnt[245] = this::decode4422;
		decodeFnt[246] = this::decode4423;
		decodeFnt[247] = this::decode4424;
		decodeFnt[248] = this::decode4431;
		decodeFnt[249] = this::decode4432;
		decodeFnt[250] = this::decode4433;
		decodeFnt[251] = this::decode4434;
		decodeFnt[252] = this::decode4441;
		decodeFnt[253] = this::decode4442;
		decodeFnt[254] = this::decode4443;
		decodeFnt[255] = this::decode4444;
	}

	private int decode1111(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 4;
	}

	private int decode1112(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 5;
	}

	private int decode1113(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 6;
	}

	private int decode1114(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 7;
	}

	private int decode1121(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 5;
	}

	private int decode1122(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 6;
	}

	private int decode1123(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 7;
	}

	private int decode1124(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 8;
	}

	private int decode1131(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode1132(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode1133(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode1134(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode1141(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode1142(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode1143(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode1144(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode1211(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 5;
	}

	private int decode1212(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 6;
	}

	private int decode1213(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 7;
	}

	private int decode1214(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 8;
	}

	private int decode1221(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode1222(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode1223(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode1224(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode1231(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode1232(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode1233(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode1234(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode1241(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode1242(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode1243(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode1244(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode1311(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode1312(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode1313(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode1314(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode1321(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode1322(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode1323(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode1324(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode1331(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode1332(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode1333(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode1334(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode1341(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode1342(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode1343(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode1344(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode1411(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode1412(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode1413(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode1414(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode1421(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode1422(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode1423(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode1424(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode1431(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode1432(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode1433(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode1434(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode1441(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode1442(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode1443(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode1444(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode2111(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 5;
	}

	private int decode2112(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 6;
	}

	private int decode2113(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 7;
	}

	private int decode2114(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 8;
	}

	private int decode2121(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode2122(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode2123(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode2124(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode2131(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode2132(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode2133(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode2134(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode2141(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode2142(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode2143(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode2144(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode2211(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode2212(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode2213(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode2214(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode2221(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode2222(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode2223(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode2224(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode2231(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode2232(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode2233(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode2234(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode2241(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode2242(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode2243(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode2244(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode2311(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode2312(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode2313(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode2314(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode2321(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode2322(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode2323(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode2324(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode2331(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode2332(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode2333(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode2334(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode2341(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode2342(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode2343(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode2344(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode2411(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode2412(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode2413(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode2414(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode2421(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode2422(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode2423(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode2424(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode2431(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode2432(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode2433(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode2434(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode2441(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode2442(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode2443(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode2444(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode3111(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 6;
	}

	private int decode3112(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 7;
	}

	private int decode3113(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 8;
	}

	private int decode3114(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 9;
	}

	private int decode3121(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode3122(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode3123(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode3124(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode3131(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode3132(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode3133(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode3134(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode3141(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode3142(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode3143(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode3144(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode3211(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode3212(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode3213(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode3214(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode3221(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode3222(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode3223(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode3224(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode3231(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode3232(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode3233(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode3234(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode3241(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode3242(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode3243(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode3244(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode3311(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode3312(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode3313(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode3314(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode3321(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode3322(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode3323(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode3324(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode3331(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode3332(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode3333(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode3334(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode3341(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode3342(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode3343(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode3344(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode3411(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode3412(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode3413(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode3414(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode3421(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode3422(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode3423(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode3424(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode3431(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode3432(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode3433(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode3434(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode3441(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 12;
	}

	private int decode3442(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 13;
	}

	private int decode3443(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 14;
	}

	private int decode3444(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 15;
	}

	private int decode4111(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 7;
	}

	private int decode4112(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 8;
	}

	private int decode4113(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 9;
	}

	private int decode4114(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 10;
	}

	private int decode4121(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode4122(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode4123(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode4124(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode4131(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode4132(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode4133(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode4134(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode4141(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode4142(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode4143(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode4144(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode4211(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 8;
	}

	private int decode4212(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 9;
	}

	private int decode4213(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 10;
	}

	private int decode4214(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 11;
	}

	private int decode4221(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode4222(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode4223(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode4224(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode4231(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode4232(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode4233(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode4234(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode4241(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode4242(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode4243(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode4244(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode4311(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 9;
	}

	private int decode4312(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 10;
	}

	private int decode4313(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 11;
	}

	private int decode4314(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 12;
	}

	private int decode4321(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode4322(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode4323(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode4324(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode4331(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode4332(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode4333(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode4334(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode4341(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 12;
	}

	private int decode4342(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 13;
	}

	private int decode4343(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 14;
	}

	private int decode4344(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 15;
	}

	private int decode4411(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 10;
	}

	private int decode4412(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 11;
	}

	private int decode4413(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 12;
	}

	private int decode4414(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 13;
	}

	private int decode4421(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 11;
	}

	private int decode4422(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 12;
	}

	private int decode4423(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 13;
	}

	private int decode4424(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 14;
	}

	private int decode4431(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 12;
	}

	private int decode4432(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 13;
	}

	private int decode4433(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 14;
	}

	private int decode4434(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 15;
	}

	private int decode4441(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode1(in, inOffset);
		inOffset += 1;
		outOffset += 1;
		return 13;
	}

	private int decode4442(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode2(in, inOffset);
		inOffset += 2;
		outOffset += 1;
		return 14;
	}

	private int decode4443(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode3(in, inOffset);
		inOffset += 3;
		outOffset += 1;
		return 15;
	}

	private int decode4444(byte[] in, int inOffset, int[] out, int outOffset) {
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		out[outOffset] = decode4(in, inOffset);
		inOffset += 4;
		outOffset += 1;
		return 16;
	}
}