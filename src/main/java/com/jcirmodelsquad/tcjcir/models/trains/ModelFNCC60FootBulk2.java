//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FNCC60FootBulk
// Model Creator:Bida
// Created on:07.04.2022 - 18:03:56
// Last changed on: 07.04.2022 - 18:03:56

package com.jcirmodelsquad.tcjcir.models.trains;

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Coord2D;
import tmt.ModelRendererTurbo;
import tmt.Shape2D;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFNCC60FootBulk2 extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public ModelFNCC60FootBulk2()
	{
		fncc60footbulk2Model = new ModelRendererTurbo[120];
		fncc60footbulk2Model[0] = new ModelRendererTurbo(this, 161, 22, textureX, textureY); // Box 0
		fncc60footbulk2Model[1] = new ModelRendererTurbo(this, 14, 116, textureX, textureY); // Box 0
		fncc60footbulk2Model[2] = new ModelRendererTurbo(this, 161, 22, textureX, textureY); // Box 0
		fncc60footbulk2Model[3] = new ModelRendererTurbo(this, 207, 87, textureX, textureY, "cull"); // Box 38 crossover cull
		fncc60footbulk2Model[4] = new ModelRendererTurbo(this, 213, 95, textureX, textureY); // Box 39
		fncc60footbulk2Model[5] = new ModelRendererTurbo(this, 215, 219, textureX, textureY); // Box 80
		fncc60footbulk2Model[6] = new ModelRendererTurbo(this, 215, 216, textureX, textureY); // Box 81
		fncc60footbulk2Model[7] = new ModelRendererTurbo(this, 215, 105, textureX, textureY); // Box 72
		fncc60footbulk2Model[8] = new ModelRendererTurbo(this, 210, 113, textureX, textureY); // Box 87
		fncc60footbulk2Model[9] = new ModelRendererTurbo(this, 204, 113, textureX, textureY); // Box 87
		fncc60footbulk2Model[10] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 132
		fncc60footbulk2Model[11] = new ModelRendererTurbo(this, 175, 77, textureX, textureY); // Box 125
		fncc60footbulk2Model[12] = new ModelRendererTurbo(this, 207, 87, textureX, textureY, "cull"); // Box 56 crossover cull
		fncc60footbulk2Model[13] = new ModelRendererTurbo(this, 213, 95, textureX, textureY); // Box 57
		fncc60footbulk2Model[14] = new ModelRendererTurbo(this, 29, 75, textureX, textureY); // Box 3
		fncc60footbulk2Model[15] = new ModelRendererTurbo(this, 56, 75, textureX, textureY); // Box 105
		fncc60footbulk2Model[16] = new ModelRendererTurbo(this, 2, 68, textureX, textureY); // Box 14
		fncc60footbulk2Model[17] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 40
		fncc60footbulk2Model[18] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 41
		fncc60footbulk2Model[19] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 42
		fncc60footbulk2Model[20] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 133
		fncc60footbulk2Model[21] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Box 82
		fncc60footbulk2Model[22] = new ModelRendererTurbo(this, 22, 151, textureX, textureY); // Box 89
		fncc60footbulk2Model[23] = new ModelRendererTurbo(this, 23, 147, textureX, textureY); // Box 93
		fncc60footbulk2Model[24] = new ModelRendererTurbo(this, 12, 131, textureX, textureY); // Box 99
		fncc60footbulk2Model[25] = new ModelRendererTurbo(this, 17, 131, textureX, textureY); // Box 100
		fncc60footbulk2Model[26] = new ModelRendererTurbo(this, 33, 165, textureX, textureY); // Box 109
		fncc60footbulk2Model[27] = new ModelRendererTurbo(this, 34, 161, textureX, textureY); // Box 110
		fncc60footbulk2Model[28] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 174
		fncc60footbulk2Model[29] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 175
		fncc60footbulk2Model[30] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 176
		fncc60footbulk2Model[31] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 177
		fncc60footbulk2Model[32] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 178
		fncc60footbulk2Model[33] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 179
		fncc60footbulk2Model[34] = new ModelRendererTurbo(this, 56, 221, textureX, textureY); // Box 5
		fncc60footbulk2Model[35] = new ModelRendererTurbo(this, 29, 221, textureX, textureY); // Box 104
		fncc60footbulk2Model[36] = new ModelRendererTurbo(this, 2, 214, textureX, textureY); // Box 15
		fncc60footbulk2Model[37] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 58
		fncc60footbulk2Model[38] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 59
		fncc60footbulk2Model[39] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 60
		fncc60footbulk2Model[40] = new ModelRendererTurbo(this, 17, 147, textureX, textureY); // Box 85
		fncc60footbulk2Model[41] = new ModelRendererTurbo(this, 12, 147, textureX, textureY); // Box 86
		fncc60footbulk2Model[42] = new ModelRendererTurbo(this, 33, 151, textureX, textureY); // Box 92
		fncc60footbulk2Model[43] = new ModelRendererTurbo(this, 34, 147, textureX, textureY); // Box 94
		fncc60footbulk2Model[44] = new ModelRendererTurbo(this, 7, 131, textureX, textureY); // Box 107
		fncc60footbulk2Model[45] = new ModelRendererTurbo(this, 2, 131, textureX, textureY); // Box 108
		fncc60footbulk2Model[46] = new ModelRendererTurbo(this, 22, 165, textureX, textureY); // Box 111
		fncc60footbulk2Model[47] = new ModelRendererTurbo(this, 23, 161, textureX, textureY); // Box 112
		fncc60footbulk2Model[48] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 155
		fncc60footbulk2Model[49] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 156
		fncc60footbulk2Model[50] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 157
		fncc60footbulk2Model[51] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 158
		fncc60footbulk2Model[52] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 159
		fncc60footbulk2Model[53] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 160
		fncc60footbulk2Model[54] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 0
		fncc60footbulk2Model[55] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 42
		fncc60footbulk2Model[56] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 0
		fncc60footbulk2Model[57] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 116
		fncc60footbulk2Model[58] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 117
		fncc60footbulk2Model[59] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 215
		fncc60footbulk2Model[60] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 216
		fncc60footbulk2Model[61] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 217
		fncc60footbulk2Model[62] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 93
		fncc60footbulk2Model[63] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 94
		fncc60footbulk2Model[64] = new ModelRendererTurbo(this, 2, 124, textureX, textureY); // Box 1
		fncc60footbulk2Model[65] = new ModelRendererTurbo(this, 31, 105, textureX, textureY); // Box 96
		fncc60footbulk2Model[66] = new ModelRendererTurbo(this, 31, 101, textureX, textureY); // Box 97
		fncc60footbulk2Model[67] = new ModelRendererTurbo(this, 53, 146, textureX, textureY); // Box 50
		fncc60footbulk2Model[68] = new ModelRendererTurbo(this, 53, 112, textureX, textureY); // Box 51
		fncc60footbulk2Model[69] = new ModelRendererTurbo(this, 53, 150, textureX, textureY); // Box 0
		fncc60footbulk2Model[70] = new ModelRendererTurbo(this, 53, 109, textureX, textureY); // Box 101
		fncc60footbulk2Model[71] = new ModelRendererTurbo(this, 145, 109, textureX, textureY); // Box 102
		fncc60footbulk2Model[72] = new ModelRendererTurbo(this, 145, 150, textureX, textureY); // Box 103
		fncc60footbulk2Model[73] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 286
		fncc60footbulk2Model[74] = new ModelRendererTurbo(this, 206, 65, textureX, textureY); // Box 287
		fncc60footbulk2Model[75] = new ModelRendererTurbo(this, 206, 60, textureX, textureY); // Box 118
		fncc60footbulk2Model[76] = new ModelRendererTurbo(this, 217, 60, textureX, textureY); // Box 119
		fncc60footbulk2Model[77] = new ModelRendererTurbo(this, 222, 55, textureX, textureY); // Box 196
		fncc60footbulk2Model[78] = new ModelRendererTurbo(this, 247, 61, textureX, textureY); // Box 199
		fncc60footbulk2Model[79] = new ModelRendererTurbo(this, 227, 57, textureX, textureY); // Box 122
		fncc60footbulk2Model[80] = new ModelRendererTurbo(this, 247, 61, textureX, textureY); // Box 123
		fncc60footbulk2Model[81] = new ModelRendererTurbo(this, 195, 31, textureX, textureY); // Box 124
		fncc60footbulk2Model[82] = new ModelRendererTurbo(this, 236, 61, textureX, textureY); // Box 126
		fncc60footbulk2Model[83] = new ModelRendererTurbo(this, 224, 73, textureX, textureY); // Box 202
		fncc60footbulk2Model[84] = new ModelRendererTurbo(this, 230, 75, textureX, textureY); // Box 128
		fncc60footbulk2Model[85] = new ModelRendererTurbo(this, 228, 65, textureX, textureY); // Box 129
		fncc60footbulk2Model[86] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 130
		fncc60footbulk2Model[87] = new ModelRendererTurbo(this, 228, 65, textureX, textureY); // Box 302
		fncc60footbulk2Model[88] = new ModelRendererTurbo(this, 49, 68, textureX, textureY); // Box 119
		fncc60footbulk2Model[89] = new ModelRendererTurbo(this, 49, 214, textureX, textureY); // Box 120
		fncc60footbulk2Model[90] = new ModelRendererTurbo(this, 49, 155, textureX, textureY); // Shape 124
		fncc60footbulk2Model[91] = new ModelRendererTurbo(this, 22, 179, textureX, textureY); // Box 126
		fncc60footbulk2Model[92] = new ModelRendererTurbo(this, 49, 170, textureX, textureY); // Shape 127
		fncc60footbulk2Model[93] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Shape 128
		fncc60footbulk2Model[94] = new ModelRendererTurbo(this, 49, 39, textureX, textureY); // Shape 129
		fncc60footbulk2Model[95] = new ModelRendererTurbo(this, 49, 24, textureX, textureY); // Shape 130
		fncc60footbulk2Model[96] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Shape 131
		fncc60footbulk2Model[97] = new ModelRendererTurbo(this, 22, 33, textureX, textureY); // Box 132
		fncc60footbulk2Model[98] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 133
		fncc60footbulk2Model[99] = new ModelRendererTurbo(this, 2, 178, textureX, textureY); // Box 134
		fncc60footbulk2Model[100] = new ModelRendererTurbo(this, 108, 74, textureX, textureY); // Box 144
		fncc60footbulk2Model[101] = new ModelRendererTurbo(this, 108, 74, textureX, textureY); // Box 145
		fncc60footbulk2Model[102] = new ModelRendererTurbo(this, 108, 74, textureX, textureY); // Box 148
		fncc60footbulk2Model[103] = new ModelRendererTurbo(this, 108, 74, textureX, textureY); // Box 152
		fncc60footbulk2Model[104] = new ModelRendererTurbo(this, 102, 74, textureX, textureY); // Box 153
		fncc60footbulk2Model[105] = new ModelRendererTurbo(this, 102, 74, textureX, textureY); // Box 154
		fncc60footbulk2Model[106] = new ModelRendererTurbo(this, 102, 74, textureX, textureY); // Box 155
		fncc60footbulk2Model[107] = new ModelRendererTurbo(this, 102, 74, textureX, textureY); // Box 156
		fncc60footbulk2Model[108] = new ModelRendererTurbo(this, 100, 70, textureX, textureY); // Box 157
		fncc60footbulk2Model[109] = new ModelRendererTurbo(this, 100, 70, textureX, textureY); // Box 158
		fncc60footbulk2Model[110] = new ModelRendererTurbo(this, 100, 70, textureX, textureY); // Box 159
		fncc60footbulk2Model[111] = new ModelRendererTurbo(this, 100, 70, textureX, textureY); // Box 160
		fncc60footbulk2Model[112] = new ModelRendererTurbo(this, 108, 70, textureX, textureY); // Box 161
		fncc60footbulk2Model[113] = new ModelRendererTurbo(this, 108, 70, textureX, textureY); // Box 162
		fncc60footbulk2Model[114] = new ModelRendererTurbo(this, 108, 70, textureX, textureY); // Box 163
		fncc60footbulk2Model[115] = new ModelRendererTurbo(this, 108, 70, textureX, textureY); // Box 164
		fncc60footbulk2Model[116] = new ModelRendererTurbo(this, 230, 132, textureX, textureY); // Box 462 kartrak my beloved
		fncc60footbulk2Model[117] = new ModelRendererTurbo(this, 230, 132, textureX, textureY); // Box 481 kartrak my beloved
		fncc60footbulk2Model[118] = new ModelRendererTurbo(this, 222, 125, textureX, textureY); // Box 700
		fncc60footbulk2Model[119] = new ModelRendererTurbo(this, 222, 125, textureX, textureY); // Box 701

		fncc60footbulk2Model[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		fncc60footbulk2Model[0].setRotationPoint(44F, 3F, -1.5F);

		fncc60footbulk2Model[1].addBox(0F, 0F, 0F, 88, 2, 5, 0F); // Box 0
		fncc60footbulk2Model[1].setRotationPoint(-44F, 3F, -2.5F);

		fncc60footbulk2Model[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		fncc60footbulk2Model[2].setRotationPoint(-48F, 3F, -1.5F);

		fncc60footbulk2Model[3].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 38 crossover cull
		fncc60footbulk2Model[3].setRotationPoint(-45F, 1F, -10.5F);

		fncc60footbulk2Model[4].addBox(0F, 0F, 0F, 0, 8, 21, 0F); // Box 39
		fncc60footbulk2Model[4].setRotationPoint(-43F, -7F, -10.5F);

		fncc60footbulk2Model[5].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		fncc60footbulk2Model[5].setRotationPoint(-46.5F, 4.5F, 1.5F);
		fncc60footbulk2Model[5].rotateAngleY = 1.1693706F;
		fncc60footbulk2Model[5].rotateAngleZ = 0.10471976F;

		fncc60footbulk2Model[6].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		fncc60footbulk2Model[6].setRotationPoint(46.5F, 4.5F, -1.5F);
		fncc60footbulk2Model[6].rotateAngleY = 1.1693706F;
		fncc60footbulk2Model[6].rotateAngleZ = -0.10471976F;

		fncc60footbulk2Model[7].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		fncc60footbulk2Model[7].setRotationPoint(-44.51F, -5.5F, 2F);

		fncc60footbulk2Model[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		fncc60footbulk2Model[8].setRotationPoint(-44.5F, -4F, 3.5F);

		fncc60footbulk2Model[9].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		fncc60footbulk2Model[9].setRotationPoint(-43.5F, -5.5F, 2.5F);

		fncc60footbulk2Model[10].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 132
		fncc60footbulk2Model[10].setRotationPoint(-44.25F, -3F, 4F);

		fncc60footbulk2Model[11].addShapeBox(0F, 0F, 0F, 40, 1, 0, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		fncc60footbulk2Model[11].setRotationPoint(-43.25F, 4F, 4F);

		fncc60footbulk2Model[12].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 56 crossover cull
		fncc60footbulk2Model[12].setRotationPoint(42F, 1F, -10.5F);

		fncc60footbulk2Model[13].addBox(0F, 0F, 0F, 0, 8, 21, 0F); // Box 57
		fncc60footbulk2Model[13].setRotationPoint(43F, -7F, -10.5F);

		fncc60footbulk2Model[14].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 3
		fncc60footbulk2Model[14].setRotationPoint(-42.5F, -7F, -11F);

		fncc60footbulk2Model[15].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 105
		fncc60footbulk2Model[15].setRotationPoint(-42.5F, -7F, 10F);

		fncc60footbulk2Model[16].addBox(0F, 0F, 0F, 3, 9, 20, 0F); // Box 14
		fncc60footbulk2Model[16].setRotationPoint(-42.5F, -7F, -10F);

		fncc60footbulk2Model[17].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 40
		fncc60footbulk2Model[17].setRotationPoint(-43.5F, -1F, -11F);

		fncc60footbulk2Model[18].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 41
		fncc60footbulk2Model[18].setRotationPoint(-43.5F, -1F, -6F);

		fncc60footbulk2Model[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 42
		fncc60footbulk2Model[19].setRotationPoint(-43.5F, -1F, 6F);

		fncc60footbulk2Model[20].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		fncc60footbulk2Model[20].setRotationPoint(-42.5F, -7F, -11.5F);

		fncc60footbulk2Model[21].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		fncc60footbulk2Model[21].setRotationPoint(-38.5F, -7F, -11.5F);

		fncc60footbulk2Model[22].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 89
		fncc60footbulk2Model[22].setRotationPoint(-42.5F, -7F, -11.51F);

		fncc60footbulk2Model[23].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 93
		fncc60footbulk2Model[23].setRotationPoint(-42.5F, 3F, -11.01F);

		fncc60footbulk2Model[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		fncc60footbulk2Model[24].setRotationPoint(-38.5F, -7F, 10.5F);

		fncc60footbulk2Model[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		fncc60footbulk2Model[25].setRotationPoint(-42.5F, -7F, 10.5F);

		fncc60footbulk2Model[26].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 109
		fncc60footbulk2Model[26].setRotationPoint(-42.5F, -7F, 11.51F);

		fncc60footbulk2Model[27].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 110
		fncc60footbulk2Model[27].setRotationPoint(-42.5F, 3F, 11.01F);

		fncc60footbulk2Model[28].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 174
		fncc60footbulk2Model[28].setRotationPoint(-43.5F, -4F, -6F);

		fncc60footbulk2Model[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 175
		fncc60footbulk2Model[29].setRotationPoint(-43.5F, -4F, -11F);

		fncc60footbulk2Model[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 176
		fncc60footbulk2Model[30].setRotationPoint(-43.5F, -4F, 6F);

		fncc60footbulk2Model[31].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 177
		fncc60footbulk2Model[31].setRotationPoint(-43.5F, -7F, -6F);

		fncc60footbulk2Model[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 178
		fncc60footbulk2Model[32].setRotationPoint(-43.5F, -7F, -11F);

		fncc60footbulk2Model[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 179
		fncc60footbulk2Model[33].setRotationPoint(-43.5F, -7F, 6F);

		fncc60footbulk2Model[34].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 5
		fncc60footbulk2Model[34].setRotationPoint(37.5F, -7F, -11F);

		fncc60footbulk2Model[35].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 104
		fncc60footbulk2Model[35].setRotationPoint(37.5F, -7F, 10F);

		fncc60footbulk2Model[36].addBox(0F, 0F, 0F, 3, 9, 20, 0F); // Box 15
		fncc60footbulk2Model[36].setRotationPoint(39.5F, -7F, -10F);

		fncc60footbulk2Model[37].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 58
		fncc60footbulk2Model[37].setRotationPoint(42.5F, -1F, -6F);

		fncc60footbulk2Model[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		fncc60footbulk2Model[38].setRotationPoint(42.5F, -1F, -11F);

		fncc60footbulk2Model[39].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 60
		fncc60footbulk2Model[39].setRotationPoint(42.5F, -1F, 6F);

		fncc60footbulk2Model[40].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		fncc60footbulk2Model[40].setRotationPoint(41.5F, -7F, -11.5F);

		fncc60footbulk2Model[41].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		fncc60footbulk2Model[41].setRotationPoint(37.5F, -7F, -11.5F);

		fncc60footbulk2Model[42].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 92
		fncc60footbulk2Model[42].setRotationPoint(37.5F, -7F, -11.51F);

		fncc60footbulk2Model[43].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 94
		fncc60footbulk2Model[43].setRotationPoint(38.5F, 3F, -11.01F);

		fncc60footbulk2Model[44].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		fncc60footbulk2Model[44].setRotationPoint(37.5F, -7F, 10.5F);

		fncc60footbulk2Model[45].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		fncc60footbulk2Model[45].setRotationPoint(41.5F, -7F, 10.5F);

		fncc60footbulk2Model[46].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 111
		fncc60footbulk2Model[46].setRotationPoint(37.5F, -7F, 11.51F);

		fncc60footbulk2Model[47].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 112
		fncc60footbulk2Model[47].setRotationPoint(38.5F, 3F, 11.01F);

		fncc60footbulk2Model[48].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 155
		fncc60footbulk2Model[48].setRotationPoint(42.5F, -4F, -6F);

		fncc60footbulk2Model[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 156
		fncc60footbulk2Model[49].setRotationPoint(42.5F, -4F, 6F);

		fncc60footbulk2Model[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 157
		fncc60footbulk2Model[50].setRotationPoint(42.5F, -4F, -11F);

		fncc60footbulk2Model[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 158
		fncc60footbulk2Model[51].setRotationPoint(42.5F, -7F, -6F);

		fncc60footbulk2Model[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 159
		fncc60footbulk2Model[52].setRotationPoint(42.5F, -7F, 6F);

		fncc60footbulk2Model[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 160
		fncc60footbulk2Model[53].setRotationPoint(42.5F, -7F, -11F);

		fncc60footbulk2Model[54].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		fncc60footbulk2Model[54].setRotationPoint(-32F, 5F, -2F);

		fncc60footbulk2Model[55].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		fncc60footbulk2Model[55].setRotationPoint(-31.5F, 2.8F, -10F);

		fncc60footbulk2Model[56].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		fncc60footbulk2Model[56].setRotationPoint(28F, 5F, -2F);

		fncc60footbulk2Model[57].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 116
		fncc60footbulk2Model[57].setRotationPoint(7.5F, 2.8F, -10F);

		fncc60footbulk2Model[58].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 117
		fncc60footbulk2Model[58].setRotationPoint(-9.5F, 2.8F, -10F);

		fncc60footbulk2Model[59].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		fncc60footbulk2Model[59].setRotationPoint(-31.5F, 2.8F, 2F);

		fncc60footbulk2Model[60].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 216
		fncc60footbulk2Model[60].setRotationPoint(28.5F, 2.8F, -10F);

		fncc60footbulk2Model[61].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		fncc60footbulk2Model[61].setRotationPoint(28.5F, 2.8F, 2F);

		fncc60footbulk2Model[62].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 93
		fncc60footbulk2Model[62].setRotationPoint(-20.5F, 2.8F, -10F);

		fncc60footbulk2Model[63].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 94
		fncc60footbulk2Model[63].setRotationPoint(18.5F, 2.8F, -10F);

		fncc60footbulk2Model[64].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Box 1
		fncc60footbulk2Model[64].setRotationPoint(-42.5F, 2F, -10F);

		fncc60footbulk2Model[65].addBox(0F, 0F, 0F, 75, 2, 1, 0F); // Box 96
		fncc60footbulk2Model[65].setRotationPoint(-37.5F, 2F, -11F);

		fncc60footbulk2Model[66].addBox(0F, 0F, 0F, 75, 2, 1, 0F); // Box 97
		fncc60footbulk2Model[66].setRotationPoint(-37.5F, 2F, 10F);

		fncc60footbulk2Model[67].addBox(0F, 0F, 0F, 53, 2, 1, 0F); // Box 50
		fncc60footbulk2Model[67].setRotationPoint(-26.5F, 4F, -11F);

		fncc60footbulk2Model[68].addBox(0F, 0F, 0F, 53, 2, 1, 0F); // Box 51
		fncc60footbulk2Model[68].setRotationPoint(-26.5F, 4F, 10F);

		fncc60footbulk2Model[69].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		fncc60footbulk2Model[69].setRotationPoint(-33.5F, 4F, -11F);

		fncc60footbulk2Model[70].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		fncc60footbulk2Model[70].setRotationPoint(-33.5F, 4F, 10F);

		fncc60footbulk2Model[71].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 102
		fncc60footbulk2Model[71].setRotationPoint(26.5F, 4F, 10F);

		fncc60footbulk2Model[72].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 103
		fncc60footbulk2Model[72].setRotationPoint(26.5F, 4F, -11F);

		fncc60footbulk2Model[73].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		fncc60footbulk2Model[73].setRotationPoint(1F, 5.5F, -7.5F);
		fncc60footbulk2Model[73].rotateAngleX = -0.78539816F;

		fncc60footbulk2Model[74].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		fncc60footbulk2Model[74].setRotationPoint(4F, 5.5F, -7.5F);
		fncc60footbulk2Model[74].rotateAngleX = -0.78539816F;

		fncc60footbulk2Model[75].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		fncc60footbulk2Model[75].setRotationPoint(-2F, 5F, 4F);
		fncc60footbulk2Model[75].rotateAngleX = -0.78539816F;

		fncc60footbulk2Model[76].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		fncc60footbulk2Model[76].setRotationPoint(-4F, 5F, 4F);
		fncc60footbulk2Model[76].rotateAngleX = -0.78539816F;

		fncc60footbulk2Model[77].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		fncc60footbulk2Model[77].setRotationPoint(-14F, 5.26F, 0F);
		fncc60footbulk2Model[77].rotateAngleY = -0.31415927F;

		fncc60footbulk2Model[78].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		fncc60footbulk2Model[78].setRotationPoint(-14F, 5.25F, 0F);
		fncc60footbulk2Model[78].rotateAngleY = -0.31415927F;

		fncc60footbulk2Model[79].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		fncc60footbulk2Model[79].setRotationPoint(18F, 5.26F, 0F);
		fncc60footbulk2Model[79].rotateAngleY = -0.10471976F;

		fncc60footbulk2Model[80].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 123
		fncc60footbulk2Model[80].setRotationPoint(18F, 5.25F, 0F);
		fncc60footbulk2Model[80].rotateAngleY = -0.10471976F;

		fncc60footbulk2Model[81].addBox(-0.5F, 0F, 0F, 1, 0, 32, 0F); // Box 124
		fncc60footbulk2Model[81].setRotationPoint(-14F, 5.26F, 0F);
		fncc60footbulk2Model[81].rotateAngleY = -1.57079633F;

		fncc60footbulk2Model[82].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		fncc60footbulk2Model[82].setRotationPoint(16F, 4.5F, -2.25F);

		fncc60footbulk2Model[83].addBox(-14.5F, -0.75F, -0.5F, 15, 0, 1, 0F); // Box 202
		fncc60footbulk2Model[83].setRotationPoint(-15F, 6.01F, -3.5F);
		fncc60footbulk2Model[83].rotateAngleY = -0.17453293F;
		fncc60footbulk2Model[83].rotateAngleZ = 0.08726646F;

		fncc60footbulk2Model[84].addBox(-11.5F, -0.75F, -0.5F, 12, 0, 1, 0F); // Box 128
		fncc60footbulk2Model[84].setRotationPoint(18.5F, 6.01F, 3.5F);
		fncc60footbulk2Model[84].rotateAngleY = -3.40339204F;
		fncc60footbulk2Model[84].rotateAngleZ = 0.08726646F;

		fncc60footbulk2Model[85].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		fncc60footbulk2Model[85].setRotationPoint(-2.5F, 3F, 3F);

		fncc60footbulk2Model[86].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 130
		fncc60footbulk2Model[86].setRotationPoint(2.5F, 3F, 7F);

		fncc60footbulk2Model[87].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 302
		fncc60footbulk2Model[87].setRotationPoint(2.5F, 3F, -8.5F);

		fncc60footbulk2Model[88].addBox(0F, 0F, 0F, 2, 9, 20, 0F); // Box 119
		fncc60footbulk2Model[88].setRotationPoint(-39.5F, -7F, -10F);

		fncc60footbulk2Model[89].addBox(0F, 0F, 0F, 2, 9, 20, 0F); // Box 120
		fncc60footbulk2Model[89].setRotationPoint(37.5F, -7F, -10F);

		fncc60footbulk2Model[90].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 124
		fncc60footbulk2Model[90].setRotationPoint(42.5F, -7F, 11F);

		fncc60footbulk2Model[91].addBox(0F, 0F, 0F, 2, 12, 22, 0F); // Box 126
		fncc60footbulk2Model[91].setRotationPoint(37.5F, -19F, -11F);

		fncc60footbulk2Model[92].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 127
		fncc60footbulk2Model[92].setRotationPoint(42.5F, -7F, 1F);

		fncc60footbulk2Model[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 128
		fncc60footbulk2Model[93].setRotationPoint(42.5F, -7F, -9F);

		fncc60footbulk2Model[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 129
		fncc60footbulk2Model[94].setRotationPoint(-42.5F, -7F, -11F);
		fncc60footbulk2Model[94].rotateAngleY = -3.14159265F;

		fncc60footbulk2Model[95].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 130
		fncc60footbulk2Model[95].setRotationPoint(-42.5F, -7F, -1F);
		fncc60footbulk2Model[95].rotateAngleY = -3.14159265F;

		fncc60footbulk2Model[96].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 12, 3, 12) }), 2, 3, 12, 28, 2, ModelRendererTurbo.MR_FRONT, new float[] {13 ,12 ,3}); // Shape 131
		fncc60footbulk2Model[96].setRotationPoint(-42.5F, -7F, 9F);
		fncc60footbulk2Model[96].rotateAngleY = -3.14159265F;

		fncc60footbulk2Model[97].addBox(0F, 0F, 0F, 2, 12, 22, 0F); // Box 132
		fncc60footbulk2Model[97].setRotationPoint(-39.5F, -19F, -11F);

		fncc60footbulk2Model[98].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 133
		fncc60footbulk2Model[98].setRotationPoint(-40.5F, -14F, -10F);

		fncc60footbulk2Model[99].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 134
		fncc60footbulk2Model[99].setRotationPoint(39.5F, -14F, -10F);

		fncc60footbulk2Model[100].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		fncc60footbulk2Model[100].setRotationPoint(-23F, -18F, 11F);

		fncc60footbulk2Model[101].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		fncc60footbulk2Model[101].setRotationPoint(-8F, -18F, 11F);

		fncc60footbulk2Model[102].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 148
		fncc60footbulk2Model[102].setRotationPoint(7F, -18F, 11F);

		fncc60footbulk2Model[103].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 152
		fncc60footbulk2Model[103].setRotationPoint(22F, -18F, 11F);

		fncc60footbulk2Model[104].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		fncc60footbulk2Model[104].setRotationPoint(-8F, -18F, -12F);

		fncc60footbulk2Model[105].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		fncc60footbulk2Model[105].setRotationPoint(-23F, -18F, -12F);

		fncc60footbulk2Model[106].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		fncc60footbulk2Model[106].setRotationPoint(7F, -18F, -12F);

		fncc60footbulk2Model[107].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		fncc60footbulk2Model[107].setRotationPoint(22F, -18F, -12F);

		fncc60footbulk2Model[108].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 157
		fncc60footbulk2Model[108].setRotationPoint(-23.5F, 2.5F, -11.75F);

		fncc60footbulk2Model[109].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 158
		fncc60footbulk2Model[109].setRotationPoint(-8.5F, 2.5F, -11.75F);

		fncc60footbulk2Model[110].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 159
		fncc60footbulk2Model[110].setRotationPoint(21.5F, 2.5F, -11.75F);

		fncc60footbulk2Model[111].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 160
		fncc60footbulk2Model[111].setRotationPoint(6.5F, 2.5F, -11.75F);

		fncc60footbulk2Model[112].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 161
		fncc60footbulk2Model[112].setRotationPoint(21.5F, 2.5F, 10.75F);

		fncc60footbulk2Model[113].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 162
		fncc60footbulk2Model[113].setRotationPoint(6.5F, 2.5F, 10.75F);

		fncc60footbulk2Model[114].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 163
		fncc60footbulk2Model[114].setRotationPoint(-8.5F, 2.5F, 10.75F);

		fncc60footbulk2Model[115].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 164
		fncc60footbulk2Model[115].setRotationPoint(-23.5F, 2.5F, 10.75F);

		fncc60footbulk2Model[116].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 462 kartrak my beloved
		fncc60footbulk2Model[116].setRotationPoint(-38F, -12.5F, 11.01F);
		fncc60footbulk2Model[116].rotateAngleY = -3.14159265F;

		fncc60footbulk2Model[117].addShapeBox(0F, 0F, 0F, 4, 4, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 481 kartrak my beloved
		fncc60footbulk2Model[117].setRotationPoint(37F, -12.5F, -11.01F);

		fncc60footbulk2Model[118].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 700
		fncc60footbulk2Model[118].setRotationPoint(-14F, 2.5F, 11.01F);
		fncc60footbulk2Model[118].rotateAngleY = -3.14159265F;

		fncc60footbulk2Model[119].addShapeBox(0F, 0F, 0F, 12, 6, 0, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F, 0F); // Box 701
		fncc60footbulk2Model[119].setRotationPoint(14F, 2.5F, -11.01F);

	}

	Model70TonTruck2 bogie2 = new Model70TonTruck2();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 120; i++)
		{
			if (fncc60footbulk2Model[i].boxName != null && fncc60footbulk2Model[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				fncc60footbulk2Model[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				fncc60footbulk2Model[i].render(f5);
			}
			//fncc60footbulk2Model[i].render(f5);
			if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==18900){
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
			} else {
				Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
			}
			GL11.glPushMatrix();
			GL11.glTranslated(-1.65,-0.0,-0.0);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);

			GL11.glTranslated(3.25,-0.0,0.00);
			bogie2.render(entity,f,f1,f2,f3,f4,f5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo fncc60footbulk2Model[];
}