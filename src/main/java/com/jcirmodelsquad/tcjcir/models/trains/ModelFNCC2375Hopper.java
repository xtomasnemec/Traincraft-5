//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FNCC 2375 CU Hopper
// Model Creator: Bida
// Created on: 11.04.2022 - 21:01:39
// Last changed on: 11.04.2022 - 21:01:39

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelFNCC2375Hopper extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelFNCC2375Hopper() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[170];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 341, 92, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 171, 92, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 308, 102, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 200, 102, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 312, 94, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 180, 94, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 213, 90, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 335, 124, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 352, 87, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 350, 103, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 369, 66, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 347, 73, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 352, 73, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 381, 73, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 349, 105, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 373, 105, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 374, 103, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 214, 9, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 347, 56, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 202, 29, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 347, 11, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[22] = new ModelRendererTurbo(this, 307, 27, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 337, 6, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 347, 42, textureX, textureY, "cull"); // Box 35 cull
		bodyModel[25] = new ModelRendererTurbo(this, 347, 33, textureX, textureY, "cull"); // Box 37 cull
		bodyModel[26] = new ModelRendererTurbo(this, 307, 25, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 307, 55, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 202, 57, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 307, 53, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 347, 2, textureX, textureY, "cull"); // Box 43 cull
		bodyModel[31] = new ModelRendererTurbo(this, 151, 10, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 214, 37, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 337, 6, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 332, 6, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 327, 6, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 312, 6, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 317, 6, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 322, 6, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 236, 108, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 209, 108, textureX, textureY); // Box 83
		bodyModel[41] = new ModelRendererTurbo(this, 186, 108, textureX, textureY); // Box 84
		bodyModel[42] = new ModelRendererTurbo(this, 186, 143, textureX, textureY); // Box 85
		bodyModel[43] = new ModelRendererTurbo(this, 236, 143, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 209, 143, textureX, textureY); // Box 87
		bodyModel[45] = new ModelRendererTurbo(this, 291, 66, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 211, 59, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 132, 87, textureX, textureY); // Box 15
		bodyModel[48] = new ModelRendererTurbo(this, 203, 9, textureX, textureY, "cull"); // Box 30 cull
		bodyModel[49] = new ModelRendererTurbo(this, 203, 37, textureX, textureY, "cull"); // Box 35 cull
		bodyModel[50] = new ModelRendererTurbo(this, 198, 40, textureX, textureY, "cull"); // Box 37 cull
		bodyModel[51] = new ModelRendererTurbo(this, 198, 12, textureX, textureY, "cull"); // Box 43 cull
		bodyModel[52] = new ModelRendererTurbo(this, 132, 57, textureX, textureY); // Box 82
		bodyModel[53] = new ModelRendererTurbo(this, 175, 67, textureX, textureY); // Box 83
		bodyModel[54] = new ModelRendererTurbo(this, 132, 74, textureX, textureY); // Box 84
		bodyModel[55] = new ModelRendererTurbo(this, 106, 69, textureX, textureY); // Box 85
		bodyModel[56] = new ModelRendererTurbo(this, 137, 74, textureX, textureY); // Box 86
		bodyModel[57] = new ModelRendererTurbo(this, 167, 74, textureX, textureY); // Box 87
		bodyModel[58] = new ModelRendererTurbo(this, 170, 74, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 193, 55, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 153, 103, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 152, 105, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 193, 27, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 130, 105, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 131, 103, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 145, 124, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 368, 124, textureX, textureY, "cull"); // Box 96 crossover cull
		bodyModel[67] = new ModelRendererTurbo(this, 132, 124, textureX, textureY, "cull"); // Box 97 crossover cull
		bodyModel[68] = new ModelRendererTurbo(this, 193, 53, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 289, 143, textureX, textureY); // Box 106
		bodyModel[71] = new ModelRendererTurbo(this, 266, 143, textureX, textureY); // Box 107
		bodyModel[72] = new ModelRendererTurbo(this, 316, 143, textureX, textureY); // Box 108
		bodyModel[73] = new ModelRendererTurbo(this, 316, 108, textureX, textureY); // Box 109
		bodyModel[74] = new ModelRendererTurbo(this, 289, 108, textureX, textureY); // Box 110
		bodyModel[75] = new ModelRendererTurbo(this, 266, 108, textureX, textureY); // Box 111
		bodyModel[76] = new ModelRendererTurbo(this, 265, 134, textureX, textureY, "cull"); // Box 112 cull
		bodyModel[77] = new ModelRendererTurbo(this, 229, 134, textureX, textureY, "cull"); // Box 114 cull
		bodyModel[78] = new ModelRendererTurbo(this, 270, 124, textureX, textureY); // Box 159
		bodyModel[79] = new ModelRendererTurbo(this, 236, 124, textureX, textureY); // Box 117
		bodyModel[80] = new ModelRendererTurbo(this, 352, 7, textureX, textureY); // Box 118
		bodyModel[81] = new ModelRendererTurbo(this, 198, 21, textureX, textureY); // Box 119
		bodyModel[82] = new ModelRendererTurbo(this, 198, 49, textureX, textureY); // Box 120
		bodyModel[83] = new ModelRendererTurbo(this, 352, 38, textureX, textureY); // Box 121
		bodyModel[84] = new ModelRendererTurbo(this, 5, 44, textureX, textureY); // Box 106
		bodyModel[85] = new ModelRendererTurbo(this, 5, 62, textureX, textureY); // Box 107
		bodyModel[86] = new ModelRendererTurbo(this, 1, 51, textureX, textureY); // Box 108
		bodyModel[87] = new ModelRendererTurbo(this, 74, 12, textureX, textureY); // Box 116
		bodyModel[88] = new ModelRendererTurbo(this, 18, 12, textureX, textureY); // Box 117
		bodyModel[89] = new ModelRendererTurbo(this, 6, 34, textureX, textureY); // Box 118
		bodyModel[90] = new ModelRendererTurbo(this, 1, 23, textureX, textureY); // Box 119
		bodyModel[91] = new ModelRendererTurbo(this, 6, 6, textureX, textureY); // Box 120
		bodyModel[92] = new ModelRendererTurbo(this, -5, 3, textureX, textureY); // Box 121
		bodyModel[93] = new ModelRendererTurbo(this, 125, 34, textureX, textureY); // Box 122
		bodyModel[94] = new ModelRendererTurbo(this, 121, 13, textureX, textureY, "cull"); // Box 123 cull
		bodyModel[95] = new ModelRendererTurbo(this, 135, 16, textureX, textureY); // Box 124
		bodyModel[96] = new ModelRendererTurbo(this, -1, 16, textureX, textureY); // Box 125
		bodyModel[97] = new ModelRendererTurbo(this, 1, 13, textureX, textureY, "cull"); // Box 126 cull
		bodyModel[98] = new ModelRendererTurbo(this, 337, 34, textureX, textureY); // Box 130
		bodyModel[99] = new ModelRendererTurbo(this, 332, 34, textureX, textureY); // Box 131
		bodyModel[100] = new ModelRendererTurbo(this, 327, 34, textureX, textureY); // Box 132
		bodyModel[101] = new ModelRendererTurbo(this, 322, 34, textureX, textureY); // Box 133
		bodyModel[102] = new ModelRendererTurbo(this, 317, 34, textureX, textureY); // Box 134
		bodyModel[103] = new ModelRendererTurbo(this, 312, 34, textureX, textureY); // Box 135
		bodyModel[104] = new ModelRendererTurbo(this, 209, 124, textureX, textureY); // Box 299
		bodyModel[105] = new ModelRendererTurbo(this, 289, 124, textureX, textureY); // Box 300
		bodyModel[106] = new ModelRendererTurbo(this, 337, 37, textureX, textureY); // Box 301
		bodyModel[107] = new ModelRendererTurbo(this, 151, 38, textureX, textureY); // Box 302
		bodyModel[108] = new ModelRendererTurbo(this, 342, 6, textureX, textureY); // Box 50
		bodyModel[109] = new ModelRendererTurbo(this, 307, 6, textureX, textureY); // Box 55
		bodyModel[110] = new ModelRendererTurbo(this, 342, 34, textureX, textureY); // Box 129
		bodyModel[111] = new ModelRendererTurbo(this, 307, 34, textureX, textureY); // Box 136
		bodyModel[112] = new ModelRendererTurbo(this, 367, 119, textureX, textureY); // Box 72
		bodyModel[113] = new ModelRendererTurbo(this, 377, 128, textureX, textureY); // Box 87
		bodyModel[114] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 87
		bodyModel[115] = new ModelRendererTurbo(this, 378, 132, textureX, textureY); // Box 132
		bodyModel[116] = new ModelRendererTurbo(this, 365, 96, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 356, 98, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 345, 101, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 372, 97, textureX, textureY); // Box 129
		bodyModel[120] = new ModelRendererTurbo(this, 369, 87, textureX, textureY); // Box 286
		bodyModel[121] = new ModelRendererTurbo(this, 357, 87, textureX, textureY); // Box 287
		bodyModel[122] = new ModelRendererTurbo(this, 398, 90, textureX, textureY); // Box 317
		bodyModel[123] = new ModelRendererTurbo(this, 387, 88, textureX, textureY); // Box 318
		bodyModel[124] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 320
		bodyModel[125] = new ModelRendererTurbo(this, 380, 87, textureX, textureY); // Box 321
		bodyModel[126] = new ModelRendererTurbo(this, 350, 87, textureX, textureY); // Box 322
		bodyModel[127] = new ModelRendererTurbo(this, 356, 93, textureX, textureY); // Box 323
		bodyModel[128] = new ModelRendererTurbo(this, 373, 92, textureX, textureY); // Box 196
		bodyModel[129] = new ModelRendererTurbo(this, 376, 93, textureX, textureY); // Box 199
		bodyModel[130] = new ModelRendererTurbo(this, 361, 93, textureX, textureY); // Box 326
		bodyModel[131] = new ModelRendererTurbo(this, 384, 94, textureX, textureY); // Box 327
		bodyModel[132] = new ModelRendererTurbo(this, 134, 96, textureX, textureY); // Box 328
		bodyModel[133] = new ModelRendererTurbo(this, 151, 96, textureX, textureY); // Box 329
		bodyModel[134] = new ModelRendererTurbo(this, 143, 97, textureX, textureY); // Box 330
		bodyModel[135] = new ModelRendererTurbo(this, 133, 101, textureX, textureY); // Box 331
		bodyModel[136] = new ModelRendererTurbo(this, 160, 98, textureX, textureY); // Box 332
		bodyModel[137] = new ModelRendererTurbo(this, 148, 98, textureX, textureY, "cull"); // Box 333 cull
		bodyModel[138] = new ModelRendererTurbo(this, 131, 41, textureX, textureY); // Box 334
		bodyModel[139] = new ModelRendererTurbo(this, 10, 41, textureX, textureY); // Box 335
		bodyModel[140] = new ModelRendererTurbo(this, 10, 2, textureX, textureY); // Box 336
		bodyModel[141] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 337
		bodyModel[142] = new ModelRendererTurbo(this, 9, 71, textureX, textureY); // Box 153 plate
		bodyModel[143] = new ModelRendererTurbo(this, 9, 95, textureX, textureY); // Box 154 plate
		bodyModel[144] = new ModelRendererTurbo(this, 303, 59, textureX, textureY); // Box 700
		bodyModel[145] = new ModelRendererTurbo(this, 224, 2, textureX, textureY); // Box 701
		bodyModel[146] = new ModelRendererTurbo(this, 328, 60, textureX, textureY); // Box 462 kartrak my beloved
		bodyModel[147] = new ModelRendererTurbo(this, 214, 3, textureX, textureY); // Box 481 kartrak my beloved
		bodyModel[148] = new ModelRendererTurbo(this, 379, 11, textureX, textureY, "cull"); // Box 148 cull
		bodyModel[149] = new ModelRendererTurbo(this, 379, 15, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[150] = new ModelRendererTurbo(this, 390, 11, textureX, textureY, "cull"); // Box 148 cull
		bodyModel[151] = new ModelRendererTurbo(this, 390, 15, textureX, textureY, "cull"); // Box 149 cull
		bodyModel[152] = new ModelRendererTurbo(this, 401, 11, textureX, textureY, "cull"); // Box 152 cull
		bodyModel[153] = new ModelRendererTurbo(this, 401, 15, textureX, textureY, "cull"); // Box 153 cull
		bodyModel[154] = new ModelRendererTurbo(this, 412, 11, textureX, textureY, "cull"); // Box 152 cull
		bodyModel[155] = new ModelRendererTurbo(this, 412, 15, textureX, textureY, "cull"); // Box 153 cull
		bodyModel[156] = new ModelRendererTurbo(this, 87, 85, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 393, 85, textureX, textureY); // Box 157
		bodyModel[158] = new ModelRendererTurbo(this, 379, 19, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 379, 19, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 382, 18, textureX, textureY); // Box 160
		bodyModel[161] = new ModelRendererTurbo(this, 382, 18, textureX, textureY); // Box 161
		bodyModel[162] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 80
		bodyModel[163] = new ModelRendererTurbo(this, 393, 116, textureX, textureY); // Box 81
		bodyModel[164] = new ModelRendererTurbo(this, 393, 119, textureX, textureY); // Box 108 hazmat plac
		bodyModel[165] = new ModelRendererTurbo(this, 393, 119, textureX, textureY); // Box 108 hazmat plac
		bodyModel[166] = new ModelRendererTurbo(this, 393, 119, textureX, textureY); // Box 108 hazmat plac
		bodyModel[167] = new ModelRendererTurbo(this, 393, 119, textureX, textureY); // Box 108 hazmat plac
		bodyModel[168] = new ModelRendererTurbo(this, 402, 119, textureX, textureY); // Box 614
		bodyModel[169] = new ModelRendererTurbo(this, 402, 119, textureX, textureY); // Box 614

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-37.5F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(34.5F, 3F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[2].setRotationPoint(-24.5F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 1
		bodyModel[3].setRotationPoint(20.5F, 5F, -2F);

		bodyModel[4].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 13
		bodyModel[4].setRotationPoint(-34.5F, 3F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 12, 2, 4, 0F); // Box 12
		bodyModel[5].setRotationPoint(22.5F, 3F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 45, 11, 4, 0F); // Box 13
		bodyModel[6].setRotationPoint(-22.5F, -6F, -2F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 14
		bodyModel[7].setRotationPoint(-32.5F, 3.01F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 16, 20, 0F); // Box 15
		bodyModel[8].setRotationPoint(-32.5F, -13F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(-32.5F, 2F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 0, 21, 0F); // Box 19
		bodyModel[10].setRotationPoint(-23.5F, 3.01F, -10.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 20
		bodyModel[11].setRotationPoint(-23.5F, 0F, -10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[12].setRotationPoint(-21.5F, 0F, -10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(-21.5F, 0F, 10.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 23
		bodyModel[14].setRotationPoint(-23.5F, 0F, 10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(-32.5F, 3F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(-32.5F, 3F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 26
		bodyModel[17].setRotationPoint(-32.5F, 2F, 11F);

		bodyModel[18].addBox(0F, 0F, 0F, 45, 18, 1, 0F); // Box 27
		bodyModel[18].setRotationPoint(-22.5F, -18F, -10.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 28
		bodyModel[19].setRotationPoint(-22.5F, -6F, -10.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 57, 0, 1, 0F); // Box 29
		bodyModel[20].setRotationPoint(-28.5F, 0.01F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 30 cull
		bodyModel[21].setRotationPoint(-32.5F, -11F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 32
		bodyModel[22].setRotationPoint(-32.5F, -1F, -10.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 5, 21, 0F); // Box 33
		bodyModel[23].setRotationPoint(-32.5F, -18F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 35 cull
		bodyModel[24].setRotationPoint(-32.5F, -11F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37 cull
		bodyModel[25].setRotationPoint(-32.5F, -18F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-32.5F, -13F, -10.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 40
		bodyModel[27].setRotationPoint(-32.5F, -1F, 10.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 57, 0, 1, 0F); // Box 41
		bodyModel[28].setRotationPoint(-28.5F, 0.01F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[29].setRotationPoint(-32.5F, -13F, 10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43 cull
		bodyModel[30].setRotationPoint(-32.5F, -18F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 10, 5, 21, 0F); // Box 46
		bodyModel[31].setRotationPoint(22.5F, -18F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 45, 18, 1, 0F); // Box 47
		bodyModel[32].setRotationPoint(-22.5F, -18F, 9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 51
		bodyModel[33].setRotationPoint(-13.5F, -18F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[34].setRotationPoint(-8.5F, -18F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[35].setRotationPoint(-3.5F, -18F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyModel[36].setRotationPoint(12.5F, -18F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
		bodyModel[37].setRotationPoint(7.5F, -18F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[38].setRotationPoint(2.5F, -18F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 51
		bodyModel[39].setRotationPoint(1F, 0F, -10.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[40].setRotationPoint(5F, 0F, -10.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[41].setRotationPoint(11F, 0F, -10.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 85
		bodyModel[42].setRotationPoint(11F, 0F, 3.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F); // Box 86
		bodyModel[43].setRotationPoint(1F, 0F, 3.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 87
		bodyModel[44].setRotationPoint(5F, 0F, 3.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,0F, 1F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[45].setRotationPoint(-22.5F, -6F, -9.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 30, 1, 19, 0F); // Box 74
		bodyModel[46].setRotationPoint(-15F, -1F, -9.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 16, 20, 0F); // Box 15
		bodyModel[47].setRotationPoint(32.5F, -13F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 30 cull
		bodyModel[48].setRotationPoint(28.5F, -11F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 14, 1, 0F); // Box 35 cull
		bodyModel[49].setRotationPoint(28.5F, -11F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37 cull
		bodyModel[50].setRotationPoint(31.5F, -18F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43 cull
		bodyModel[51].setRotationPoint(31.5F, -18F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 9, 21, 0F); // Box 82
		bodyModel[52].setRotationPoint(22.5F, -6F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 1, 19, 0F,-0.5F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 5F, 0F); // Box 83
		bodyModel[53].setRotationPoint(14.5F, -6F, -9.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 84
		bodyModel[54].setRotationPoint(21.5F, 0F, -10.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 0, 21, 0F); // Box 85
		bodyModel[55].setRotationPoint(21.5F, 3.01F, -10.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[56].setRotationPoint(20.5F, 0F, -10.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[57].setRotationPoint(20.5F, 0F, 10.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 88
		bodyModel[58].setRotationPoint(21.5F, 0F, 10.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 89
		bodyModel[59].setRotationPoint(22.5F, -1F, 10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 90
		bodyModel[60].setRotationPoint(22.5F, 2F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 91
		bodyModel[61].setRotationPoint(22.5F, 3F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 10, 1, 0, 0F); // Box 92
		bodyModel[62].setRotationPoint(22.5F, -1F, -10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 0, 1, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 93
		bodyModel[63].setRotationPoint(22.5F, 3F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 94
		bodyModel[64].setRotationPoint(22.5F, 2F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 95
		bodyModel[65].setRotationPoint(31.5F, 3.01F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 96 crossover cull
		bodyModel[66].setRotationPoint(-34.5F, 2.01F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 97 crossover cull
		bodyModel[67].setRotationPoint(32.5F, 2.01F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 98
		bodyModel[68].setRotationPoint(22.5F, -13F, 10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 99
		bodyModel[69].setRotationPoint(22.5F, -13F, -10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 106
		bodyModel[70].setRotationPoint(-11F, 0F, 3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 107
		bodyModel[71].setRotationPoint(-5F, 0F, 3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F); // Box 108
		bodyModel[72].setRotationPoint(-15F, 0F, 3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 109
		bodyModel[73].setRotationPoint(-15F, 0F, -10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[74].setRotationPoint(-11F, 0F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[75].setRotationPoint(-5F, 0F, -10.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 112 cull
		bodyModel[76].setRotationPoint(-11F, 7.5F, -3.5F);

		bodyModel[77].addBox(-6F, 0F, -7F, 8, 1, 7, 0F); // Box 114 cull
		bodyModel[77].setRotationPoint(5F, 7.5F, -3.5F);
		bodyModel[77].rotateAngleY = -3.14159265F;

		bodyModel[78].addBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F); // Box 159
		bodyModel[78].setRotationPoint(-4.5F, 8F, -4F);
		bodyModel[78].rotateAngleZ = 0.78539816F;

		bodyModel[79].addBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F); // Box 117
		bodyModel[79].setRotationPoint(4.5F, 8F, -4F);
		bodyModel[79].rotateAngleZ = 0.78539816F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[80].setRotationPoint(-32.5F, -13F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[81].setRotationPoint(31.5F, -13F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[82].setRotationPoint(31.5F, -13F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[83].setRotationPoint(-32.5F, -13F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 65, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[84].setRotationPoint(-32.5F, -19F, -9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 65, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[85].setRotationPoint(-32.5F, -19F, 4.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 65, 1, 9, 0F); // Box 108
		bodyModel[86].setRotationPoint(-32.5F, -19F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 116
		bodyModel[87].setRotationPoint(-23.75F, -21F, -3.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 117
		bodyModel[88].setRotationPoint(3.75F, -21F, -3.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 60, 0, 4, 0F); // Box 118
		bodyModel[89].setRotationPoint(-32F, -19.5F, -8.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 65, 1, 8, 0F); // Box 119
		bodyModel[90].setRotationPoint(-32.5F, -20F, -4F);

		bodyModel[91].addBox(0F, 0F, 0F, 60, 0, 4, 0F); // Box 120
		bodyModel[91].setRotationPoint(-28F, -19.5F, 4.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 0, 6, 0F); // Box 121
		bodyModel[92].setRotationPoint(-32F, -19.5F, 4.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 0, 6, 0F); // Box 122
		bodyModel[93].setRotationPoint(28F, -19.5F, -10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123 cull
		bodyModel[94].setRotationPoint(-32.5F, -20.5F, -4F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 124
		bodyModel[95].setRotationPoint(-34.5F, -20.5F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 125
		bodyModel[96].setRotationPoint(32.5F, -20.5F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126 cull
		bodyModel[97].setRotationPoint(28.5F, -20.5F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 130
		bodyModel[98].setRotationPoint(-13.5F, -18F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 131
		bodyModel[99].setRotationPoint(-8.5F, -18F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 132
		bodyModel[100].setRotationPoint(-3.5F, -18F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 133
		bodyModel[101].setRotationPoint(2.5F, -18F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 134
		bodyModel[102].setRotationPoint(7.5F, -18F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 135
		bodyModel[103].setRotationPoint(12.5F, -18F, 10F);

		bodyModel[104].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 299
		bodyModel[104].setRotationPoint(5F, 0F, -3.5F);

		bodyModel[105].addFlexTrapezoid(0F, 0F, 0F, 6, 8, 7, 0F, 4.00F, 4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 300
		bodyModel[105].setRotationPoint(-11F, 0F, -3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 301
		bodyModel[106].setRotationPoint(-32.5F, -13F, -10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[107].setRotationPoint(22.5F, -13F, -10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[108].setRotationPoint(-18.5F, -18F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[109].setRotationPoint(17.5F, -18F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 129
		bodyModel[110].setRotationPoint(-18.5F, -18F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 136
		bodyModel[111].setRotationPoint(17.5F, -18F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[112].setRotationPoint(-34.01F, -5.5F, 2F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[113].setRotationPoint(-34F, -4F, 3.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[114].setRotationPoint(-33F, -5.5F, 2.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 132
		bodyModel[115].setRotationPoint(-33.25F, -3F, 4F);

		bodyModel[116].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[116].setRotationPoint(-26F, 1F, 4F);
		bodyModel[116].rotateAngleX = -0.78539816F;

		bodyModel[117].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[117].setRotationPoint(-28F, 1F, 4F);
		bodyModel[117].rotateAngleX = -0.78539816F;

		bodyModel[118].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Box 125
		bodyModel[118].setRotationPoint(-32.25F, 1F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 129
		bodyModel[119].setRotationPoint(-25.5F, 2F, 2F);

		bodyModel[120].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[120].setRotationPoint(-24F, -4.5F, 7.5F);
		bodyModel[120].rotateAngleX = -0.78539816F;
		bodyModel[120].rotateAngleY = -1.57079633F;

		bodyModel[121].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[121].setRotationPoint(-24F, -4.5F, 4.5F);
		bodyModel[121].rotateAngleX = -0.78539816F;
		bodyModel[121].rotateAngleY = -1.57079633F;

		bodyModel[122].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 317
		bodyModel[122].setRotationPoint(-25.5F, -2.5F, -5.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Box 318
		bodyModel[123].setRotationPoint(-25.5F, -1.5F, -7.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 320
		bodyModel[124].setRotationPoint(-25.5F, 0.5F, -5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 321
		bodyModel[125].setRotationPoint(-25.5F, -4.5F, 7.51F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 322
		bodyModel[126].setRotationPoint(-25.5F, -4.5F, 1.49F);

		bodyModel[127].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 323
		bodyModel[127].setRotationPoint(-23.5F, 1.5F, 0F);
		bodyModel[127].rotateAngleX = 0.78539816F;

		bodyModel[128].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[128].setRotationPoint(-29F, 1.26F, 0F);
		bodyModel[128].rotateAngleY = 0.19198622F;

		bodyModel[129].addBox(-0.5F, -1F, -0.5F, 1, 2, 1, 0F); // Box 199
		bodyModel[129].setRotationPoint(-29F, 2.25F, 0F);
		bodyModel[129].rotateAngleY = 0.19198622F;

		bodyModel[130].addBox(-0.5F, 0F, 0F, 7, 1, 0, 0F); // Box 326
		bodyModel[130].setRotationPoint(-29F, 1.26F, 0F);

		bodyModel[131].addBox(-0.5F, 0F, -4F, 1, 4, 0, 0F); // Box 327
		bodyModel[131].setRotationPoint(-29F, 1.26F, 0F);
		bodyModel[131].rotateAngleY = 0.19198622F;
		bodyModel[131].rotateAngleZ = -0.45378561F;

		bodyModel[132].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 328
		bodyModel[132].setRotationPoint(22.5F, 1.5F, 0F);
		bodyModel[132].rotateAngleX = 0.78539816F;

		bodyModel[133].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 329
		bodyModel[133].setRotationPoint(29F, 1.26F, 0F);
		bodyModel[133].rotateAngleY = 0.19198622F;

		bodyModel[134].addBox(-0.5F, -1F, -0.5F, 1, 2, 1, 0F); // Box 330
		bodyModel[134].setRotationPoint(29F, 2.25F, 0F);
		bodyModel[134].rotateAngleY = 0.19198622F;

		bodyModel[135].addBox(-6.5F, 0F, 0F, 7, 1, 0, 0F); // Box 331
		bodyModel[135].setRotationPoint(29F, 1.26F, 0F);

		bodyModel[136].addBox(-0.5F, 0F, 4F, 1, 4, 0, 0F); // Box 332
		bodyModel[136].setRotationPoint(29F, 1.26F, 0F);
		bodyModel[136].rotateAngleY = 0.19198622F;
		bodyModel[136].rotateAngleZ = 0.45378561F;

		bodyModel[137].addBox(-0.5F, -1F, -0.5F, 3, 3, 1, 0F); // Box 333 cull
		bodyModel[137].setRotationPoint(28F, 2.25F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 334
		bodyModel[138].setRotationPoint(28F, -19.5F, -10.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 60, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 335
		bodyModel[139].setRotationPoint(-32F, -19.5F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 60, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 336
		bodyModel[140].setRotationPoint(-28F, -19.5F, 8.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 337
		bodyModel[141].setRotationPoint(-32F, -19.5F, 10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 38, 22, 0, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -19F, -11F, 0F, -19F, -11F, 0F, 0F, -11F, 0F); // Box 153 plate
		bodyModel[142].setRotationPoint(-20F, -17F, -11.01F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 38, 22, 0, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -19F, -11F, 0F, -19F, -11F, 0F, 0F, -11F, 0F); // Box 154 plate
		bodyModel[143].setRotationPoint(1F, -17F, 11.01F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 700
		bodyModel[144].setRotationPoint(-12.5F, -3.5F, 11.01F);
		bodyModel[144].rotateAngleY = -3.14159265F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 701
		bodyModel[145].setRotationPoint(12.5F, -3.5F, -11.01F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 462 kartrak my beloved
		bodyModel[146].setRotationPoint(-19F, -4.5F, 10.51F);
		bodyModel[146].rotateAngleY = -3.14159265F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 481 kartrak my beloved
		bodyModel[147].setRotationPoint(18F, -4.5F, -10.51F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 148 cull
		bodyModel[148].setRotationPoint(-32.5F, 3F, -11F);

		bodyModel[149].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[149].setRotationPoint(-32.5F, 5F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 148 cull
		bodyModel[150].setRotationPoint(28.5F, 3F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 149 cull
		bodyModel[151].setRotationPoint(28.5F, 5F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 152 cull
		bodyModel[152].setRotationPoint(28.5F, 3F, 10F);

		bodyModel[153].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 153 cull
		bodyModel[153].setRotationPoint(28.5F, 5F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 152 cull
		bodyModel[154].setRotationPoint(-32.5F, 3F, 10F);

		bodyModel[155].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 153 cull
		bodyModel[155].setRotationPoint(-32.5F, 5F, 9F);

		bodyModel[156].addBox(0F, 0F, 0F, 0, 5, 22, 0F); // Box 156
		bodyModel[156].setRotationPoint(32.51F, -18F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 5, 22, 0F); // Box 157
		bodyModel[157].setRotationPoint(-32.51F, -18F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 158
		bodyModel[158].setRotationPoint(-32.5F, 3F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[159].setRotationPoint(32.5F, 3F, 8F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 160
		bodyModel[160].setRotationPoint(-32.51F, 3F, 8F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 3, 2, 0F); // Box 161
		bodyModel[161].setRotationPoint(32.51F, 3F, -10F);

		bodyModel[162].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[162].setRotationPoint(-36.5F, 4.5F, 0.5F);
		bodyModel[162].rotateAngleY = 1.1693706F;

		bodyModel[163].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[163].setRotationPoint(36.5F, 4.5F, -0.5F);
		bodyModel[163].rotateAngleY = 1.1693706F;

		bodyModel[164].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[164].setRotationPoint(-21F, -8F, 10.51F);
		bodyModel[164].rotateAngleZ = -0.78539816F;

		bodyModel[165].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[165].setRotationPoint(21F, -8F, -10.51F);
		bodyModel[165].rotateAngleZ = -0.78539816F;

		bodyModel[166].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[166].setRotationPoint(-32.03F, 0F, 0F);
		bodyModel[166].rotateAngleY = -1.57079633F;
		bodyModel[166].rotateAngleZ = -0.78539816F;

		bodyModel[167].addShapeBox(-2F, -2F, 0F, 4, 4, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 108 hazmat plac
		bodyModel[167].setRotationPoint(32.03F, 0F, 0F);
		bodyModel[167].rotateAngleY = -1.57079633F;
		bodyModel[167].rotateAngleZ = -0.78539816F;

		bodyModel[168].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[168].setRotationPoint(-32.02F, 0F, -0.5F);

		bodyModel[169].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 614
		bodyModel[169].setRotationPoint(32.02F, 0F, -0.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 170; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));

		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.4,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.8,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}