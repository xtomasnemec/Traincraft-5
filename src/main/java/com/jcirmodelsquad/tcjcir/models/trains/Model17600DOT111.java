//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 17600galTank
// Model Creator: Bidahochi
// Created on: 09.12.2021 - 17:42:14
// Last changed on: 09.12.2021 - 17:42:14

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class Model17600DOT111 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public Model17600DOT111() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[195];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 28, 75, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 137, 67, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 28, 75, textureX, textureY); // Box 1 coupler
		bodyModel[3] = new ModelRendererTurbo(this, 43, 82, textureX, textureY); // Box 28
		bodyModel[4] = new ModelRendererTurbo(this, 43, 82, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 12, 76, textureX, textureY); // Box 141
		bodyModel[6] = new ModelRendererTurbo(this, 196, 121, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 217, 122, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 237, 122, textureX, textureY); // Box 5
		bodyModel[9] = new ModelRendererTurbo(this, 256, 121, textureX, textureY); // Box 4
		bodyModel[10] = new ModelRendererTurbo(this, 196, 147, textureX, textureY); // Box 4
		bodyModel[11] = new ModelRendererTurbo(this, 217, 148, textureX, textureY); // Box 5
		bodyModel[12] = new ModelRendererTurbo(this, 237, 148, textureX, textureY); // Box 5
		bodyModel[13] = new ModelRendererTurbo(this, 256, 147, textureX, textureY); // Box 4
		bodyModel[14] = new ModelRendererTurbo(this, 246, 135, textureX, textureY); // Box 3
		bodyModel[15] = new ModelRendererTurbo(this, 208, 135, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 227, 135, textureX, textureY); // Box 3
		bodyModel[17] = new ModelRendererTurbo(this, 127, 74, textureX, textureY, "cull"); // Box 75 cull platform
		bodyModel[18] = new ModelRendererTurbo(this, 196, 74, textureX, textureY, "cull"); // Box 206 cull platform
		bodyModel[19] = new ModelRendererTurbo(this, 88, 135, textureX, textureY); // Box 207
		bodyModel[20] = new ModelRendererTurbo(this, 98, 148, textureX, textureY); // Box 208
		bodyModel[21] = new ModelRendererTurbo(this, 78, 148, textureX, textureY); // Box 209
		bodyModel[22] = new ModelRendererTurbo(this, 57, 147, textureX, textureY); // Box 210
		bodyModel[23] = new ModelRendererTurbo(this, 69, 135, textureX, textureY); // Box 211
		bodyModel[24] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 212
		bodyModel[25] = new ModelRendererTurbo(this, 78, 122, textureX, textureY); // Box 213
		bodyModel[26] = new ModelRendererTurbo(this, 98, 122, textureX, textureY); // Box 214
		bodyModel[27] = new ModelRendererTurbo(this, 117, 121, textureX, textureY); // Box 215
		bodyModel[28] = new ModelRendererTurbo(this, 107, 135, textureX, textureY); // Box 216
		bodyModel[29] = new ModelRendererTurbo(this, 117, 147, textureX, textureY); // Box 217
		bodyModel[30] = new ModelRendererTurbo(this, 195, 195, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 173, 178, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 177, 165, textureX, textureY); // Box 5
		bodyModel[33] = new ModelRendererTurbo(this, 241, 165, textureX, textureY); // Box 5
		bodyModel[34] = new ModelRendererTurbo(this, 237, 178, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 173, 222, textureX, textureY); // Box 4
		bodyModel[36] = new ModelRendererTurbo(this, 177, 239, textureX, textureY); // Box 5
		bodyModel[37] = new ModelRendererTurbo(this, 241, 239, textureX, textureY); // Box 5
		bodyModel[38] = new ModelRendererTurbo(this, 237, 222, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 38, 165, textureX, textureY); // Box 227
		bodyModel[40] = new ModelRendererTurbo(this, 103, 165, textureX, textureY); // Box 228
		bodyModel[41] = new ModelRendererTurbo(this, 98, 178, textureX, textureY); // Box 229
		bodyModel[42] = new ModelRendererTurbo(this, 34, 178, textureX, textureY); // Box 230
		bodyModel[43] = new ModelRendererTurbo(this, 56, 195, textureX, textureY); // Box 231
		bodyModel[44] = new ModelRendererTurbo(this, 98, 222, textureX, textureY); // Box 232
		bodyModel[45] = new ModelRendererTurbo(this, 102, 239, textureX, textureY); // Box 233
		bodyModel[46] = new ModelRendererTurbo(this, 38, 239, textureX, textureY); // Box 234
		bodyModel[47] = new ModelRendererTurbo(this, 34, 222, textureX, textureY); // Box 235
		bodyModel[48] = new ModelRendererTurbo(this, 158, 94, textureX, textureY); // Box 236
		bodyModel[49] = new ModelRendererTurbo(this, 131, 92, textureX, textureY); // Box 237
		bodyModel[50] = new ModelRendererTurbo(this, 104, 35, textureX, textureY); // Box 238
		bodyModel[51] = new ModelRendererTurbo(this, 157, 92, textureX, textureY); // Box 239
		bodyModel[52] = new ModelRendererTurbo(this, 105, 31, textureX, textureY); // Box 240
		bodyModel[53] = new ModelRendererTurbo(this, 35, 95, textureX, textureY); // Box 138
		bodyModel[54] = new ModelRendererTurbo(this, 58, 76, textureX, textureY); // Box 242
		bodyModel[55] = new ModelRendererTurbo(this, 37, 88, textureX, textureY); // Box 243
		bodyModel[56] = new ModelRendererTurbo(this, 83, 88, textureX, textureY); // Box 244
		bodyModel[57] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 140
		bodyModel[58] = new ModelRendererTurbo(this, 79, 25, textureX, textureY); // Box 246
		bodyModel[59] = new ModelRendererTurbo(this, 132, 94, textureX, textureY); // Box 247
		bodyModel[60] = new ModelRendererTurbo(this, 120, 40, textureX, textureY); // Box 248
		bodyModel[61] = new ModelRendererTurbo(this, 76, 40, textureX, textureY); // Box 249
		bodyModel[62] = new ModelRendererTurbo(this, 95, 31, textureX, textureY); // Box 250
		bodyModel[63] = new ModelRendererTurbo(this, 94, 35, textureX, textureY); // Box 251
		bodyModel[64] = new ModelRendererTurbo(this, 143, 59, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 212, 59, textureX, textureY); // Box 253
		bodyModel[66] = new ModelRendererTurbo(this, 206, 67, textureX, textureY); // Box 254
		bodyModel[67] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 3, 109, textureX, textureY); // Box 258
		bodyModel[69] = new ModelRendererTurbo(this, 3, 118, textureX, textureY); // Box 259
		bodyModel[70] = new ModelRendererTurbo(this, 3, 109, textureX, textureY); // Box 260
		bodyModel[71] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 108
		bodyModel[72] = new ModelRendererTurbo(this, 75, 87, textureX, textureY); // Box 124
		bodyModel[73] = new ModelRendererTurbo(this, 117, 105, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 75, 105, textureX, textureY); // Box 127
		bodyModel[75] = new ModelRendererTurbo(this, 119, 93, textureX, textureY); // Box 265
		bodyModel[76] = new ModelRendererTurbo(this, 175, 93, textureX, textureY); // Box 266
		bodyModel[77] = new ModelRendererTurbo(this, 244, 93, textureX, textureY); // Box 267
		bodyModel[78] = new ModelRendererTurbo(this, 188, 93, textureX, textureY); // Box 268
		bodyModel[79] = new ModelRendererTurbo(this, 227, 94, textureX, textureY); // Box 269
		bodyModel[80] = new ModelRendererTurbo(this, 226, 92, textureX, textureY); // Box 270
		bodyModel[81] = new ModelRendererTurbo(this, 200, 92, textureX, textureY); // Box 271
		bodyModel[82] = new ModelRendererTurbo(this, 201, 94, textureX, textureY); // Box 272
		bodyModel[83] = new ModelRendererTurbo(this, 104, 35, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 79, 25, textureX, textureY); // Box 274
		bodyModel[85] = new ModelRendererTurbo(this, 120, 40, textureX, textureY); // Box 275
		bodyModel[86] = new ModelRendererTurbo(this, 105, 31, textureX, textureY); // Box 276
		bodyModel[87] = new ModelRendererTurbo(this, 76, 40, textureX, textureY); // Box 277
		bodyModel[88] = new ModelRendererTurbo(this, 95, 31, textureX, textureY); // Box 278
		bodyModel[89] = new ModelRendererTurbo(this, 94, 35, textureX, textureY); // Box 279
		bodyModel[90] = new ModelRendererTurbo(this, 214, 87, textureX, textureY); // Box 280
		bodyModel[91] = new ModelRendererTurbo(this, 214, 105, textureX, textureY); // Box 281
		bodyModel[92] = new ModelRendererTurbo(this, 256, 105, textureX, textureY); // Box 282
		bodyModel[93] = new ModelRendererTurbo(this, 1, 135, textureX, textureY); // Box 283
		bodyModel[94] = new ModelRendererTurbo(this, 131, 112, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 131, 106, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 10, 56, textureX, textureY); // Box 72
		bodyModel[97] = new ModelRendererTurbo(this, 3, 56, textureX, textureY); // Box 87
		bodyModel[98] = new ModelRendererTurbo(this, 1, 59, textureX, textureY); // Box 87
		bodyModel[99] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 132
		bodyModel[100] = new ModelRendererTurbo(this, 21, 62, textureX, textureY); // Box 290
		bodyModel[101] = new ModelRendererTurbo(this, 21, 62, textureX, textureY); // Box 291
		bodyModel[102] = new ModelRendererTurbo(this, 163, 83, textureX, textureY); // Box 342
		bodyModel[103] = new ModelRendererTurbo(this, 139, 90, textureX, textureY); // Box 343
		bodyModel[104] = new ModelRendererTurbo(this, 139, 90, textureX, textureY); // Box 350
		bodyModel[105] = new ModelRendererTurbo(this, 163, 83, textureX, textureY); // Box 351
		bodyModel[106] = new ModelRendererTurbo(this, 232, 83, textureX, textureY); // Box 384
		bodyModel[107] = new ModelRendererTurbo(this, 208, 90, textureX, textureY); // Box 385
		bodyModel[108] = new ModelRendererTurbo(this, 232, 83, textureX, textureY); // Box 386
		bodyModel[109] = new ModelRendererTurbo(this, 208, 90, textureX, textureY); // Box 387
		bodyModel[110] = new ModelRendererTurbo(this, 92, 44, textureX, textureY); // Box 476
		bodyModel[111] = new ModelRendererTurbo(this, 91, 40, textureX, textureY); // Box 477
		bodyModel[112] = new ModelRendererTurbo(this, 86, 51, textureX, textureY); // Box 478
		bodyModel[113] = new ModelRendererTurbo(this, 112, 51, textureX, textureY); // Box 479
		bodyModel[114] = new ModelRendererTurbo(this, 101, 40, textureX, textureY); // Box 480
		bodyModel[115] = new ModelRendererTurbo(this, 102, 44, textureX, textureY); // Box 481
		bodyModel[116] = new ModelRendererTurbo(this, 112, 51, textureX, textureY); // Box 482
		bodyModel[117] = new ModelRendererTurbo(this, 102, 44, textureX, textureY); // Box 483
		bodyModel[118] = new ModelRendererTurbo(this, 101, 40, textureX, textureY); // Box 484
		bodyModel[119] = new ModelRendererTurbo(this, 92, 44, textureX, textureY); // Box 485
		bodyModel[120] = new ModelRendererTurbo(this, 86, 51, textureX, textureY); // Box 486
		bodyModel[121] = new ModelRendererTurbo(this, 91, 40, textureX, textureY); // Box 487
		bodyModel[122] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 286
		bodyModel[123] = new ModelRendererTurbo(this, 52, 74, textureX, textureY); // Box 287
		bodyModel[124] = new ModelRendererTurbo(this, 8, 80, textureX, textureY); // Box 491
		bodyModel[125] = new ModelRendererTurbo(this, 41, 69, textureX, textureY); // Box 492
		bodyModel[126] = new ModelRendererTurbo(this, 52, 69, textureX, textureY); // Box 493
		bodyModel[127] = new ModelRendererTurbo(this, 80, 35, textureX, textureY); // Box 494
		bodyModel[128] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 495
		bodyModel[129] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 496
		bodyModel[130] = new ModelRendererTurbo(this, 76, 46, textureX, textureY); // Box 497
		bodyModel[131] = new ModelRendererTurbo(this, 83, 41, textureX, textureY); // Box 498
		bodyModel[132] = new ModelRendererTurbo(this, 80, 35, textureX, textureY); // Box 499
		bodyModel[133] = new ModelRendererTurbo(this, 124, 46, textureX, textureY); // Box 500
		bodyModel[134] = new ModelRendererTurbo(this, 115, 41, textureX, textureY); // Box 501
		bodyModel[135] = new ModelRendererTurbo(this, 112, 35, textureX, textureY); // Box 502
		bodyModel[136] = new ModelRendererTurbo(this, 115, 41, textureX, textureY); // Box 503
		bodyModel[137] = new ModelRendererTurbo(this, 112, 35, textureX, textureY); // Box 504
		bodyModel[138] = new ModelRendererTurbo(this, 124, 46, textureX, textureY); // Box 505
		bodyModel[139] = new ModelRendererTurbo(this, 12, 118, textureX, textureY); // Box 506
		bodyModel[140] = new ModelRendererTurbo(this, 12, 109, textureX, textureY); // Box 507
		bodyModel[141] = new ModelRendererTurbo(this, 10, 135, textureX, textureY); // Box 508
		bodyModel[142] = new ModelRendererTurbo(this, 12, 118, textureX, textureY); // Box 509
		bodyModel[143] = new ModelRendererTurbo(this, 10, 135, textureX, textureY); // Box 510
		bodyModel[144] = new ModelRendererTurbo(this, 12, 109, textureX, textureY); // Box 511
		bodyModel[145] = new ModelRendererTurbo(this, 52, 95, textureX, textureY); // Box 512
		bodyModel[146] = new ModelRendererTurbo(this, 69, 97, textureX, textureY); // Box 513
		bodyModel[147] = new ModelRendererTurbo(this, 57, 80, textureX, textureY); // Box 514
		bodyModel[148] = new ModelRendererTurbo(this, 57, 84, textureX, textureY); // Box 515
		bodyModel[149] = new ModelRendererTurbo(this, 66, 83, textureX, textureY); // Box 516
		bodyModel[150] = new ModelRendererTurbo(this, 66, 83, textureX, textureY); // Box 517
		bodyModel[151] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 108 hazmat plac
		bodyModel[152] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 108 hazmat plac
		bodyModel[153] = new ModelRendererTurbo(this, 8, 74, textureX, textureY); // Box 118
		bodyModel[154] = new ModelRendererTurbo(this, 19, 73, textureX, textureY); // Box 119
		bodyModel[155] = new ModelRendererTurbo(this, 4, 67, textureX, textureY); // Box 125
		bodyModel[156] = new ModelRendererTurbo(this, 8, 69, textureX, textureY); // Box 129
		bodyModel[157] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 108 hazmat plac
		bodyModel[158] = new ModelRendererTurbo(this, 30, 82, textureX, textureY); // Box 614
		bodyModel[159] = new ModelRendererTurbo(this, 33, 82, textureX, textureY); // Box 108 hazmat plac
		bodyModel[160] = new ModelRendererTurbo(this, 30, 82, textureX, textureY); // Box 614
		bodyModel[161] = new ModelRendererTurbo(this, 142, 85, textureX, textureY); // Box 617
		bodyModel[162] = new ModelRendererTurbo(this, 142, 85, textureX, textureY); // Box 618
		bodyModel[163] = new ModelRendererTurbo(this, 211, 85, textureX, textureY); // Box 619
		bodyModel[164] = new ModelRendererTurbo(this, 211, 85, textureX, textureY); // Box 620
		bodyModel[165] = new ModelRendererTurbo(this, 120, 105, textureX, textureY); // Box 621
		bodyModel[166] = new ModelRendererTurbo(this, 211, 105, textureX, textureY); // Box 622
		bodyModel[167] = new ModelRendererTurbo(this, 259, 105, textureX, textureY); // Box 623
		bodyModel[168] = new ModelRendererTurbo(this, 72, 105, textureX, textureY); // Box 625
		bodyModel[169] = new ModelRendererTurbo(this, 158, 82, textureX, textureY); // Box 626
		bodyModel[170] = new ModelRendererTurbo(this, 158, 89, textureX, textureY); // Box 80
		bodyModel[171] = new ModelRendererTurbo(this, 158, 87, textureX, textureY); // Box 718
		bodyModel[172] = new ModelRendererTurbo(this, 227, 82, textureX, textureY); // Box 719
		bodyModel[173] = new ModelRendererTurbo(this, 227, 87, textureX, textureY); // Box 720
		bodyModel[174] = new ModelRendererTurbo(this, 227, 89, textureX, textureY); // Box 721
		bodyModel[175] = new ModelRendererTurbo(this, 19, 78, textureX, textureY); // Box 722
		bodyModel[176] = new ModelRendererTurbo(this, 169, 84, textureX, textureY); // Box 723
		bodyModel[177] = new ModelRendererTurbo(this, 238, 84, textureX, textureY); // Box 724
		bodyModel[178] = new ModelRendererTurbo(this, -1, 79, textureX, textureY); // Box 196
		bodyModel[179] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 199
		bodyModel[180] = new ModelRendererTurbo(this, 15, 85, textureX, textureY); // Box 727
		bodyModel[181] = new ModelRendererTurbo(this, 0, 81, textureX, textureY); // Box 728
		bodyModel[182] = new ModelRendererTurbo(this, -3, 76, textureX, textureY); // Box 124
		bodyModel[183] = new ModelRendererTurbo(this, -15, 69, textureX, textureY); // Box 730
		bodyModel[184] = new ModelRendererTurbo(this, -3, 79, textureX, textureY); // Box 731
		bodyModel[185] = new ModelRendererTurbo(this, 20, 82, textureX, textureY, "cull"); // Box 732 cull
		bodyModel[186] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Box 365
		bodyModel[187] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Box 366
		bodyModel[188] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Box 367
		bodyModel[189] = new ModelRendererTurbo(this, 97, 56, textureX, textureY); // Box 368
		bodyModel[190] = new ModelRendererTurbo(this, 91, 43, textureX, textureY); // Box 282
		bodyModel[191] = new ModelRendererTurbo(this, 91, 43, textureX, textureY); // Box 283
		bodyModel[192] = new ModelRendererTurbo(this, 89, 36, textureX, textureY); // Box 284
		bodyModel[193] = new ModelRendererTurbo(this, 89, 36, textureX, textureY); // Box 285
		bodyModel[194] = new ModelRendererTurbo(this, 36, 102, textureX, textureY); // Box 286

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-30F, 3F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 13
		bodyModel[1].setRotationPoint(-27F, 3F, -2F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[2].setRotationPoint(27F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[3].setRotationPoint(-18.5F, 4.6F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[4].setRotationPoint(15.5F, 4.6F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 141
		bodyModel[5].setRotationPoint(-5F, -21F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F); // Box 4
		bodyModel[6].setRotationPoint(-24F, -17F, 3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 5
		bodyModel[7].setRotationPoint(-24F, -17.5F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[8].setRotationPoint(-24F, -17.5F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[9].setRotationPoint(-24F, -17F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -4F, -3F, -1.5F, -4F); // Box 4
		bodyModel[10].setRotationPoint(-24F, -3F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F); // Box 5
		bodyModel[11].setRotationPoint(-24F, -2.5F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 5
		bodyModel[12].setRotationPoint(-24F, -2.5F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,-3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -3F, -3F, -1.5F, -3F); // Box 4
		bodyModel[13].setRotationPoint(-24F, -3F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 3
		bodyModel[14].setRotationPoint(-24F, -10F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F); // Box 3
		bodyModel[15].setRotationPoint(-24F, -10F, 4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[16].setRotationPoint(-24F, -10F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 75 cull platform
		bodyModel[17].setRotationPoint(-27F, 2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 206 cull platform
		bodyModel[18].setRotationPoint(23F, 2F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 207
		bodyModel[19].setRotationPoint(21F, -10F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 208
		bodyModel[20].setRotationPoint(21F, -2.5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[21].setRotationPoint(21F, -2.5F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F); // Box 210
		bodyModel[22].setRotationPoint(21F, -3F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, 0F, 0.34F, 0F, -3F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F); // Box 211
		bodyModel[23].setRotationPoint(21F, -10F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -4F, -3F, -1.5F, -4F, -3F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 212
		bodyModel[24].setRotationPoint(21F, -17F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F, 0F, 1.16F, 0F, 0F, 1.16F, 0F); // Box 213
		bodyModel[25].setRotationPoint(21F, -17.5F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -3F, 0F, 1.16F, -3F); // Box 214
		bodyModel[26].setRotationPoint(21F, -17.5F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F); // Box 215
		bodyModel[27].setRotationPoint(21F, -17F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 1F, 0F, 0.34F, 1F, -3F, 0.34F, 0F, 0F, 0.34F, 0F); // Box 216
		bodyModel[28].setRotationPoint(21F, -10F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 6, 7, 0F,0F, 0.66F, 0F, 0F, 0.66F, 0F, -3F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -3F, -3F, -1.5F, -3F, -3F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 217
		bodyModel[29].setRotationPoint(21F, -3F, 3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 21, 6, 20, 0F,0F, 0.34F, 0F, 0F, -0.16F, 0F, 0F, -0.16F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.84F, 0F, 0F, 0.84F, 0F, 0F, 0.34F, 0F); // Box 3
		bodyModel[30].setRotationPoint(-21F, -10F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, -1.5F, -6F, 0F, -2F, -6F, 0F, -2F, -4F, 0F, -1.5F, -4F, 0F, 0.66F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-21F, -17F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 1.16F, 0F, 0F, 1.66F, 0F, 0F, 1.66F, -6F, 0F, 1.16F, -6F); // Box 5
		bodyModel[32].setRotationPoint(-21F, -17.5F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.16F, -6F, 0F, 1.66F, -6F, 0F, 1.66F, 0F, 0F, 1.16F, 0F); // Box 5
		bodyModel[33].setRotationPoint(-21F, -17.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, -1.5F, -4F, 0F, -2F, -4F, 0F, -2F, -6F, 0F, -1.5F, -6F, 0F, 0.66F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, 0F, 0F, 0.66F, 0F); // Box 4
		bodyModel[34].setRotationPoint(-21F, -17F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -6F, 0F, -1F, -6F, 0F, -1F, -4F, 0F, -1.5F, -4F); // Box 4
		bodyModel[35].setRotationPoint(-21F, -3F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, 1.16F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, -6F, 0F, 1.16F, -6F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 5
		bodyModel[36].setRotationPoint(-21F, -2.5F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, 1.16F, -6F, 0F, 0.66F, -6F, 0F, 0.66F, 0F, 0F, 1.16F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[37].setRotationPoint(-21F, -2.5F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, 0.66F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, -4F, 0F, -1F, -4F, 0F, -1F, -6F, 0F, -1.5F, -6F); // Box 4
		bodyModel[38].setRotationPoint(-21F, -3F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 1.66F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 1.66F, -6F); // Box 227
		bodyModel[39].setRotationPoint(0F, -17.5F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.66F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 1.66F, 0F); // Box 228
		bodyModel[40].setRotationPoint(0F, -17.5F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, -2F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -2F, -6F, 0F, 1.16F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 1.16F, 0F); // Box 229
		bodyModel[41].setRotationPoint(0F, -17F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, -2F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -2F, -4F, 0F, 1.16F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 1.16F, 0F); // Box 230
		bodyModel[42].setRotationPoint(0F, -17F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 21, 6, 20, 0F,0F, -0.16F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, -0.16F, 0F, 0F, 0.84F, 0F, 0F, 0.34F, 0F, 0F, 0.34F, 0F, 0F, 0.84F, 0F); // Box 231
		bodyModel[43].setRotationPoint(0F, -10F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, 0.16F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.16F, 0F, 0F, -1F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, -6F, 0F, -1F, -6F); // Box 232
		bodyModel[44].setRotationPoint(0F, -3F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, 0.66F, -6F, 0F, 1.16F, -6F, 0F, 1.16F, 0F, 0F, 0.66F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 233
		bodyModel[45].setRotationPoint(0F, -2.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 21, 6, 6, 0F,0F, 0.66F, 0F, 0F, 1.16F, 0F, 0F, 1.16F, -6F, 0F, 0.66F, -6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F); // Box 234
		bodyModel[46].setRotationPoint(0F, -2.5F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 21, 6, 10, 0F,0F, 0.16F, 0F, 0F, 0.66F, 0F, 0F, 0.66F, 0F, 0F, 0.16F, 0F, 0F, -1F, -6F, 0F, -1.5F, -6F, 0F, -1.5F, -4F, 0F, -1F, -4F); // Box 235
		bodyModel[47].setRotationPoint(0F, -3F, 0F);

		bodyModel[48].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 236
		bodyModel[48].setRotationPoint(-23F, 2F, -11F);

		bodyModel[49].addBox(0F, 1F, 0F, 8, 0, 1, 0F); // Box 237
		bodyModel[49].setRotationPoint(-23F, 2F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 238
		bodyModel[50].setRotationPoint(-17F, -2F, -11F);

		bodyModel[51].addBox(0F, 1F, 0F, 8, 0, 1, 0F); // Box 239
		bodyModel[51].setRotationPoint(-23F, 2F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[52].setRotationPoint(-16.5F, -5F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 138
		bodyModel[53].setRotationPoint(-2F, -18F, -2F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 6, 12, 0F); // Box 242
		bodyModel[54].setRotationPoint(5F, -21F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 243
		bodyModel[55].setRotationPoint(-5F, -21F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 6, 0, 0F); // Box 244
		bodyModel[56].setRotationPoint(-5F, -21F, 6F);

		bodyModel[57].addBox(0F, 0F, 0F, 10, 0, 12, 0F); // Box 140
		bodyModel[57].setRotationPoint(-5F, -16F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 0, 5, 22, 0F); // Box 246
		bodyModel[58].setRotationPoint(-16F, -2F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 247
		bodyModel[59].setRotationPoint(-23F, 2F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[60].setRotationPoint(-16F, -5F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[61].setRotationPoint(-16F, -5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[62].setRotationPoint(-16.5F, -5F, 11F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 251
		bodyModel[63].setRotationPoint(-17F, -2F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[64].setRotationPoint(-15F, 2.5F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 253
		bodyModel[65].setRotationPoint(9F, 2.5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 254
		bodyModel[66].setRotationPoint(15F, 3F, -2F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 108
		bodyModel[67].setRotationPoint(-3F, -9.5F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 258
		bodyModel[68].setRotationPoint(-3F, -9.5F, -11F);
		bodyModel[68].rotateAngleX = 2.47836754F;

		bodyModel[69].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 259
		bodyModel[69].setRotationPoint(-3F, -9.5F, 11F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 260
		bodyModel[70].setRotationPoint(-3F, -9.5F, 11F);
		bodyModel[70].rotateAngleX = -2.47836754F;

		bodyModel[71].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 108
		bodyModel[71].setRotationPoint(-3F, -2.5F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 124
		bodyModel[72].setRotationPoint(-24.01F, -8F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[73].setRotationPoint(-24.01F, -8F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[74].setRotationPoint(-24.01F, -8F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 265
		bodyModel[75].setRotationPoint(-27F, 3F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[76].setRotationPoint(-27F, 3F, -7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 267
		bodyModel[77].setRotationPoint(26F, 3F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[78].setRotationPoint(26F, 3F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 269
		bodyModel[79].setRotationPoint(15F, 2F, 11F);

		bodyModel[80].addBox(0F, 1F, 0F, 8, 0, 1, 0F); // Box 270
		bodyModel[80].setRotationPoint(15F, 2F, 10F);

		bodyModel[81].addBox(0F, 1F, 0F, 8, 0, 1, 0F); // Box 271
		bodyModel[81].setRotationPoint(15F, 2F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 272
		bodyModel[82].setRotationPoint(15F, 2F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 273
		bodyModel[83].setRotationPoint(15F, -2F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 5, 22, 0F); // Box 274
		bodyModel[84].setRotationPoint(16F, -2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[85].setRotationPoint(16F, -5F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[86].setRotationPoint(15.5F, -5F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 0, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[87].setRotationPoint(16F, -5F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[88].setRotationPoint(15.5F, -5F, 11F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 279
		bodyModel[89].setRotationPoint(15F, -2F, 11F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 10, 22, 0F); // Box 280
		bodyModel[90].setRotationPoint(24.01F, -8F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[91].setRotationPoint(24.01F, -8F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[92].setRotationPoint(24.01F, -8F, 10F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 283
		bodyModel[93].setRotationPoint(-3F, -2.5F, 9F);

		bodyModel[94].addBox(0F, 0F, 0F, 30, 0, 5, 0F); // Box 108
		bodyModel[94].setRotationPoint(-15F, 3F, 11F);
		bodyModel[94].rotateAngleX = 2.35619449F;

		bodyModel[95].addBox(0F, 0F, 0F, 30, 0, 5, 0F); // Box 108
		bodyModel[95].setRotationPoint(-15F, 3F, -11F);
		bodyModel[95].rotateAngleX = 0.78539816F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[96].setRotationPoint(-25.51F, -6.5F, 2F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[97].setRotationPoint(-25.5F, -5F, 3.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 87
		bodyModel[98].setRotationPoint(-25F, -6.5F, 2.5F);

		bodyModel[99].addBox(-1F, 0F, 0F, 1, 7, 0, 0F); // Box 132
		bodyModel[99].setRotationPoint(-24F, -3F, 4F);
		bodyModel[99].rotateAngleZ = -0.03490659F;

		bodyModel[100].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 290
		bodyModel[100].setRotationPoint(-24F, -5.5F, 2.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 2, 4, 0, 0F); // Box 291
		bodyModel[101].setRotationPoint(-24F, -5.5F, 5.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 342
		bodyModel[102].setRotationPoint(-27F, 3F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 343
		bodyModel[103].setRotationPoint(-27F, 2.5F, -11.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 350
		bodyModel[104].setRotationPoint(-27F, 2.5F, 10.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 351
		bodyModel[105].setRotationPoint(-27F, 3F, 11F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 384
		bodyModel[106].setRotationPoint(23F, 3F, 11F);

		bodyModel[107].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 385
		bodyModel[107].setRotationPoint(23F, 2.5F, 10.75F);

		bodyModel[108].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 386
		bodyModel[108].setRotationPoint(23F, 3F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 387
		bodyModel[109].setRotationPoint(23F, 2.5F, -11.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[110].setRotationPoint(15F, 3F, 5F);

		bodyModel[111].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 477
		bodyModel[111].setRotationPoint(15F, 3F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 478
		bodyModel[112].setRotationPoint(16F, 3F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 479
		bodyModel[113].setRotationPoint(16F, 3F, -7F);

		bodyModel[114].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 480
		bodyModel[114].setRotationPoint(15F, 3F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 481
		bodyModel[115].setRotationPoint(15F, 3F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 482
		bodyModel[116].setRotationPoint(-16F, 3F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 483
		bodyModel[117].setRotationPoint(-17F, 3F, -7F);

		bodyModel[118].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 484
		bodyModel[118].setRotationPoint(-17F, 3F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[119].setRotationPoint(-17F, 3F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 486
		bodyModel[120].setRotationPoint(-16F, 3F, 5F);

		bodyModel[121].addBox(0F, 0F, 0F, 2, 0, 3, 0F); // Box 487
		bodyModel[121].setRotationPoint(-17F, 3F, 7F);

		bodyModel[122].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[122].setRotationPoint(-23F, 1.5F, 8.5F);
		bodyModel[122].rotateAngleX = -0.78539816F;

		bodyModel[123].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[123].setRotationPoint(-20F, 1.5F, 8.5F);
		bodyModel[123].rotateAngleX = -0.78539816F;

		bodyModel[124].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 491
		bodyModel[124].setRotationPoint(-23F, 0F, -10.5F);

		bodyModel[125].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 492
		bodyModel[125].setRotationPoint(-23F, 0.5F, 9F);
		bodyModel[125].rotateAngleX = -0.78539816F;

		bodyModel[126].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 493
		bodyModel[126].setRotationPoint(-20F, 0.5F, 9F);
		bodyModel[126].rotateAngleX = -0.78539816F;

		bodyModel[127].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 494
		bodyModel[127].setRotationPoint(-17.5F, -3.5F, 8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[128].setRotationPoint(-16.5F, -1F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[129].setRotationPoint(-16F, -1F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[130].setRotationPoint(16F, -1F, 9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[131].setRotationPoint(15.5F, -1F, 10F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 499
		bodyModel[132].setRotationPoint(14.5F, -3.5F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[133].setRotationPoint(16F, -1F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[134].setRotationPoint(15.5F, -1F, -11F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 502
		bodyModel[135].setRotationPoint(14.5F, -3.5F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[136].setRotationPoint(-16.5F, -1F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 504
		bodyModel[137].setRotationPoint(-17.5F, -3.5F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[138].setRotationPoint(-16F, -1F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 506
		bodyModel[139].setRotationPoint(-2F, -9.5F, 11F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 507
		bodyModel[140].setRotationPoint(-2F, -9.5F, 11F);
		bodyModel[140].rotateAngleX = -2.47836754F;

		bodyModel[141].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 508
		bodyModel[141].setRotationPoint(-2F, -2.5F, 9F);

		bodyModel[142].addBox(0F, 0F, 0F, 4, 16, 0, 0F); // Box 509
		bodyModel[142].setRotationPoint(-2F, -9.5F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 510
		bodyModel[143].setRotationPoint(-2F, -2.5F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 511
		bodyModel[144].setRotationPoint(-2F, -9.5F, -11F);
		bodyModel[144].rotateAngleX = 2.47836754F;

		bodyModel[145].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 512
		bodyModel[145].setRotationPoint(-4F, -18F, -2F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 513
		bodyModel[146].setRotationPoint(2F, -18F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[147].setRotationPoint(-1F, 3.5F, -1F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 515
		bodyModel[148].setRotationPoint(-1F, 4.5F, -1F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 516
		bodyModel[149].setRotationPoint(3F, 3F, -0.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 517
		bodyModel[150].setRotationPoint(5F, 3F, -0.5F);

		bodyModel[151].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[151].setRotationPoint(-16F, 0F, 11.03F);
		bodyModel[151].rotateAngleZ = -0.78539816F;

		bodyModel[152].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[152].setRotationPoint(16F, 0F, -11.03F);
		bodyModel[152].rotateAngleZ = -0.78539816F;

		bodyModel[153].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[153].setRotationPoint(-5F, 4.5F, 3F);
		bodyModel[153].rotateAngleX = -0.78539816F;

		bodyModel[154].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[154].setRotationPoint(-7F, 4.5F, 3F);
		bodyModel[154].rotateAngleX = -0.78539816F;

		bodyModel[155].addBox(0F, 0F, 0F, 19, 1, 0, 0F); // Box 125
		bodyModel[155].setRotationPoint(-25.25F, 4F, 4F);
		bodyModel[155].rotateAngleY = -0.06981317F;

		bodyModel[156].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[156].setRotationPoint(-5.5F, 2.5F, 2F);

		bodyModel[157].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[157].setRotationPoint(-24.03F, 0F, 0F);
		bodyModel[157].rotateAngleY = -1.57079633F;
		bodyModel[157].rotateAngleZ = -0.78539816F;

		bodyModel[158].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[158].setRotationPoint(-24.02F, -1F, -0.5F);

		bodyModel[159].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[159].setRotationPoint(24.03F, 0F, 0F);
		bodyModel[159].rotateAngleY = -1.57079633F;
		bodyModel[159].rotateAngleZ = -0.78539816F;

		bodyModel[160].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[160].setRotationPoint(24.02F, -1F, -0.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 617
		bodyModel[161].setRotationPoint(-27.75F, 2.5F, 4F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 618
		bodyModel[162].setRotationPoint(-27.75F, 2.5F, -8F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 619
		bodyModel[163].setRotationPoint(26.75F, 2.5F, -8F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 620
		bodyModel[164].setRotationPoint(26.75F, 2.5F, 4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[165].setRotationPoint(-24.01F, -7F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[166].setRotationPoint(24.01F, -7F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 9, 1, 0F,0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[167].setRotationPoint(24.01F, -7F, 7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 625
		bodyModel[168].setRotationPoint(-24.01F, -3F, 5F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 626
		bodyModel[169].setRotationPoint(-27F, 3F, 9F);

		bodyModel[170].addBox(0F, -1F, 0F, 11, 2, 0, 0F); // Box 80
		bodyModel[170].setRotationPoint(-28.5F, 4.5F, -0.5F);
		bodyModel[170].rotateAngleY = 1.44862328F;

		bodyModel[171].addShapeBox(3F, -1F, 0F, 5, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 718
		bodyModel[171].setRotationPoint(-28.5F, 4.5F, -0.5F);
		bodyModel[171].rotateAngleY = 1.44862328F;

		bodyModel[172].addBox(0F, 0F, 0F, 0, 2, 2, 0F); // Box 719
		bodyModel[172].setRotationPoint(27F, 3F, -11F);

		bodyModel[173].addShapeBox(-8F, -1F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 720
		bodyModel[173].setRotationPoint(28.5F, 4.5F, 0.5F);
		bodyModel[173].rotateAngleY = 1.44862328F;

		bodyModel[174].addBox(-11F, -1F, 0F, 11, 2, 0, 0F); // Box 721
		bodyModel[174].setRotationPoint(28.5F, 4.5F, 0.5F);
		bodyModel[174].rotateAngleY = 1.44862328F;

		bodyModel[175].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 722
		bodyModel[175].setRotationPoint(-22.5F, 2F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 723
		bodyModel[176].setRotationPoint(-27F, 3F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 724
		bodyModel[177].setRotationPoint(27F, 3F, 8F);

		bodyModel[178].addBox(-0.5F, 0F, -2F, 1, 0, 5, 0F); // Box 196
		bodyModel[178].setRotationPoint(-9F, 4.26F, 0F);
		bodyModel[178].rotateAngleY = -0.31415927F;

		bodyModel[179].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[179].setRotationPoint(-9F, 4.25F, 0F);
		bodyModel[179].rotateAngleY = -0.31415927F;

		bodyModel[180].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 727
		bodyModel[180].setRotationPoint(-2F, 4.25F, 0F);
		bodyModel[180].rotateAngleY = -0.31415927F;

		bodyModel[181].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 728
		bodyModel[181].setRotationPoint(-2F, 4.26F, 0F);
		bodyModel[181].rotateAngleY = -0.31415927F;

		bodyModel[182].addBox(-0.5F, 0F, 0F, 1, 0, 7, 0F); // Box 124
		bodyModel[182].setRotationPoint(-9F, 4.26F, 0F);
		bodyModel[182].rotateAngleY = -1.57079633F;

		bodyModel[183].addBox(-0.5F, 0F, 0F, 1, 0, 19, 0F); // Box 730
		bodyModel[183].setRotationPoint(-1.5F, 4.26F, 2F);
		bodyModel[183].rotateAngleX = -0.10471976F;
		bodyModel[183].rotateAngleY = -1.67551608F;

		bodyModel[184].addBox(-0.5F, 0F, 0F, 1, 0, 7, 0F); // Box 731
		bodyModel[184].setRotationPoint(-9.5F, 4.26F, -2F);
		bodyModel[184].rotateAngleX = -0.29670597F;
		bodyModel[184].rotateAngleY = 1.32645023F;

		bodyModel[185].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 732 cull
		bodyModel[185].setRotationPoint(7F, 3F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 365
		bodyModel[186].setRotationPoint(15F, 3.75F, -5.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 366
		bodyModel[187].setRotationPoint(15F, 3.75F, 3.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 367
		bodyModel[188].setRotationPoint(-17F, 3.75F, 3.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 368
		bodyModel[189].setRotationPoint(-17F, 3.75F, -5.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 0, 2, 10, 0F); // Box 282
		bodyModel[190].setRotationPoint(16F, 3F, -5F);

		bodyModel[191].addBox(0F, 0F, 0F, 0, 2, 10, 0F); // Box 283
		bodyModel[191].setRotationPoint(-16F, 3F, -5F);

		bodyModel[192].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 284
		bodyModel[192].setRotationPoint(-17F, 5F, -5F);

		bodyModel[193].addBox(0F, 0F, 0F, 2, 0, 10, 0F); // Box 285
		bodyModel[193].setRotationPoint(15F, 5F, -5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 286
		bodyModel[194].setRotationPoint(6F, -19F, -0.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 195; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glPushMatrix();
		GL11.glTranslated(-1.0,0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.0,0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo Model11000DOT111[];
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}