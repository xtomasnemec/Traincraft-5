//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EP1A
// Model Creator: 
// Created on: 23.05.2020 - 17:36:30
// Last changed on: 23.05.2020 - 17:36:30

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelEF1d;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelEF1tp;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelEP1A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelEP1A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[210];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 155, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 2, 132, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 54, 91, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 151, 99, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 54, 72, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 42, 31, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 307, 102, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 101, 37, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 109, 14, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 303, 21, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 315, 17, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 315, 35, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 446, 16, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 446, 35, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 181, 70, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 181, 61, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 191, 60, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 191, 69, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 204, 70, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 204, 61, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 214, 69, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 228, 70, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 227, 61, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 237, 60, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 238, 69, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 56, 22, textureX, textureY); // Box 1
		bodyModel[27] = new ModelRendererTurbo(this, 24, 161, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 24, 173, textureX, textureY); // Box 1
		bodyModel[29] = new ModelRendererTurbo(this, 77, 22, textureX, textureY); // Box 1
		bodyModel[30] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Headlight top body
		bodyModel[31] = new ModelRendererTurbo(this, 12, 15, textureX, textureY); // Headlight top body
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Headlight top body
		bodyModel[33] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Headlight top body
		bodyModel[34] = new ModelRendererTurbo(this, 23, 1, textureX, textureY); // Headlight top body
		bodyModel[35] = new ModelRendererTurbo(this, 23, 15, textureX, textureY); // Headlight top body
		bodyModel[36] = new ModelRendererTurbo(this, 178, 107, textureX, textureY); // Box 4
		bodyModel[37] = new ModelRendererTurbo(this, 167, 91, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 219, 98, textureX, textureY); // Box 4
		bodyModel[39] = new ModelRendererTurbo(this, 167, 83, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 167, 99, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 202, 91, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 232, 107, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 266, 97, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 235, 81, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 254, 83, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 275, 77, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 86, 22, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 37, 22, textureX, textureY); // Box 4
		bodyModel[50] = new ModelRendererTurbo(this, 31, 36, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 8, 6, textureX, textureY); // Headlight top body
		bodyModel[52] = new ModelRendererTurbo(this, 40, 13, textureX, textureY); // Headlight top left
		bodyModel[53] = new ModelRendererTurbo(this, 2, 6, textureX, textureY); // Headlight number boards right
		bodyModel[54] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Headlight number boards left
		bodyModel[55] = new ModelRendererTurbo(this, 34, 13, textureX, textureY); // Headlight top right
		bodyModel[56] = new ModelRendererTurbo(this, 40, 17, textureX, textureY); // Headlight bottom left
		bodyModel[57] = new ModelRendererTurbo(this, 34, 17, textureX, textureY); // Headlight bottom right
		bodyModel[58] = new ModelRendererTurbo(this, 42, 161, textureX, textureY); // Box 427
		bodyModel[59] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 427
		bodyModel[60] = new ModelRendererTurbo(this, 67, 161, textureX, textureY); // Box 427
		bodyModel[61] = new ModelRendererTurbo(this, 49, 174, textureX, textureY); // Box 427
		bodyModel[62] = new ModelRendererTurbo(this, 49, 162, textureX, textureY); // Box 427
		bodyModel[63] = new ModelRendererTurbo(this, 3, 163, textureX, textureY); // Box 427
		bodyModel[64] = new ModelRendererTurbo(this, 3, 176, textureX, textureY); // Box 427
		bodyModel[65] = new ModelRendererTurbo(this, 3, 169, textureX, textureY); // Box 427
		bodyModel[66] = new ModelRendererTurbo(this, 91, 177, textureX, textureY); // Box 427
		bodyModel[67] = new ModelRendererTurbo(this, 67, 177, textureX, textureY); // Box 427
		bodyModel[68] = new ModelRendererTurbo(this, 4, 185, textureX, textureY); // Box 427
		bodyModel[69] = new ModelRendererTurbo(this, 4, 195, textureX, textureY); // Box 427
		bodyModel[70] = new ModelRendererTurbo(this, 4, 190, textureX, textureY); // Box 427
		bodyModel[71] = new ModelRendererTurbo(this, 344, 89, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 397, 89, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 344, 71, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 397, 71, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 358, 96, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 402, 91, textureX, textureY); // Box 4
		bodyModel[77] = new ModelRendererTurbo(this, 411, 92, textureX, textureY); // Box 4
		bodyModel[78] = new ModelRendererTurbo(this, 402, 95, textureX, textureY); // Box 4
		bodyModel[79] = new ModelRendererTurbo(this, 411, 96, textureX, textureY); // Box 4
		bodyModel[80] = new ModelRendererTurbo(this, 363, 52, textureX, textureY); // Box 9
		bodyModel[81] = new ModelRendererTurbo(this, 347, 54, textureX, textureY); // Box 9
		bodyModel[82] = new ModelRendererTurbo(this, 369, 68, textureX, textureY); // Box 11
		bodyModel[83] = new ModelRendererTurbo(this, 359, 68, textureX, textureY); // Box 11
		bodyModel[84] = new ModelRendererTurbo(this, 339, 71, textureX, textureY); // Box 13
		bodyModel[85] = new ModelRendererTurbo(this, 392, 71, textureX, textureY); // Box 14
		bodyModel[86] = new ModelRendererTurbo(this, 339, 89, textureX, textureY); // Box 15
		bodyModel[87] = new ModelRendererTurbo(this, 325, 92, textureX, textureY); // Box 16
		bodyModel[88] = new ModelRendererTurbo(this, 330, 91, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 330, 95, textureX, textureY); // Box 18
		bodyModel[90] = new ModelRendererTurbo(this, 325, 96, textureX, textureY); // Box 19
		bodyModel[91] = new ModelRendererTurbo(this, 358, 92, textureX, textureY); // Box 20
		bodyModel[92] = new ModelRendererTurbo(this, 392, 89, textureX, textureY); // Box 21
		bodyModel[93] = new ModelRendererTurbo(this, 419, 89, textureX, textureY); // Box 23
		bodyModel[94] = new ModelRendererTurbo(this, 314, 91, textureX, textureY); // Box 23
		bodyModel[95] = new ModelRendererTurbo(this, 408, 91, textureX, textureY); // Box 23
		bodyModel[96] = new ModelRendererTurbo(this, 303, 89, textureX, textureY); // Box 23
		bodyModel[97] = new ModelRendererTurbo(this, 406, 81, textureX, textureY); // Box 23
		bodyModel[98] = new ModelRendererTurbo(this, 417, 79, textureX, textureY); // Box 23
		bodyModel[99] = new ModelRendererTurbo(this, 316, 81, textureX, textureY); // Box 23
		bodyModel[100] = new ModelRendererTurbo(this, 305, 79, textureX, textureY); // Box 23
		bodyModel[101] = new ModelRendererTurbo(this, 341, 93, textureX, textureY); // Box 4
		bodyModel[102] = new ModelRendererTurbo(this, 381, 93, textureX, textureY); // Box 4
		bodyModel[103] = new ModelRendererTurbo(this, 352, 58, textureX, textureY); // Box 33
		bodyModel[104] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Box 34
		bodyModel[105] = new ModelRendererTurbo(this, 378, 56, textureX, textureY); // Box 33
		bodyModel[106] = new ModelRendererTurbo(this, 378, 60, textureX, textureY); // Box 34
		bodyModel[107] = new ModelRendererTurbo(this, 380, 75, textureX, textureY); // Box 37
		bodyModel[108] = new ModelRendererTurbo(this, 409, 75, textureX, textureY); // Box 37
		bodyModel[109] = new ModelRendererTurbo(this, 402, 75, textureX, textureY); // Box 39
		bodyModel[110] = new ModelRendererTurbo(this, 385, 75, textureX, textureY); // Box 40
		bodyModel[111] = new ModelRendererTurbo(this, 402, 85, textureX, textureY); // Box 39
		bodyModel[112] = new ModelRendererTurbo(this, 385, 85, textureX, textureY); // Box 40
		bodyModel[113] = new ModelRendererTurbo(this, 327, 75, textureX, textureY); // Box 37
		bodyModel[114] = new ModelRendererTurbo(this, 356, 75, textureX, textureY); // Box 37
		bodyModel[115] = new ModelRendererTurbo(this, 349, 75, textureX, textureY); // Box 39
		bodyModel[116] = new ModelRendererTurbo(this, 332, 75, textureX, textureY); // Box 40
		bodyModel[117] = new ModelRendererTurbo(this, 349, 85, textureX, textureY); // Box 39
		bodyModel[118] = new ModelRendererTurbo(this, 332, 85, textureX, textureY); // Box 40
		bodyModel[119] = new ModelRendererTurbo(this, 168, 64, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 168, 76, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 166, 69, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 253, 76, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 251, 69, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 45, 9, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 56, 2, textureX, textureY); // Box 1
		bodyModel[128] = new ModelRendererTurbo(this, 60, 2, textureX, textureY); // Box 1
		bodyModel[129] = new ModelRendererTurbo(this, 77, 2, textureX, textureY); // Box 1
		bodyModel[130] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 7, 37, textureX, textureY); // Box 1
		bodyModel[132] = new ModelRendererTurbo(this, 193, 170, textureX, textureY); // Box 4
		bodyModel[133] = new ModelRendererTurbo(this, 149, 170, textureX, textureY); // Box 4
		bodyModel[134] = new ModelRendererTurbo(this, 182, 170, textureX, textureY); // Box 4
		bodyModel[135] = new ModelRendererTurbo(this, 171, 170, textureX, textureY); // Box 4
		bodyModel[136] = new ModelRendererTurbo(this, 160, 170, textureX, textureY); // Box 4
		bodyModel[137] = new ModelRendererTurbo(this, 160, 162, textureX, textureY); // Box 4
		bodyModel[138] = new ModelRendererTurbo(this, 193, 163, textureX, textureY); // Box 4
		bodyModel[139] = new ModelRendererTurbo(this, 149, 163, textureX, textureY); // Box 4
		bodyModel[140] = new ModelRendererTurbo(this, 182, 162, textureX, textureY); // Box 4
		bodyModel[141] = new ModelRendererTurbo(this, 171, 162, textureX, textureY); // Box 4
		bodyModel[142] = new ModelRendererTurbo(this, 144, 173, textureX, textureY); // Box 4
		bodyModel[143] = new ModelRendererTurbo(this, 204, 173, textureX, textureY); // Box 4
		bodyModel[144] = new ModelRendererTurbo(this, 144, 170, textureX, textureY); // Box 4
		bodyModel[145] = new ModelRendererTurbo(this, 204, 170, textureX, textureY); // Box 4
		bodyModel[146] = new ModelRendererTurbo(this, 204, 167, textureX, textureY); // Box 4
		bodyModel[147] = new ModelRendererTurbo(this, 144, 167, textureX, textureY); // Box 4
		bodyModel[148] = new ModelRendererTurbo(this, 170, 191, textureX, textureY); // Box 4
		bodyModel[149] = new ModelRendererTurbo(this, 196, 191, textureX, textureY); // Box 4
		bodyModel[150] = new ModelRendererTurbo(this, 183, 191, textureX, textureY); // Box 4
		bodyModel[151] = new ModelRendererTurbo(this, 144, 191, textureX, textureY); // Box 4
		bodyModel[152] = new ModelRendererTurbo(this, 157, 191, textureX, textureY); // Box 4
		bodyModel[153] = new ModelRendererTurbo(this, 5, 55, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 7, 22, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 12, 30, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 18, 30, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 24, 33, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 12, 33, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 10, 33, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 28, 33, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 198, 144, textureX, textureY); // Box 4
		bodyModel[162] = new ModelRendererTurbo(this, 189, 154, textureX, textureY); // Box 4
		bodyModel[163] = new ModelRendererTurbo(this, 178, 198, textureX, textureY); // Face headlight top left
		bodyModel[164] = new ModelRendererTurbo(this, 170, 198, textureX, textureY); // Face headlight top right
		bodyModel[165] = new ModelRendererTurbo(this, 178, 201, textureX, textureY); // Face headlight bottom left
		bodyModel[166] = new ModelRendererTurbo(this, 170, 201, textureX, textureY); // Face headlight bottom right
		bodyModel[167] = new ModelRendererTurbo(this, 161, 200, textureX, textureY); // Headlight front body
		bodyModel[168] = new ModelRendererTurbo(this, 185, 200, textureX, textureY); // Headlight front body
		bodyModel[169] = new ModelRendererTurbo(this, 149, 197, textureX, textureY); // Headlight front body
		bodyModel[170] = new ModelRendererTurbo(this, 154, 200, textureX, textureY); // Headlight front body
		bodyModel[171] = new ModelRendererTurbo(this, 197, 197, textureX, textureY); // Headlight front body
		bodyModel[172] = new ModelRendererTurbo(this, 192, 200, textureX, textureY); // Headlight front body
		bodyModel[173] = new ModelRendererTurbo(this, 169, 198, textureX, textureY); // Headlight front body
		bodyModel[174] = new ModelRendererTurbo(this, 24, 57, textureX, textureY); // Box 1
		bodyModel[175] = new ModelRendererTurbo(this, 6, 57, textureX, textureY); // Box 1
		bodyModel[176] = new ModelRendererTurbo(this, 120, 34, textureX, textureY); // Box 4
		bodyModel[177] = new ModelRendererTurbo(this, 117, 28, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 117, 8, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 120, 5, textureX, textureY); // Box 4
		bodyModel[180] = new ModelRendererTurbo(this, 65, 2, textureX, textureY); // Box 1
		bodyModel[181] = new ModelRendererTurbo(this, 69, 2, textureX, textureY); // Box 1
		bodyModel[182] = new ModelRendererTurbo(this, 86, 2, textureX, textureY); // Box 1
		bodyModel[183] = new ModelRendererTurbo(this, 90, 2, textureX, textureY); // Box 1
		bodyModel[184] = new ModelRendererTurbo(this, 31, 91, textureX, textureY); // Box 4
		bodyModel[185] = new ModelRendererTurbo(this, 31, 72, textureX, textureY); // Box 4
		bodyModel[186] = new ModelRendererTurbo(this, 12, 91, textureX, textureY); // Box 4
		bodyModel[187] = new ModelRendererTurbo(this, 12, 72, textureX, textureY); // Box 4
		bodyModel[188] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 4
		bodyModel[189] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 4
		bodyModel[190] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 4
		bodyModel[191] = new ModelRendererTurbo(this, 1, 72, textureX, textureY); // Box 4
		bodyModel[192] = new ModelRendererTurbo(this, 1, 110, textureX, textureY); // Engineer's front door
		bodyModel[193] = new ModelRendererTurbo(this, 12, 110, textureX, textureY); // Engineer's body door
		bodyModel[194] = new ModelRendererTurbo(this, 45, 110, textureX, textureY); // Fireman's body door
		bodyModel[195] = new ModelRendererTurbo(this, 1, 107, textureX, textureY); // Box 4
		bodyModel[196] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 4
		bodyModel[197] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 4
		bodyModel[198] = new ModelRendererTurbo(this, 34, 110, textureX, textureY); // Fireman's front door
		bodyModel[199] = new ModelRendererTurbo(this, 1, 88, textureX, textureY); // Box 4
		bodyModel[200] = new ModelRendererTurbo(this, 73, 31, textureX, textureY); // Box 4
		bodyModel[201] = new ModelRendererTurbo(this, 62, 40, textureX, textureY); // Front door
		bodyModel[202] = new ModelRendererTurbo(this, 62, 31, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 62, 57, textureX, textureY); // Box 4
		bodyModel[204] = new ModelRendererTurbo(this, 127, 68, textureX, textureY); // Box 0
		bodyModel[205] = new ModelRendererTurbo(this, 127, 63, textureX, textureY); // Box 0
		bodyModel[206] = new ModelRendererTurbo(this, 140, 60, textureX, textureY); // number boards right
		bodyModel[207] = new ModelRendererTurbo(this, 151, 60, textureX, textureY); // number boards left
		bodyModel[208] = new ModelRendererTurbo(this, 142, 67, textureX, textureY); // Box 212
		bodyModel[209] = new ModelRendererTurbo(this, 153, 67, textureX, textureY); // Box 211

		bodyModel[0].addBox(0F, 0F, 0F, 79, 2, 3, 0F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -2F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 0
		bodyModel[1].setRotationPoint(-36F, -3F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 53, 17, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(-11F, -19F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 15, 12, 0F); // Box 4
		bodyModel[3].setRotationPoint(-25F, -18F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 53, 17, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-11F, -19F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 4
		bodyModel[5].setRotationPoint(-37F, -19F, 2F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 17, 20, 0F); // Box 4
		bodyModel[6].setRotationPoint(41F, -19F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 77, 1, 20, 0F); // Box 0
		bodyModel[7].setRotationPoint(-36F, -19F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 79, 1, 12, 0F); // Box 0
		bodyModel[8].setRotationPoint(-37F, -20F, -6F);

		bodyModel[9].addBox(0F, 0F, 0F, 65, 1, 12, 0F); // Box 0
		bodyModel[9].setRotationPoint(-28F, -21F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 65, 3, 0, 0F); // Box 0
		bodyModel[10].setRotationPoint(-28F, -24F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 65, 3, 0, 0F); // Box 0
		bodyModel[11].setRotationPoint(-28F, -24F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[12].setRotationPoint(37F, -24F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 0
		bodyModel[13].setRotationPoint(37F, -24F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-7F, -24F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-7F, -24F, 1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-6.5F, -22F, 1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-6.5F, -22F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(4F, -24F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(4F, -24F, 1F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(4.5F, -22F, 1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(4.5F, -22F, -5.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(16F, -24F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(16F, -24F, 1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(16.5F, -22F, 1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(16.5F, -22F, -5.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[26].setRotationPoint(-29F, -2F, 11F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 1
		bodyModel[27].setRotationPoint(-37F, -2F, 1.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 1
		bodyModel[28].setRotationPoint(-37F, -2F, -10.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[29].setRotationPoint(-29F, -2F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight top body
		bodyModel[30].setRotationPoint(-38F, -24.75F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight top body
		bodyModel[31].setRotationPoint(-38F, -21.75F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight top body
		bodyModel[32].setRotationPoint(-38F, -24.75F, 0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F); // Headlight top body
		bodyModel[33].setRotationPoint(-38F, -21.75F, 0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight top body
		bodyModel[34].setRotationPoint(-38F, -24.75F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight top body
		bodyModel[35].setRotationPoint(-38F, -21.75F, -2.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 14, 7, 12, 0F); // Box 4
		bodyModel[36].setRotationPoint(-24F, -10F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 5, 0F); // Box 4
		bodyModel[37].setRotationPoint(-24F, -14F, -2.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 11, 9, 0F); // Box 4
		bodyModel[38].setRotationPoint(-10F, -14F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(-24F, -16F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 4
		bodyModel[40].setRotationPoint(-24F, -12F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[41].setRotationPoint(-10F, -17F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 25, 15, 12, 0F); // Box 4
		bodyModel[42].setRotationPoint(-7F, -18F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[43].setRotationPoint(26F, -8F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 13, 12, 0F); // Box 4
		bodyModel[44].setRotationPoint(23F, -16F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 5, 4, 0F); // Box 4
		bodyModel[45].setRotationPoint(26F, -8F, 2F);

		bodyModel[46].addBox(0F, 0F, 0F, 6, 13, 6, 0F); // Box 4
		bodyModel[46].setRotationPoint(35F, -16F, 4F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[47].setRotationPoint(-15F, -2F, 11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 1
		bodyModel[48].setRotationPoint(-15F, -2F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 4
		bodyModel[49].setRotationPoint(-36F, -16F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[50].setRotationPoint(-36F, -12F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Headlight top body
		bodyModel[51].setRotationPoint(-38F, -23.25F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight top left
		bodyModel[52].setRotationPoint(-38.25F, -23.5F, -1.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight number boards right
		bodyModel[53].setRotationPoint(-38F, -23.25F, 2.25F);
		bodyModel[53].rotateAngleY = -0.68067841F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight number boards left
		bodyModel[54].setRotationPoint(-36.1F, -23.25F, -4.58F);
		bodyModel[54].rotateAngleY = 0.68067841F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight top right
		bodyModel[55].setRotationPoint(-38.25F, -23.5F, 0.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight bottom left
		bodyModel[56].setRotationPoint(-38.25F, -22F, -1.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Headlight bottom right
		bodyModel[57].setRotationPoint(-38.25F, -22F, 0.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[58].setRotationPoint(-10F, -0.5F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[59].setRotationPoint(24F, -0.5F, -1.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 4, 1, 14, 0F); // Box 427
		bodyModel[60].setRotationPoint(-24.5F, -0.5F, -7F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 427
		bodyModel[61].setRotationPoint(-24.5F, -2.5F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 427
		bodyModel[62].setRotationPoint(-24.5F, -2.5F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[63].setRotationPoint(-33F, -2F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 427
		bodyModel[64].setRotationPoint(-33F, 1F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[65].setRotationPoint(-33F, -1F, 6.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[66].setRotationPoint(-24F, 0.5F, -4F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 427
		bodyModel[67].setRotationPoint(-24F, 0.5F, 1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[68].setRotationPoint(-33F, -2F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 427
		bodyModel[69].setRotationPoint(-33F, 0F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[70].setRotationPoint(-33F, -1F, -9F);

		bodyModel[71].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // Box 0
		bodyModel[71].setRotationPoint(-32F, -30F, -4.5F);
		bodyModel[71].rotateAngleZ = 0.85521133F;

		bodyModel[72].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // Box 0
		bodyModel[72].setRotationPoint(-6.5F, -30F, -4.5F);
		bodyModel[72].rotateAngleZ = -0.85521133F;

		bodyModel[73].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		bodyModel[73].setRotationPoint(-19.75F, -38.9F, -4.5F);
		bodyModel[73].rotateAngleZ = -0.92066118F;

		bodyModel[74].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		bodyModel[74].setRotationPoint(-18.75F, -38.9F, -4.5F);
		bodyModel[74].rotateAngleZ = 0.92066118F;

		bodyModel[75].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 4
		bodyModel[75].setRotationPoint(-24.75F, -24F, -5F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 4
		bodyModel[76].setRotationPoint(-24.75F, -22F, -5.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 4
		bodyModel[77].setRotationPoint(-24.25F, -23F, -5F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 4
		bodyModel[78].setRotationPoint(-15.75F, -22F, -5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 4
		bodyModel[79].setRotationPoint(-15.25F, -23F, -5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 9
		bodyModel[80].setRotationPoint(-20.75F, -40.25F, -6F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 9
		bodyModel[81].setRotationPoint(-18.75F, -40.25F, -6F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[82].setRotationPoint(-20.75F, -39.25F, -5F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 11
		bodyModel[83].setRotationPoint(-20.75F, -39.25F, 4F);

		bodyModel[84].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 13
		bodyModel[84].setRotationPoint(-19.75F, -38.9F, 4.5F);
		bodyModel[84].rotateAngleZ = -0.92066118F;

		bodyModel[85].addShapeBox(-0.5F, 0F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 14
		bodyModel[85].setRotationPoint(-18.75F, -38.9F, 4.5F);
		bodyModel[85].rotateAngleZ = 0.92066118F;

		bodyModel[86].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // Box 15
		bodyModel[86].setRotationPoint(-32F, -30F, 4.5F);
		bodyModel[86].rotateAngleZ = 0.85521133F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 16
		bodyModel[87].setRotationPoint(-24.25F, -23F, 4F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 17
		bodyModel[88].setRotationPoint(-24.75F, -22F, 3.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 18
		bodyModel[89].setRotationPoint(-15.75F, -22F, 3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 19
		bodyModel[90].setRotationPoint(-15.25F, -23F, 4F);

		bodyModel[91].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 20
		bodyModel[91].setRotationPoint(-24.75F, -24F, 4F);

		bodyModel[92].addBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F); // Box 21
		bodyModel[92].setRotationPoint(-6.5F, -30F, 4.5F);
		bodyModel[92].rotateAngleZ = -0.85521133F;

		bodyModel[93].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -0.5F, 8F, 0F); // Box 23
		bodyModel[93].setRotationPoint(-7.87F, -28.8F, -4F);
		bodyModel[93].rotateAngleZ = -0.85521133F;

		bodyModel[94].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -0.5F, 8F, 0F); // Box 23
		bodyModel[94].setRotationPoint(-30.63F, -28.8F, -4F);
		bodyModel[94].rotateAngleZ = 0.85521133F;

		bodyModel[95].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,0F, -8F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[95].setRotationPoint(-7.87F, -28.8F, -4F);
		bodyModel[95].rotateAngleZ = -0.85521133F;

		bodyModel[96].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,0F, -8F, 0F, -0.5F, -8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -0.5F, 8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[96].setRotationPoint(-30.63F, -28.8F, -4F);
		bodyModel[96].rotateAngleZ = 0.85521133F;

		bodyModel[97].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,0F, 13F, 0F, -0.5F, 13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -0.5F, -13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[97].setRotationPoint(-7.87F, -30.65F, -4F);
		bodyModel[97].rotateAngleZ = 0.92066118F;

		bodyModel[98].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, -0.5F, 13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -0.5F, -13F, 0F); // Box 23
		bodyModel[98].setRotationPoint(-7.87F, -30.65F, -4F);
		bodyModel[98].rotateAngleZ = 0.92066118F;

		bodyModel[99].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,0F, 13F, 0F, -0.5F, 13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -0.5F, -13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[99].setRotationPoint(-30.87F, -30.45F, -4F);
		bodyModel[99].rotateAngleZ = -0.92066118F;

		bodyModel[100].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, -0.5F, 13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -0.5F, -13F, 0F); // Box 23
		bodyModel[100].setRotationPoint(-30.87F, -30.45F, -4F);
		bodyModel[100].rotateAngleZ = -0.92066118F;

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 4
		bodyModel[101].setRotationPoint(-23.75F, -24F, -4F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 4
		bodyModel[102].setRotationPoint(-15.75F, -24F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 33
		bodyModel[103].setRotationPoint(-18.75F, -40.25F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 34
		bodyModel[104].setRotationPoint(-20.75F, -40.25F, 6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[105].setRotationPoint(-18.75F, -40.25F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[106].setRotationPoint(-20.75F, -40.25F, -8F);

		bodyModel[107].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 37
		bodyModel[107].setRotationPoint(-17.7F, -38.1F, 7.5F);
		bodyModel[107].rotateAngleZ = 0.92066118F;

		bodyModel[108].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 37
		bodyModel[108].setRotationPoint(-17.7F, -38.1F, -7.5F);
		bodyModel[108].rotateAngleZ = 0.92066118F;

		bodyModel[109].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[109].setRotationPoint(-17.7F, -38.1F, -6.5F);
		bodyModel[109].rotateAngleZ = 0.92066118F;

		bodyModel[110].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[110].setRotationPoint(-17.7F, -38.1F, 5.5F);
		bodyModel[110].rotateAngleZ = 0.92066118F;

		bodyModel[111].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[111].setRotationPoint(-9.5F, -31.85F, -6.5F);
		bodyModel[111].rotateAngleZ = 0.92066118F;

		bodyModel[112].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[112].setRotationPoint(-9.5F, -31.85F, 5.5F);
		bodyModel[112].rotateAngleZ = 0.92066118F;

		bodyModel[113].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 37
		bodyModel[113].setRotationPoint(-20.8F, -38.1F, 7.5F);
		bodyModel[113].rotateAngleZ = -0.92066118F;

		bodyModel[114].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 37
		bodyModel[114].setRotationPoint(-20.8F, -38.1F, -7.5F);
		bodyModel[114].rotateAngleZ = -0.92066118F;

		bodyModel[115].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[115].setRotationPoint(-20.8F, -38.1F, -6.5F);
		bodyModel[115].rotateAngleZ = -0.92066118F;

		bodyModel[116].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[116].setRotationPoint(-20.8F, -38.1F, 5.5F);
		bodyModel[116].rotateAngleZ = -0.92066118F;

		bodyModel[117].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[117].setRotationPoint(-29F, -31.85F, -6.5F);
		bodyModel[117].rotateAngleZ = -0.92066118F;

		bodyModel[118].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[118].setRotationPoint(-29F, -31.85F, 5.5F);
		bodyModel[118].rotateAngleZ = -0.92066118F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[119].setRotationPoint(-10.5F, -25F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(-10.5F, -25F, 0F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[121].setRotationPoint(-10.5F, -23F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(18F, -25F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[123].setRotationPoint(18F, -25F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[124].setRotationPoint(18F, -23F, -2F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[125].setRotationPoint(-36F, -21.5F, 4.75F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[126].setRotationPoint(-33F, -20.5F, 4.75F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[127].setRotationPoint(-29F, -15F, 11F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[128].setRotationPoint(-25F, -15F, 11F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[129].setRotationPoint(-29F, -15F, -12F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[130].setRotationPoint(-25F, -15F, -12F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 7, 10, 0F); // Box 1
		bodyModel[131].setRotationPoint(-40F, -10F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 4
		bodyModel[132].setRotationPoint(-38F, -18F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[133].setRotationPoint(-38F, -18F, 6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[134].setRotationPoint(-39F, -18F, -6F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 16, 4, 0F); // Box 4
		bodyModel[135].setRotationPoint(-40F, -18F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 4
		bodyModel[136].setRotationPoint(-39F, -18F, 2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 4
		bodyModel[137].setRotationPoint(-39F, -21F, 2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 4
		bodyModel[138].setRotationPoint(-38F, -20F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[139].setRotationPoint(-38F, -20F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[140].setRotationPoint(-39F, -21F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, -1F, 0F); // Box 4
		bodyModel[141].setRotationPoint(-38F, -20F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[142].setRotationPoint(-38F, -18F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[143].setRotationPoint(-38F, -18F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[144].setRotationPoint(-38F, -19F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[145].setRotationPoint(-38F, -19F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.665F, 0F, 0F); // Box 4
		bodyModel[146].setRotationPoint(-38F, -20F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.25F, -1F, -0.625F, -0.25F, -0.665F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[147].setRotationPoint(-38F, -20F, 10F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 4
		bodyModel[148].setRotationPoint(-39F, -3F, -2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		bodyModel[149].setRotationPoint(-39F, -3F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[150].setRotationPoint(-39F, -3F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 4
		bodyModel[151].setRotationPoint(-39F, -3F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 4
		bodyModel[152].setRotationPoint(-39F, -3F, 2F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 0
		bodyModel[153].setRotationPoint(-40F, -3F, -5F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 0, 12, 0F); // Box 0
		bodyModel[154].setRotationPoint(-38F, -20F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[155].setRotationPoint(-38F, -20F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[156].setRotationPoint(-38F, -20F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[157].setRotationPoint(-38F, -19.5F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[158].setRotationPoint(-38F, -19.5F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[159].setRotationPoint(-38F, -19F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(-38F, -19F, -11F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 4
		bodyModel[161].setRotationPoint(-39F, -16F, -4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[162].setRotationPoint(-39F, -12F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Face headlight top left
		bodyModel[163].setRotationPoint(-41.25F, -14.5F, -1.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Face headlight top right
		bodyModel[164].setRotationPoint(-41.25F, -14.5F, 0.25F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Face headlight bottom left
		bodyModel[165].setRotationPoint(-41.25F, -13F, -1.25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Face headlight bottom right
		bodyModel[166].setRotationPoint(-41.25F, -13F, 0.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front body
		bodyModel[167].setRotationPoint(-41F, -15.75F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front body
		bodyModel[168].setRotationPoint(-41F, -12.75F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front body
		bodyModel[169].setRotationPoint(-41F, -15.75F, 0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F); // Headlight front body
		bodyModel[170].setRotationPoint(-41F, -12.75F, 0.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front body
		bodyModel[171].setRotationPoint(-41F, -15.75F, -2.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Headlight front body
		bodyModel[172].setRotationPoint(-41F, -12.75F, -2.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Headlight front body
		bodyModel[173].setRotationPoint(-41F, -14.25F, -3F);

		bodyModel[174].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 1
		bodyModel[174].setRotationPoint(-40F, -10F, -5F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 7, 0, 0F); // Box 1
		bodyModel[175].setRotationPoint(-40F, -10F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[176].setRotationPoint(-37F, -20F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 79, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[177].setRotationPoint(-37F, -20F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 79, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[178].setRotationPoint(-37F, -20F, -10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 79, 1, 1, 0F,0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[179].setRotationPoint(-37F, -20F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[180].setRotationPoint(-15F, -15F, 11F);

		bodyModel[181].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[181].setRotationPoint(-11F, -15F, 11F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[182].setRotationPoint(-15F, -15F, -12F);

		bodyModel[183].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 1
		bodyModel[183].setRotationPoint(-11F, -15F, -12F);

		bodyModel[184].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 4
		bodyModel[184].setRotationPoint(-25F, -19F, 10F);

		bodyModel[185].addBox(0F, 0F, 0F, 10, 17, 1, 0F); // Box 4
		bodyModel[185].setRotationPoint(-25F, -19F, -11F);

		bodyModel[186].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 4
		bodyModel[186].setRotationPoint(-37F, -19F, 10F);

		bodyModel[187].addBox(0F, 0F, 0F, 8, 17, 1, 0F); // Box 4
		bodyModel[187].setRotationPoint(-37F, -19F, -11F);

		bodyModel[188].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		bodyModel[188].setRotationPoint(-29F, -19F, 10F);

		bodyModel[189].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		bodyModel[189].setRotationPoint(-29F, -19F, -11F);

		bodyModel[190].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		bodyModel[190].setRotationPoint(-15F, -19F, 10F);

		bodyModel[191].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 4
		bodyModel[191].setRotationPoint(-15F, -19F, -11F);

		bodyModel[192].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Engineer's front door
		bodyModel[192].setRotationPoint(-29F, -15F, 10F);

		bodyModel[193].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Engineer's body door
		bodyModel[193].setRotationPoint(-15F, -15F, 10F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Fireman's body door
		bodyModel[194].setRotationPoint(-15F, -15F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[195].setRotationPoint(-29F, -3F, 10F);

		bodyModel[196].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[196].setRotationPoint(-15F, -3F, 10F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[197].setRotationPoint(-15F, -3F, -11F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 12, 1, 0F); // Fireman's front door
		bodyModel[198].setRotationPoint(-29F, -15F, -11F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 4
		bodyModel[199].setRotationPoint(-29F, -3F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Box 4
		bodyModel[200].setRotationPoint(-37F, -19F, -10F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 12, 4, 0F); // Front door
		bodyModel[201].setRotationPoint(-37F, -15F, -2F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 4
		bodyModel[202].setRotationPoint(-37F, -19F, -2F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 4
		bodyModel[203].setRotationPoint(-37F, -3F, -2F);

		bodyModel[204].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[204].setRotationPoint(-3F, -19.5F, -11.02F);

		bodyModel[205].addBox(0F, 0F, 0F, 6, 3, 0, 0F); // Box 0
		bodyModel[205].setRotationPoint(-3F, -19.5F, 11.02F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // number boards right
		bodyModel[206].setRotationPoint(-38F, -21.75F, 8.25F);
		bodyModel[206].rotateAngleY = -0.68067841F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // number boards left
		bodyModel[207].setRotationPoint(-35.5F, -21.75F, -11.4F);
		bodyModel[207].rotateAngleY = 0.68067841F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[208].setRotationPoint(-37F, -21.25F, 8.5F);
		bodyModel[208].rotateAngleY = -0.68067841F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[209].setRotationPoint(-35.75F, -21.25F, -10.4F);
		bodyModel[209].rotateAngleY = 0.68067841F;
	}
	ModelEF1d theTrucksRear = new ModelEF1d();
	ModelEF1tp theTrucksFront = new ModelEF1tp();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 210; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1tp_black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1d_black.png"));

		}
		GL11.glPushMatrix();
		GL11.glTranslatef(1.5F, 0F, 0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theTrucksRear.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/ef1tp_black.png"));
		GL11.glPushMatrix();
		GL11.glTranslated(-1.3125F, -0F, 0);
		theTrucksFront.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelEF1[];
}