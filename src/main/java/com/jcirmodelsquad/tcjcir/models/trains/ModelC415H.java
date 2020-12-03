//uwu

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeB;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelC415H extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;
//The H stands for High Visibillity!
	// other versions will be the C415S and the C415L for standard and low respectivly
	public ModelC415H() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[302];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 14, 2, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 0, 164, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 32, 77, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 35, 33, textureX, textureY); // Box 115
		bodyModel[10] = new ModelRendererTurbo(this, 1, 63, textureX, textureY); // Box 141
		bodyModel[11] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 206
		bodyModel[12] = new ModelRendererTurbo(this, 148, 137, textureX, textureY); // Box 458
		bodyModel[13] = new ModelRendererTurbo(this, 240, 143, textureX, textureY); // Box 468
		bodyModel[14] = new ModelRendererTurbo(this, 106, 182, textureX, textureY); // Box 490
		bodyModel[15] = new ModelRendererTurbo(this, 133, 66, textureX, textureY); // Box 500
		bodyModel[16] = new ModelRendererTurbo(this, 221, 120, textureX, textureY); // Box 502
		bodyModel[17] = new ModelRendererTurbo(this, 233, 131, textureX, textureY); // Box 503
		bodyModel[18] = new ModelRendererTurbo(this, 206, 119, textureX, textureY); // Box 504
		bodyModel[19] = new ModelRendererTurbo(this, 236, 117, textureX, textureY); // Box 156
		bodyModel[20] = new ModelRendererTurbo(this, 102, 191, textureX, textureY); // Box 158
		bodyModel[21] = new ModelRendererTurbo(this, 104, 189, textureX, textureY); // Box 159
		bodyModel[22] = new ModelRendererTurbo(this, 104, 182, textureX, textureY); // Box 160
		bodyModel[23] = new ModelRendererTurbo(this, 102, 184, textureX, textureY); // Box 161
		bodyModel[24] = new ModelRendererTurbo(this, 21, 53, textureX, textureY, "lamp"); // Box 162 lamp R
		bodyModel[25] = new ModelRendererTurbo(this, 21, 48, textureX, textureY, "lamp"); // Box 163 lamp R
		bodyModel[26] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 178 tank main
		bodyModel[27] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 201
		bodyModel[28] = new ModelRendererTurbo(this, 196, 34, textureX, textureY); // Box 202
		bodyModel[29] = new ModelRendererTurbo(this, 213, 164, textureX, textureY); // Box 224
		bodyModel[30] = new ModelRendererTurbo(this, 154, 183, textureX, textureY); // Box 225
		bodyModel[31] = new ModelRendererTurbo(this, 147, 129, textureX, textureY); // Box 228
		bodyModel[32] = new ModelRendererTurbo(this, 207, 34, textureX, textureY); // Box 237
		bodyModel[33] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 245
		bodyModel[34] = new ModelRendererTurbo(this, 142, 66, textureX, textureY); // Box 250
		bodyModel[35] = new ModelRendererTurbo(this, 197, 41, textureX, textureY); // Box 560
		bodyModel[36] = new ModelRendererTurbo(this, 168, 48, textureX, textureY); // Box 562
		bodyModel[37] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 564 tank extra1
		bodyModel[38] = new ModelRendererTurbo(this, 137, 46, textureX, textureY); // Box 569 tank extra 1
		bodyModel[39] = new ModelRendererTurbo(this, 144, 131, textureX, textureY); // Box 682
		bodyModel[40] = new ModelRendererTurbo(this, 144, 142, textureX, textureY); // Box 708
		bodyModel[41] = new ModelRendererTurbo(this, 176, 142, textureX, textureY); // Box 709
		bodyModel[42] = new ModelRendererTurbo(this, 159, 210, textureX, textureY, "lamp"); // Box 359 ditchlight f
		bodyModel[43] = new ModelRendererTurbo(this, 159, 215, textureX, textureY, "cull"); // Box 360 cull
		bodyModel[44] = new ModelRendererTurbo(this, 98, 210, textureX, textureY, "lamp"); // Box 272 ditchlight r
		bodyModel[45] = new ModelRendererTurbo(this, 98, 215, textureX, textureY, "cull"); // Box 273 cull
		bodyModel[46] = new ModelRendererTurbo(this, 29, 43, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[47] = new ModelRendererTurbo(this, 29, 40, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 318
		bodyModel[49] = new ModelRendererTurbo(this, 159, 215, textureX, textureY, "cull"); // Box 320 cull
		bodyModel[50] = new ModelRendererTurbo(this, 159, 210, textureX, textureY, "lamp"); // Box 321 ditchlight f
		bodyModel[51] = new ModelRendererTurbo(this, 98, 215, textureX, textureY, "cull"); // Box 322 cull
		bodyModel[52] = new ModelRendererTurbo(this, 98, 210, textureX, textureY, "lamp"); // Box 323 ditchlight r
		bodyModel[53] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 324
		bodyModel[54] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 325
		bodyModel[55] = new ModelRendererTurbo(this, 196, 189, textureX, textureY); // Box 401
		bodyModel[56] = new ModelRendererTurbo(this, 133, 191, textureX, textureY); // Box 404
		bodyModel[57] = new ModelRendererTurbo(this, 123, 189, textureX, textureY); // Box 405
		bodyModel[58] = new ModelRendererTurbo(this, 208, 120, textureX, textureY); // Box 406
		bodyModel[59] = new ModelRendererTurbo(this, 123, 182, textureX, textureY); // Box 407
		bodyModel[60] = new ModelRendererTurbo(this, 133, 184, textureX, textureY); // Box 408
		bodyModel[61] = new ModelRendererTurbo(this, 238, 100, textureX, textureY); // Box 409
		bodyModel[62] = new ModelRendererTurbo(this, 238, 89, textureX, textureY); // Box 410
		bodyModel[63] = new ModelRendererTurbo(this, 5, 53, textureX, textureY, "lamp"); // Box 411 lamp F
		bodyModel[64] = new ModelRendererTurbo(this, 5, 48, textureX, textureY, "lamp"); // Box 412 lamp F
		bodyModel[65] = new ModelRendererTurbo(this, 41, 35, textureX, textureY); // Box 938
		bodyModel[66] = new ModelRendererTurbo(this, 92, 115, textureX, textureY); // Box 939
		bodyModel[67] = new ModelRendererTurbo(this, 42, 132, textureX, textureY); // Box 940
		bodyModel[68] = new ModelRendererTurbo(this, 165, 115, textureX, textureY); // Box 944
		bodyModel[69] = new ModelRendererTurbo(this, 72, 96, textureX, textureY); // Box 945
		bodyModel[70] = new ModelRendererTurbo(this, 24, 90, textureX, textureY); // Box 946
		bodyModel[71] = new ModelRendererTurbo(this, 142, 103, textureX, textureY); // Box 947
		bodyModel[72] = new ModelRendererTurbo(this, 4, 97, textureX, textureY); // Box 1150
		bodyModel[73] = new ModelRendererTurbo(this, 4, 96, textureX, textureY); // Box 1151
		bodyModel[74] = new ModelRendererTurbo(this, 187, 97, textureX, textureY); // Box 1152
		bodyModel[75] = new ModelRendererTurbo(this, 4, 114, textureX, textureY); // Box 1153
		bodyModel[76] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 1154
		bodyModel[77] = new ModelRendererTurbo(this, 187, 104, textureX, textureY); // Box 1155
		bodyModel[78] = new ModelRendererTurbo(this, 154, 112, textureX, textureY); // Box 314 door swing right
		bodyModel[79] = new ModelRendererTurbo(this, 81, 112, textureX, textureY); // Box 315 door swing right
		bodyModel[80] = new ModelRendererTurbo(this, 117, 99, textureX, textureY); // Box 1158
		bodyModel[81] = new ModelRendererTurbo(this, 44, 99, textureX, textureY); // Box 1159
		bodyModel[82] = new ModelRendererTurbo(this, 29, 98, textureX, textureY); // Box 1510
		bodyModel[83] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 1511
		bodyModel[84] = new ModelRendererTurbo(this, 65, 103, textureX, textureY); // Box 1512
		bodyModel[85] = new ModelRendererTurbo(this, 55, 82, textureX, textureY); // Box 1513
		bodyModel[86] = new ModelRendererTurbo(this, 74, 103, textureX, textureY); // Box 1514
		bodyModel[87] = new ModelRendererTurbo(this, 49, 99, textureX, textureY); // Box 1515
		bodyModel[88] = new ModelRendererTurbo(this, 178, 119, textureX, textureY); // Box 1516
		bodyModel[89] = new ModelRendererTurbo(this, 137, 182, textureX, textureY); // Box 1517
		bodyModel[90] = new ModelRendererTurbo(this, 193, 118, textureX, textureY); // Box 1518
		bodyModel[91] = new ModelRendererTurbo(this, 130, 155, textureX, textureY); // Box 1519
		bodyModel[92] = new ModelRendererTurbo(this, 123, 155, textureX, textureY); // Box 1520
		bodyModel[93] = new ModelRendererTurbo(this, 123, 190, textureX, textureY); // Box 1521
		bodyModel[94] = new ModelRendererTurbo(this, 123, 183, textureX, textureY); // Box 1522
		bodyModel[95] = new ModelRendererTurbo(this, 221, 118, textureX, textureY); // Box 1523
		bodyModel[96] = new ModelRendererTurbo(this, 123, 159, textureX, textureY); // Box 1524
		bodyModel[97] = new ModelRendererTurbo(this, 130, 159, textureX, textureY); // Box 1525
		bodyModel[98] = new ModelRendererTurbo(this, 114, 190, textureX, textureY); // Box 1526
		bodyModel[99] = new ModelRendererTurbo(this, 114, 183, textureX, textureY); // Box 1527
		bodyModel[100] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 1528
		bodyModel[101] = new ModelRendererTurbo(this, 34, 187, textureX, textureY); // Box 1529
		bodyModel[102] = new ModelRendererTurbo(this, 15, 184, textureX, textureY); // Box 1530
		bodyModel[103] = new ModelRendererTurbo(this, 16, 190, textureX, textureY); // Box 1531
		bodyModel[104] = new ModelRendererTurbo(this, 25, 190, textureX, textureY); // Box 1532
		bodyModel[105] = new ModelRendererTurbo(this, 24, 197, textureX, textureY); // Box 1533
		bodyModel[106] = new ModelRendererTurbo(this, 18, 195, textureX, textureY); // Box 1534
		bodyModel[107] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 1535
		bodyModel[108] = new ModelRendererTurbo(this, 43, 66, textureX, textureY); // Box 1536
		bodyModel[109] = new ModelRendererTurbo(this, 9, 58, textureX, textureY, "lamp"); // Box 1537 lamp gyralight F
		bodyModel[110] = new ModelRendererTurbo(this, 1, 58, textureX, textureY, "lamp"); // Box 1538 lamp gyralight F
		bodyModel[111] = new ModelRendererTurbo(this, 92, 35, textureX, textureY); // Box 1540
		bodyModel[112] = new ModelRendererTurbo(this, 106, 47, textureX, textureY); // Box 1542
		bodyModel[113] = new ModelRendererTurbo(this, 208, 115, textureX, textureY); // Box 192
		bodyModel[114] = new ModelRendererTurbo(this, 5, 43, textureX, textureY, "lamp"); // Box 193 lamp gyralight F
		bodyModel[115] = new ModelRendererTurbo(this, 221, 115, textureX, textureY); // Box 194
		bodyModel[116] = new ModelRendererTurbo(this, 21, 43, textureX, textureY, "lamp"); // Box 195 lamp gyralight R
		bodyModel[117] = new ModelRendererTurbo(this, 17, 58, textureX, textureY, "lamp"); // Box 196 lamp gyralight R
		bodyModel[118] = new ModelRendererTurbo(this, 25, 58, textureX, textureY, "lamp"); // Box 197 lamp gyralight R
		bodyModel[119] = new ModelRendererTurbo(this, 196, 194, textureX, textureY); // Box 198
		bodyModel[120] = new ModelRendererTurbo(this, 187, 194, textureX, textureY); // Box 199
		bodyModel[121] = new ModelRendererTurbo(this, 187, 189, textureX, textureY); // Box 200
		bodyModel[122] = new ModelRendererTurbo(this, 151, 94, textureX, textureY); // Box 211
		bodyModel[123] = new ModelRendererTurbo(this, 140, 94, textureX, textureY); // Box 212
		bodyModel[124] = new ModelRendererTurbo(this, 151, 96, textureX, textureY); // Box 213
		bodyModel[125] = new ModelRendererTurbo(this, 139, 96, textureX, textureY); // Box 214
		bodyModel[126] = new ModelRendererTurbo(this, 178, 194, textureX, textureY); // Box 215
		bodyModel[127] = new ModelRendererTurbo(this, 178, 189, textureX, textureY); // Box 216
		bodyModel[128] = new ModelRendererTurbo(this, 140, 92, textureX, textureY); // Box 217
		bodyModel[129] = new ModelRendererTurbo(this, 151, 92, textureX, textureY); // Box 218
		bodyModel[130] = new ModelRendererTurbo(this, 141, 90, textureX, textureY); // Box 219
		bodyModel[131] = new ModelRendererTurbo(this, 159, 96, textureX, textureY); // Box 220
		bodyModel[132] = new ModelRendererTurbo(this, 169, 194, textureX, textureY); // Box 221
		bodyModel[133] = new ModelRendererTurbo(this, 171, 96, textureX, textureY); // Box 222
		bodyModel[134] = new ModelRendererTurbo(this, 171, 94, textureX, textureY); // Box 223
		bodyModel[135] = new ModelRendererTurbo(this, 160, 94, textureX, textureY); // Box 224
		bodyModel[136] = new ModelRendererTurbo(this, 169, 189, textureX, textureY); // Box 225
		bodyModel[137] = new ModelRendererTurbo(this, 160, 92, textureX, textureY); // Box 226
		bodyModel[138] = new ModelRendererTurbo(this, 171, 92, textureX, textureY); // Box 227
		bodyModel[139] = new ModelRendererTurbo(this, 32, 83, textureX, textureY); // Box 228
		bodyModel[140] = new ModelRendererTurbo(this, 161, 90, textureX, textureY); // Box 229
		bodyModel[141] = new ModelRendererTurbo(this, 45, 83, textureX, textureY); // Box 230
		bodyModel[142] = new ModelRendererTurbo(this, 206, 129, textureX, textureY); // Box 232
		bodyModel[143] = new ModelRendererTurbo(this, 203, 142, textureX, textureY); // Box 233
		bodyModel[144] = new ModelRendererTurbo(this, 235, 142, textureX, textureY); // Box 234
		bodyModel[145] = new ModelRendererTurbo(this, 235, 150, textureX, textureY); // Box 235
		bodyModel[146] = new ModelRendererTurbo(this, 203, 150, textureX, textureY); // Box 236
		bodyModel[147] = new ModelRendererTurbo(this, 118, 37, textureX, textureY); // Box 237
		bodyModel[148] = new ModelRendererTurbo(this, 154, 164, textureX, textureY); // Box 238
		bodyModel[149] = new ModelRendererTurbo(this, 204, 169, textureX, textureY); // Box 249
		bodyModel[150] = new ModelRendererTurbo(this, 189, 148, textureX, textureY); // Box 250
		bodyModel[151] = new ModelRendererTurbo(this, 179, 141, textureX, textureY); // Box 241 sp light mount
		bodyModel[152] = new ModelRendererTurbo(this, 167, 131, textureX, textureY); // Box 242 sp light mount
		bodyModel[153] = new ModelRendererTurbo(this, 210, 164, textureX, textureY); // Box 351
		bodyModel[154] = new ModelRendererTurbo(this, 197, 164, textureX, textureY); // Box 352
		bodyModel[155] = new ModelRendererTurbo(this, 197, 167, textureX, textureY); // Box 353
		bodyModel[156] = new ModelRendererTurbo(this, 214, 183, textureX, textureY); // Box 354
		bodyModel[157] = new ModelRendererTurbo(this, 214, 186, textureX, textureY); // Box 355
		bodyModel[158] = new ModelRendererTurbo(this, 211, 183, textureX, textureY); // Box 356
		bodyModel[159] = new ModelRendererTurbo(this, 75, 69, textureX, textureY, "cull"); // Box 357 stair cull
		bodyModel[160] = new ModelRendererTurbo(this, 75, 69, textureX, textureY, "cull"); // Box 358 stair cull
		bodyModel[161] = new ModelRendererTurbo(this, 75, 69, textureX, textureY, "cull"); // Box 359 stair cull
		bodyModel[162] = new ModelRendererTurbo(this, 75, 69, textureX, textureY, "cull"); // Box 360 stair cull
		bodyModel[163] = new ModelRendererTurbo(this, 227, 183, textureX, textureY); // Box 361
		bodyModel[164] = new ModelRendererTurbo(this, 207, 169, textureX, textureY); // Box 362
		bodyModel[165] = new ModelRendererTurbo(this, 137, 148, textureX, textureY); // Box 363
		bodyModel[166] = new ModelRendererTurbo(this, 176, 150, textureX, textureY); // Box 364
		bodyModel[167] = new ModelRendererTurbo(this, 203, 131, textureX, textureY); // Box 365
		bodyModel[168] = new ModelRendererTurbo(this, 196, 148, textureX, textureY); // Box 366
		bodyModel[169] = new ModelRendererTurbo(this, 198, 169, textureX, textureY); // Box 367
		bodyModel[170] = new ModelRendererTurbo(this, 248, 148, textureX, textureY); // Box 370
		bodyModel[171] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 371
		bodyModel[172] = new ModelRendererTurbo(this, 186, 174, textureX, textureY); // Box 372
		bodyModel[173] = new ModelRendererTurbo(this, 183, 174, textureX, textureY); // Box 373
		bodyModel[174] = new ModelRendererTurbo(this, 192, 174, textureX, textureY); // Box 374
		bodyModel[175] = new ModelRendererTurbo(this, 189, 174, textureX, textureY); // Box 375
		bodyModel[176] = new ModelRendererTurbo(this, 36, 109, textureX, textureY); // Box 376
		bodyModel[177] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 377
		bodyModel[178] = new ModelRendererTurbo(this, 10, 200, textureX, textureY); // Box 267
		bodyModel[179] = new ModelRendererTurbo(this, 12, 197, textureX, textureY, "lamp"); // Box 268 commander beacon
		bodyModel[180] = new ModelRendererTurbo(this, 59, 186, textureX, textureY); // Box 380
		bodyModel[181] = new ModelRendererTurbo(this, 60, 189, textureX, textureY); // Box 381
		bodyModel[182] = new ModelRendererTurbo(this, 59, 183, textureX, textureY); // Box 382
		bodyModel[183] = new ModelRendererTurbo(this, 61, 192, textureX, textureY); // Box 383
		bodyModel[184] = new ModelRendererTurbo(this, 113, 40, textureX, textureY); // Box 384
		bodyModel[185] = new ModelRendererTurbo(this, 144, 150, textureX, textureY); // Box 385
		bodyModel[186] = new ModelRendererTurbo(this, 140, 109, textureX, textureY); // Box 386
		bodyModel[187] = new ModelRendererTurbo(this, 140, 100, textureX, textureY); // Box 387
		bodyModel[188] = new ModelRendererTurbo(this, 10, 93, textureX, textureY); // Box 143
		bodyModel[189] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Box 389
		bodyModel[190] = new ModelRendererTurbo(this, 93, 136, textureX, textureY, "cull"); // Box WW F1T cull
		bodyModel[191] = new ModelRendererTurbo(this, 91, 141, textureX, textureY, "cull"); // Box 311 WW F1B cull
		bodyModel[192] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 392
		bodyModel[193] = new ModelRendererTurbo(this, 129, 60, textureX, textureY); // Box 393
		bodyModel[194] = new ModelRendererTurbo(this, 128, 54, textureX, textureY); // Box 394
		bodyModel[195] = new ModelRendererTurbo(this, 114, 141, textureX, textureY, "cull"); // Box 395 WW E1B cull
		bodyModel[196] = new ModelRendererTurbo(this, 116, 136, textureX, textureY, "cull"); // Box 396 WW E1T cull
		bodyModel[197] = new ModelRendererTurbo(this, 82, 183, textureX, textureY); // Box 397
		bodyModel[198] = new ModelRendererTurbo(this, 82, 186, textureX, textureY); // Box 398
		bodyModel[199] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 399
		bodyModel[200] = new ModelRendererTurbo(this, 10, 145, textureX, textureY); // Box 114
		bodyModel[201] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 74
		bodyModel[202] = new ModelRendererTurbo(this, 15, 145, textureX, textureY); // Box 78
		bodyModel[203] = new ModelRendererTurbo(this, 132, 214, textureX, textureY); // Box 403
		bodyModel[204] = new ModelRendererTurbo(this, 149, 214, textureX, textureY); // Box 404
		bodyModel[205] = new ModelRendererTurbo(this, 135, 213, textureX, textureY); // Box 405
		bodyModel[206] = new ModelRendererTurbo(this, 142, 213, textureX, textureY); // Box 406
		bodyModel[207] = new ModelRendererTurbo(this, 149, 211, textureX, textureY); // Box 407
		bodyModel[208] = new ModelRendererTurbo(this, 142, 211, textureX, textureY); // Box 408
		bodyModel[209] = new ModelRendererTurbo(this, 88, 66, textureX, textureY); // Box 409
		bodyModel[210] = new ModelRendererTurbo(this, 88, 80, textureX, textureY); // Box 410
		bodyModel[211] = new ModelRendererTurbo(this, 133, 132, textureX, textureY); // Box 411
		bodyModel[212] = new ModelRendererTurbo(this, 237, 111, textureX, textureY); // Box 412
		bodyModel[213] = new ModelRendererTurbo(this, 29, 46, textureX, textureY, "lamp"); // Box 117 liveryimg 2
		bodyModel[214] = new ModelRendererTurbo(this, 29, 49, textureX, textureY, "lamp"); // Box 298 liveryimg 2
		bodyModel[215] = new ModelRendererTurbo(this, 1, 198, textureX, textureY); // Box 364 prime base
		bodyModel[216] = new ModelRendererTurbo(this, 1, 202, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[217] = new ModelRendererTurbo(this, 1, 210, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[218] = new ModelRendererTurbo(this, 1, 206, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[219] = new ModelRendererTurbo(this, 1, 214, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[220] = new ModelRendererTurbo(this, 101, 213, textureX, textureY); // Box 242
		bodyModel[221] = new ModelRendererTurbo(this, 98, 214, textureX, textureY); // Box 243
		bodyModel[222] = new ModelRendererTurbo(this, 108, 211, textureX, textureY); // Box 244
		bodyModel[223] = new ModelRendererTurbo(this, 115, 211, textureX, textureY); // Box 245
		bodyModel[224] = new ModelRendererTurbo(this, 108, 213, textureX, textureY); // Box 246
		bodyModel[225] = new ModelRendererTurbo(this, 115, 214, textureX, textureY); // Box 247
		bodyModel[226] = new ModelRendererTurbo(this, 166, 215, textureX, textureY); // Box 101
		bodyModel[227] = new ModelRendererTurbo(this, 166, 215, textureX, textureY); // Box 252
		bodyModel[228] = new ModelRendererTurbo(this, 166, 210, textureX, textureY, "lamp"); // Box 189 ditchlight f
		bodyModel[229] = new ModelRendererTurbo(this, 166, 210, textureX, textureY, "lamp"); // Box 190 ditchlight f
		bodyModel[230] = new ModelRendererTurbo(this, 91, 215, textureX, textureY); // Box 252
		bodyModel[231] = new ModelRendererTurbo(this, 91, 210, textureX, textureY, "lamp"); // Box 253 ditchlight r
		bodyModel[232] = new ModelRendererTurbo(this, 91, 215, textureX, textureY); // Box 254
		bodyModel[233] = new ModelRendererTurbo(this, 91, 210, textureX, textureY, "lamp"); // Box 255 ditchlight r
		bodyModel[234] = new ModelRendererTurbo(this, 125, 101, textureX, textureY); // Box 114
		bodyModel[235] = new ModelRendererTurbo(this, 126, 98, textureX, textureY); // Box 74
		bodyModel[236] = new ModelRendererTurbo(this, 122, 107, textureX, textureY); // Box 78
		bodyModel[237] = new ModelRendererTurbo(this, 118, 100, textureX, textureY); // Box 113
		bodyModel[238] = new ModelRendererTurbo(this, 116, 95, textureX, textureY); // Box 114
		bodyModel[239] = new ModelRendererTurbo(this, 121, 95, textureX, textureY); // Box 115
		bodyModel[240] = new ModelRendererTurbo(this, 115, 100, textureX, textureY); // Box 116
		bodyModel[241] = new ModelRendererTurbo(this, 115, 106, textureX, textureY); // Box 117
		bodyModel[242] = new ModelRendererTurbo(this, 70, 186, textureX, textureY); // Box 264
		bodyModel[243] = new ModelRendererTurbo(this, 72, 192, textureX, textureY); // Box 265
		bodyModel[244] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 266
		bodyModel[245] = new ModelRendererTurbo(this, 71, 189, textureX, textureY); // Box 267
		bodyModel[246] = new ModelRendererTurbo(this, 48, 183, textureX, textureY); // Box 268
		bodyModel[247] = new ModelRendererTurbo(this, 48, 186, textureX, textureY); // Box 269
		bodyModel[248] = new ModelRendererTurbo(this, 49, 189, textureX, textureY); // Box 271
		bodyModel[249] = new ModelRendererTurbo(this, 75, 76, textureX, textureY, "cull"); // Box 243 stair cull
		bodyModel[250] = new ModelRendererTurbo(this, 75, 76, textureX, textureY, "cull"); // Box 348 stair cull
		bodyModel[251] = new ModelRendererTurbo(this, 75, 76, textureX, textureY, "cull"); // Box 349 stair cull
		bodyModel[252] = new ModelRendererTurbo(this, 75, 76, textureX, textureY, "cull"); // Box 350 stair cull
		bodyModel[253] = new ModelRendererTurbo(this, 18, 117, textureX, textureY); // Box 377
		bodyModel[254] = new ModelRendererTurbo(this, 41, 136, textureX, textureY); // Box 378
		bodyModel[255] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 148
		bodyModel[256] = new ModelRendererTurbo(this, 5, 128, textureX, textureY); // Box 150
		bodyModel[257] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 152
		bodyModel[258] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 383
		bodyModel[259] = new ModelRendererTurbo(this, 10, 89, textureX, textureY); // Box 384
		bodyModel[260] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 385 tank extra 1
		bodyModel[261] = new ModelRendererTurbo(this, 171, 96, textureX, textureY); // Box 386
		bodyModel[262] = new ModelRendererTurbo(this, 159, 96, textureX, textureY); // Box 387
		bodyModel[263] = new ModelRendererTurbo(this, 160, 94, textureX, textureY); // Box 388
		bodyModel[264] = new ModelRendererTurbo(this, 171, 94, textureX, textureY); // Box 389
		bodyModel[265] = new ModelRendererTurbo(this, 160, 92, textureX, textureY); // Box 390
		bodyModel[266] = new ModelRendererTurbo(this, 171, 92, textureX, textureY); // Box 391
		bodyModel[267] = new ModelRendererTurbo(this, 161, 90, textureX, textureY); // Box 392
		bodyModel[268] = new ModelRendererTurbo(this, 151, 96, textureX, textureY); // Box 393
		bodyModel[269] = new ModelRendererTurbo(this, 139, 96, textureX, textureY); // Box 394
		bodyModel[270] = new ModelRendererTurbo(this, 151, 94, textureX, textureY); // Box 395
		bodyModel[271] = new ModelRendererTurbo(this, 140, 94, textureX, textureY); // Box 396
		bodyModel[272] = new ModelRendererTurbo(this, 140, 92, textureX, textureY); // Box 397
		bodyModel[273] = new ModelRendererTurbo(this, 151, 92, textureX, textureY); // Box 398
		bodyModel[274] = new ModelRendererTurbo(this, 141, 90, textureX, textureY); // Box 399
		bodyModel[275] = new ModelRendererTurbo(this, 26, 157, textureX, textureY); // Box 301
		bodyModel[276] = new ModelRendererTurbo(this, 11, 157, textureX, textureY); // Box 302
		bodyModel[277] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 303
		bodyModel[278] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 304
		bodyModel[279] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 305
		bodyModel[280] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 306
		bodyModel[281] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 307
		bodyModel[282] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 308
		bodyModel[283] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 309
		bodyModel[284] = new ModelRendererTurbo(this, 41, 183, textureX, textureY); // Box 310
		bodyModel[285] = new ModelRendererTurbo(this, 71, 195, textureX, textureY); // Box 425
		bodyModel[286] = new ModelRendererTurbo(this, 73, 191, textureX, textureY); // Box 311
		bodyModel[287] = new ModelRendererTurbo(this, 73, 191, textureX, textureY); // Box 312
		bodyModel[288] = new ModelRendererTurbo(this, 169, 64, textureX, textureY); // Box 291
		bodyModel[289] = new ModelRendererTurbo(this, 169, 64, textureX, textureY); // Box 292
		bodyModel[290] = new ModelRendererTurbo(this, 136, 225, textureX, textureY); // Box 293
		bodyModel[291] = new ModelRendererTurbo(this, 136, 227, textureX, textureY); // Box 294
		bodyModel[292] = new ModelRendererTurbo(this, 144, 140, textureX, textureY); // Box 364
		bodyModel[293] = new ModelRendererTurbo(this, 176, 140, textureX, textureY); // Box 296
		bodyModel[294] = new ModelRendererTurbo(this, 235, 140, textureX, textureY); // Box 297
		bodyModel[295] = new ModelRendererTurbo(this, 203, 140, textureX, textureY); // Box 298
		bodyModel[296] = new ModelRendererTurbo(this, 171, 137, textureX, textureY); // Box 299
		bodyModel[297] = new ModelRendererTurbo(this, 166, 137, textureX, textureY); // Box 301
		bodyModel[298] = new ModelRendererTurbo(this, 243, 147, textureX, textureY); // Box 302
		bodyModel[299] = new ModelRendererTurbo(this, 238, 147, textureX, textureY); // Box 303
		bodyModel[300] = new ModelRendererTurbo(this, 106, 47, textureX, textureY); // Box 304
		bodyModel[301] = new ModelRendererTurbo(this, 92, 35, textureX, textureY); // Box 305

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39F, 2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 2
		bodyModel[1].setRotationPoint(-36.5F, 1.5F, -2.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 27, 16, 14, 0F); // Box 2
		bodyModel[2].setRotationPoint(-29F, -17F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 0
		bodyModel[3].setRotationPoint(-30F, -1F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 26
		bodyModel[4].setRotationPoint(35F, 2F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Box 27
		bodyModel[5].setRotationPoint(33.5F, 1.5F, -2.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 69, 3, 14, 0F); // Box 52
		bodyModel[6].setRotationPoint(-35F, -1F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[7].setRotationPoint(-32F, -1F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[8].setRotationPoint(-32F, -1F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[9].setRotationPoint(-33F, 2F, -3F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 141
		bodyModel[10].setRotationPoint(-35F, 2F, -3F);

		bodyModel[11].addBox(0F, 0F, 0F, 59, 1, 4, 0F); // Box 206
		bodyModel[11].setRotationPoint(-30F, -1F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 458
		bodyModel[12].setRotationPoint(-37F, -2F, -2F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 468
		bodyModel[13].setRotationPoint(34F, -2F, -2F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 490
		bodyModel[14].setRotationPoint(28F, -10F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 500
		bodyModel[15].setRotationPoint(15F, -17.75F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 502
		bodyModel[16].setRotationPoint(28F, -17F, -1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[17].setRotationPoint(28F, -17F, 1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 504
		bodyModel[18].setRotationPoint(29F, -10F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[19].setRotationPoint(28F, -17F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[20].setRotationPoint(28F, -13F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[21].setRotationPoint(28F, -13F, 1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[22].setRotationPoint(28F, -13F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[23].setRotationPoint(28F, -13F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 162 lamp R
		bodyModel[24].setRotationPoint(29.5F, -14.25F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 163 lamp R
		bodyModel[25].setRotationPoint(29.5F, -16.25F, -1F);

		bodyModel[26].addBox(0F, 0F, 0F, 13, 6, 16, 0F); // Box 178 tank main
		bodyModel[26].setRotationPoint(-7F, 1F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 201
		bodyModel[27].setRotationPoint(-21F, 2F, -2F);

		bodyModel[28].addBox(0F, 0F, -3F, 1, 1, 4, 0F); // Box 202
		bodyModel[28].setRotationPoint(-6.5F, 2F, -8F);
		bodyModel[28].rotateAngleX = -0.64577182F;

		bodyModel[29].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 224
		bodyModel[29].setRotationPoint(10F, -9F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 28, 8, 0, 0F); // Box 225
		bodyModel[30].setRotationPoint(-30F, -9F, 11F);

		bodyModel[31].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 228
		bodyModel[31].setRotationPoint(-35F, -10F, -7F);

		bodyModel[32].addBox(0F, 0F, -1F, 1, 1, 4, 0F); // Box 237
		bodyModel[32].setRotationPoint(-6.5F, 2F, 8F);
		bodyModel[32].rotateAngleX = 0.64577182F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 245
		bodyModel[33].setRotationPoint(-20F, 0F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 250
		bodyModel[34].setRotationPoint(17F, 0F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 560
		bodyModel[35].setRotationPoint(-5.5F, 0F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 562
		bodyModel[36].setRotationPoint(-5.5F, 0F, 8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 564 tank extra1
		bodyModel[37].setRotationPoint(-7F, 4F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569 tank extra 1
		bodyModel[38].setRotationPoint(-7F, 4F, 8F);

		bodyModel[39].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 682
		bodyModel[39].setRotationPoint(-35.01F, -1F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 708
		bodyModel[40].setRotationPoint(-35F, -9F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 709
		bodyModel[41].setRotationPoint(-35F, -9F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 ditchlight f
		bodyModel[42].setRotationPoint(-36F, -1F, -6.75F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 360 cull
		bodyModel[43].setRotationPoint(-35.75F, -1F, -6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 272 ditchlight r
		bodyModel[44].setRotationPoint(34F, -1F, -6.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 273 cull
		bodyModel[45].setRotationPoint(33.75F, -1F, -6.75F);

		bodyModel[46].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[46].setRotationPoint(29.85F, -16F, 1.5F);
		bodyModel[46].rotateAngleY = 0.31415927F;

		bodyModel[47].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 298 liveryimg 2
		bodyModel[47].setRotationPoint(29.85F, -16F, -1.5F);
		bodyModel[47].rotateAngleY = -0.31415927F;

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 318
		bodyModel[48].setRotationPoint(16F, 2F, -2F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 320 cull
		bodyModel[49].setRotationPoint(-35.75F, -1F, 4.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 321 ditchlight f
		bodyModel[50].setRotationPoint(-36F, -1F, 4.75F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 322 cull
		bodyModel[51].setRotationPoint(33.75F, -1F, 4.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 323 ditchlight r
		bodyModel[52].setRotationPoint(34F, -1F, 4.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
		bodyModel[53].setRotationPoint(30F, 2F, -3F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 325
		bodyModel[54].setRotationPoint(32F, 2F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 401
		bodyModel[55].setRotationPoint(-30F, 0F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[56].setRotationPoint(-31F, -13F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[57].setRotationPoint(-31F, -13F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 406
		bodyModel[58].setRotationPoint(-31F, -17F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[59].setRotationPoint(-31F, -13F, 1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 408
		bodyModel[60].setRotationPoint(-31F, -13F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 409
		bodyModel[61].setRotationPoint(-31F, -17F, 1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[62].setRotationPoint(-31F, -17F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 411 lamp F
		bodyModel[63].setRotationPoint(-31.5F, -14.25F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 lamp F
		bodyModel[64].setRotationPoint(-31.5F, -16.25F, -1F);

		bodyModel[65].addBox(0F, 0F, 0F, 18, 16, 14, 0F); // Box 938
		bodyModel[65].setRotationPoint(10F, -17F, -7F);

		bodyModel[66].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 939
		bodyModel[66].setRotationPoint(-1F, -23F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 12, 8, 22, 0F); // Box 940
		bodyModel[67].setRotationPoint(-2F, -9F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 944
		bodyModel[68].setRotationPoint(-2F, -23F, 10F);

		bodyModel[69].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 945
		bodyModel[69].setRotationPoint(-3F, -26F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 946
		bodyModel[70].setRotationPoint(-3F, -24F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 947
		bodyModel[71].setRotationPoint(-3F, -24F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1150
		bodyModel[72].setRotationPoint(-4F, -24F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 1151
		bodyModel[73].setRotationPoint(-4F, -26F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1152
		bodyModel[74].setRotationPoint(-4F, -24F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 1153
		bodyModel[75].setRotationPoint(11F, -24F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 1154
		bodyModel[76].setRotationPoint(11F, -26F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1155
		bodyModel[77].setRotationPoint(11F, -24F, 7F);

		bodyModel[78].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[78].setRotationPoint(9.5F, -23F, 7.5F);

		bodyModel[79].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 315 door swing right
		bodyModel[79].setRotationPoint(-1.5F, -23F, -7.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 1158
		bodyModel[80].setRotationPoint(9F, -23F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 1159
		bodyModel[81].setRotationPoint(-2F, -23F, -7F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 1510
		bodyModel[82].setRotationPoint(-2F, -25F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1511
		bodyModel[83].setRotationPoint(-2F, -25F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1512
		bodyModel[84].setRotationPoint(9F, -25F, -10F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 1513
		bodyModel[85].setRotationPoint(9F, -25F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1514
		bodyModel[86].setRotationPoint(9F, -25F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1515
		bodyModel[87].setRotationPoint(-2F, -25F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 1516
		bodyModel[88].setRotationPoint(-31F, -10F, -6F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 9, 14, 0F); // Box 1517
		bodyModel[89].setRotationPoint(-30F, -10F, -7F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 1518
		bodyModel[90].setRotationPoint(-31F, -12F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 1519
		bodyModel[91].setRotationPoint(-31F, -12F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 1520
		bodyModel[92].setRotationPoint(-31F, -12F, 6F);

		bodyModel[93].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1521
		bodyModel[93].setRotationPoint(-29.75F, -11.5F, -5.75F);
		bodyModel[93].rotateAngleY = 0.78539816F;

		bodyModel[94].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1522
		bodyModel[94].setRotationPoint(-29.75F, -11.5F, 5.75F);
		bodyModel[94].rotateAngleY = -0.78539816F;

		bodyModel[95].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 1523
		bodyModel[95].setRotationPoint(28F, -12F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1524
		bodyModel[96].setRotationPoint(28F, -12F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 1525
		bodyModel[97].setRotationPoint(28F, -12F, -7F);

		bodyModel[98].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1526
		bodyModel[98].setRotationPoint(28.75F, -11.5F, -5.75F);
		bodyModel[98].rotateAngleY = 0.78539816F;

		bodyModel[99].addBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F); // Box 1527
		bodyModel[99].setRotationPoint(28.75F, -11.5F, 5.75F);
		bodyModel[99].rotateAngleY = -0.78539816F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 1528
		bodyModel[100].setRotationPoint(-5.5F, 3F, 8F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 1529
		bodyModel[101].setRotationPoint(-4F, -25F, -1.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 2, 3, 0F); // Box 1530
		bodyModel[102].setRotationPoint(-10F, -19F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1531
		bodyModel[103].setRotationPoint(-3F, -18F, -1.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 1532
		bodyModel[104].setRotationPoint(-3F, -19F, -1.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 1533
		bodyModel[105].setRotationPoint(-11F, -18F, -1.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1534
		bodyModel[106].setRotationPoint(-11F, -19F, -1.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 10, 4, 0F); // Box 1535
		bodyModel[107].setRotationPoint(-11F, -27F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 1536
		bodyModel[108].setRotationPoint(-24F, -17.5F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1537 lamp gyralight F
		bodyModel[109].setRotationPoint(-31.5F, -12.25F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1538 lamp gyralight F
		bodyModel[110].setRotationPoint(-31.5F, -12.25F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 1540
		bodyModel[111].setRotationPoint(-27F, -15F, 6.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 1542
		bodyModel[112].setRotationPoint(17F, -10F, 6.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 192
		bodyModel[113].setRotationPoint(-31.25F, -18.5F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 193 lamp gyralight F
		bodyModel[114].setRotationPoint(-31.5F, -18.5F, -1F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 194
		bodyModel[115].setRotationPoint(28.25F, -18.5F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 195 lamp gyralight R
		bodyModel[116].setRotationPoint(29.5F, -18.5F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 196 lamp gyralight R
		bodyModel[117].setRotationPoint(29.5F, -12.25F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 197 lamp gyralight R
		bodyModel[118].setRotationPoint(29.5F, -12.25F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 198
		bodyModel[119].setRotationPoint(-30F, 4F, -11F);
		bodyModel[119].rotateAngleY = 0.46251225F;

		bodyModel[120].addShapeBox(0F, 0F, -4F, 0, 3, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[120].setRotationPoint(-30F, 4F, 11F);
		bodyModel[120].rotateAngleY = -0.46251225F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[121].setRotationPoint(-30F, 0F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 211
		bodyModel[122].setRotationPoint(30F, 3F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 212
		bodyModel[123].setRotationPoint(30F, 4F, 9F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 213
		bodyModel[124].setRotationPoint(30F, 6F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 214
		bodyModel[125].setRotationPoint(30F, 7F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, -4F, 0, 3, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[126].setRotationPoint(29F, 4F, 11F);
		bodyModel[126].rotateAngleY = 0.46251225F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[127].setRotationPoint(29F, 0F, 7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[128].setRotationPoint(30F, 1.5F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 218
		bodyModel[129].setRotationPoint(31F, 0.5F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		bodyModel[130].setRotationPoint(31F, -1F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[131].setRotationPoint(30F, 7F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 221
		bodyModel[132].setRotationPoint(29F, 4F, -11F);
		bodyModel[132].rotateAngleY = -0.46251225F;

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 222
		bodyModel[133].setRotationPoint(30F, 6F, -9F);

		bodyModel[134].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 223
		bodyModel[134].setRotationPoint(30F, 3F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[135].setRotationPoint(30F, 4F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 225
		bodyModel[136].setRotationPoint(29F, 0F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[137].setRotationPoint(30F, 1.5F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 227
		bodyModel[138].setRotationPoint(31F, 0.5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[139].setRotationPoint(29F, -1F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[140].setRotationPoint(31F, -1F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[141].setRotationPoint(29F, -1F, 7F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 232
		bodyModel[142].setRotationPoint(34F, -10F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 233
		bodyModel[143].setRotationPoint(34F, -9F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 234
		bodyModel[144].setRotationPoint(34F, -9F, 8F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 235
		bodyModel[145].setRotationPoint(34F, -2F, 10F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 236
		bodyModel[146].setRotationPoint(34F, -2F, -11F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 237
		bodyModel[147].setRotationPoint(10F, -25F, -0.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 21, 8, 0, 0F); // Box 238
		bodyModel[148].setRotationPoint(-30F, -9F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[149].setRotationPoint(-30.5F, -8F, -11F);
		bodyModel[149].rotateAngleY = 0.4712389F;

		bodyModel[150].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 250
		bodyModel[150].setRotationPoint(-30.5F, -9F, -11F);
		bodyModel[150].rotateAngleY = 0.4712389F;

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 241 sp light mount
		bodyModel[151].setRotationPoint(29.25F, -12.25F, -2F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 242 sp light mount
		bodyModel[152].setRotationPoint(-31.25F, -12.25F, -2F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 351
		bodyModel[153].setRotationPoint(-3F, -17F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[154].setRotationPoint(-9F, -9F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[155].setRotationPoint(-9F, -6F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 354
		bodyModel[156].setRotationPoint(11F, -9F, 11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 355
		bodyModel[157].setRotationPoint(11F, -6F, 11F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 356
		bodyModel[158].setRotationPoint(10F, -17F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 357 stair cull
		bodyModel[159].setRotationPoint(9.5F, -9F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 358 stair cull
		bodyModel[160].setRotationPoint(11F, -7F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 359 stair cull
		bodyModel[161].setRotationPoint(12.5F, -5F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 360 stair cull
		bodyModel[162].setRotationPoint(14F, -3F, 7F);

		bodyModel[163].addBox(0F, 0F, 0F, 12, 8, 0, 0F); // Box 361
		bodyModel[163].setRotationPoint(17F, -9F, 11F);

		bodyModel[164].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[164].setRotationPoint(-30.5F, -8F, 11F);
		bodyModel[164].rotateAngleY = -0.4712389F;

		bodyModel[165].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 363
		bodyModel[165].setRotationPoint(-30.5F, -9F, 11F);
		bodyModel[165].rotateAngleY = -0.4712389F;

		bodyModel[166].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 364
		bodyModel[166].setRotationPoint(-35F, -2F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 0, 9, 22, 0F); // Box 365
		bodyModel[167].setRotationPoint(34.01F, -1F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 0, 11, 3, 0F); // Box 366
		bodyModel[168].setRotationPoint(29.5F, -9F, -11F);
		bodyModel[168].rotateAngleY = -0.4712389F;

		bodyModel[169].addShapeBox(0F, 0F, 1F, 0, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[169].setRotationPoint(29.5F, -8F, -11F);
		bodyModel[169].rotateAngleY = -0.4712389F;

		bodyModel[170].addBox(0F, 0F, -3F, 0, 11, 3, 0F); // Box 370
		bodyModel[170].setRotationPoint(29.5F, -9F, 11F);
		bodyModel[170].rotateAngleY = 0.4712389F;

		bodyModel[171].addShapeBox(0F, 0F, -2F, 0, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[171].setRotationPoint(29.5F, -8F, 11F);
		bodyModel[171].rotateAngleY = 0.4712389F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 372
		bodyModel[172].setRotationPoint(-31F, -9F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[173].setRotationPoint(-31F, -9F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[174].setRotationPoint(29F, -9F, 11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[175].setRotationPoint(29F, -9F, -11F);

		bodyModel[176].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 376
		bodyModel[176].setRotationPoint(10.5F, -27F, -0.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 377
		bodyModel[177].setRotationPoint(-6F, -18F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 267
		bodyModel[178].setRotationPoint(10.7F, -27F, -0.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 268 commander beacon
		bodyModel[179].setRotationPoint(10.55F, -27F, -0.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 380
		bodyModel[180].setRotationPoint(-6F, -27.5F, 3F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 381
		bodyModel[181].setRotationPoint(-5F, -27.5F, 5F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 382
		bodyModel[182].setRotationPoint(-5F, -27.5F, 4F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 383
		bodyModel[183].setRotationPoint(-4F, -27F, 4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 6, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[184].setRotationPoint(10F, -23F, 0F);

		bodyModel[185].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 385
		bodyModel[185].setRotationPoint(-35F, -2F, 10F);

		bodyModel[186].addBox(0F, 0F, 0F, 12, 0, 2, 0F); // Box 386
		bodyModel[186].setRotationPoint(-2F, -23F, 11F);
		bodyModel[186].rotateAngleX = -0.87266463F;

		bodyModel[187].addBox(0F, 0F, -2F, 12, 0, 2, 0F); // Box 387
		bodyModel[187].setRotationPoint(-2F, -23F, -11F);
		bodyModel[187].rotateAngleX = 0.87266463F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[188].setRotationPoint(-29.5F, -17.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 389
		bodyModel[189].setRotationPoint(26.5F, -17.5F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box WW F1T cull
		bodyModel[190].setRotationPoint(2F, -23F, -13F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311 WW F1B cull
		bodyModel[191].setRotationPoint(2F, -22F, -15F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 392
		bodyModel[192].setRotationPoint(14F, -17.75F, -4F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 393
		bodyModel[193].setRotationPoint(25F, -17.75F, 2F);

		bodyModel[194].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Box 394
		bodyModel[194].setRotationPoint(15.5F, -17.25F, -5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 395 WW E1B cull
		bodyModel[195].setRotationPoint(0F, -22F, 10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 396 WW E1T cull
		bodyModel[196].setRotationPoint(0F, -23F, 10F);

		bodyModel[197].addBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F); // Box 397
		bodyModel[197].setRotationPoint(-5F, -25.75F, 8.5F);
		bodyModel[197].rotateAngleX = -0.66322512F;

		bodyModel[198].addBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 398
		bodyModel[198].setRotationPoint(-4F, -25F, 9.5F);
		bodyModel[198].rotateAngleX = -0.66322512F;

		bodyModel[199].addBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 399
		bodyModel[199].setRotationPoint(-3.5F, -25F, 8.75F);
		bodyModel[199].rotateAngleX = -0.66322512F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[200].setRotationPoint(-8F, 0.75F, 9.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[201].setRotationPoint(-8F, -0.25F, 9.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[202].setRotationPoint(-7.75F, 1.25F, 9.75F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 403
		bodyModel[203].setRotationPoint(-36F, 6F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 404
		bodyModel[204].setRotationPoint(-36F, 6F, 3F);

		bodyModel[205].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 405
		bodyModel[205].setRotationPoint(-38F, 7F, -10F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 406
		bodyModel[206].setRotationPoint(-38F, 7F, 3F);

		bodyModel[207].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 407
		bodyModel[207].setRotationPoint(-38F, 6F, 3F);

		bodyModel[208].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 408
		bodyModel[208].setRotationPoint(-38F, 6F, -3F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 409
		bodyModel[209].setRotationPoint(-35F, -2F, -6F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 12, 0F); // Box 410
		bodyModel[210].setRotationPoint(30F, -2F, -6F);

		bodyModel[211].addBox(0F, -0.5F, 0F, 5, 1, 4, 0F); // Box 411
		bodyModel[211].setRotationPoint(-35.5F, -5.5F, -2F);
		bodyModel[211].rotateAngleZ = -1.46607657F;

		bodyModel[212].addBox(0F, -0.5F, 0F, 5, 1, 4, 0F); // Box 412
		bodyModel[212].setRotationPoint(34.5F, -5.5F, -2F);
		bodyModel[212].rotateAngleZ = -1.67551608F;

		bodyModel[213].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2
		bodyModel[213].setRotationPoint(-30.85F, -16F, 1.5F);
		bodyModel[213].rotateAngleY = -0.31415927F;

		bodyModel[214].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 298 liveryimg 2
		bodyModel[214].setRotationPoint(-30.85F, -16F, -1.5F);
		bodyModel[214].rotateAngleY = 0.31415927F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[215].setRotationPoint(10F, -27F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[216].setRotationPoint(10F, -27.5F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[217].setRotationPoint(10F, -27.5F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[218].setRotationPoint(10F, -27.5F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[219].setRotationPoint(10F, -27.5F, -1F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 242
		bodyModel[220].setRotationPoint(34F, 7F, -10F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 243
		bodyModel[221].setRotationPoint(34F, 6F, -10F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 244
		bodyModel[222].setRotationPoint(34F, 6F, -3F);

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 245
		bodyModel[223].setRotationPoint(34F, 6F, 3F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 0, 7, 0F); // Box 246
		bodyModel[224].setRotationPoint(34F, 7F, 3F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 247
		bodyModel[225].setRotationPoint(34F, 6F, 3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[226].setRotationPoint(-35F, -4F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[227].setRotationPoint(-35F, -4F, -5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[228].setRotationPoint(-35.25F, -4F, 3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[229].setRotationPoint(-35.25F, -4F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 252
		bodyModel[230].setRotationPoint(33F, -4F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 253 ditchlight r
		bodyModel[231].setRotationPoint(33.25F, -4F, 3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		bodyModel[232].setRotationPoint(33F, -4F, -5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 255 ditchlight r
		bodyModel[233].setRotationPoint(33.25F, -4F, -5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[234].setRotationPoint(-12.5F, -20F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[235].setRotationPoint(-12.5F, -21F, -0.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[236].setRotationPoint(-12.25F, -19.5F, -0.25F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[237].setRotationPoint(-12.5F, -18F, -2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 114
		bodyModel[238].setRotationPoint(-12.5F, -21F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[239].setRotationPoint(-12.5F, -21F, 1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[240].setRotationPoint(-12.5F, -21.5F, -1F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 117
		bodyModel[241].setRotationPoint(-12.5F, -17.5F, -1F);

		bodyModel[242].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 264
		bodyModel[242].setRotationPoint(-5F, -27.5F, -0.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 265
		bodyModel[243].setRotationPoint(-4F, -27F, -0.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 266
		bodyModel[244].setRotationPoint(-6F, -27.5F, -1.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 267
		bodyModel[245].setRotationPoint(-5F, -27.5F, 0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 268
		bodyModel[246].setRotationPoint(-6F, -25F, 3F);

		bodyModel[247].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 269
		bodyModel[247].setRotationPoint(-5F, -25F, 4F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 271
		bodyModel[248].setRotationPoint(-5F, -25F, 5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 243 stair cull
		bodyModel[249].setRotationPoint(-3.5F, -9F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 348 stair cull
		bodyModel[250].setRotationPoint(-5F, -7F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 349 stair cull
		bodyModel[251].setRotationPoint(-6.5F, -5F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 350 stair cull
		bodyModel[252].setRotationPoint(-8F, -3F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -5F, -2F); // Box 377
		bodyModel[253].setRotationPoint(-1F, -22F, -1F);

		bodyModel[254].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 378
		bodyModel[254].setRotationPoint(-1F, -18F, 3.75F);

		bodyModel[255].addBox(0F, 0F, 0F, 8, 7, 2, 0F); // Box 148
		bodyModel[255].setRotationPoint(-1F, -16.01F, -3F);
		bodyModel[255].rotateAngleY = -0.61086524F;

		bodyModel[256].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 150
		bodyModel[256].setRotationPoint(2F, -18.01F, -5.25F);
		bodyModel[256].rotateAngleY = -0.57595865F;

		bodyModel[257].addBox(0F, 0F, 0F, 2, 8, 6, 0F); // Box 152
		bodyModel[257].setRotationPoint(0F, -17.01F, -3F);
		bodyModel[257].rotateAngleY = 0.15707963F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 383
		bodyModel[258].setRotationPoint(26.5F, -18.5F, -1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 384
		bodyModel[259].setRotationPoint(-29.5F, -18.5F, -1F);

		bodyModel[260].addBox(0F, 0F, 0F, 13, 1, 16, 0F); // Box 385 tank extra 1
		bodyModel[260].setRotationPoint(-7F, 7F, -8F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 386
		bodyModel[261].setRotationPoint(-35F, 6F, -9F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[262].setRotationPoint(-35F, 7F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[263].setRotationPoint(-35F, 4F, -10F);

		bodyModel[264].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 389
		bodyModel[264].setRotationPoint(-35F, 3F, -9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[265].setRotationPoint(-35F, 1.5F, -9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[266].setRotationPoint(-35F, 0.5F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[267].setRotationPoint(-35F, -1F, -8F);

		bodyModel[268].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 393
		bodyModel[268].setRotationPoint(-35F, 6F, 9F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[269].setRotationPoint(-35F, 7F, 9F);

		bodyModel[270].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[270].setRotationPoint(-35F, 3F, 9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[271].setRotationPoint(-35F, 4F, 9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[272].setRotationPoint(-35F, 1.5F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[273].setRotationPoint(-35F, 0.5F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[274].setRotationPoint(-35F, -1F, 7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[275].setRotationPoint(-36.5F, 0.5F, -2.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[276].setRotationPoint(33.5F, 0.5F, -2.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[277].setRotationPoint(-36.5F, 1.5F, -3.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 304
		bodyModel[278].setRotationPoint(-36.5F, 1.5F, 2.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 305
		bodyModel[279].setRotationPoint(33.5F, 1.5F, 2.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[280].setRotationPoint(33.5F, 1.5F, -3.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[281].setRotationPoint(-36.5F, 4.5F, -3.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 308
		bodyModel[282].setRotationPoint(-36.5F, 4.5F, 2.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 309
		bodyModel[283].setRotationPoint(33.5F, 4.5F, 2.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[284].setRotationPoint(33.5F, 4.5F, -3.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[285].setRotationPoint(8F, -27F, 2F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[286].setRotationPoint(-38F, 6F, -3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[287].setRotationPoint(34F, 6F, -3F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 291
		bodyModel[288].setRotationPoint(-18F, 0F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 292
		bodyModel[289].setRotationPoint(15F, 0F, -11F);

		bodyModel[290].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 293
		bodyModel[290].setRotationPoint(-30F, 0F, -11.01F);

		bodyModel[291].addBox(0F, 0F, 0F, 59, 1, 0, 0F); // Box 294
		bodyModel[291].setRotationPoint(-30F, 0F, 11.01F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[292].setRotationPoint(-35F, -8F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
		bodyModel[293].setRotationPoint(-35F, -8F, -7F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 297
		bodyModel[294].setRotationPoint(34F, -8F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[295].setRotationPoint(34F, -8F, 6F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 299
		bodyModel[296].setRotationPoint(-35F, -4F, -8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[297].setRotationPoint(-35F, -4F, 6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[298].setRotationPoint(34F, -4F, 6F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 303
		bodyModel[299].setRotationPoint(34F, -4F, -8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 304
		bodyModel[300].setRotationPoint(17F, -10F, -7.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 305
		bodyModel[301].setRotationPoint(-27F, -15F, -7.5F);
	}
	ModelTypeB typeB = new ModelTypeB();
	//ModelHiAd hiad = new ModelHiAd();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 302; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 135461||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7234||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8546||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5546) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.28, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.35, 0, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13244||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 12345) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/hiad_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.55, 0.33, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.05, 0, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.2, 0.28, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.35, 0, 0);
			typeB.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
}