//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Explorer-II
// Model Creator:
// Created on:10.11.2020 - 00:22:34
// Last changed on: 10.11.2020 - 00:22:34

package com.jcirmodelsquad.tcjcir.models.trains;


import com.jcirmodelsquad.tcjcir.models.trucks.ModelPCHBogie;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;

public class ModelExplorer2 extends ModelBase
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelExplorer2()
	{
		explorer2Model = new ModelRendererTurbo[110];
		explorer2Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		explorer2Model[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box46
		explorer2Model[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box66
		explorer2Model[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box97
		explorer2Model[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box130
		explorer2Model[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box131
		explorer2Model[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box132
		explorer2Model[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box133
		explorer2Model[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box136
		explorer2Model[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box137
		explorer2Model[10] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box138
		explorer2Model[11] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box139
		explorer2Model[12] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box150
		explorer2Model[13] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box107
		explorer2Model[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 298
		explorer2Model[15] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 4
		explorer2Model[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 3
		explorer2Model[17] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 31
		explorer2Model[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 32
		explorer2Model[19] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 33
		explorer2Model[20] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		explorer2Model[21] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 35
		explorer2Model[22] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 36
		explorer2Model[23] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 38
		explorer2Model[24] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 39
		explorer2Model[25] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 40
		explorer2Model[26] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 41
		explorer2Model[27] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 42
		explorer2Model[28] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 43
		explorer2Model[29] = new ModelRendererTurbo(this, 344, 81, textureX, textureY); // Box 44
		explorer2Model[30] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 45
		explorer2Model[31] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 46
		explorer2Model[32] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 47
		explorer2Model[33] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 48
		explorer2Model[34] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 49
		explorer2Model[35] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 50
		explorer2Model[36] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 51
		explorer2Model[37] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 52
		explorer2Model[38] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 53
		explorer2Model[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 54
		explorer2Model[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 55
		explorer2Model[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 56
		explorer2Model[42] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 57
		explorer2Model[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 58
		explorer2Model[44] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 59
		explorer2Model[45] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 60
		explorer2Model[46] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 61
		explorer2Model[47] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 62
		explorer2Model[48] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 63
		explorer2Model[49] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 64
		explorer2Model[50] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 65
		explorer2Model[51] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 66
		explorer2Model[52] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 81
		explorer2Model[53] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 82
		explorer2Model[54] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 83
		explorer2Model[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 93
		explorer2Model[56] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 173
		explorer2Model[57] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 200
		explorer2Model[58] = new ModelRendererTurbo(this, 5, 196, textureX, textureY); // Box 201
		explorer2Model[59] = new ModelRendererTurbo(this, 5, 139, textureX, textureY); // Box 202
		explorer2Model[60] = new ModelRendererTurbo(this, 11, 167, textureX, textureY); // Box 203
		explorer2Model[61] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 204
		explorer2Model[62] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 205
		explorer2Model[63] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 206
		explorer2Model[64] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 207
		explorer2Model[65] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 208
		explorer2Model[66] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 209
		explorer2Model[67] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 210
		explorer2Model[68] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 211
		explorer2Model[69] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 212
		explorer2Model[70] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 238
		explorer2Model[71] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 239
		explorer2Model[72] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 240
		explorer2Model[73] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 241
		explorer2Model[74] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 242
		explorer2Model[75] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 243
		explorer2Model[76] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 244
		explorer2Model[77] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 245
		explorer2Model[78] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 246
		explorer2Model[79] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 247
		explorer2Model[80] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 248
		explorer2Model[81] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 249
		explorer2Model[82] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 250
		explorer2Model[83] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 251
		explorer2Model[84] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 252
		explorer2Model[85] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 253
		explorer2Model[86] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 254
		explorer2Model[87] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 255
		explorer2Model[88] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 256
		explorer2Model[89] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 257
		explorer2Model[90] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 258
		explorer2Model[91] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 259
		explorer2Model[92] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 260
		explorer2Model[93] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 261
		explorer2Model[94] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 262
		explorer2Model[95] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 263
		explorer2Model[96] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 264
		explorer2Model[97] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 265
		explorer2Model[98] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 266
		explorer2Model[99] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 267
		explorer2Model[100] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 268
		explorer2Model[101] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 269
		explorer2Model[102] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 270
		explorer2Model[103] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 271
		explorer2Model[104] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 272
		explorer2Model[105] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 273
		explorer2Model[106] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 274
		explorer2Model[107] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 275
		explorer2Model[108] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 276
		explorer2Model[109] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 277

		explorer2Model[0].addBox(0F, 0F, 0F, 100, 1, 22, 0F); // Import Box0
		explorer2Model[0].setRotationPoint(-62F, 0F, -11F);

		explorer2Model[1].addBox(0F, 0F, 0F, 66, 19, 1, 0F); // Import Box46
		explorer2Model[1].setRotationPoint(-45F, -19F, -11F);

		explorer2Model[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Import Box66
		explorer2Model[2].setRotationPoint(-66F, 0F, -1.5F);

		explorer2Model[3].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		explorer2Model[3].setRotationPoint(-62F, 1F, -11F);

		explorer2Model[4].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Import Box130
		explorer2Model[4].setRotationPoint(9F, -13F, -10F);

		explorer2Model[5].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Import Box131
		explorer2Model[5].setRotationPoint(10F, -7F, -4F);

		explorer2Model[6].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Import Box132
		explorer2Model[6].setRotationPoint(10F, -5F, -10F);

		explorer2Model[7].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Import Box133
		explorer2Model[7].setRotationPoint(12F, -4F, -9F);

		explorer2Model[8].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Import Box136
		explorer2Model[8].setRotationPoint(12F, -4F, 4F);

		explorer2Model[9].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Import Box137
		explorer2Model[9].setRotationPoint(10F, -7F, 9F);

		explorer2Model[10].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Import Box138
		explorer2Model[10].setRotationPoint(10F, -5F, 3F);

		explorer2Model[11].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Import Box139
		explorer2Model[11].setRotationPoint(9F, -13F, 3F);

		explorer2Model[12].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Import Box150
		explorer2Model[12].setRotationPoint(10F, -7F, 3F);

		explorer2Model[13].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Import Box107
		explorer2Model[13].setRotationPoint(10F, -7F, -10F);

		explorer2Model[14].addShapeBox(0F, 0F, 0F, 98, 2, 1, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		explorer2Model[14].setRotationPoint(37F, -27F, -6F);
		explorer2Model[14].rotateAngleY = -3.14159265F;

		explorer2Model[15].addShapeBox(0F, 0F, 0F, 98, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		explorer2Model[15].setRotationPoint(37F, -22F, -10F);
		explorer2Model[15].rotateAngleY = -3.14159265F;

		explorer2Model[16].addShapeBox(0F, 0F, 0F, 98, 3, 1, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		explorer2Model[16].setRotationPoint(37F, -25F, -9F);
		explorer2Model[16].rotateAngleY = -3.14159265F;

		explorer2Model[17].addBox(0F, 0F, 0F, 98, 2, 8, 0F); // Box 31
		explorer2Model[17].setRotationPoint(-61F, -27F, -4F);

		explorer2Model[18].addShapeBox(0F, 0F, 0F, 98, 2, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		explorer2Model[18].setRotationPoint(37F, -27F, 7F);
		explorer2Model[18].rotateAngleY = -3.14159265F;

		explorer2Model[19].addShapeBox(0F, 0F, 0F, 98, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		explorer2Model[19].setRotationPoint(37F, -22F, 11F);
		explorer2Model[19].rotateAngleY = -3.14159265F;

		explorer2Model[20].addShapeBox(0F, 0F, 0F, 98, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		explorer2Model[20].setRotationPoint(37F, -25F, 10F);
		explorer2Model[20].rotateAngleY = -3.14159265F;

		explorer2Model[21].addBox(0F, 0F, 0F, 9, 19, 1, 0F); // Box 35
		explorer2Model[21].setRotationPoint(-54F, -19F, -11F);

		explorer2Model[22].addBox(0F, 0F, 0F, 1, 19, 14, 0F); // Box 36
		explorer2Model[22].setRotationPoint(-60F, -19F, -7F);

		explorer2Model[23].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 38
		explorer2Model[23].setRotationPoint(-61F, -19F, -11F);

		explorer2Model[24].addBox(0F, 0F, 0F, 9, 19, 1, 0F); // Box 39
		explorer2Model[24].setRotationPoint(21F, -19F, -11F);

		explorer2Model[25].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 40
		explorer2Model[25].setRotationPoint(30F, -19F, -11F);

		explorer2Model[26].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 41
		explorer2Model[26].setRotationPoint(30F, -19F, 10F);

		explorer2Model[27].addBox(0F, 0F, 0F, 9, 19, 1, 0F); // Box 42
		explorer2Model[27].setRotationPoint(21F, -19F, 10F);

		explorer2Model[28].addBox(0F, 0F, 0F, 66, 19, 1, 0F); // Box 43
		explorer2Model[28].setRotationPoint(-45F, -19F, 10F);

		explorer2Model[29].addBox(0F, 0F, 0F, 9, 19, 1, 0F); // Box 44
		explorer2Model[29].setRotationPoint(-54F, -19F, 10F);

		explorer2Model[30].addBox(0F, 0F, 0F, 7, 19, 1, 0F); // Box 45
		explorer2Model[30].setRotationPoint(-61F, -19F, 10F);

		explorer2Model[31].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 46
		explorer2Model[31].setRotationPoint(-60F, -22F, -10F);

		explorer2Model[32].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		explorer2Model[32].setRotationPoint(-60F, -23F, -9F);

		explorer2Model[33].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 48
		explorer2Model[33].setRotationPoint(-60F, -25F, -7F);

		explorer2Model[34].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 49
		explorer2Model[34].setRotationPoint(-62F, -18F, 7F);

		explorer2Model[35].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 50
		explorer2Model[35].setRotationPoint(-62F, -19F, -7F);

		explorer2Model[36].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 51
		explorer2Model[36].setRotationPoint(-62F, -18F, -8F);

		explorer2Model[37].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 52
		explorer2Model[37].setRotationPoint(-60F, -19F, -10F);

		explorer2Model[38].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 53
		explorer2Model[38].setRotationPoint(-60F, -19F, 7F);

		explorer2Model[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		explorer2Model[39].setRotationPoint(-62F, -19F, -8F);

		explorer2Model[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		explorer2Model[40].setRotationPoint(-62F, -19F, 7F);

		explorer2Model[41].addBox(0F, 0F, 0F, 1, 19, 14, 0F); // Box 56
		explorer2Model[41].setRotationPoint(34F, -19F, -7F);

		explorer2Model[42].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 57
		explorer2Model[42].setRotationPoint(35F, -18F, -8F);

		explorer2Model[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		explorer2Model[43].setRotationPoint(35F, -19F, -8F);

		explorer2Model[44].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 59
		explorer2Model[44].setRotationPoint(35F, -19F, -7F);

		explorer2Model[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		explorer2Model[45].setRotationPoint(35F, -19F, 7F);

		explorer2Model[46].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 61
		explorer2Model[46].setRotationPoint(35F, -18F, 7F);

		explorer2Model[47].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 62
		explorer2Model[47].setRotationPoint(34F, -19F, 7F);

		explorer2Model[48].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 63
		explorer2Model[48].setRotationPoint(34F, -22F, -10F);

		explorer2Model[49].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 64
		explorer2Model[49].setRotationPoint(34F, -25F, -7F);

		explorer2Model[50].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		explorer2Model[50].setRotationPoint(34F, -23F, -9F);

		explorer2Model[51].addBox(0F, 0F, 0F, 1, 19, 3, 0F); // Box 66
		explorer2Model[51].setRotationPoint(34F, -19F, -10F);

		explorer2Model[52].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 81
		explorer2Model[52].setRotationPoint(-62F, 1F, 10F);

		explorer2Model[53].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 82
		explorer2Model[53].setRotationPoint(19F, 1F, 10F);

		explorer2Model[54].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		explorer2Model[54].setRotationPoint(19F, 1F, -11F);

		explorer2Model[55].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 93
		explorer2Model[55].setRotationPoint(-33F, 0.5F, -2F);

		explorer2Model[56].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		explorer2Model[56].setRotationPoint(22F, 0.5F, -1.5F);

		explorer2Model[57].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		explorer2Model[57].setRotationPoint(-51F, 0.5F, -1.5F);

		explorer2Model[58].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 201
		explorer2Model[58].setRotationPoint(6F, 1F, -5F);

		explorer2Model[59].addBox(0F, 0F, 0F, 35, 4, 10, 0F); // Box 202
		explorer2Model[59].setRotationPoint(-29F, 1F, -5F);

		explorer2Model[60].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 203
		explorer2Model[60].setRotationPoint(-32F, 1F, -5F);

		explorer2Model[61].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 204
		explorer2Model[61].setRotationPoint(38F, 0F, -1.5F);

		explorer2Model[62].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 205
		explorer2Model[62].setRotationPoint(24F, 1F, -10F);

		explorer2Model[63].addBox(0F, 0F, 0F, 8, 2, 20, 0F); // Box 206
		explorer2Model[63].setRotationPoint(-56F, 1F, -10F);

		explorer2Model[64].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 207
		explorer2Model[64].setRotationPoint(21F, -28F, -3F);

		explorer2Model[65].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 208
		explorer2Model[65].setRotationPoint(-59F, -28F, -3F);

		explorer2Model[66].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 209
		explorer2Model[66].setRotationPoint(24F, -27.7F, 4.8F);
		explorer2Model[66].rotateAngleX = -0.59341195F;

		explorer2Model[67].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 210
		explorer2Model[67].setRotationPoint(-57F, -27.7F, 4.8F);
		explorer2Model[67].rotateAngleX = -0.59341195F;

		explorer2Model[68].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 211
		explorer2Model[68].setRotationPoint(24F, -26.1F, -7.2F);
		explorer2Model[68].rotateAngleX = 0.59341195F;

		explorer2Model[69].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 212
		explorer2Model[69].setRotationPoint(-57F, -26.2F, -7.2F);
		explorer2Model[69].rotateAngleX = 0.59341195F;

		explorer2Model[70].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 238
		explorer2Model[70].setRotationPoint(-2F, -5F, -10F);

		explorer2Model[71].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 239
		explorer2Model[71].setRotationPoint(0F, -4F, -9F);

		explorer2Model[72].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 240
		explorer2Model[72].setRotationPoint(-2F, -7F, -4F);

		explorer2Model[73].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 241
		explorer2Model[73].setRotationPoint(-3F, -13F, -10F);

		explorer2Model[74].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 242
		explorer2Model[74].setRotationPoint(-2F, -7F, -10F);

		explorer2Model[75].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 243
		explorer2Model[75].setRotationPoint(-2F, -7F, 9F);

		explorer2Model[76].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 244
		explorer2Model[76].setRotationPoint(-2F, -7F, 3F);

		explorer2Model[77].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 245
		explorer2Model[77].setRotationPoint(-2F, -5F, 3F);

		explorer2Model[78].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 246
		explorer2Model[78].setRotationPoint(-3F, -13F, 3F);

		explorer2Model[79].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 247
		explorer2Model[79].setRotationPoint(0F, -4F, 4F);

		explorer2Model[80].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 248
		explorer2Model[80].setRotationPoint(-14F, -5F, -10F);

		explorer2Model[81].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 249
		explorer2Model[81].setRotationPoint(-12F, -4F, -9F);

		explorer2Model[82].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 250
		explorer2Model[82].setRotationPoint(-14F, -7F, -4F);

		explorer2Model[83].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 251
		explorer2Model[83].setRotationPoint(-15F, -13F, -10F);

		explorer2Model[84].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 252
		explorer2Model[84].setRotationPoint(-14F, -7F, -10F);

		explorer2Model[85].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 253
		explorer2Model[85].setRotationPoint(-14F, -7F, 9F);

		explorer2Model[86].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 254
		explorer2Model[86].setRotationPoint(-14F, -7F, 3F);

		explorer2Model[87].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 255
		explorer2Model[87].setRotationPoint(-14F, -5F, 3F);

		explorer2Model[88].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 256
		explorer2Model[88].setRotationPoint(-15F, -13F, 3F);

		explorer2Model[89].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 257
		explorer2Model[89].setRotationPoint(-12F, -4F, 4F);

		explorer2Model[90].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 258
		explorer2Model[90].setRotationPoint(-26F, -5F, -10F);

		explorer2Model[91].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 259
		explorer2Model[91].setRotationPoint(-24F, -4F, -9F);

		explorer2Model[92].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 260
		explorer2Model[92].setRotationPoint(-26F, -7F, -4F);

		explorer2Model[93].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 261
		explorer2Model[93].setRotationPoint(-27F, -13F, -10F);

		explorer2Model[94].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 262
		explorer2Model[94].setRotationPoint(-26F, -7F, -10F);

		explorer2Model[95].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 263
		explorer2Model[95].setRotationPoint(-26F, -7F, 9F);

		explorer2Model[96].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 264
		explorer2Model[96].setRotationPoint(-26F, -7F, 3F);

		explorer2Model[97].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 265
		explorer2Model[97].setRotationPoint(-26F, -5F, 3F);

		explorer2Model[98].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 266
		explorer2Model[98].setRotationPoint(-27F, -13F, 3F);

		explorer2Model[99].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 267
		explorer2Model[99].setRotationPoint(-24F, -4F, 4F);

		explorer2Model[100].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 268
		explorer2Model[100].setRotationPoint(-38F, -5F, -10F);

		explorer2Model[101].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 269
		explorer2Model[101].setRotationPoint(-36F, -4F, -9F);

		explorer2Model[102].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 270
		explorer2Model[102].setRotationPoint(-38F, -7F, -4F);

		explorer2Model[103].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 271
		explorer2Model[103].setRotationPoint(-39F, -13F, -10F);

		explorer2Model[104].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 272
		explorer2Model[104].setRotationPoint(-38F, -7F, -10F);

		explorer2Model[105].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 273
		explorer2Model[105].setRotationPoint(-38F, -7F, 9F);

		explorer2Model[106].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 274
		explorer2Model[106].setRotationPoint(-38F, -7F, 3F);

		explorer2Model[107].addBox(0F, 0F, 0F, 7, 1, 7, 0F); // Box 275
		explorer2Model[107].setRotationPoint(-38F, -5F, 3F);

		explorer2Model[108].addBox(0F, 0F, 0F, 1, 9, 7, 0F); // Box 276
		explorer2Model[108].setRotationPoint(-39F, -13F, 3F);

		explorer2Model[109].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 277
		explorer2Model[109].setRotationPoint(-36F, -4F, 4F);


	}
	ModelPCHBogie theBogie = new ModelPCHBogie();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glPushMatrix();
		AipkitExplorer2 theCoach = (AipkitExplorer2)entity;
		if (theCoach.tiltingHandler != null) {
			GL11.glRotatef(theCoach.tiltingHandler.tiltingProgress, 4F, 0, 0);
		}
		for(int i = 0; i < 110; i++)
		{
			explorer2Model[i].render(f5);
		}
		GL11.glPopMatrix();


		Tessellator.bindTexture(new ResourceLocation("tc:textures/trains/pch120_bogie.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef(1.5F ,0.1F,0F);
		//GL11.glScalef(0.9f,0.9f,0.8f);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glTranslated(-3,0.1F,0);
		theBogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public float[] getTrans() {
		return new float[]{0.8F, -0.02F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ModelRendererTurbo explorer2Model[];
}