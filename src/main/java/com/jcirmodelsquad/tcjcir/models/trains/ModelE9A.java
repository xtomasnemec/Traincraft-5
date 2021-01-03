//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.06.2020 - 11:10:51
// Last changed on: 22.06.2020 - 11:10:51

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergA1A;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergB;
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

public class ModelE9A extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelE9A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[327];
		bodyModel[0] = new ModelRendererTurbo(this, 215, 143, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 153, 155, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 398, 157, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 250, 104, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 250, 73, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 205, 78, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 205, 109, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 190, 145, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 165, 145, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 156, 149, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 223, 167, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 337, 46, textureX, textureY); // Box 1
		bodyModel[12] = new ModelRendererTurbo(this, 367, 26, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 311, 34, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 322, 38, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 333, 11, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 118, 23, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 118, 15, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 118, 9, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 118, 29, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 118, 4, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 118, 34, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 118, 1, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 356, 14, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 395, 5, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 378, 22, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 359, 16, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 373, 16, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 71, 17, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 86, 19, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 93, 18, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 60, 19, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 55, 18, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 73, 90, textureX, textureY); // Box 1
		bodyModel[37] = new ModelRendererTurbo(this, 64, 91, textureX, textureY); // Box 1
		bodyModel[38] = new ModelRendererTurbo(this, 54, 86, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 47, 85, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 92, 86, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 66, 52, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 82, 52, textureX, textureY); // Box 1
		bodyModel[44] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 1
		bodyModel[45] = new ModelRendererTurbo(this, 82, 55, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 67, 66, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 85, 66, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 67, 69, textureX, textureY); // Box 1
		bodyModel[49] = new ModelRendererTurbo(this, 85, 69, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 52, 66, textureX, textureY); // Box 105
		bodyModel[51] = new ModelRendererTurbo(this, 73, 54, textureX, textureY); // Box 106
		bodyModel[52] = new ModelRendererTurbo(this, 84, 66, textureX, textureY); // Box 107
		bodyModel[53] = new ModelRendererTurbo(this, 105, 71, textureX, textureY); // Box 108
		bodyModel[54] = new ModelRendererTurbo(this, 33, 71, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 53, 57, textureX, textureY); // Box 110
		bodyModel[56] = new ModelRendererTurbo(this, 83, 57, textureX, textureY); // Box 111
		bodyModel[57] = new ModelRendererTurbo(this, 73, 67, textureX, textureY); // Box 112
		bodyModel[58] = new ModelRendererTurbo(this, 102, 48, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 73, 42, textureX, textureY); // Box 117
		bodyModel[60] = new ModelRendererTurbo(this, 66, 35, textureX, textureY); // Box 118
		bodyModel[61] = new ModelRendererTurbo(this, 85, 35, textureX, textureY); // Box 119
		bodyModel[62] = new ModelRendererTurbo(this, 104, 43, textureX, textureY); // Box 120
		bodyModel[63] = new ModelRendererTurbo(this, 43, 35, textureX, textureY); // Box 125
		bodyModel[64] = new ModelRendererTurbo(this, 38, 48, textureX, textureY); // Box 127
		bodyModel[65] = new ModelRendererTurbo(this, 40, 43, textureX, textureY); // Box 128
		bodyModel[66] = new ModelRendererTurbo(this, 112, 31, textureX, textureY); // Box 129
		bodyModel[67] = new ModelRendererTurbo(this, 111, 34, textureX, textureY); // Box 130
		bodyModel[68] = new ModelRendererTurbo(this, 41, 34, textureX, textureY); // Box 131
		bodyModel[69] = new ModelRendererTurbo(this, 91, 48, textureX, textureY); // Box 135
		bodyModel[70] = new ModelRendererTurbo(this, 82, 43, textureX, textureY); // Box 136
		bodyModel[71] = new ModelRendererTurbo(this, 60, 43, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 68, 28, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 52, 28, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 84, 28, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 144
		bodyModel[78] = new ModelRendererTurbo(this, 100, 28, textureX, textureY); // Box 145
		bodyModel[79] = new ModelRendererTurbo(this, 105, 27, textureX, textureY); // Box 146
		bodyModel[80] = new ModelRendererTurbo(this, 103, 85, textureX, textureY); // Box 147
		bodyModel[81] = new ModelRendererTurbo(this, 13, 130, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 2, 133, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 1, 133, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 21, 141, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 3, 127, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 3, 141, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 236, 83, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 223, 71, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 214, 71, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 204, 71, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 228, 73, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 236, 72, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 236, 69, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 236, 114, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 223, 102, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 214, 102, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 204, 102, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 228, 104, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 236, 103, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 236, 100, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 16, 104, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 16, 100, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 16, 96, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 16, 92, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 283, 34, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 298, 34, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 283, 28, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 283, 22, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 298, 22, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 282, 181, textureX, textureY); // Box 42
		bodyModel[117] = new ModelRendererTurbo(this, 290, 206, textureX, textureY); // Box 44
		bodyModel[118] = new ModelRendererTurbo(this, 339, 181, textureX, textureY); // Box 324
		bodyModel[119] = new ModelRendererTurbo(this, 289, 175, textureX, textureY); // Box 325
		bodyModel[120] = new ModelRendererTurbo(this, 287, 212, textureX, textureY); // Box 123
		bodyModel[121] = new ModelRendererTurbo(this, 278, 212, textureX, textureY); // Box 254
		bodyModel[122] = new ModelRendererTurbo(this, 287, 216, textureX, textureY); // Box 255
		bodyModel[123] = new ModelRendererTurbo(this, 278, 216, textureX, textureY); // Box 136
		bodyModel[124] = new ModelRendererTurbo(this, 334, 216, textureX, textureY); // Box 137
		bodyModel[125] = new ModelRendererTurbo(this, 334, 212, textureX, textureY); // Box 138
		bodyModel[126] = new ModelRendererTurbo(this, 104, 58, textureX, textureY); // Box 111
		bodyModel[127] = new ModelRendererTurbo(this, 38, 58, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 99, 69, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 53, 69, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 99, 67, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 53, 67, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 80, 61, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 74, 61, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 73, 82, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 247, 107, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 233, 107, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 247, 76, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 233, 76, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 237, 122, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 237, 91, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 211, 103, textureX, textureY); // Box 350
		bodyModel[142] = new ModelRendererTurbo(this, 211, 72, textureX, textureY); // Box 351
		bodyModel[143] = new ModelRendererTurbo(this, 205, 122, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 205, 91, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 84, 60, textureX, textureY, "glow"); // Box 164 lamp
		bodyModel[146] = new ModelRendererTurbo(this, 70, 60, textureX, textureY, "glow"); // Box 165 lamp
		bodyModel[147] = new ModelRendererTurbo(this, 70, 58, textureX, textureY, "glow"); // Box 166 lamp
		bodyModel[148] = new ModelRendererTurbo(this, 84, 58, textureX, textureY, "glow"); // Box 167 lamp
		bodyModel[149] = new ModelRendererTurbo(this, 72, 66, textureX, textureY, "glow"); // Box 168 lamp
		bodyModel[150] = new ModelRendererTurbo(this, 82, 66, textureX, textureY, "glow"); // Box 169 lamp
		bodyModel[151] = new ModelRendererTurbo(this, 82, 68, textureX, textureY, "glow"); // Box 170 lamp
		bodyModel[152] = new ModelRendererTurbo(this, 72, 68, textureX, textureY, "glow"); // Box 171 lamp
		bodyModel[153] = new ModelRendererTurbo(this, 49, 48, textureX, textureY); // Box 172
		bodyModel[154] = new ModelRendererTurbo(this, 153, 46, textureX, textureY); // Box 299
		bodyModel[155] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 300
		bodyModel[156] = new ModelRendererTurbo(this, 155, 55, textureX, textureY); // Box 301
		bodyModel[157] = new ModelRendererTurbo(this, 157, 43, textureX, textureY); // Box 302
		bodyModel[158] = new ModelRendererTurbo(this, 387, 110, textureX, textureY); // Box 178
		bodyModel[159] = new ModelRendererTurbo(this, 387, 79, textureX, textureY); // Box 180
		bodyModel[160] = new ModelRendererTurbo(this, 146, 40, textureX, textureY, "glow"); // Box 348 rotating lamp?
		bodyModel[161] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // Box 349
		bodyModel[162] = new ModelRendererTurbo(this, 114, 55, textureX, textureY, "glow"); // Box 184 liveryimg 2 glow
		bodyModel[163] = new ModelRendererTurbo(this, 32, 55, textureX, textureY, "glow"); // Box 185 liveryimg 2 glow
		bodyModel[164] = new ModelRendererTurbo(this, 297, 46, textureX, textureY); // Box 186
		bodyModel[165] = new ModelRendererTurbo(this, 329, 23, textureX, textureY); // Box 187
		bodyModel[166] = new ModelRendererTurbo(this, 329, 19, textureX, textureY); // Box 188
		bodyModel[167] = new ModelRendererTurbo(this, 381, 122, textureX, textureY); // Box 189
		bodyModel[168] = new ModelRendererTurbo(this, 381, 91, textureX, textureY); // Box 190
		bodyModel[169] = new ModelRendererTurbo(this, 399, 91, textureX, textureY); // Box 191
		bodyModel[170] = new ModelRendererTurbo(this, 399, 122, textureX, textureY); // Box 192
		bodyModel[171] = new ModelRendererTurbo(this, 250, 97, textureX, textureY); // Box 196
		bodyModel[172] = new ModelRendererTurbo(this, 250, 66, textureX, textureY); // Box 197
		bodyModel[173] = new ModelRendererTurbo(this, 397, 114, textureX, textureY); // Box 198
		bodyModel[174] = new ModelRendererTurbo(this, 400, 114, textureX, textureY); // Box 199
		bodyModel[175] = new ModelRendererTurbo(this, 400, 83, textureX, textureY); // Box 200
		bodyModel[176] = new ModelRendererTurbo(this, 397, 83, textureX, textureY); // Box 201
		bodyModel[177] = new ModelRendererTurbo(this, 336, 17, textureX, textureY); // Box 202
		bodyModel[178] = new ModelRendererTurbo(this, 335, 25, textureX, textureY); // Box 203
		bodyModel[179] = new ModelRendererTurbo(this, 390, 26, textureX, textureY); // Box 314
		bodyModel[180] = new ModelRendererTurbo(this, 390, 13, textureX, textureY); // Box 315
		bodyModel[181] = new ModelRendererTurbo(this, 408, 26, textureX, textureY); // Box 316
		bodyModel[182] = new ModelRendererTurbo(this, 390, 33, textureX, textureY); // Box 317
		bodyModel[183] = new ModelRendererTurbo(this, 298, 28, textureX, textureY); // Box 209
		bodyModel[184] = new ModelRendererTurbo(this, 298, 18, textureX, textureY); // Box 210
		bodyModel[185] = new ModelRendererTurbo(this, 166, 46, textureX, textureY); // Box 278
		bodyModel[186] = new ModelRendererTurbo(this, 166, 40, textureX, textureY); // Box 279
		bodyModel[187] = new ModelRendererTurbo(this, 165, 43, textureX, textureY); // Box 280
		bodyModel[188] = new ModelRendererTurbo(this, 174, 43, textureX, textureY); // Box 214
		bodyModel[189] = new ModelRendererTurbo(this, 105, 136, textureX, textureY); // Box 131
		bodyModel[190] = new ModelRendererTurbo(this, 103, 140, textureX, textureY); // Box 131
		bodyModel[191] = new ModelRendererTurbo(this, 78, 145, textureX, textureY); // Box 131
		bodyModel[192] = new ModelRendererTurbo(this, 76, 133, textureX, textureY); // Box 131
		bodyModel[193] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 131
		bodyModel[194] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 131
		bodyModel[195] = new ModelRendererTurbo(this, 83, 145, textureX, textureY); // Box 131
		bodyModel[196] = new ModelRendererTurbo(this, 71, 135, textureX, textureY); // Box 131
		bodyModel[197] = new ModelRendererTurbo(this, 85, 135, textureX, textureY); // Box 131
		bodyModel[198] = new ModelRendererTurbo(this, 91, 132, textureX, textureY); // Box 131
		bodyModel[199] = new ModelRendererTurbo(this, 76, 118, textureX, textureY); // Box 131
		bodyModel[200] = new ModelRendererTurbo(this, 87, 130, textureX, textureY); // Box 131
		bodyModel[201] = new ModelRendererTurbo(this, 329, 13, textureX, textureY); // Box 231
		bodyModel[202] = new ModelRendererTurbo(this, 323, 33, textureX, textureY, "glow"); // Box 247 lamp
		bodyModel[203] = new ModelRendererTurbo(this, 377, 44, textureX, textureY); // Box 222
		bodyModel[204] = new ModelRendererTurbo(this, 389, 44, textureX, textureY); // Box 223
		bodyModel[205] = new ModelRendererTurbo(this, 339, 174, textureX, textureY); // Box 438
		bodyModel[206] = new ModelRendererTurbo(this, 223, 174, textureX, textureY); // Box 439
		bodyModel[207] = new ModelRendererTurbo(this, 85, 86, textureX, textureY, "glow"); // Box 443 lamp
		bodyModel[208] = new ModelRendererTurbo(this, 80, 89, textureX, textureY); // Box 444
		bodyModel[209] = new ModelRendererTurbo(this, 65, 86, textureX, textureY, "glow"); // Box 445 lamp
		bodyModel[210] = new ModelRendererTurbo(this, 70, 89, textureX, textureY); // Box 446
		bodyModel[211] = new ModelRendererTurbo(this, 200, 43, textureX, textureY); // Box 447
		bodyModel[212] = new ModelRendererTurbo(this, 199, 40, textureX, textureY); // Box 448
		bodyModel[213] = new ModelRendererTurbo(this, 200, 46, textureX, textureY); // Box 449
		bodyModel[214] = new ModelRendererTurbo(this, 207, 43, textureX, textureY); // Box 450
		bodyModel[215] = new ModelRendererTurbo(this, 104, 57, textureX, textureY, "glow"); // Marker light fireman glow top
		bodyModel[216] = new ModelRendererTurbo(this, 48, 60, textureX, textureY, "glow"); // Marker light engneer glow
		bodyModel[217] = new ModelRendererTurbo(this, 104, 60, textureX, textureY, "glow"); // Marker light fireman glow
		bodyModel[218] = new ModelRendererTurbo(this, 48, 57, textureX, textureY, "glow"); // Marker light engneer glow top
		bodyModel[219] = new ModelRendererTurbo(this, 302, 34, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 303, 28, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 303, 22, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 266, 46, textureX, textureY); // Box 186
		bodyModel[223] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 324
		bodyModel[224] = new ModelRendererTurbo(this, 290, 181, textureX, textureY); // Box 324
		bodyModel[225] = new ModelRendererTurbo(this, 232, 178, textureX, textureY); // Box 324
		bodyModel[226] = new ModelRendererTurbo(this, 293, 181, textureX, textureY); // Box 324
		bodyModel[227] = new ModelRendererTurbo(this, 296, 181, textureX, textureY); // Box 324
		bodyModel[228] = new ModelRendererTurbo(this, 299, 181, textureX, textureY); // Box 324
		bodyModel[229] = new ModelRendererTurbo(this, 114, 53, textureX, textureY, "glow"); // Box 184 liveryimg 2 glow
		bodyModel[230] = new ModelRendererTurbo(this, 34, 53, textureX, textureY, "glow"); // Box 185 liveryimg 2 glow
		bodyModel[231] = new ModelRendererTurbo(this, 123, 56, textureX, textureY, "glow"); // Box 184 liveryimg 2 glow
		bodyModel[232] = new ModelRendererTurbo(this, 31, 56, textureX, textureY, "glow"); // Box 184 liveryimg 2 glow
		bodyModel[233] = new ModelRendererTurbo(this, 289, 10, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 316, 28, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 316, 22, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 153, 52, textureX, textureY); // Box 301
		bodyModel[237] = new ModelRendererTurbo(this, 153, 40, textureX, textureY); // Box 301
		bodyModel[238] = new ModelRendererTurbo(this, 183, 43, textureX, textureY); // Box 447
		bodyModel[239] = new ModelRendererTurbo(this, 182, 40, textureX, textureY); // Box 448
		bodyModel[240] = new ModelRendererTurbo(this, 183, 46, textureX, textureY); // Box 449
		bodyModel[241] = new ModelRendererTurbo(this, 144, 68, textureX, textureY); // Box 364 prime base
		bodyModel[242] = new ModelRendererTurbo(this, 144, 60, textureX, textureY, "glow"); // Box 6 PRIME1-1
		bodyModel[243] = new ModelRendererTurbo(this, 144, 64, textureX, textureY, "glow"); // Box 7 PRIME1-3
		bodyModel[244] = new ModelRendererTurbo(this, 137, 62, textureX, textureY, "glow"); // Box 8 PRIME1-2
		bodyModel[245] = new ModelRendererTurbo(this, 151, 62, textureX, textureY, "glow"); // Box 9 PRIME1-4
		bodyModel[246] = new ModelRendererTurbo(this, 348, 2, textureX, textureY); // Box 186
		bodyModel[247] = new ModelRendererTurbo(this, 325, 2, textureX, textureY); // Box 186
		bodyModel[248] = new ModelRendererTurbo(this, 351, 7, textureX, textureY); // Box 186
		bodyModel[249] = new ModelRendererTurbo(this, 348, 7, textureX, textureY); // Box 186
		bodyModel[250] = new ModelRendererTurbo(this, 328, 7, textureX, textureY); // Box 186
		bodyModel[251] = new ModelRendererTurbo(this, 325, 7, textureX, textureY); // Box 186
		bodyModel[252] = new ModelRendererTurbo(this, 302, 2, textureX, textureY); // Box 186
		bodyModel[253] = new ModelRendererTurbo(this, 279, 2, textureX, textureY); // Box 186
		bodyModel[254] = new ModelRendererTurbo(this, 305, 7, textureX, textureY); // Box 186
		bodyModel[255] = new ModelRendererTurbo(this, 302, 7, textureX, textureY); // Box 186
		bodyModel[256] = new ModelRendererTurbo(this, 282, 7, textureX, textureY); // Box 186
		bodyModel[257] = new ModelRendererTurbo(this, 279, 7, textureX, textureY); // Box 186
		bodyModel[258] = new ModelRendererTurbo(this, 138, 42, textureX, textureY); // Box 186
		bodyModel[259] = new ModelRendererTurbo(this, 393, 110, textureX, textureY); // Box 177
		bodyModel[260] = new ModelRendererTurbo(this, 393, 79, textureX, textureY); // Box 179
		bodyModel[261] = new ModelRendererTurbo(this, 390, 122, textureX, textureY); // Box 189
		bodyModel[262] = new ModelRendererTurbo(this, 390, 91, textureX, textureY); // Box 190
		bodyModel[263] = new ModelRendererTurbo(this, 251, 122, textureX, textureY); // Box 196
		bodyModel[264] = new ModelRendererTurbo(this, 250, 59, textureX, textureY); // Box 197
		bodyModel[265] = new ModelRendererTurbo(this, 270, 122, textureX, textureY); // Box 196
		bodyModel[266] = new ModelRendererTurbo(this, 269, 59, textureX, textureY); // Box 197
		bodyModel[267] = new ModelRendererTurbo(this, 285, 122, textureX, textureY); // Box 196
		bodyModel[268] = new ModelRendererTurbo(this, 284, 59, textureX, textureY); // Box 197
		bodyModel[269] = new ModelRendererTurbo(this, 290, 222, textureX, textureY); // Box 42
		bodyModel[270] = new ModelRendererTurbo(this, 257, 245, textureX, textureY); // Box 324
		bodyModel[271] = new ModelRendererTurbo(this, 222, 222, textureX, textureY); // Box 42
		bodyModel[272] = new ModelRendererTurbo(this, 195, 245, textureX, textureY); // Box 324
		bodyModel[273] = new ModelRendererTurbo(this, 117, 64, textureX, textureY); // Box 111
		bodyModel[274] = new ModelRendererTurbo(this, 31, 64, textureX, textureY); // Box 144
		bodyModel[275] = new ModelRendererTurbo(this, 112, 66, textureX, textureY); // Box 111
		bodyModel[276] = new ModelRendererTurbo(this, 38, 66, textureX, textureY); // Box 144
		bodyModel[277] = new ModelRendererTurbo(this, 107, 66, textureX, textureY, "glow"); // Marker light fireman glow number b
		bodyModel[278] = new ModelRendererTurbo(this, 45, 66, textureX, textureY, "glow"); // Marker light engneer glow number b
		bodyModel[279] = new ModelRendererTurbo(this, 33, 68, textureX, textureY, "glow"); // Box 144 liveryimg 2 glow
		bodyModel[280] = new ModelRendererTurbo(this, 119, 68, textureX, textureY, "glow"); // Box 111 liveryimg 2 glow
		bodyModel[281] = new ModelRendererTurbo(this, 257, 222, textureX, textureY); // Box 324
		bodyModel[282] = new ModelRendererTurbo(this, 195, 222, textureX, textureY); // Box 324
		bodyModel[283] = new ModelRendererTurbo(this, 331, 232, textureX, textureY); // Box 44
		bodyModel[284] = new ModelRendererTurbo(this, 331, 245, textureX, textureY); // Box 325
		bodyModel[285] = new ModelRendererTurbo(this, 192, 228, textureX, textureY); // Box 44
		bodyModel[286] = new ModelRendererTurbo(this, 192, 251, textureX, textureY); // Box 325
		bodyModel[287] = new ModelRendererTurbo(this, 331, 237, textureX, textureY); // Box 44
		bodyModel[288] = new ModelRendererTurbo(this, 331, 250, textureX, textureY); // Box 325
		bodyModel[289] = new ModelRendererTurbo(this, 192, 233, textureX, textureY); // Box 44
		bodyModel[290] = new ModelRendererTurbo(this, 192, 256, textureX, textureY); // Box 325
		bodyModel[291] = new ModelRendererTurbo(this, 259, 44, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 250, 44, textureX, textureY); // Box 0
		bodyModel[293] = new ModelRendererTurbo(this, 241, 44, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 232, 44, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 259, 40, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 250, 40, textureX, textureY); // Box 0
		bodyModel[297] = new ModelRendererTurbo(this, 241, 40, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 232, 40, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 299, 60, textureX, textureY); // Box 186
		bodyModel[300] = new ModelRendererTurbo(this, 299, 55, textureX, textureY); // Box 186
		bodyModel[301] = new ModelRendererTurbo(this, 170, 60, textureX, textureY); // Box 114
		bodyModel[302] = new ModelRendererTurbo(this, 170, 57, textureX, textureY); // Box 74
		bodyModel[303] = new ModelRendererTurbo(this, 170, 63, textureX, textureY); // Box 78
		bodyModel[304] = new ModelRendererTurbo(this, 177, 56, textureX, textureY); // Box 875
		bodyModel[305] = new ModelRendererTurbo(this, 165, 56, textureX, textureY); // Box 876
		bodyModel[306] = new ModelRendererTurbo(this, 168, 52, textureX, textureY); // Box 877
		bodyModel[307] = new ModelRendererTurbo(this, 133, 53, textureX, textureY); // Box 114
		bodyModel[308] = new ModelRendererTurbo(this, 133, 50, textureX, textureY); // Box 74
		bodyModel[309] = new ModelRendererTurbo(this, 133, 56, textureX, textureY); // Box 78
		bodyModel[310] = new ModelRendererTurbo(this, 137, 46, textureX, textureY); // Box 875
		bodyModel[311] = new ModelRendererTurbo(this, 127, 46, textureX, textureY); // Box 876
		bodyModel[312] = new ModelRendererTurbo(this, 131, 45, textureX, textureY); // Box 877
		bodyModel[313] = new ModelRendererTurbo(this, 141, 53, textureX, textureY); // Box 186
		bodyModel[314] = new ModelRendererTurbo(this, 138, 53, textureX, textureY); // Box 186
		bodyModel[315] = new ModelRendererTurbo(this, 152, 55, textureX, textureY); // Box 186
		bodyModel[316] = new ModelRendererTurbo(this, 149, 53, textureX, textureY); // Box 186
		bodyModel[317] = new ModelRendererTurbo(this, 138, 48, textureX, textureY); // Box 186
		bodyModel[318] = new ModelRendererTurbo(this, 144, 54, textureX, textureY); // Box 349
		bodyModel[319] = new ModelRendererTurbo(this, 387, 99, textureX, textureY); // Box 177
		bodyModel[320] = new ModelRendererTurbo(this, 387, 68, textureX, textureY); // Box 179
		bodyModel[321] = new ModelRendererTurbo(this, 390, 110, textureX, textureY); // Box 177
		bodyModel[322] = new ModelRendererTurbo(this, 390, 79, textureX, textureY); // Box 179
		bodyModel[323] = new ModelRendererTurbo(this, 371, 3, textureX, textureY); // Box 187
		bodyModel[324] = new ModelRendererTurbo(this, 371, 7, textureX, textureY); // Box 188
		bodyModel[325] = new ModelRendererTurbo(this, 371, 3, textureX, textureY); // Box 187
		bodyModel[326] = new ModelRendererTurbo(this, 371, 7, textureX, textureY); // Box 188

		bodyModel[0].addBox(0F, 0F, 0F, 81, 1, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -2F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 1
		bodyModel[1].setRotationPoint(-47F, 2F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1
		bodyModel[2].setRotationPoint(48F, 2F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 67, 16, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-19F, -15F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 67, 16, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(-19F, -15F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-33.5F, -10F, 10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-33.5F, -10F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F, 0.8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -1F, 0.8F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -0.95F); // Box 0
		bodyModel[7].setRotationPoint(-36F, -2F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		bodyModel[8].setRotationPoint(-40.8F, -2F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 0
		bodyModel[9].setRotationPoint(-41.8F, -2F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 89, 2, 4, 0F); // Box 0
		bodyModel[10].setRotationPoint(-42F, -1F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 1
		bodyModel[11].setRotationPoint(47F, 1F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 1
		bodyModel[12].setRotationPoint(47F, -1F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[13].setRotationPoint(47F, 1F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[14].setRotationPoint(47F, 1F, 2F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[15].setRotationPoint(47F, -15F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-28F, -19F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 76, 1, 6, 0F); // Box 0
		bodyModel[17].setRotationPoint(-28F, -19F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 76, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-28F, -19F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 76, 1, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-28F, -18F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 76, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-28F, -18F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-28F, -16F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-28F, -16F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[23].setRotationPoint(47F, -17F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[24].setRotationPoint(47F, -18F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(47F, -17F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(47F, -17F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(47F, -18F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(47F, -18F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-31.5F, -18F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-29F, -19F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(-29F, -19F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-29F, -18F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-29F, -19F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-29F, -18F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(-29F, -16F, 10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[36].setRotationPoint(-44F, 1F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -0.5F, -2.5F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F); // Box 1
		bodyModel[37].setRotationPoint(-44F, 1F, 2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, -0.5F, 0F, 3.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 0
		bodyModel[38].setRotationPoint(-42F, 1F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-37F, 1F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, -0.5F, 0F, -3.5F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 3.5F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 0
		bodyModel[40].setRotationPoint(-42F, 1F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, -2.5F, 0F, 0.5F, 1.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1
		bodyModel[41].setRotationPoint(-44F, 1F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[42].setRotationPoint(-43F, -13F, 0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 1
		bodyModel[43].setRotationPoint(-43F, -13F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 1
		bodyModel[44].setRotationPoint(-43F, -11F, 0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[45].setRotationPoint(-43F, -11F, -1.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[46].setRotationPoint(-43.5F, -8F, 0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 1
		bodyModel[47].setRotationPoint(-43.5F, -8F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 1
		bodyModel[48].setRotationPoint(-43.5F, -6F, 0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[49].setRotationPoint(-43.5F, -6F, -1.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 105
		bodyModel[50].setRotationPoint(-43.5F, -9F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[51].setRotationPoint(-42.5F, -11F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 10, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[52].setRotationPoint(-43.5F, -9F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[53].setRotationPoint(-39.5F, -9F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 109
		bodyModel[54].setRotationPoint(-39.5F, -9F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 110
		bodyModel[55].setRotationPoint(-42.5F, -11F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[56].setRotationPoint(-42.5F, -11F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[57].setRotationPoint(-43.5F, -9F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0.31F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 114
		bodyModel[58].setRotationPoint(-38.5F, -11F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[59].setRotationPoint(-41.5F, -13F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 118
		bodyModel[60].setRotationPoint(-38.5F, -13F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[61].setRotationPoint(-38.5F, -11F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[62].setRotationPoint(-33.5F, -11F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[63].setRotationPoint(-38.5F, -11F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0.31F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F); // Box 127
		bodyModel[64].setRotationPoint(-38.5F, -11F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0.31F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[65].setRotationPoint(-33.5F, -11F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[66].setRotationPoint(-29F, -16F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[67].setRotationPoint(-31.5F, -15F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[68].setRotationPoint(-31.5F, -15F, 10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -3F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[69].setRotationPoint(-41.5F, -13F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[70].setRotationPoint(-39.5F, -13F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 138
		bodyModel[71].setRotationPoint(-39.5F, -13F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 139
		bodyModel[72].setRotationPoint(-31.5F, -18F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F); // Box 140
		bodyModel[73].setRotationPoint(-31.5F, -18F, 3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -0.6F, 0F, -2.5F, -0.65F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F); // Box 141
		bodyModel[74].setRotationPoint(-31.5F, -17F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -2.5F, 0.35F, 0F, 2.5F, 0.35F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, -0.4F, 0F, -0.05F, -0.4F, 0F, 0F, 0.6F, 0F, -0.2F, 0.6F, 0F); // Box 142
		bodyModel[75].setRotationPoint(-31.5F, -16F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[76].setRotationPoint(-31.5F, -18F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, -2.5F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 144
		bodyModel[77].setRotationPoint(-31.5F, -18F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -2.5F, -0.65F, 0F, 2.5F, -0.6F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 145
		bodyModel[78].setRotationPoint(-31.5F, -17F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, -2.5F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, 0.35F, 0F, -2.5F, 0.35F, 0F, -0.2F, 0.6F, 0F, 0F, 0.6F, 0F, -0.05F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 146
		bodyModel[79].setRotationPoint(-31.5F, -16F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 147
		bodyModel[80].setRotationPoint(-37F, 1F, -9F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 0
		bodyModel[81].setRotationPoint(-14F, -15F, -10F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 0
		bodyModel[82].setRotationPoint(-14F, -17F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 0
		bodyModel[83].setRotationPoint(-14F, -18F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-14F, -17F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(-14F, -17F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(-14F, -18F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[87].setRotationPoint(-14F, -18F, 3F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[88].setRotationPoint(-23F, -5F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[89].setRotationPoint(-24.5F, -15F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(-28F, -15F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-30.5F, -15F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-23.5F, -15F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[93].setRotationPoint(-23F, -14F, 10F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[94].setRotationPoint(-23F, -15F, 10F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 0
		bodyModel[95].setRotationPoint(-23F, -5F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 0
		bodyModel[96].setRotationPoint(-24.5F, -15F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(-28F, -15F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-30.5F, -15F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[99].setRotationPoint(-23.5F, -15F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-23F, -14F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 0
		bodyModel[101].setRotationPoint(-23F, -15F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Box 0
		bodyModel[102].setRotationPoint(-31.5F, -10F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 0
		bodyModel[103].setRotationPoint(-31.5F, -11F, -6F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		bodyModel[104].setRotationPoint(-31.5F, -12F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(-31.5F, -12F, 2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(-31.5F, -12F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-31.5F, -11F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(-31.5F, -11F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.83F, 0F, 0F, -0.83F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(-31.5F, -11F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[110].setRotationPoint(-31.5F, -11F, 6F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[111].setRotationPoint(-12.5F, -20F, -2F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[112].setRotationPoint(0.5F, -20F, -1F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[113].setRotationPoint(-8.25F, -20F, -2F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[114].setRotationPoint(-4F, -20F, -2F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 0
		bodyModel[115].setRotationPoint(13.5F, -20F, -1F);

		bodyModel[116].addBox(0F, 0F, 0F, 18, 4, 20, 0F); // Box 42
		bodyModel[116].setRotationPoint(-4F, 0F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[117].setRotationPoint(-4F, 4F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 18, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[118].setRotationPoint(-4F, 4F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 18, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[119].setRotationPoint(-4F, 4F, 8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[120].setRotationPoint(-6F, 1F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 254
		bodyModel[121].setRotationPoint(-9F, 1F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[122].setRotationPoint(-6F, 1F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[123].setRotationPoint(-9F, 1F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[124].setRotationPoint(16F, 1F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 138
		bodyModel[125].setRotationPoint(16F, 1F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 111
		bodyModel[126].setRotationPoint(-40F, -9F, -9F);
		bodyModel[126].rotateAngleY = 0.4712389F;

		bodyModel[127].addBox(0F, 0F, -5F, 2, 2, 5, 0F); // Box 144
		bodyModel[127].setRotationPoint(-40F, -9F, 9F);
		bodyModel[127].rotateAngleY = -0.4712389F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 145
		bodyModel[128].setRotationPoint(-44F, -1F, -4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		bodyModel[129].setRotationPoint(-44F, -1F, 4F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 147
		bodyModel[130].setRotationPoint(-44F, -2F, -4F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 148
		bodyModel[131].setRotationPoint(-44F, -2F, 4F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 149
		bodyModel[132].setRotationPoint(-43F, -8F, -3F);
		bodyModel[132].rotateAngleZ = -0.10471976F;

		bodyModel[133].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 150
		bodyModel[133].setRotationPoint(-43F, -8F, 3F);
		bodyModel[133].rotateAngleZ = -0.10471976F;

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 151
		bodyModel[134].setRotationPoint(-44F, 0F, -2F);

		bodyModel[135].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 152
		bodyModel[135].setRotationPoint(-18.5F, -13F, -11.75F);

		bodyModel[136].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 153
		bodyModel[136].setRotationPoint(-23.5F, -13F, -11.75F);

		bodyModel[137].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 154
		bodyModel[137].setRotationPoint(-23.5F, -13F, 10.75F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 13, 1, 0F); // Box 155
		bodyModel[138].setRotationPoint(-18.5F, -13F, 10.75F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 156
		bodyModel[139].setRotationPoint(-23F, 1F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 157
		bodyModel[140].setRotationPoint(-23F, 1F, 11F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[141].setRotationPoint(-28F, -15F, -12F);

		bodyModel[142].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[142].setRotationPoint(-28F, -15F, 11F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 160
		bodyModel[143].setRotationPoint(-33.5F, 1F, -11F);

		bodyModel[144].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 161
		bodyModel[144].setRotationPoint(-33.5F, 1F, 11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 164 lamp
		bodyModel[145].setRotationPoint(-43.01F, -11F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 165 lamp
		bodyModel[146].setRotationPoint(-43.01F, -11F, 0.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166 lamp
		bodyModel[147].setRotationPoint(-43.01F, -13F, 0.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 167 lamp
		bodyModel[148].setRotationPoint(-43.01F, -13F, -1.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 168 lamp
		bodyModel[149].setRotationPoint(-43.51F, -8F, 0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 169 lamp
		bodyModel[150].setRotationPoint(-43.51F, -8F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 170 lamp
		bodyModel[151].setRotationPoint(-43.51F, -6F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 171 lamp
		bodyModel[152].setRotationPoint(-43.51F, -6F, 0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 172
		bodyModel[153].setRotationPoint(-41.5F, -13F, 2F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[154].setRotationPoint(-24.5F, -20F, -5.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[155].setRotationPoint(-24.5F, -19F, -5.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 301
		bodyModel[156].setRotationPoint(-23.5F, -20F, 4.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[157].setRotationPoint(-22.5F, -19F, 4F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 178
		bodyModel[158].setRotationPoint(4.5F, -10F, -11.75F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 180
		bodyModel[159].setRotationPoint(4.5F, -10F, 10.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 rotating lamp?
		bodyModel[160].setRotationPoint(-23.5F, -20.5F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 349
		bodyModel[161].setRotationPoint(-23.32F, -20F, -0.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 184 liveryimg 2 glow
		bodyModel[162].setRotationPoint(-40.01F, -9F, -9F);
		bodyModel[162].rotateAngleY = 0.4712389F;

		bodyModel[163].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 185 liveryimg 2 glow
		bodyModel[163].setRotationPoint(-40.01F, -9F, 9F);
		bodyModel[163].rotateAngleY = -0.4712389F;

		bodyModel[164].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[164].setRotationPoint(-17.4F, -21F, -3F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[165].setRotationPoint(36.5F, -20F, -3F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[166].setRotationPoint(42.5F, -20F, -2F);

		bodyModel[167].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[167].setRotationPoint(5F, 1F, -11.01F);

		bodyModel[168].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[168].setRotationPoint(5F, 1F, 11.01F);

		bodyModel[169].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 191
		bodyModel[169].setRotationPoint(44.5F, 1F, 11F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 5, 0, 0F); // Box 192
		bodyModel[170].setRotationPoint(44.5F, 1F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 65, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[171].setRotationPoint(-17.5F, -14F, -11.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 65, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[172].setRotationPoint(-17.5F, -14F, 10.25F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 198
		bodyModel[173].setRotationPoint(47.5F, -6F, -11.75F);

		bodyModel[174].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 199
		bodyModel[174].setRotationPoint(44.5F, -6F, -11.75F);

		bodyModel[175].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 200
		bodyModel[175].setRotationPoint(47.5F, -6F, 10.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 201
		bodyModel[176].setRotationPoint(44.5F, -6F, 10.75F);

		bodyModel[177].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 202
		bodyModel[177].setRotationPoint(48F, -19F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[178].setRotationPoint(48F, -19F, -7F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 314
		bodyModel[179].setRotationPoint(48F, -15F, -5F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 315
		bodyModel[180].setRotationPoint(48F, -17F, -5F);

		bodyModel[181].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 316
		bodyModel[181].setRotationPoint(48F, -15F, 4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[182].setRotationPoint(48F, 0F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[183].setRotationPoint(0.5F, -21F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[184].setRotationPoint(13.5F, -21F, -1F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 278
		bodyModel[185].setRotationPoint(-23.5F, -20.5F, 1F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 279
		bodyModel[186].setRotationPoint(-23.5F, -20.5F, 3F);

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[187].setRotationPoint(-24.5F, -20.5F, 2F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 214
		bodyModel[188].setRotationPoint(-23F, -19.5F, 2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[189].setRotationPoint(-29.5F, -9F, 3.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[190].setRotationPoint(-30F, -7F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[191].setRotationPoint(-27.5F, -9.5F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[192].setRotationPoint(-28.5F, -9.5F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[193].setRotationPoint(-29.5F, -9.5F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[194].setRotationPoint(-27.5F, -9.5F, -5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[195].setRotationPoint(-27.5F, -9.5F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[196].setRotationPoint(-29.5F, -9.5F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[197].setRotationPoint(-29.5F, -9.5F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[198].setRotationPoint(-30.5F, -10.3F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[199].setRotationPoint(-29F, -11.5F, -4.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[200].setRotationPoint(-31F, -11.5F, -3.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 231
		bodyModel[201].setRotationPoint(48F, -19F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[202].setRotationPoint(47.5F, -10.5F, -9F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 222
		bodyModel[203].setRotationPoint(48.01F, 0F, -10F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Box 223
		bodyModel[204].setRotationPoint(48.01F, 0F, 5F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 438
		bodyModel[205].setRotationPoint(30F, 1F, -2F);

		bodyModel[206].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 439
		bodyModel[206].setRotationPoint(-23.5F, 1F, -2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 443 lamp
		bodyModel[207].setRotationPoint(-42.75F, -1.25F, -6.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 444
		bodyModel[208].setRotationPoint(-42F, -1.25F, -6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 445 lamp
		bodyModel[209].setRotationPoint(-42.75F, -1.25F, 4.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 446
		bodyModel[210].setRotationPoint(-42F, -1.25F, 4.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 447
		bodyModel[211].setRotationPoint(-9.5F, -23F, -0.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 448
		bodyModel[212].setRotationPoint(-11.5F, -23F, -1.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 449
		bodyModel[213].setRotationPoint(-10.5F, -23F, 0.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 450
		bodyModel[214].setRotationPoint(-9.5F, -22F, -0.5F);

		bodyModel[215].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Marker light fireman glow top
		bodyModel[215].setRotationPoint(-40.1F, -10.4F, -5.89F);
		bodyModel[215].rotateAngleY = 0.4712389F;
		bodyModel[215].rotateAngleZ = -0.41887902F;

		bodyModel[216].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.6F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F); // Marker light engneer glow
		bodyModel[216].setRotationPoint(-40.3F, -10.5F, 6F);
		bodyModel[216].rotateAngleY = -0.48869219F;
		bodyModel[216].rotateAngleZ = -0.41887902F;

		bodyModel[217].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.6F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F); // Marker light fireman glow
		bodyModel[217].setRotationPoint(-40.3F, -10.5F, -6F);
		bodyModel[217].rotateAngleY = 0.4712389F;
		bodyModel[217].rotateAngleZ = -0.41887902F;

		bodyModel[218].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Marker light engneer glow top
		bodyModel[218].setRotationPoint(-40.1F, -10.4F, 5.89F);
		bodyModel[218].rotateAngleY = -0.48869219F;
		bodyModel[218].rotateAngleZ = -0.41887902F;

		bodyModel[219].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[219].setRotationPoint(15.25F, -20F, -2F);

		bodyModel[220].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[220].setRotationPoint(19.5F, -20F, -2F);

		bodyModel[221].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 0
		bodyModel[221].setRotationPoint(23.75F, -20F, -2F);

		bodyModel[222].addBox(0F, 0F, 0F, 9, 2, 6, 0F); // Box 186
		bodyModel[222].setRotationPoint(23.6F, -21F, -3F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[223].setRotationPoint(-7F, 4F, -8F);
		bodyModel[223].rotateAngleZ = 0.78539816F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[224].setRotationPoint(15.42F, -1F, -8.01F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[225].setRotationPoint(14.5F, 4F, -8F);
		bodyModel[225].rotateAngleZ = 0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[226].setRotationPoint(15.42F, -1F, 8.01F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[227].setRotationPoint(-6.1F, -1F, -8.01F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 6, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[228].setRotationPoint(-6.1F, -1F, 8.01F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 liveryimg 2 glow
		bodyModel[229].setRotationPoint(-39.51F, -9F, -8F);
		bodyModel[229].rotateAngleY = 0.46251225F;
		bodyModel[229].rotateAngleZ = -0.08726646F;

		bodyModel[230].addShapeBox(0F, 0F, -5F, 0, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.075F, 0F, 0F, -0.075F); // Box 185 liveryimg 2 glow
		bodyModel[230].setRotationPoint(-39.07F, -9F, 8.89F);
		bodyModel[230].rotateAngleY = -0.46251225F;
		bodyModel[230].rotateAngleZ = -0.08726646F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, 0.175F); // Box 184 liveryimg 2 glow
		bodyModel[231].setRotationPoint(-38.61F, -9F, -8.45F);
		bodyModel[231].rotateAngleY = 1.11701072F;
		bodyModel[231].rotateAngleZ = -0.04363323F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, 0.175F); // Box 184 liveryimg 2 glow
		bodyModel[232].setRotationPoint(-38.62F, -9F, 8.45F);
		bodyModel[232].rotateAngleY = 2.04203522F;
		bodyModel[232].rotateAngleZ = 0.05235988F;

		bodyModel[233].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 0
		bodyModel[233].setRotationPoint(4.5F, -20F, -3F);

		bodyModel[234].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 0
		bodyModel[234].setRotationPoint(-0.5F, -21F, -1F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 0
		bodyModel[235].setRotationPoint(12.5F, -21F, -1F);

		bodyModel[236].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[236].setRotationPoint(-24.5F, -20F, 3.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[237].setRotationPoint(-24.5F, -20F, 4F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 447
		bodyModel[238].setRotationPoint(-23F, -20.5F, 2F);

		bodyModel[239].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 448
		bodyModel[239].setRotationPoint(-25F, -20.5F, 1F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 449
		bodyModel[240].setRotationPoint(-24F, -20.5F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[241].setRotationPoint(-27F, -20F, -1F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[242].setRotationPoint(-27F, -20.5F, -1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[243].setRotationPoint(-27F, -20.5F, -1F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[244].setRotationPoint(-27F, -20.5F, -1F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[245].setRotationPoint(-27F, -20.5F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186
		bodyModel[246].setRotationPoint(19.6F, -19.65F, -5.5F);
		bodyModel[246].rotateAngleX = 0.78539816F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186
		bodyModel[247].setRotationPoint(19.6F, -19.65F, 2.67F);
		bodyModel[247].rotateAngleX = 0.78539816F;

		bodyModel[248].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[248].setRotationPoint(20.6F, -19.65F, -5.15F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[249].setRotationPoint(26.6F, -19.65F, -5.15F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[250].setRotationPoint(20.6F, -19.65F, 5.15F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[251].setRotationPoint(26.6F, -19.65F, 5.15F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186
		bodyModel[252].setRotationPoint(-13.4F, -19.65F, -5.5F);
		bodyModel[252].rotateAngleX = 0.78539816F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186
		bodyModel[253].setRotationPoint(-13.4F, -19.65F, 2.67F);
		bodyModel[253].rotateAngleX = 0.78539816F;

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[254].setRotationPoint(-12.4F, -19.65F, -5.15F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[255].setRotationPoint(-6.4F, -19.65F, -5.15F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[256].setRotationPoint(-12.4F, -19.65F, 5.15F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[257].setRotationPoint(-6.4F, -19.65F, 5.15F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 186
		bodyModel[258].setRotationPoint(-25.4F, -21F, -1.5F);

		bodyModel[259].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[259].setRotationPoint(15.5F, -10F, -11.75F);

		bodyModel[260].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[260].setRotationPoint(15.5F, -10F, 10.75F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 189
		bodyModel[261].setRotationPoint(11F, 1F, -11.01F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 5, 0, 0F); // Box 190
		bodyModel[262].setRotationPoint(11F, 1F, 11.01F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[263].setRotationPoint(-14.5F, -14F, -11.1F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[264].setRotationPoint(-14.5F, -14F, 10.1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[265].setRotationPoint(5F, -14F, -11.1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[266].setRotationPoint(5F, -14F, 10.1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[267].setRotationPoint(34F, -14F, -11.1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[268].setRotationPoint(34F, -14F, 10.1F);

		bodyModel[269].addBox(0F, 0F, 0F, 10, 2, 20, 0F); // Box 42
		bodyModel[269].setRotationPoint(-4F, 3F, -10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[270].setRotationPoint(-4F, 5F, -8F);

		bodyModel[271].addBox(0F, 0F, 0F, 7, 2, 20, 0F); // Box 42
		bodyModel[271].setRotationPoint(7F, 3F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[272].setRotationPoint(7F, 5F, -8F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 111
		bodyModel[273].setRotationPoint(-35.5F, -8F, -11F);

		bodyModel[274].addBox(0F, 0F, -5F, 2, 1, 2, 0F); // Box 144
		bodyModel[274].setRotationPoint(-35.5F, -8F, 14F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[275].setRotationPoint(-36.5F, -8F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
		bodyModel[276].setRotationPoint(-36.5F, -8F, 9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Marker light fireman glow number b
		bodyModel[277].setRotationPoint(-36F, -8F, -11F);
		bodyModel[277].rotateAngleY = 0.78539816F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Marker light engneer glow number b
		bodyModel[278].setRotationPoint(-36F, -8F, 9.7F);
		bodyModel[278].rotateAngleY = 0.78539816F;

		bodyModel[279].addBox(0F, 0F, -5F, 2, 1, 0, 0F); // Box 144 liveryimg 2 glow
		bodyModel[279].setRotationPoint(-35.5F, -8F, 16.01F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 111 liveryimg 2 glow
		bodyModel[280].setRotationPoint(-35.5F, -8F, -11.01F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[281].setRotationPoint(-4F, 0F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 7, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[282].setRotationPoint(7F, 0F, -8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[283].setRotationPoint(-4F, 1F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[284].setRotationPoint(-4F, 1F, 8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[285].setRotationPoint(7F, 1F, -10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[286].setRotationPoint(7F, 1F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[287].setRotationPoint(-4F, 5F, -10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 325
		bodyModel[288].setRotationPoint(-4F, 5F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[289].setRotationPoint(7F, 5F, -10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 325
		bodyModel[290].setRotationPoint(7F, 5F, 8F);

		bodyModel[291].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[291].setRotationPoint(27.5F, -20F, -1F);

		bodyModel[292].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[292].setRotationPoint(24.5F, -20F, -1F);

		bodyModel[293].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[293].setRotationPoint(20.5F, -20F, -1F);

		bodyModel[294].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[294].setRotationPoint(17.5F, -20F, -1F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[295].setRotationPoint(-3.5F, -20F, -1F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[296].setRotationPoint(-6.5F, -20F, -1F);

		bodyModel[297].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[297].setRotationPoint(-10.5F, -20F, -1F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[298].setRotationPoint(-13.5F, -20F, -1F);

		bodyModel[299].addBox(0F, 0F, 0F, 66, 4, 0, 0F); // Box 186
		bodyModel[299].setRotationPoint(-20.4F, -22F, 5.5F);

		bodyModel[300].addBox(0F, 0F, 0F, 66, 4, 0, 0F); // Box 186
		bodyModel[300].setRotationPoint(-20.4F, -22F, -5.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[301].setRotationPoint(-37.5F, -14.75F, -0.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[302].setRotationPoint(-37.5F, -15.75F, -0.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[303].setRotationPoint(-37.25F, -14.25F, -0.25F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[304].setRotationPoint(-37.5F, -15.75F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[305].setRotationPoint(-37.5F, -15.75F, 1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[306].setRotationPoint(-37.25F, -16F, -1.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[307].setRotationPoint(-30.75F, -18.75F, -0.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[308].setRotationPoint(-30.75F, -19.75F, -0.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[309].setRotationPoint(-30.5F, -18.25F, -0.25F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 875
		bodyModel[310].setRotationPoint(-30.75F, -19.75F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 876
		bodyModel[311].setRotationPoint(-30.75F, -19.75F, 1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[312].setRotationPoint(-30.5F, -20F, -1.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[313].setRotationPoint(-22F, -22F, -1F);

		bodyModel[314].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[314].setRotationPoint(-22F, -22F, 1F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[315].setRotationPoint(-20F, -22F, -1F);

		bodyModel[316].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 186
		bodyModel[316].setRotationPoint(-20F, -22F, 1F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 186
		bodyModel[317].setRotationPoint(-22.5F, -22F, -2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[318].setRotationPoint(-21F, -23F, -0.5F);

		bodyModel[319].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[319].setRotationPoint(9.5F, -10F, -11.75F);

		bodyModel[320].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[320].setRotationPoint(9.5F, -10F, 10.75F);

		bodyModel[321].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 177
		bodyModel[321].setRotationPoint(10.5F, -10F, -11.75F);

		bodyModel[322].addBox(0F, 0F, 0F, 0, 10, 1, 0F); // Box 179
		bodyModel[322].setRotationPoint(10.5F, -10F, 10.75F);

		bodyModel[323].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[323].setRotationPoint(36.5F, -19.2F, -6F);

		bodyModel[324].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[324].setRotationPoint(42.5F, -19.2F, -6F);

		bodyModel[325].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 187
		bodyModel[325].setRotationPoint(36.5F, -19.2F, 4F);

		bodyModel[326].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 188
		bodyModel[326].setRotationPoint(42.5F, -19.2F, 4F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
	ModelBlombergA1A theTrucc = new ModelBlombergA1A();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 327; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else {
				bodyModel[i].render(f5);
			}
		}

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 4328||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 2341) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/a1a_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.13, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.33, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/a1a_black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.35, -0.13, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.33, 0, 0);
			theTrucc.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModelE9A[];
	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{1.9375D, 1.3215D, 0.0D});
				add(new double[]{1.125D, 1.3125D, 0.0D});
			}
		};
	}
}