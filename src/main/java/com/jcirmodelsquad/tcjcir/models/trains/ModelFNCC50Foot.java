//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FNCC50Foot
// Model Creator: Bida
// Created on: 06.10.2021 - 22:55:40
// Last changed on: 06.10.2021 - 22:55:40

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.Model70TonTruck2;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

public class ModelFNCC50Foot extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelFNCC50Foot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[155];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 42
		bodyModel[2] = new ModelRendererTurbo(this, 161, 22, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 14, 9, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 161, 22, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 1, 174, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 93, 174, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 1, 75, textureX, textureY); // Box 104
		bodyModel[9] = new ModelRendererTurbo(this, 93, 75, textureX, textureY); // Box 105
		bodyModel[10] = new ModelRendererTurbo(this, 2, 18, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 144, 55, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 144, 154, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 194, 79, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 193, 84, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 209, 84, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 162, 104, textureX, textureY, "cull"); // Box 38 crossover cull
		bodyModel[17] = new ModelRendererTurbo(this, 213, 95, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 11, 109, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 2, 147, textureX, textureY); // Box 133
		bodyModel[23] = new ModelRendererTurbo(this, 3, 211, textureX, textureY); // Box 45
		bodyModel[24] = new ModelRendererTurbo(this, 11, 123, textureX, textureY); // Box 46
		bodyModel[25] = new ModelRendererTurbo(this, 52, 172, textureX, textureY); // Box 48
		bodyModel[26] = new ModelRendererTurbo(this, 1, 202, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 42, 202, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 42, 103, textureX, textureY); // Box 51
		bodyModel[29] = new ModelRendererTurbo(this, 1, 103, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 52, 73, textureX, textureY); // Box 53
		bodyModel[31] = new ModelRendererTurbo(this, 215, 219, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 215, 216, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 162, 104, textureX, textureY, "cull"); // Box 56 crossover cull
		bodyModel[34] = new ModelRendererTurbo(this, 213, 95, textureX, textureY); // Box 57
		bodyModel[35] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 58
		bodyModel[36] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 59
		bodyModel[37] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 60
		bodyModel[38] = new ModelRendererTurbo(this, 209, 183, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 194, 178, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 193, 183, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 12, 147, textureX, textureY); // Box 83
		bodyModel[43] = new ModelRendererTurbo(this, 17, 147, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 139, 147, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 134, 147, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 129, 147, textureX, textureY); // Box 87
		bodyModel[47] = new ModelRendererTurbo(this, 124, 147, textureX, textureY); // Box 88
		bodyModel[48] = new ModelRendererTurbo(this, 27, 164, textureX, textureY); // Box 89
		bodyModel[49] = new ModelRendererTurbo(this, 22, 147, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 119, 147, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 108, 164, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 28, 160, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 109, 160, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 215, 105, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 210, 113, textureX, textureY); // Box 87
		bodyModel[56] = new ModelRendererTurbo(this, 204, 113, textureX, textureY); // Box 87
		bodyModel[57] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 132
		bodyModel[58] = new ModelRendererTurbo(this, 134, 48, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 139, 48, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 129, 48, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 124, 48, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 119, 48, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 22, 48, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 17, 48, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 12, 48, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 7, 48, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 2, 48, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 108, 65, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 109, 61, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 27, 65, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 28, 61, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 286
		bodyModel[73] = new ModelRendererTurbo(this, 206, 65, textureX, textureY); // Box 287
		bodyModel[74] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 116
		bodyModel[75] = new ModelRendererTurbo(this, 160, 21, textureX, textureY); // Box 117
		bodyModel[76] = new ModelRendererTurbo(this, 206, 60, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 217, 60, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 222, 55, textureX, textureY); // Box 196
		bodyModel[79] = new ModelRendererTurbo(this, 247, 61, textureX, textureY); // Box 199
		bodyModel[80] = new ModelRendererTurbo(this, 227, 57, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 247, 61, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 193, 71, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 236, 61, textureX, textureY); // Box 126
		bodyModel[85] = new ModelRendererTurbo(this, 224, 73, textureX, textureY); // Box 202
		bodyModel[86] = new ModelRendererTurbo(this, 230, 75, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 228, 65, textureX, textureY); // Box 129
		bodyModel[88] = new ModelRendererTurbo(this, 241, 64, textureX, textureY); // Box 130
		bodyModel[89] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 215
		bodyModel[90] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 216
		bodyModel[91] = new ModelRendererTurbo(this, 157, 28, textureX, textureY); // Box 217
		bodyModel[92] = new ModelRendererTurbo(this, 228, 65, textureX, textureY); // Box 302
		bodyModel[93] = new ModelRendererTurbo(this, 52, 175, textureX, textureY); // Box 78 door L B end
		bodyModel[94] = new ModelRendererTurbo(this, 50, 139, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 50, 142, textureX, textureY); // Box 125
		bodyModel[96] = new ModelRendererTurbo(this, 55, 157, textureX, textureY); // Box 149 door L B end
		bodyModel[97] = new ModelRendererTurbo(this, 90, 145, textureX, textureY); // Box 149 door L B end
		bodyModel[98] = new ModelRendererTurbo(this, 50, 145, textureX, textureY); // Box 149 door L B end
		bodyModel[99] = new ModelRendererTurbo(this, 55, 166, textureX, textureY); // Box 149 door L B end
		bodyModel[100] = new ModelRendererTurbo(this, 55, 154, textureX, textureY); // Box 149 door L B end
		bodyModel[101] = new ModelRendererTurbo(this, 55, 169, textureX, textureY); // Box 149 door L B end
		bodyModel[102] = new ModelRendererTurbo(this, 96, 146, textureX, textureY); // Box 149 door L B end
		bodyModel[103] = new ModelRendererTurbo(this, 99, 146, textureX, textureY); // Box 149 door L B end
		bodyModel[104] = new ModelRendererTurbo(this, 52, 76, textureX, textureY); // Box 108 door R B end
		bodyModel[105] = new ModelRendererTurbo(this, 50, 43, textureX, textureY); // Box 130
		bodyModel[106] = new ModelRendererTurbo(this, 50, 40, textureX, textureY); // Box 131
		bodyModel[107] = new ModelRendererTurbo(this, 90, 46, textureX, textureY); // Box 108 door R B end
		bodyModel[108] = new ModelRendererTurbo(this, 50, 46, textureX, textureY); // Box 108 door R B end
		bodyModel[109] = new ModelRendererTurbo(this, 55, 58, textureX, textureY); // Box 108 door R B end
		bodyModel[110] = new ModelRendererTurbo(this, 55, 67, textureX, textureY); // Box 108 door R B end
		bodyModel[111] = new ModelRendererTurbo(this, 55, 70, textureX, textureY); // Box 108 door R B end
		bodyModel[112] = new ModelRendererTurbo(this, 55, 55, textureX, textureY); // Box 108 door R B end
		bodyModel[113] = new ModelRendererTurbo(this, 99, 47, textureX, textureY); // Box 108 door R B end
		bodyModel[114] = new ModelRendererTurbo(this, 96, 47, textureX, textureY); // Box 108 door R B end
		bodyModel[115] = new ModelRendererTurbo(this, 65, 160, textureX, textureY); // Box 149 door L B end
		bodyModel[116] = new ModelRendererTurbo(this, 65, 61, textureX, textureY); // Box 108 door R B end
		bodyModel[117] = new ModelRendererTurbo(this, 167, 151, textureX, textureY); // Box 153 plate
		bodyModel[118] = new ModelRendererTurbo(this, 167, 128, textureX, textureY); // Box 154 plate
		bodyModel[119] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 155
		bodyModel[120] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 156
		bodyModel[121] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 157
		bodyModel[122] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 158
		bodyModel[123] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 159
		bodyModel[124] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 160
		bodyModel[125] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 161
		bodyModel[126] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 162
		bodyModel[127] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 163
		bodyModel[128] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 164
		bodyModel[129] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 165
		bodyModel[130] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 166
		bodyModel[131] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 167
		bodyModel[132] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 168
		bodyModel[133] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 169
		bodyModel[134] = new ModelRendererTurbo(this, 194, 192, textureX, textureY); // Box 170
		bodyModel[135] = new ModelRendererTurbo(this, 209, 197, textureX, textureY); // Box 171
		bodyModel[136] = new ModelRendererTurbo(this, 193, 197, textureX, textureY); // Box 172
		bodyModel[137] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 175
		bodyModel[139] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 180
		bodyModel[144] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 181
		bodyModel[145] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 182
		bodyModel[146] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 183
		bodyModel[147] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 184
		bodyModel[148] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 185
		bodyModel[149] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 194, 93, textureX, textureY); // Box 189
		bodyModel[153] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 190
		bodyModel[154] = new ModelRendererTurbo(this, 193, 98, textureX, textureY); // Box 191

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, 5F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 42
		bodyModel[1].setRotationPoint(-24.5F, 2.8F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[2].setRotationPoint(35F, 3F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 70, 2, 5, 0F); // Box 0
		bodyModel[3].setRotationPoint(-35F, 3F, -2.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[4].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[5].setRotationPoint(21F, 5F, -2F);

		bodyModel[6].addBox(0F, 0F, 0F, 24, 26, 1, 0F); // Box 3
		bodyModel[6].setRotationPoint(-33.5F, -22F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 24, 26, 1, 0F); // Box 5
		bodyModel[7].setRotationPoint(9.5F, -22F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 24, 26, 1, 0F); // Box 104
		bodyModel[8].setRotationPoint(9.5F, -22F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 24, 26, 1, 0F); // Box 105
		bodyModel[9].setRotationPoint(-33.5F, -22F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 67, 1, 20, 0F); // Box 1
		bodyModel[10].setRotationPoint(-33.5F, 2F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Box 14
		bodyModel[11].setRotationPoint(-33.5F, -22F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 24, 20, 0F); // Box 15
		bodyModel[12].setRotationPoint(32.5F, -22F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 17
		bodyModel[13].setRotationPoint(-34.5F, -22F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 18
		bodyModel[14].setRotationPoint(-34.5F, -22F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 19
		bodyModel[15].setRotationPoint(-34.5F, -22F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 38 crossover cull
		bodyModel[16].setRotationPoint(-36F, 1F, -10.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 8, 21, 0F); // Box 39
		bodyModel[17].setRotationPoint(-34F, -7F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 40
		bodyModel[18].setRotationPoint(-34.5F, -1F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 41
		bodyModel[19].setRotationPoint(-34.5F, -1F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 42
		bodyModel[20].setRotationPoint(-34.5F, -1F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 67, 1, 10, 0F,0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 39
		bodyModel[21].setRotationPoint(-33.5F, -24F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[22].setRotationPoint(-33.5F, -22F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 67, 1, 20, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[23].setRotationPoint(-33.5F, -23F, -9.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 67, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 46
		bodyModel[24].setRotationPoint(-33.5F, -24F, 0F);

		bodyModel[25].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 48
		bodyModel[25].setRotationPoint(-9.5F, -22F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 49
		bodyModel[26].setRotationPoint(-9.5F, 2F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 53, 1, 1, 0F); // Box 50
		bodyModel[27].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[28].addBox(0F, 0F, 0F, 53, 1, 1, 0F); // Box 51
		bodyModel[28].setRotationPoint(-26.5F, 4F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 19, 2, 1, 0F); // Box 52
		bodyModel[29].setRotationPoint(-9.5F, 2F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 53
		bodyModel[30].setRotationPoint(-9.5F, -22F, 10F);

		bodyModel[31].addBox(0F, -1F, 0F, 10, 2, 0, 0F); // Box 80
		bodyModel[31].setRotationPoint(-37.5F, 4.5F, 1.5F);
		bodyModel[31].rotateAngleY = 1.1693706F;
		bodyModel[31].rotateAngleZ = 0.10471976F;

		bodyModel[32].addBox(-10F, -1F, 0F, 10, 2, 0, 0F); // Box 81
		bodyModel[32].setRotationPoint(37.5F, 4.5F, -1.5F);
		bodyModel[32].rotateAngleY = 1.1693706F;
		bodyModel[32].rotateAngleZ = -0.10471976F;

		bodyModel[33].addBox(0F, 0F, 0F, 3, 1, 21, 0F); // Box 56 crossover cull
		bodyModel[33].setRotationPoint(33F, 1F, -10.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 8, 21, 0F); // Box 57
		bodyModel[34].setRotationPoint(34F, -7F, -10.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 58
		bodyModel[35].setRotationPoint(33.5F, -1F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[36].setRotationPoint(33.5F, -1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 60
		bodyModel[37].setRotationPoint(33.5F, -1F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 79
		bodyModel[38].setRotationPoint(33.5F, -22F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[39].setRotationPoint(33.5F, -22F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 81
		bodyModel[40].setRotationPoint(33.5F, -22F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[41].setRotationPoint(-29.5F, -22F, -11.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[42].setRotationPoint(-23.5F, -22F, -11.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[43].setRotationPoint(-17.5F, -22F, -11.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[44].setRotationPoint(32.5F, -22F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		bodyModel[45].setRotationPoint(28.5F, -22F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[46].setRotationPoint(22.5F, -22F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[47].setRotationPoint(16.5F, -22F, -11.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 89
		bodyModel[48].setRotationPoint(-33.5F, -7F, -11.51F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 90
		bodyModel[49].setRotationPoint(-11.5F, -22F, -11.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[50].setRotationPoint(10.5F, -22F, -11.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 92
		bodyModel[51].setRotationPoint(28.5F, -7F, -11.51F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 93
		bodyModel[52].setRotationPoint(-33.5F, 3F, -11.01F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 94
		bodyModel[53].setRotationPoint(29.5F, 3F, -11.01F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[54].setRotationPoint(-35.51F, -5.5F, 2F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[55].setRotationPoint(-35.5F, -4F, 3.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 87
		bodyModel[56].setRotationPoint(-34.5F, -5.5F, 2.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 132
		bodyModel[57].setRotationPoint(-35.25F, -3F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[58].setRotationPoint(-29.5F, -22F, 10.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-33.5F, -22F, 10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[60].setRotationPoint(-23.5F, -22F, 10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[61].setRotationPoint(-17.5F, -22F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[62].setRotationPoint(-11.5F, -22F, 10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[63].setRotationPoint(10.5F, -22F, 10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[64].setRotationPoint(16.5F, -22F, 10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[65].setRotationPoint(22.5F, -22F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[66].setRotationPoint(28.5F, -22F, 10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[67].setRotationPoint(32.5F, -22F, 10.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 109
		bodyModel[68].setRotationPoint(-33.5F, -7F, 11.51F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 110
		bodyModel[69].setRotationPoint(-33.5F, 3F, 11.01F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 9, 0, 0F); // Box 111
		bodyModel[70].setRotationPoint(28.5F, -7F, 11.51F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 112
		bodyModel[71].setRotationPoint(29.5F, 3F, 11.01F);

		bodyModel[72].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[72].setRotationPoint(1F, 5.5F, -4.5F);
		bodyModel[72].rotateAngleX = -0.78539816F;

		bodyModel[73].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[73].setRotationPoint(4F, 5.5F, -4.5F);
		bodyModel[73].rotateAngleX = -0.78539816F;

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 116
		bodyModel[74].setRotationPoint(7.5F, 2.8F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 117
		bodyModel[75].setRotationPoint(-9.5F, 2.8F, -10F);

		bodyModel[76].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[76].setRotationPoint(-2F, 5F, 4F);
		bodyModel[76].rotateAngleX = -0.78539816F;

		bodyModel[77].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[77].setRotationPoint(-4F, 5F, 4F);
		bodyModel[77].rotateAngleX = -0.78539816F;

		bodyModel[78].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[78].setRotationPoint(-7F, 5.26F, 0F);
		bodyModel[78].rotateAngleY = -0.31415927F;

		bodyModel[79].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[79].setRotationPoint(-7F, 5.25F, 0F);
		bodyModel[79].rotateAngleY = -0.31415927F;

		bodyModel[80].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[80].setRotationPoint(11F, 5.26F, 0F);
		bodyModel[80].rotateAngleY = -0.10471976F;

		bodyModel[81].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 123
		bodyModel[81].setRotationPoint(11F, 5.25F, 0F);
		bodyModel[81].rotateAngleY = -0.10471976F;

		bodyModel[82].addBox(-0.5F, 0F, 0F, 1, 0, 18, 0F); // Box 124
		bodyModel[82].setRotationPoint(-7F, 5.26F, 0F);
		bodyModel[82].rotateAngleY = -1.57079633F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 31, 1, 0, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[83].setRotationPoint(-34.25F, 4F, 4F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[84].setRotationPoint(9F, 4.5F, -2.25F);

		bodyModel[85].addBox(-14.5F, -0.75F, -0.5F, 15, 0, 1, 0F); // Box 202
		bodyModel[85].setRotationPoint(-8F, 6.01F, -3.5F);
		bodyModel[85].rotateAngleY = -0.17453293F;
		bodyModel[85].rotateAngleZ = 0.08726646F;

		bodyModel[86].addBox(-11.5F, -0.75F, -0.5F, 12, 0, 1, 0F); // Box 128
		bodyModel[86].setRotationPoint(11.5F, 6.01F, 3.5F);
		bodyModel[86].rotateAngleY = -3.40339204F;
		bodyModel[86].rotateAngleZ = 0.08726646F;

		bodyModel[87].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[87].setRotationPoint(-2.5F, 3F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 130
		bodyModel[88].setRotationPoint(2.5F, 3F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[89].setRotationPoint(-24.5F, 2.8F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 216
		bodyModel[90].setRotationPoint(21.5F, 2.8F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[91].setRotationPoint(21.5F, 2.8F, 2F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 302
		bodyModel[92].setRotationPoint(2.5F, 3F, -5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 19, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78 door L B end
		bodyModel[93].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(-10F, -23F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[95].setRotationPoint(-10F, 3F, -12F);

		bodyModel[96].addShapeBox(1.5F, 8F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[96].setRotationPoint(-9.5F, -24F, -11.5F);

		bodyModel[97].addShapeBox(17.5F, 0F, -0.5F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[97].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[98].addShapeBox(0.5F, 0F, -0.5F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[98].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[99].addShapeBox(1.5F, 18F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[99].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[100].addShapeBox(1.5F, 0F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[100].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[101].addShapeBox(1.5F, 26F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[101].setRotationPoint(-9.5F, -24F, -11.5F);

		bodyModel[102].addBox(3.5F, 0F, -0.5F, 1, 25, 0, 0F); // Box 149 door L B end
		bodyModel[102].setRotationPoint(-9.5F, -22F, -11.51F);

		bodyModel[103].addBox(14.5F, 0F, -0.5F, 1, 25, 0, 0F); // Box 149 door L B end
		bodyModel[103].setRotationPoint(-9.5F, -22F, -11.51F);

		bodyModel[104].addShapeBox(0F, 0F, -1F, 19, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[104].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[105].setRotationPoint(-28F, 3F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 38, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[106].setRotationPoint(-28F, -23F, 11F);

		bodyModel[107].addShapeBox(0.5F, 0F, -0.5F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[107].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[108].addShapeBox(17.5F, 0F, -0.5F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[108].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[109].addShapeBox(1.5F, 8F, -0.5F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[109].setRotationPoint(-9.5F, -24F, 11.5F);

		bodyModel[110].addShapeBox(1.5F, 18F, -0.5F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[110].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[111].addShapeBox(1.5F, 26F, -0.5F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[111].setRotationPoint(-9.5F, -24F, 11.5F);

		bodyModel[112].addShapeBox(1.5F, 0F, -0.5F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[112].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[113].addBox(3.5F, 0F, 0.51F, 1, 25, 0, 0F); // Box 108 door R B end
		bodyModel[113].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[114].addBox(14.5F, 0F, 0.51F, 1, 25, 0, 0F); // Box 108 door R B end
		bodyModel[114].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[115].addShapeBox(6.5F, 14F, -0.5F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149 door L B end
		bodyModel[115].setRotationPoint(-9.5F, -22F, -11.5F);

		bodyModel[116].addShapeBox(6.5F, 14F, -0.5F, 6, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108 door R B end
		bodyModel[116].setRotationPoint(-9.5F, -22F, 11.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 38, 22, 0, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -19F, -11F, 0F, -19F, -11F, 0F, 0F, -11F, 0F); // Box 153 plate
		bodyModel[117].setRotationPoint(-29.5F, -20F, -11.51F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 38, 22, 0, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -19F, -11F, 0F, -19F, -11F, 0F, 0F, -11F, 0F); // Box 154 plate
		bodyModel[118].setRotationPoint(10.5F, -20F, 11.51F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 155
		bodyModel[119].setRotationPoint(33.5F, -4F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 156
		bodyModel[120].setRotationPoint(33.5F, -4F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 157
		bodyModel[121].setRotationPoint(33.5F, -4F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 158
		bodyModel[122].setRotationPoint(33.5F, -7F, -6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 159
		bodyModel[123].setRotationPoint(33.5F, -7F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 160
		bodyModel[124].setRotationPoint(33.5F, -7F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 161
		bodyModel[125].setRotationPoint(33.5F, -10F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 162
		bodyModel[126].setRotationPoint(33.5F, -10F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 163
		bodyModel[127].setRotationPoint(33.5F, -10F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 164
		bodyModel[128].setRotationPoint(33.5F, -13F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 165
		bodyModel[129].setRotationPoint(33.5F, -13F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 166
		bodyModel[130].setRotationPoint(33.5F, -13F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 167
		bodyModel[131].setRotationPoint(33.5F, -16F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 168
		bodyModel[132].setRotationPoint(33.5F, -16F, 6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[133].setRotationPoint(33.5F, -16F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 170
		bodyModel[134].setRotationPoint(33.5F, -19F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 171
		bodyModel[135].setRotationPoint(33.5F, -19F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F); // Box 172
		bodyModel[136].setRotationPoint(33.5F, -19F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 174
		bodyModel[137].setRotationPoint(-34.5F, -4F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 175
		bodyModel[138].setRotationPoint(-34.5F, -4F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 176
		bodyModel[139].setRotationPoint(-34.5F, -4F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 177
		bodyModel[140].setRotationPoint(-34.5F, -7F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 178
		bodyModel[141].setRotationPoint(-34.5F, -7F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 179
		bodyModel[142].setRotationPoint(-34.5F, -7F, 6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 180
		bodyModel[143].setRotationPoint(-34.5F, -10F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 181
		bodyModel[144].setRotationPoint(-34.5F, -10F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 182
		bodyModel[145].setRotationPoint(-34.5F, -10F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 183
		bodyModel[146].setRotationPoint(-34.5F, -13F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 184
		bodyModel[147].setRotationPoint(-34.5F, -13F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 185
		bodyModel[148].setRotationPoint(-34.5F, -13F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 186
		bodyModel[149].setRotationPoint(-34.5F, -16F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 187
		bodyModel[150].setRotationPoint(-34.5F, -16F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 188
		bodyModel[151].setRotationPoint(-34.5F, -16F, 6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 189
		bodyModel[152].setRotationPoint(-34.5F, -19F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F); // Box 190
		bodyModel[153].setRotationPoint(-34.5F, -19F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 191
		bodyModel[154].setRotationPoint(-34.5F, -19F, 6F);
	}
	Model70TonTruck2 truck = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 155; i++)
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		if(entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor()==18900){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Black.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/70Ton_Greyish.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslated(-1.435,0.0,-0.0);
		truck.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(2.87,-0.0,0.00);
		truck.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}