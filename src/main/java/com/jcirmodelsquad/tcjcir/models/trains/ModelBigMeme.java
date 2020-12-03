//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.12.2020 - 18:23:24
// Last changed on: 02.12.2020 - 18:23:24

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBigMeme extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelBigMeme() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
		bodyModel[2] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 59
		bodyModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 93
		bodyModel[5] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 94
		bodyModel[6] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 95
		bodyModel[7] = new ModelRendererTurbo(this, 60, 68, textureX, textureY); // Box 108
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[9] = new ModelRendererTurbo(this, 19, 55, textureX, textureY); // Box 110
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 111
		bodyModel[11] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 112
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 113
		bodyModel[13] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 114
		bodyModel[14] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 115
		bodyModel[15] = new ModelRendererTurbo(this, 65, 40, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 13, 92, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 74
		bodyModel[18] = new ModelRendererTurbo(this, 162, 9, textureX, textureY); // Box 75
		bodyModel[19] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 76
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 60, 68, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 185, 13, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 127, 6, textureX, textureY); // Box 157
		bodyModel[30] = new ModelRendererTurbo(this, 127, 2, textureX, textureY); // Box 158
		bodyModel[31] = new ModelRendererTurbo(this, 220, 13, textureX, textureY); // Box 159
		bodyModel[32] = new ModelRendererTurbo(this, 147, 31, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 65
		bodyModel[34] = new ModelRendererTurbo(this, 137, 8, textureX, textureY); // Box 67
		bodyModel[35] = new ModelRendererTurbo(this, 100, 76, textureX, textureY); // Box 20
		bodyModel[36] = new ModelRendererTurbo(this, 46, 66, textureX, textureY); // Box 21
		bodyModel[37] = new ModelRendererTurbo(this, 223, 38, textureX, textureY); // Box 23
		bodyModel[38] = new ModelRendererTurbo(this, 3, 60, textureX, textureY); // Box 171
		bodyModel[39] = new ModelRendererTurbo(this, 195, 38, textureX, textureY); // Box 172
		bodyModel[40] = new ModelRendererTurbo(this, 180, 36, textureX, textureY); // Box 178
		bodyModel[41] = new ModelRendererTurbo(this, 21, 63, textureX, textureY); // Box 180
		bodyModel[42] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 181
		bodyModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 182
		bodyModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 183
		bodyModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 184
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 185
		bodyModel[47] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 186
		bodyModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 187
		bodyModel[49] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 188
		bodyModel[50] = new ModelRendererTurbo(this, 17, 80, textureX, textureY); // Box 189
		bodyModel[51] = new ModelRendererTurbo(this, 10, 75, textureX, textureY); // Box 190
		bodyModel[52] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 192
		bodyModel[53] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 194
		bodyModel[54] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 195
		bodyModel[55] = new ModelRendererTurbo(this, 224, 49, textureX, textureY); // Box 196
		bodyModel[56] = new ModelRendererTurbo(this, 209, 47, textureX, textureY); // Box 197
		bodyModel[57] = new ModelRendererTurbo(this, 126, 47, textureX, textureY); // Box 198
		bodyModel[58] = new ModelRendererTurbo(this, 145, 47, textureX, textureY); // Box 199
		bodyModel[59] = new ModelRendererTurbo(this, 164, 49, textureX, textureY); // Box 200
		bodyModel[60] = new ModelRendererTurbo(this, 179, 49, textureX, textureY); // Box 201
		bodyModel[61] = new ModelRendererTurbo(this, 194, 49, textureX, textureY); // Box 202
		bodyModel[62] = new ModelRendererTurbo(this, 108, 76, textureX, textureY); // Box 203
		bodyModel[63] = new ModelRendererTurbo(this, 236, 40, textureX, textureY); // Box 204
		bodyModel[64] = new ModelRendererTurbo(this, 102, 72, textureX, textureY); // Box 205
		bodyModel[65] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 206
		bodyModel[66] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 207
		bodyModel[67] = new ModelRendererTurbo(this, 107, 47, textureX, textureY); // Box 208
		bodyModel[68] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 209
		bodyModel[69] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 210

		bodyModel[0].addBox(0F, 0F, 0F, 43, 1, 18, 0F); // Box 12
		bodyModel[0].setRotationPoint(-23F, 1F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 57
		bodyModel[1].setRotationPoint(10F, 6F, -5F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 58
		bodyModel[2].setRotationPoint(7F, 3F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 59
		bodyModel[3].setRotationPoint(7F, 3F, 5F);

		bodyModel[4].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 93
		bodyModel[4].setRotationPoint(-2F, 3F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 94
		bodyModel[5].setRotationPoint(-2F, 3F, 5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 95
		bodyModel[6].setRotationPoint(1F, 6F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 108
		bodyModel[7].setRotationPoint(18F, 3F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 109
		bodyModel[8].setRotationPoint(18F, 7F, 6F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[9].setRotationPoint(19F, 5F, 4F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 111
		bodyModel[10].setRotationPoint(19F, 5F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 112
		bodyModel[11].setRotationPoint(18F, 7F, -6F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 113
		bodyModel[12].setRotationPoint(19F, 8F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Box 114
		bodyModel[13].setRotationPoint(-5F, 2F, -5F);

		bodyModel[14].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Box 115
		bodyModel[14].setRotationPoint(-5F, 2F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 71
		bodyModel[15].setRotationPoint(20F, 5F, -8F);

		bodyModel[16].addBox(0F, 0F, 0F, 48, 2, 3, 0F); // Box 0
		bodyModel[16].setRotationPoint(-30F, 2F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 74
		bodyModel[17].setRotationPoint(-29F, 2.5F, -1.5F);
		bodyModel[17].rotateAngleY = -0.43633231F;

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 75
		bodyModel[18].setRotationPoint(-16F, 1.5F, -8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Box 76
		bodyModel[19].setRotationPoint(-29F, 2.5F, 1.5F);
		bodyModel[19].rotateAngleY = 0.43633231F;

		bodyModel[20].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 77
		bodyModel[20].setRotationPoint(-8F, 7F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 78
		bodyModel[21].setRotationPoint(-8F, 7F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 79
		bodyModel[22].setRotationPoint(-7F, 5F, 4F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 80
		bodyModel[23].setRotationPoint(-7F, 8F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 81
		bodyModel[24].setRotationPoint(-7F, 5F, -5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 82
		bodyModel[25].setRotationPoint(-8F, 3F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 43, 6, 1, 0F); // Box 83
		bodyModel[26].setRotationPoint(-23F, -5F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 43, 6, 1, 0F); // Box 84
		bodyModel[27].setRotationPoint(-23F, -5F, 8F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 85
		bodyModel[28].setRotationPoint(-23F, -5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[29].setRotationPoint(16F, -3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 158
		bodyModel[30].setRotationPoint(16F, -3F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 159
		bodyModel[31].setRotationPoint(19F, -5F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 7, 8, 0F); // Box 64
		bodyModel[32].setRotationPoint(-22F, -4F, -7F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 65
		bodyModel[33].setRotationPoint(-20F, -5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[34].setRotationPoint(-20F, -6F, -6F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 20
		bodyModel[35].setRotationPoint(14F, -10F, -7F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 21
		bodyModel[36].setRotationPoint(14F, -14F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 23
		bodyModel[37].setRotationPoint(14F, -14F, -7F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 171
		bodyModel[38].setRotationPoint(11F, -10F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[39].setRotationPoint(11F, -14F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,-3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[40].setRotationPoint(11F, -10F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 3, 3, 0F); // Box 180
		bodyModel[41].setRotationPoint(1F, -8.5F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[42].setRotationPoint(7F, -10F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 182
		bodyModel[43].setRotationPoint(7F, -6F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[44].setRotationPoint(7F, -8F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 184
		bodyModel[45].setRotationPoint(7F, -8F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[46].setRotationPoint(7F, -10F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 186
		bodyModel[47].setRotationPoint(7F, -10F, 1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 187
		bodyModel[48].setRotationPoint(7F, -6F, 1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 188
		bodyModel[49].setRotationPoint(7F, -6F, -3F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 6, 2, 0F); // Box 189
		bodyModel[50].setRotationPoint(-5F, -10F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 190
		bodyModel[51].setRotationPoint(-5F, -8F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[52].setRotationPoint(-5F, -8F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[53].setRotationPoint(14F, -14F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 195
		bodyModel[54].setRotationPoint(14F, -4F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[55].setRotationPoint(14F, -4F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F); // Box 197
		bodyModel[56].setRotationPoint(11F, -10F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 198
		bodyModel[57].setRotationPoint(11F, -4F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[58].setRotationPoint(11F, -14F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F); // Box 200
		bodyModel[59].setRotationPoint(11F, -14F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F); // Box 201
		bodyModel[60].setRotationPoint(11F, -4F, 3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,-3F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 202
		bodyModel[61].setRotationPoint(11F, -4F, -7F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 203
		bodyModel[62].setRotationPoint(14F, -10F, 6F);

		bodyModel[63].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 204
		bodyModel[63].setRotationPoint(14F, -1F, -3F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 205
		bodyModel[64].setRotationPoint(-5F, -4F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 206
		bodyModel[65].setRotationPoint(-5F, -3F, -7F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 207
		bodyModel[66].setRotationPoint(-5F, -3F, 5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 208
		bodyModel[67].setRotationPoint(2F, -4F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 209
		bodyModel[68].setRotationPoint(2F, -3F, -7F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 210
		bodyModel[69].setRotationPoint(2F, -3F, 5F);
	}
}