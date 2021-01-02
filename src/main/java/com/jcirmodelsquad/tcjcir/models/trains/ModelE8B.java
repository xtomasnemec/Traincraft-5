//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergA1A;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelE8B extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelE8B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[177];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 258, 190, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 128, 35, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 108, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 203, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 268, 116, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 268, 108, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 268, 102, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 268, 122, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 268, 97, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 268, 128, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 268, 94, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 144, 41, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 298, 1, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 144, 34, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 156, 34, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 314
		bodyModel[44] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 315
		bodyModel[45] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 316
		bodyModel[46] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 317
		bodyModel[47] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 86
		bodyModel[48] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 87
		bodyModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 88
		bodyModel[50] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 89
		bodyModel[51] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 202
		bodyModel[52] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 203
		bodyModel[53] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 231
		bodyModel[54] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 93
		bodyModel[55] = new ModelRendererTurbo(this, 126, 41, textureX, textureY); // Box 94
		bodyModel[56] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 438
		bodyModel[58] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 439
		bodyModel[59] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 187
		bodyModel[60] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 188
		bodyModel[61] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 177
		bodyModel[62] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 178
		bodyModel[63] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 179
		bodyModel[64] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 180
		bodyModel[65] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 189
		bodyModel[66] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 190
		bodyModel[67] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 191
		bodyModel[68] = new ModelRendererTurbo(this, 158, 41, textureX, textureY); // Box 192
		bodyModel[69] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 198
		bodyModel[70] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 199
		bodyModel[71] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 200
		bodyModel[72] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 201
		bodyModel[73] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 191
		bodyModel[74] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 192
		bodyModel[75] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 198
		bodyModel[76] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 199
		bodyModel[77] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 200
		bodyModel[78] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 201
		bodyModel[79] = new ModelRendererTurbo(this, 289, 65, textureX, textureY, "glow"); // Box 247 lamp
		bodyModel[80] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 222
		bodyModel[81] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 223
		bodyModel[82] = new ModelRendererTurbo(this, 457, 65, textureX, textureY, "glow"); // Box 247 lamp
		bodyModel[83] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 222
		bodyModel[84] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 223
		bodyModel[85] = new ModelRendererTurbo(this, 465, 65, textureX, textureY, "glow"); // Box 132 lamp
		bodyModel[86] = new ModelRendererTurbo(this, 473, 65, textureX, textureY, "glow"); // Box 133 lamp
		bodyModel[87] = new ModelRendererTurbo(this, 105, 136, textureX, textureY); // Box 131
		bodyModel[88] = new ModelRendererTurbo(this, 103, 140, textureX, textureY); // Box 131
		bodyModel[89] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 185, 162, textureX, textureY); // Box 2
		bodyModel[91] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 3
		bodyModel[92] = new ModelRendererTurbo(this, 185, 118, textureX, textureY); // Box 4
		bodyModel[93] = new ModelRendererTurbo(this, 193, 111, textureX, textureY); // Box 5
		bodyModel[94] = new ModelRendererTurbo(this, 194, 97, textureX, textureY); // Box 6
		bodyModel[95] = new ModelRendererTurbo(this, 193, 104, textureX, textureY); // Box 7
		bodyModel[96] = new ModelRendererTurbo(this, 172, 110, textureX, textureY); // Box 10
		bodyModel[97] = new ModelRendererTurbo(this, 179, 105, textureX, textureY); // Box 11
		bodyModel[98] = new ModelRendererTurbo(this, 165, 105, textureX, textureY); // Box 12
		bodyModel[99] = new ModelRendererTurbo(this, 179, 114, textureX, textureY); // Box 13
		bodyModel[100] = new ModelRendererTurbo(this, 248, 122, textureX, textureY); // Box 14
		bodyModel[101] = new ModelRendererTurbo(this, 185, 148, textureX, textureY); // Box 3
		bodyModel[102] = new ModelRendererTurbo(this, 215, 87, textureX, textureY); // Box 9
		bodyModel[103] = new ModelRendererTurbo(this, 239, 104, textureX, textureY); // Box 9
		bodyModel[104] = new ModelRendererTurbo(this, 173, 87, textureX, textureY); // Box 9
		bodyModel[105] = new ModelRendererTurbo(this, 235, 117, textureX, textureY); // Box 21
		bodyModel[106] = new ModelRendererTurbo(this, 144, 122, textureX, textureY); // Box 13
		bodyModel[107] = new ModelRendererTurbo(this, 151, 102, textureX, textureY); // Box 10
		bodyModel[108] = new ModelRendererTurbo(this, 151, 111, textureX, textureY); // Box 10
		bodyModel[109] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 211, 82, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 211, 82, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 185, 162, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 185, 133, textureX, textureY); // Box 3
		bodyModel[118] = new ModelRendererTurbo(this, 185, 118, textureX, textureY); // Box 4
		bodyModel[119] = new ModelRendererTurbo(this, 193, 111, textureX, textureY); // Box 5
		bodyModel[120] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 6
		bodyModel[121] = new ModelRendererTurbo(this, 193, 104, textureX, textureY); // Box 7
		bodyModel[122] = new ModelRendererTurbo(this, 172, 110, textureX, textureY); // Box 10
		bodyModel[123] = new ModelRendererTurbo(this, 179, 105, textureX, textureY); // Box 11
		bodyModel[124] = new ModelRendererTurbo(this, 165, 105, textureX, textureY); // Box 12
		bodyModel[125] = new ModelRendererTurbo(this, 179, 114, textureX, textureY); // Box 13
		bodyModel[126] = new ModelRendererTurbo(this, 248, 122, textureX, textureY); // Box 14
		bodyModel[127] = new ModelRendererTurbo(this, 185, 148, textureX, textureY); // Box 3
		bodyModel[128] = new ModelRendererTurbo(this, 215, 92, textureX, textureY); // Box 9
		bodyModel[129] = new ModelRendererTurbo(this, 239, 104, textureX, textureY); // Box 9
		bodyModel[130] = new ModelRendererTurbo(this, 175, 92, textureX, textureY); // Box 9
		bodyModel[131] = new ModelRendererTurbo(this, 235, 117, textureX, textureY); // Box 21
		bodyModel[132] = new ModelRendererTurbo(this, 151, 102, textureX, textureY); // Box 10
		bodyModel[133] = new ModelRendererTurbo(this, 151, 111, textureX, textureY); // Box 10
		bodyModel[134] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 211, 82, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 220, 82, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 202, 82, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 211, 82, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 287, 212, textureX, textureY); // Box 123
		bodyModel[141] = new ModelRendererTurbo(this, 278, 212, textureX, textureY); // Box 254
		bodyModel[142] = new ModelRendererTurbo(this, 287, 216, textureX, textureY); // Box 255
		bodyModel[143] = new ModelRendererTurbo(this, 278, 216, textureX, textureY); // Box 136
		bodyModel[144] = new ModelRendererTurbo(this, 340, 216, textureX, textureY); // Box 137
		bodyModel[145] = new ModelRendererTurbo(this, 340, 212, textureX, textureY); // Box 138
		bodyModel[146] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 324
		bodyModel[147] = new ModelRendererTurbo(this, 290, 181, textureX, textureY); // Box 324
		bodyModel[148] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 324
		bodyModel[149] = new ModelRendererTurbo(this, 293, 181, textureX, textureY); // Box 324
		bodyModel[150] = new ModelRendererTurbo(this, 296, 181, textureX, textureY); // Box 324
		bodyModel[151] = new ModelRendererTurbo(this, 299, 181, textureX, textureY); // Box 324
		bodyModel[152] = new ModelRendererTurbo(this, 359, 29, textureX, textureY); // Box 187
		bodyModel[153] = new ModelRendererTurbo(this, 359, 33, textureX, textureY); // Box 188
		bodyModel[154] = new ModelRendererTurbo(this, 359, 29, textureX, textureY); // Box 187
		bodyModel[155] = new ModelRendererTurbo(this, 359, 33, textureX, textureY); // Box 188
		bodyModel[156] = new ModelRendererTurbo(this, 207, 40, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 207, 34, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 207, 28, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 265, 152, textureX, textureY); // Box 42
		bodyModel[160] = new ModelRendererTurbo(this, 394, 158, textureX, textureY); // Box 44
		bodyModel[161] = new ModelRendererTurbo(this, 332, 151, textureX, textureY); // Box 324
		bodyModel[162] = new ModelRendererTurbo(this, 278, 145, textureX, textureY); // Box 325
		bodyModel[163] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 186
		bodyModel[164] = new ModelRendererTurbo(this, 281, 136, textureX, textureY); // Box 196
		bodyModel[165] = new ModelRendererTurbo(this, 289, 84, textureX, textureY); // Box 197
		bodyModel[166] = new ModelRendererTurbo(this, 231, 40, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 231, 34, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 231, 28, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 177, 40, textureX, textureY); // Box 186
		bodyModel[170] = new ModelRendererTurbo(this, 215, 20, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 224, 36, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 224, 28, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 232, 46, textureX, textureY); // Box 209
		bodyModel[174] = new ModelRendererTurbo(this, 216, 46, textureX, textureY); // Box 210
		bodyModel[175] = new ModelRendererTurbo(this, 347, 33, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 347, 29, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 90, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43F, -2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-47F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(48F, 2F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 46, 16, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-44F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 46, 16, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-44F, -15F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 90, 2, 4, 0F); // Box 0
		bodyModel[5].setRotationPoint(-43F, -1F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[6].setRotationPoint(47F, -15F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 92, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-44F, -19F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 92, 1, 6, 0F); // Box 0
		bodyModel[8].setRotationPoint(-44F, -19F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 92, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-44F, -19F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 92, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-44F, -18F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 92, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-44F, -18F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-44F, -16F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-44F, -16F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[14].setRotationPoint(47F, -17F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[15].setRotationPoint(47F, -18F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(47F, -17F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(47F, -17F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(47F, -18F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(47F, -18F, 3F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[20].setRotationPoint(-44F, 1F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[21].setRotationPoint(-44F, -1F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[22].setRotationPoint(-44F, 1F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[23].setRotationPoint(-44F, 1F, 2F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[24].setRotationPoint(-44F, -15F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[25].setRotationPoint(-44F, -17F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[26].setRotationPoint(-44F, -18F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-44F, -17F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-44F, -17F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-44F, -18F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-44F, -18F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 42, 16, 1, 0F); // Box 0
		bodyModel[31].setRotationPoint(6F, -15F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 42, 16, 1, 0F); // Box 0
		bodyModel[32].setRotationPoint(6F, -15F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[33].setRotationPoint(2F, -2F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 0
		bodyModel[34].setRotationPoint(2F, -2F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[35].setRotationPoint(2F, -10F, 10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(2F, -10F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[37].setRotationPoint(2F, -15F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 0
		bodyModel[38].setRotationPoint(2F, -15F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[39].setRotationPoint(47F, 1F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[40].setRotationPoint(47F, -1F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[41].setRotationPoint(47F, 1F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[42].setRotationPoint(47F, 1F, 2F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[43].setRotationPoint(48F, -15F, -5F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 315
		bodyModel[44].setRotationPoint(48F, -17F, -5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[45].setRotationPoint(48F, -15F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[46].setRotationPoint(48F, 0F, -5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 86
		bodyModel[47].setRotationPoint(-46F, -15F, -5F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 87
		bodyModel[48].setRotationPoint(-46F, -17F, -5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 88
		bodyModel[49].setRotationPoint(-46F, -15F, 4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 89
		bodyModel[50].setRotationPoint(-46F, 0F, -5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[51].setRotationPoint(48F, -19F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[52].setRotationPoint(48F, -19F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[53].setRotationPoint(48F, -19F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[54].setRotationPoint(-46F, -19F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 94
		bodyModel[55].setRotationPoint(-46F, -19F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 95
		bodyModel[56].setRotationPoint(-46F, -19F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[57].setRotationPoint(27F, 1F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[58].setRotationPoint(-27F, 1F, -2F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[59].setRotationPoint(36.5F, -20F, -1F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[60].setRotationPoint(40.5F, -20F, 1F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[61].setRotationPoint(6.5F, -10F, -11.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[62].setRotationPoint(1.5F, -10F, -11.75F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[63].setRotationPoint(6.5F, -10F, 10.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[64].setRotationPoint(1.5F, -10F, 10.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[65].setRotationPoint(2F, 1F, -11.01F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[66].setRotationPoint(2F, 1F, 11.01F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[67].setRotationPoint(43.5F, 1F, 11F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[68].setRotationPoint(43.5F, 1F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[69].setRotationPoint(46.5F, -6F, -11.75F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[70].setRotationPoint(43.5F, -6F, -11.75F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[71].setRotationPoint(46.5F, -6F, 10.75F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[72].setRotationPoint(43.5F, -6F, 10.75F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[73].setRotationPoint(-42.5F, 1F, 11F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[74].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[75].setRotationPoint(-39.5F, -6F, -11.75F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[76].setRotationPoint(-42.5F, -6F, -11.75F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[77].setRotationPoint(-39.5F, -6F, 10.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[78].setRotationPoint(-42.5F, -6F, 10.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[79].setRotationPoint(47.5F, -10.5F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[80].setRotationPoint(48.01F, 0F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[81].setRotationPoint(48.01F, 0F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[82].setRotationPoint(-44.5F, -10.5F, 7F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[83].setRotationPoint(-44.01F, 0F, -10F);

		bodyModel[84].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[84].setRotationPoint(-44.01F, 0F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 132 lamp
		bodyModel[85].setRotationPoint(47.5F, -10.5F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 133 lamp
		bodyModel[86].setRotationPoint(-44.5F, -10.5F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[87].setRotationPoint(-41.5F, -9F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[88].setRotationPoint(-42F, -7F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[89].setRotationPoint(12F, -5F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[90].setRotationPoint(12F, -7F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[91].setRotationPoint(12F, -10F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[92].setRotationPoint(12F, -12F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[93].setRotationPoint(12F, -14F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[94].setRotationPoint(12F, -14F, 2F);

		bodyModel[95].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 7
		bodyModel[95].setRotationPoint(12F, -14F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[96].setRotationPoint(29F, -16F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[97].setRotationPoint(29F, -16F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[98].setRotationPoint(29F, -16F, 2F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[99].setRotationPoint(29F, -12F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[100].setRotationPoint(10F, -6F, -5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[101].setRotationPoint(12F, -8F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[102].setRotationPoint(11F, -17F, -1.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[103].setRotationPoint(11F, -14F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[104].setRotationPoint(11F, -16F, -1.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[105].setRotationPoint(11F, -10F, -2F);

		bodyModel[106].addBox(0F, 0F, 0F, 3, 15, 12, 0F); // Box 13
		bodyModel[106].setRotationPoint(-29F, -17F, -6F);

		bodyModel[107].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[107].setRotationPoint(30F, -15F, 3F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[108].setRotationPoint(30F, -15F, -6F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[109].setRotationPoint(26.5F, -16F, -1F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[110].setRotationPoint(22.5F, -16F, -1F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[111].setRotationPoint(24.5F, -16F, -1F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[112].setRotationPoint(17.5F, -16F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[113].setRotationPoint(13.5F, -16F, -1F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[114].setRotationPoint(15.5F, -16F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[115].setRotationPoint(-19F, -5F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[116].setRotationPoint(-19F, -7F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[117].setRotationPoint(-19F, -10F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[118].setRotationPoint(-19F, -12F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[119].setRotationPoint(-19F, -14F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[120].setRotationPoint(-19F, -14F, 2F);

		bodyModel[121].addBox(0F, 0F, 0F, 17, 2, 4, 0F); // Box 7
		bodyModel[121].setRotationPoint(-19F, -14F, -2F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 10
		bodyModel[122].setRotationPoint(-20F, -16F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[123].setRotationPoint(-20F, -16F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[124].setRotationPoint(-20F, -16F, 2F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 9, 6, 0F); // Box 13
		bodyModel[125].setRotationPoint(-20F, -12F, -3F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 4, 3, 0F); // Box 14
		bodyModel[126].setRotationPoint(-2F, -6F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 3
		bodyModel[127].setRotationPoint(-19F, -8F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[128].setRotationPoint(-18F, -17F, -1.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 9
		bodyModel[129].setRotationPoint(-2F, -14F, -4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[130].setRotationPoint(-18F, -16F, -1.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 7, 5, 0F); // Box 21
		bodyModel[131].setRotationPoint(-2F, -10F, -2F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[132].setRotationPoint(-25F, -15F, 3F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 3, 3, 0F); // Box 10
		bodyModel[133].setRotationPoint(-25F, -15F, -6F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[134].setRotationPoint(-4.5F, -16F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[135].setRotationPoint(-8.5F, -16F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[136].setRotationPoint(-6.5F, -16F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[137].setRotationPoint(-13.5F, -16F, -1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[138].setRotationPoint(-17.5F, -16F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		bodyModel[139].setRotationPoint(-15.5F, -16F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[140].setRotationPoint(-9F, 1F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[141].setRotationPoint(-12F, 1F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[142].setRotationPoint(-9F, 1F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[143].setRotationPoint(-12F, 1F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[144].setRotationPoint(16F, 1F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[145].setRotationPoint(16F, 1F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[146].setRotationPoint(-10.5F, 4F, -8F);
		bodyModel[146].rotateAngleZ = 0.78539816F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[147].setRotationPoint(15.42F, -1F, -8.01F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[148].setRotationPoint(14.5F, 4F, -8F);
		bodyModel[148].rotateAngleZ = 0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[149].setRotationPoint(15.42F, -1F, 8.01F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[150].setRotationPoint(-9.6F, -1F, -8.01F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[151].setRotationPoint(-9.6F, -1F, 8.01F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[152].setRotationPoint(36.5F, -19.2F, -6F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[153].setRotationPoint(42.5F, -19.2F, -6F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[154].setRotationPoint(36.5F, -19.2F, 4F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[155].setRotationPoint(42.5F, -19.2F, 4F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[156].setRotationPoint(-15.5F, -20F, -2F);

		bodyModel[157].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[157].setRotationPoint(-11.25F, -20F, -2F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[158].setRotationPoint(-7F, -20F, -2F);

		bodyModel[159].addBox(0F, 0F, 0F, 21, 4, 20, 0F); // Box 42
		bodyModel[159].setRotationPoint(-7F, 0F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[160].setRotationPoint(-7F, 4F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[161].setRotationPoint(-7F, 4F, -8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[162].setRotationPoint(-7F, 4F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[163].setRotationPoint(-20.4F, -21F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 91, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[164].setRotationPoint(-43.5F, -14F, -11.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 91, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[165].setRotationPoint(-43.5F, -14F, 10.25F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[166].setRotationPoint(12.25F, -20F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[167].setRotationPoint(16.5F, -20F, -2F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[168].setRotationPoint(20.75F, -20F, -2F);

		bodyModel[169].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[169].setRotationPoint(20.6F, -21F, -3F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[170].setRotationPoint(1F, -20F, -3F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[171].setRotationPoint(-2.5F, -20F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 0
		bodyModel[172].setRotationPoint(10.5F, -20F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[173].setRotationPoint(-2.5F, -21F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[174].setRotationPoint(10.5F, -21F, -1F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 0
		bodyModel[175].setRotationPoint(-3.5F, -21F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 0
		bodyModel[176].setRotationPoint(9.5F, -21F, -1F);
	}
	ModelBlombergA1A theTrucc = new ModelBlombergA1A();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 177; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 8||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/a1a_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5625, -0.13, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.5625, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/a1a_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.5625, -0.13, 0);;
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.5625, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelE8B[];
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{2.125D, 1.3215D, 0.0D});
				add(new double[]{1.3125D, 1.3125D, 0.0D});
			}
		};
	}
}