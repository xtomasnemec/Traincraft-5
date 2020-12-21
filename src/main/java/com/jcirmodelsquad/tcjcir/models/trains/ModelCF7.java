//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.06.2020 - 16:04:34
// Last changed on: 08.06.2020 - 16:04:34

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergB;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7;


public class ModelCF7 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;


	public ModelCF7() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[410];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 38
		bodyModel[3] = new ModelRendererTurbo(this, 284, 3, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 351, 14, textureX, textureY); // Box 40
		bodyModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 48
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 50
		bodyModel[11] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 51
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52 door swing right
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 59
		bodyModel[17] = new ModelRendererTurbo(this, 274, 1, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, "lamp"); // Box 71 glow
		bodyModel[22] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 74
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 75
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 76
		bodyModel[26] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 72
		bodyModel[27] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 82
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 83
		bodyModel[30] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 84
		bodyModel[31] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 85
		bodyModel[32] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 86
		bodyModel[35] = new ModelRendererTurbo(this, 260, 28, textureX, textureY); // Box 87
		bodyModel[36] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 88
		bodyModel[37] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 90
		bodyModel[38] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 91
		bodyModel[39] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 92
		bodyModel[40] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 93
		bodyModel[41] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 94
		bodyModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 95
		bodyModel[43] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 99
		bodyModel[44] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 190
		bodyModel[45] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 106
		bodyModel[46] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 143
		bodyModel[48] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 4
		bodyModel[49] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 48
		bodyModel[50] = new ModelRendererTurbo(this, 178, 59, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 257, 16, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 143
		bodyModel[53] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 78
		bodyModel[57] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 294, 21, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 132
		bodyModel[61] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 133
		bodyModel[62] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 184
		bodyModel[63] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 235
		bodyModel[64] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 245
		bodyModel[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 246
		bodyModel[66] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 254
		bodyModel[67] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 255
		bodyModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 259
		bodyModel[69] = new ModelRendererTurbo(this, 10, 91, textureX, textureY); // Box 260
		bodyModel[70] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 261
		bodyModel[71] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 262
		bodyModel[72] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 263
		bodyModel[73] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 264
		bodyModel[74] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 265
		bodyModel[75] = new ModelRendererTurbo(this, 433, 25, textureX, textureY, "lamp"); // Box 318 lantern
		bodyModel[76] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 319
		bodyModel[77] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 320
		bodyModel[78] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 321
		bodyModel[79] = new ModelRendererTurbo(this, 433, 1, textureX, textureY, "lamp"); // Box 162 glow
		bodyModel[80] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 165
		bodyModel[81] = new ModelRendererTurbo(this, 250, 107, textureX, textureY); // Box 324
		bodyModel[82] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 325
		bodyModel[83] = new ModelRendererTurbo(this, 393, 9, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[84] = new ModelRendererTurbo(this, 449, 9, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[85] = new ModelRendererTurbo(this, 417, 25, textureX, textureY, "lamp"); // Box 124 glow
		bodyModel[86] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 125
		bodyModel[87] = new ModelRendererTurbo(this, 177, 27, textureX, textureY); // Box 259
		bodyModel[88] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 131
		bodyModel[89] = new ModelRendererTurbo(this, 94, 42, textureX, textureY); // Box 134
		bodyModel[90] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 135
		bodyModel[91] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 139
		bodyModel[92] = new ModelRendererTurbo(this, 489, 16, textureX, textureY); // Box 275
		bodyModel[93] = new ModelRendererTurbo(this, 177, 46, textureX, textureY); // Box 141
		bodyModel[94] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 142
		bodyModel[95] = new ModelRendererTurbo(this, 484, 1, textureX, textureY); // Box 143
		bodyModel[96] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 144
		bodyModel[97] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 145
		bodyModel[98] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 147
		bodyModel[99] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 148
		bodyModel[100] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 149
		bodyModel[101] = new ModelRendererTurbo(this, 167, 27, textureX, textureY); // Box 150
		bodyModel[102] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[103] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 81
		bodyModel[104] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 81
		bodyModel[105] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 174
		bodyModel[106] = new ModelRendererTurbo(this, 118, 60, textureX, textureY); // Box 175
		bodyModel[107] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 176
		bodyModel[108] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 177
		bodyModel[109] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 178
		bodyModel[110] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 184 o2 generator
		bodyModel[111] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 185
		bodyModel[112] = new ModelRendererTurbo(this, 289, 49, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[113] = new ModelRendererTurbo(this, 42, 53, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[114] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 188
		bodyModel[115] = new ModelRendererTurbo(this, 505, 57, textureX, textureY, "lamp"); // Box 189 lamp
		bodyModel[116] = new ModelRendererTurbo(this, 185, 65, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[117] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 191
		bodyModel[118] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 192
		bodyModel[119] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 193
		bodyModel[120] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // box64
		bodyModel[121] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 204
		bodyModel[122] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 205
		bodyModel[123] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 206
		bodyModel[124] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 207
		bodyModel[125] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 208
		bodyModel[126] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 209
		bodyModel[127] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 210
		bodyModel[128] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 211
		bodyModel[129] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 234
		bodyModel[130] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 235
		bodyModel[131] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 236
		bodyModel[132] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 237
		bodyModel[133] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 238
		bodyModel[134] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 239
		bodyModel[135] = new ModelRendererTurbo(this, 449, 73, textureX, textureY, "lamp"); // Box 240 lamp
		bodyModel[136] = new ModelRendererTurbo(this, 457, 73, textureX, textureY, "lamp"); // Box 241 lamp
		bodyModel[137] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 242
		bodyModel[138] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 243
		bodyModel[139] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 244
		bodyModel[140] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 245
		bodyModel[141] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 246
		bodyModel[142] = new ModelRendererTurbo(this, 505, 73, textureX, textureY, "lamp"); // Box 247 lamp
		bodyModel[143] = new ModelRendererTurbo(this, 17, 81, textureX, textureY, "lamp"); // Box 248 lamp
		bodyModel[144] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 249
		bodyModel[145] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 250
		bodyModel[146] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 251
		bodyModel[147] = new ModelRendererTurbo(this, 40, 80, textureX, textureY); // Box 252
		bodyModel[148] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 253
		bodyModel[149] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 254
		bodyModel[150] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 43
		bodyModel[151] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[152] = new ModelRendererTurbo(this, 257, 73, textureX, textureY, "cull"); // Box 271 cull
		bodyModel[153] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 272
		bodyModel[154] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 273
		bodyModel[155] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 274
		bodyModel[156] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 275 amtrak horn
		bodyModel[157] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 276 amtrak horn
		bodyModel[158] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 278
		bodyModel[159] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 279
		bodyModel[160] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 280
		bodyModel[161] = new ModelRendererTurbo(this, 321, 33, textureX, textureY, "cull"); // Box 281 cull
		bodyModel[162] = new ModelRendererTurbo(this, 297, 14, textureX, textureY); // Box 287
		bodyModel[163] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 114
		bodyModel[164] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 74
		bodyModel[165] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[166] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 245
		bodyModel[167] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 292
		bodyModel[168] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 293
		bodyModel[169] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 294
		bodyModel[170] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 295
		bodyModel[171] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 296
		bodyModel[172] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 297
		bodyModel[173] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 299
		bodyModel[174] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 300
		bodyModel[175] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 301
		bodyModel[176] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 302
		bodyModel[177] = new ModelRendererTurbo(this, 449, 81, textureX, textureY, "cull"); // Box 305 cull
		bodyModel[178] = new ModelRendererTurbo(this, 313, 81, textureX, textureY, "cull"); // Box 306 cull
		bodyModel[179] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 307
		bodyModel[180] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 308
		bodyModel[181] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 309
		bodyModel[182] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 310
		bodyModel[183] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 311
		bodyModel[184] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 312
		bodyModel[185] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 313
		bodyModel[186] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 314 door swing right
		bodyModel[187] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 316
		bodyModel[188] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 318
		bodyModel[189] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 319
		bodyModel[190] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 320
		bodyModel[191] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 321
		bodyModel[192] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 322
		bodyModel[193] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 323
		bodyModel[194] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 324
		bodyModel[195] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 325
		bodyModel[196] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 326
		bodyModel[197] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 327
		bodyModel[198] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 328
		bodyModel[199] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 329
		bodyModel[200] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 330
		bodyModel[201] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 331
		bodyModel[202] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 332
		bodyModel[203] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 333
		bodyModel[204] = new ModelRendererTurbo(this, 73, 89, textureX, textureY, "lamp"); // Box 334 lamp
		bodyModel[205] = new ModelRendererTurbo(this, 313, 89, textureX, textureY, "lamp"); // Box 335 lamp
		bodyModel[206] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 336
		bodyModel[207] = new ModelRendererTurbo(this, 337, 89, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[208] = new ModelRendererTurbo(this, 345, 89, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[209] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 341
		bodyModel[210] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 342
		bodyModel[211] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 343
		bodyModel[212] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 344
		bodyModel[213] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 345
		bodyModel[214] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 346
		bodyModel[215] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 347
		bodyModel[216] = new ModelRendererTurbo(this, 481, 89, textureX, textureY, "lamp"); // Box 348 glow
		bodyModel[217] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 349
		bodyModel[218] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 350
		bodyModel[219] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 351
		bodyModel[220] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 352
		bodyModel[221] = new ModelRendererTurbo(this, 17, 97, textureX, textureY, "lamp"); // Box 353 lantern
		bodyModel[222] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 354
		bodyModel[223] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 355
		bodyModel[224] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 356
		bodyModel[225] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 357
		bodyModel[226] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 358
		bodyModel[227] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 359
		bodyModel[228] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 360
		bodyModel[229] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 361
		bodyModel[230] = new ModelRendererTurbo(this, 113, 26, textureX, textureY); // Box 362
		bodyModel[231] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 363
		bodyModel[232] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 364
		bodyModel[233] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 365
		bodyModel[234] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 1
		bodyModel[235] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 2
		bodyModel[236] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 3
		bodyModel[237] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 5
		bodyModel[238] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 6
		bodyModel[239] = new ModelRendererTurbo(this, 331, 90, textureX, textureY, "lamp"); // Box 162 rotating lamp?
		bodyModel[240] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 165
		bodyModel[241] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 332
		bodyModel[243] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 333
		bodyModel[244] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 334
		bodyModel[245] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 335
		bodyModel[246] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 336
		bodyModel[247] = new ModelRendererTurbo(this, 290, 100, textureX, textureY); // Box 338
		bodyModel[248] = new ModelRendererTurbo(this, 305, 98, textureX, textureY); // Box 340
		bodyModel[249] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 343
		bodyModel[250] = new ModelRendererTurbo(this, 345, 61, textureX, textureY); // Box 344
		bodyModel[251] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 4
		bodyModel[252] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 346
		bodyModel[253] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 350
		bodyModel[254] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 351
		bodyModel[255] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 352
		bodyModel[256] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 353
		bodyModel[257] = new ModelRendererTurbo(this, 41, 105, textureX, textureY, "cull"); // Box 359 lamp
		bodyModel[258] = new ModelRendererTurbo(this, 49, 105, textureX, textureY, "cull"); // Box 360 ditchlight cull
		bodyModel[259] = new ModelRendererTurbo(this, 113, 105, textureX, textureY, "cull"); // Box 361 ditchlight cull
		bodyModel[260] = new ModelRendererTurbo(this, 245, 103, textureX, textureY); // Box 362 lamp
		bodyModel[261] = new ModelRendererTurbo(this, 313, 105, textureX, textureY, "cull"); // Box 338 cage cull
		bodyModel[262] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 352
		bodyModel[263] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 353
		bodyModel[264] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 354
		bodyModel[265] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 355
		bodyModel[266] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 356
		bodyModel[267] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 357
		bodyModel[268] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 4
		bodyModel[269] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 4
		bodyModel[270] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 4
		bodyModel[271] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 4
		bodyModel[272] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 365
		bodyModel[273] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 366
		bodyModel[274] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 367
		bodyModel[275] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 368
		bodyModel[276] = new ModelRendererTurbo(this, 451, 96, textureX, textureY); // Box 188
		bodyModel[277] = new ModelRendererTurbo(this, 458, 96, textureX, textureY, "lamp"); // Box 190 lamp
		bodyModel[278] = new ModelRendererTurbo(this, 473, 105, textureX, textureY, "lamp"); // Box 371 lamp
		bodyModel[279] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 372
		bodyModel[280] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 374
		bodyModel[281] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 375
		bodyModel[282] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 376
		bodyModel[283] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 377
		bodyModel[284] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 378
		bodyModel[285] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 379
		bodyModel[286] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 380
		bodyModel[287] = new ModelRendererTurbo(this, 122, 117, textureX, textureY); // Box 285
		bodyModel[288] = new ModelRendererTurbo(this, 109, 117, textureX, textureY); // Box 286
		bodyModel[289] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 287
		bodyModel[290] = new ModelRendererTurbo(this, 13, 27, textureX, textureY); // Box 288
		bodyModel[291] = new ModelRendererTurbo(this, 13, 35, textureX, textureY); // Box 289
		bodyModel[292] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 290
		bodyModel[293] = new ModelRendererTurbo(this, 122, 117, textureX, textureY); // Box 393
		bodyModel[294] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 394
		bodyModel[295] = new ModelRendererTurbo(this, 109, 117, textureX, textureY); // Box 395
		bodyModel[296] = new ModelRendererTurbo(this, 13, 27, textureX, textureY); // Box 396
		bodyModel[297] = new ModelRendererTurbo(this, 13, 35, textureX, textureY); // Box 397
		bodyModel[298] = new ModelRendererTurbo(this, 16, 29, textureX, textureY); // Box 398
		bodyModel[299] = new ModelRendererTurbo(this, 345, 101, textureX, textureY, "lamp"); // Box 399 glow
		bodyModel[300] = new ModelRendererTurbo(this, 337, 101, textureX, textureY); // Box 400
		bodyModel[301] = new ModelRendererTurbo(this, 293, 3, textureX, textureY); // Box 599
		bodyModel[302] = new ModelRendererTurbo(this, 351, 19, textureX, textureY); // Box 600
		bodyModel[303] = new ModelRendererTurbo(this, 35, 53, textureX, textureY, "lamp"); // Box 573 lamp
		bodyModel[304] = new ModelRendererTurbo(this, 351, 2, textureX, textureY); // Box 574
		bodyModel[305] = new ModelRendererTurbo(this, 272, 49, textureX, textureY, "lamp"); // Box 575 lamp
		bodyModel[306] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 576
		bodyModel[307] = new ModelRendererTurbo(this, 90, 44, textureX, textureY); // Box 577
		bodyModel[308] = new ModelRendererTurbo(this, 257, 14, textureX, textureY); // Box 578
		bodyModel[309] = new ModelRendererTurbo(this, 165, 59, textureX, textureY); // Box 580
		bodyModel[310] = new ModelRendererTurbo(this, 257, 20, textureX, textureY); // Box 581
		bodyModel[311] = new ModelRendererTurbo(this, 257, 18, textureX, textureY); // Box 582
		bodyModel[312] = new ModelRendererTurbo(this, 489, 18, textureX, textureY); // Box 583
		bodyModel[313] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 584
		bodyModel[314] = new ModelRendererTurbo(this, 294, 18, textureX, textureY); // Box 585
		bodyModel[315] = new ModelRendererTurbo(this, 186, 46, textureX, textureY); // Box 586
		bodyModel[316] = new ModelRendererTurbo(this, 433, 14, textureX, textureY); // Box 587
		bodyModel[317] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 588
		bodyModel[318] = new ModelRendererTurbo(this, 90, 44, textureX, textureY); // Box 589
		bodyModel[319] = new ModelRendererTurbo(this, 489, 16, textureX, textureY); // Box 590
		bodyModel[320] = new ModelRendererTurbo(this, 257, 14, textureX, textureY); // Box 591
		bodyModel[321] = new ModelRendererTurbo(this, 257, 16, textureX, textureY); // Box 592
		bodyModel[322] = new ModelRendererTurbo(this, 178, 59, textureX, textureY); // Box 593
		bodyModel[323] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 594
		bodyModel[324] = new ModelRendererTurbo(this, 177, 46, textureX, textureY); // Box 595
		bodyModel[325] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 596
		bodyModel[326] = new ModelRendererTurbo(this, 294, 21, textureX, textureY); // Box 597
		bodyModel[327] = new ModelRendererTurbo(this, 257, 18, textureX, textureY); // Box 598
		bodyModel[328] = new ModelRendererTurbo(this, 257, 20, textureX, textureY); // Box 599
		bodyModel[329] = new ModelRendererTurbo(this, 489, 18, textureX, textureY); // Box 600
		bodyModel[330] = new ModelRendererTurbo(this, 165, 59, textureX, textureY); // Box 601
		bodyModel[331] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 602
		bodyModel[332] = new ModelRendererTurbo(this, 294, 18, textureX, textureY); // Box 603
		bodyModel[333] = new ModelRendererTurbo(this, 186, 46, textureX, textureY); // Box 604
		bodyModel[334] = new ModelRendererTurbo(this, 433, 14, textureX, textureY); // Box 605
		bodyModel[335] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 67
		bodyModel[336] = new ModelRendererTurbo(this, 64, 102, textureX, textureY); // Box 607
		bodyModel[337] = new ModelRendererTurbo(this, 82, 121, textureX, textureY); // Box 608
		bodyModel[338] = new ModelRendererTurbo(this, 82, 121, textureX, textureY); // Box 609
		bodyModel[339] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 610
		bodyModel[340] = new ModelRendererTurbo(this, 137, 124, textureX, textureY); // Box 611
		bodyModel[341] = new ModelRendererTurbo(this, 311, 97, textureX, textureY, "lamp"); // Box 837 glow
		bodyModel[342] = new ModelRendererTurbo(this, 310, 100, textureX, textureY); // Box 838
		bodyModel[343] = new ModelRendererTurbo(this, 317, 97, textureX, textureY, "lamp"); // Box 839 glow
		bodyModel[344] = new ModelRendererTurbo(this, 316, 100, textureX, textureY); // Box 840
		bodyModel[345] = new ModelRendererTurbo(this, 323, 97, textureX, textureY, "lamp"); // Box 841 glow
		bodyModel[346] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Box 842
		bodyModel[347] = new ModelRendererTurbo(this, 329, 97, textureX, textureY, "lamp"); // Box 843 glow
		bodyModel[348] = new ModelRendererTurbo(this, 328, 100, textureX, textureY); // Box 844
		bodyModel[349] = new ModelRendererTurbo(this, 305, 116, textureX, textureY); // Box 845
		bodyModel[350] = new ModelRendererTurbo(this, 322, 100, textureX, textureY); // Box 846
		bodyModel[351] = new ModelRendererTurbo(this, 328, 100, textureX, textureY); // Box 847
		bodyModel[352] = new ModelRendererTurbo(this, 329, 97, textureX, textureY, "lamp"); // Box 848 glow
		bodyModel[353] = new ModelRendererTurbo(this, 323, 97, textureX, textureY, "lamp"); // Box 849 glow
		bodyModel[354] = new ModelRendererTurbo(this, 317, 97, textureX, textureY, "lamp"); // Box 850 glow
		bodyModel[355] = new ModelRendererTurbo(this, 316, 100, textureX, textureY); // Box 851
		bodyModel[356] = new ModelRendererTurbo(this, 310, 100, textureX, textureY); // Box 852
		bodyModel[357] = new ModelRendererTurbo(this, 311, 97, textureX, textureY, "lamp"); // Box 853 glow
		bodyModel[358] = new ModelRendererTurbo(this, 305, 116, textureX, textureY); // Box 854
		bodyModel[359] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // box65
		bodyModel[360] = new ModelRendererTurbo(this, 397, 72, textureX, textureY); // Box 601
		bodyModel[361] = new ModelRendererTurbo(this, 428, 4, textureX, textureY, "lamp"); // Box 387 glow
		bodyModel[362] = new ModelRendererTurbo(this, 97, 20, textureX, textureY); // Box 388
		bodyModel[363] = new ModelRendererTurbo(this, 428, 7, textureX, textureY, "lamp"); // Box 389 glow
		bodyModel[364] = new ModelRendererTurbo(this, 104, 20, textureX, textureY); // Box 390
		bodyModel[365] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 391
		bodyModel[366] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 392 cull
		bodyModel[367] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 393 cull
		bodyModel[368] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 394
		bodyModel[369] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 395 cull
		bodyModel[370] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 396
		bodyModel[371] = new ModelRendererTurbo(this, 45, 25, textureX, textureY, "cull"); // Box 397 cull
		bodyModel[372] = new ModelRendererTurbo(this, 26, 26, textureX, textureY); // Box 398
		bodyModel[373] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 277
		bodyModel[374] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 373
		bodyModel[375] = new ModelRendererTurbo(this, 374, 76, textureX, textureY); // Box 401
		bodyModel[376] = new ModelRendererTurbo(this, 60, 85, textureX, textureY); // Box 402
		bodyModel[377] = new ModelRendererTurbo(this, 9, 154, textureX, textureY); // DBox 89
		bodyModel[378] = new ModelRendererTurbo(this, 1, 138, textureX, textureY); // DBox 91
		bodyModel[379] = new ModelRendererTurbo(this, 45, 143, textureX, textureY); // DBox 101
		bodyModel[380] = new ModelRendererTurbo(this, 62, 143, textureX, textureY); // DBox 105
		bodyModel[381] = new ModelRendererTurbo(this, 77, 143, textureX, textureY); // DBox 172
		bodyModel[382] = new ModelRendererTurbo(this, 45, 138, textureX, textureY); // DBox 173
		bodyModel[383] = new ModelRendererTurbo(this, 62, 138, textureX, textureY); // DBox 176
		bodyModel[384] = new ModelRendererTurbo(this, 77, 138, textureX, textureY); // DBox 177
		bodyModel[385] = new ModelRendererTurbo(this, 28, 138, textureX, textureY); // DBox 178
		bodyModel[386] = new ModelRendererTurbo(this, 59, 150, textureX, textureY); // DBox 179
		bodyModel[387] = new ModelRendererTurbo(this, 59, 155, textureX, textureY); // DBox 180
		bodyModel[388] = new ModelRendererTurbo(this, 28, 143, textureX, textureY); // DBox 181
		bodyModel[389] = new ModelRendererTurbo(this, 44, 155, textureX, textureY); // DBox 182
		bodyModel[390] = new ModelRendererTurbo(this, 44, 150, textureX, textureY); // DBox 183
		bodyModel[391] = new ModelRendererTurbo(this, 485, 12, textureX, textureY); // Box 402
		bodyModel[392] = new ModelRendererTurbo(this, 444, 69, textureX, textureY, "lamp"); // Box 394 lamp
		bodyModel[393] = new ModelRendererTurbo(this, 235, 70, textureX, textureY); // Box 395
		bodyModel[394] = new ModelRendererTurbo(this, 444, 69, textureX, textureY, "lamp"); // Box 396 lamp
		bodyModel[395] = new ModelRendererTurbo(this, 235, 70, textureX, textureY); // Box 397
		bodyModel[396] = new ModelRendererTurbo(this, 451, 101, textureX, textureY); // Box 398
		bodyModel[397] = new ModelRendererTurbo(this, 458, 101, textureX, textureY, "lamp"); // Box 399 lamp
		bodyModel[398] = new ModelRendererTurbo(this, 458, 101, textureX, textureY, "lamp"); // Box 400 lamp
		bodyModel[399] = new ModelRendererTurbo(this, 451, 101, textureX, textureY); // Box 401
		bodyModel[400] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 73
		bodyModel[401] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 179
		bodyModel[402] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 180
		bodyModel[403] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 181
		bodyModel[404] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 182
		bodyModel[405] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 282
		bodyModel[406] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 283
		bodyModel[407] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 284
		bodyModel[408] = new ModelRendererTurbo(this, 116, 26, textureX, textureY); // Box 285
		bodyModel[409] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 286

		bodyModel[0].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 7
		bodyModel[0].setRotationPoint(-31F, -5F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 2, 22, 0F); // Box 37
		bodyModel[1].setRotationPoint(9F, -5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 3, 21, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[2].setRotationPoint(-9F, -5F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[3].setRotationPoint(9F, -3F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[4].setRotationPoint(-11F, -3F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 11, 2, 20, 0F); // Box 42
		bodyModel[5].setRotationPoint(-2F, -2F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 44
		bodyModel[6].setRotationPoint(-2F, 0F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[7].setRotationPoint(-9F, -1.5F, -10.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 3, 19, 0F); // Box 46
		bodyModel[8].setRotationPoint(-9F, -1.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 48
		bodyModel[9].setRotationPoint(-9F, 1.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 50
		bodyModel[10].setRotationPoint(-9F, -1.5F, 9.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 42, 20, 14, 0F); // Box 51
		bodyModel[11].setRotationPoint(-11F, -25F, -7F);

		bodyModel[12].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[12].setRotationPoint(-25.5F, -23F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[13].setRotationPoint(-33F, -18F, 1F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[14].setRotationPoint(-33F, -18F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[15].setRotationPoint(-32F, -18F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 59
		bodyModel[16].setRotationPoint(-37F, -4F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, -5.5F, 0F); // Box 61
		bodyModel[17].setRotationPoint(-37F, -4F, 3F);

		bodyModel[18].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 68
		bodyModel[18].setRotationPoint(-26F, -27F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[19].setRotationPoint(-26F, -27F, 9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[20].setRotationPoint(-12F, -23F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 71 glow
		bodyModel[21].setRotationPoint(-32.5F, -17F, -5.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 4, 5, 0F); // Box 73
		bodyModel[22].setRotationPoint(-31F, -9F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[23].setRotationPoint(-29F, -27F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[24].setRotationPoint(-28F, -27F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[25].setRotationPoint(-28F, -27F, 1F);

		bodyModel[26].addBox(0F, 0F, 0F, 14, 14, 1, 0F); // Box 72
		bodyModel[26].setRotationPoint(-26F, -23F, 10F);

		bodyModel[27].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 78
		bodyModel[27].setRotationPoint(-10F, -26F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 82
		bodyModel[28].setRotationPoint(6F, -27F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 83
		bodyModel[29].setRotationPoint(8.75F, -27F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 84
		bodyModel[30].setRotationPoint(11.25F, -27F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 85
		bodyModel[31].setRotationPoint(14F, -27F, -1F);

		bodyModel[32].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[32].setRotationPoint(-25.1F, -17F, -5F);
		bodyModel[32].rotateAngleY = -0.38397244F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[33].setRotationPoint(-25F, -18F, -4F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[34].setRotationPoint(-22F, -19F, -5.5F);
		bodyModel[34].rotateAngleY = -0.38397244F;

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[35].setRotationPoint(-24F, -18.75F, -4F);
		bodyModel[35].rotateAngleY = -0.38397244F;

		bodyModel[36].addBox(0F, 0F, 0F, 1, 17, 9, 0F); // Box 88
		bodyModel[36].setRotationPoint(-13F, -26F, -4.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 90
		bodyModel[37].setRotationPoint(-11F, -9F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[38].setRotationPoint(-10F, -9F, 11.01F);

		bodyModel[39].addBox(0F, 0F, 0F, 37, 8, 0, 0F); // Box 92
		bodyModel[39].setRotationPoint(-6F, -13F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 18, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[40].setRotationPoint(-9F, -5F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[41].setRotationPoint(-9F, -1.5F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[42].setRotationPoint(-9F, -1.5F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 42, 8, 0, 0F); // Box 99
		bodyModel[43].setRotationPoint(-11F, -13F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 15, 14, 1, 0F); // Box 190
		bodyModel[44].setRotationPoint(-26F, -23F, -11F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 4, 0, 0F); // Box 106
		bodyModel[45].setRotationPoint(-31F, -9F, -11.01F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 69
		bodyModel[46].setRotationPoint(-22.5F, -2.5F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 143
		bodyModel[47].setRotationPoint(18.5F, -2.5F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 4
		bodyModel[48].setRotationPoint(-39.5F, -2F, -1.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 48
		bodyModel[49].setRotationPoint(-36.01F, -4F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[50].setRotationPoint(-36F, 1F, 8F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 58
		bodyModel[51].setRotationPoint(-36F, 3F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[52].setRotationPoint(-36.01F, -12F, -8F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 61
		bodyModel[53].setRotationPoint(-36F, -6F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[54].setRotationPoint(-36.01F, -12F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 63
		bodyModel[55].setRotationPoint(-36F, -6F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[56].setRotationPoint(-36F, -6F, 4.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[57].setRotationPoint(-36F, -12F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[58].setRotationPoint(-36F, -1F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(-36F, -3F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[60].setRotationPoint(-38.01F, 1F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[61].setRotationPoint(-38.01F, 1F, 0F);

		bodyModel[62].addBox(0F, 0F, 0F, 72, 1, 12, 0F); // Box 184
		bodyModel[62].setRotationPoint(-36F, -3F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[63].setRotationPoint(-33F, -18F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 245
		bodyModel[64].setRotationPoint(36F, -6F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[65].setRotationPoint(35.99F, -12F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[66].setRotationPoint(35.99F, -12F, -8F);
		bodyModel[66].rotateAngleY = -3.14159265F;

		bodyModel[67].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 255
		bodyModel[67].setRotationPoint(36F, -6F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[68].setRotationPoint(36F, -4F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[69].setRotationPoint(36F, -4F, -5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 261
		bodyModel[70].setRotationPoint(36.5F, -2F, -1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[71].setRotationPoint(31F, -25F, 1F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 21, 2, 0F); // Box 263
		bodyModel[72].setRotationPoint(31F, -25F, -1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 21, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[73].setRotationPoint(31F, -25F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 265
		bodyModel[74].setRotationPoint(33.5F, -23.5F, -1F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 318 lantern
		bodyModel[75].setRotationPoint(-21F, -26.5F, -1F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 319
		bodyModel[76].setRotationPoint(-3F, -26F, -3F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 320
		bodyModel[77].setRotationPoint(16F, -26F, -3F);

		bodyModel[78].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 321
		bodyModel[78].setRotationPoint(23F, -26F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 glow
		bodyModel[79].setRotationPoint(-24F, -28F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[80].setRotationPoint(-23.85F, -28F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 324
		bodyModel[81].setRotationPoint(-2F, 0F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F); // Box 325
		bodyModel[82].setRotationPoint(-2F, 0F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[83].setRotationPoint(-26.05F, -26F, -6F);
		bodyModel[83].rotateAngleY = 0.38397244F;

		bodyModel[84].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[84].setRotationPoint(-26.05F, -26F, 6F);
		bodyModel[84].rotateAngleY = -0.38397244F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 glow
		bodyModel[85].setRotationPoint(-32.5F, -17F, 3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[86].setRotationPoint(-32F, -19F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[87].setRotationPoint(-32F, -4F, 7F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 131
		bodyModel[88].setRotationPoint(-36F, -4F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 134
		bodyModel[89].setRotationPoint(-32F, -3F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 135
		bodyModel[90].setRotationPoint(-36.01F, 2F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 139
		bodyModel[91].setRotationPoint(-36.01F, 3F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[92].setRotationPoint(-36F, 2F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[93].setRotationPoint(-36F, -2F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[94].setRotationPoint(-36F, 0F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[95].setRotationPoint(-32.5F, -18.5F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[96].setRotationPoint(-36F, -12F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 145
		bodyModel[97].setRotationPoint(-37.01F, -12F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[98].setRotationPoint(-36F, -12F, 3F);

		bodyModel[99].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[99].setRotationPoint(-36F, -12F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[100].setRotationPoint(-32F, -3F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[101].setRotationPoint(-32F, -4F, -10F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 61
		bodyModel[102].setRotationPoint(-31.5F, -16F, -11.01F);

		bodyModel[103].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 81
		bodyModel[103].setRotationPoint(-31.5F, -16F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[104].setRotationPoint(-31.5F, -10F, -11.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[105].setRotationPoint(-29.5F, -17F, -11.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 2, 0, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[106].setRotationPoint(-29.5F, -17F, 11.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[107].setRotationPoint(-31.5F, -10F, 10.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 0, 16, 2, 0F); // Box 177
		bodyModel[108].setRotationPoint(-31.5F, -16F, 9F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 178
		bodyModel[109].setRotationPoint(-31.5F, -16F, 11.01F);

		bodyModel[110].addBox(0F, 0F, 0F, 5, 2, 6, 0F); // Box 184 o2 generator
		bodyModel[110].setRotationPoint(-21.5F, -28.75F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[111].setRotationPoint(-26F, -30F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[112].setRotationPoint(-28.75F, -27F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[113].setRotationPoint(-28.75F, -25F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[114].setRotationPoint(-36F, -6F, -6.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 lamp
		bodyModel[115].setRotationPoint(-36.25F, -6F, 4.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[116].setRotationPoint(-36.25F, -6F, -6.75F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 191
		bodyModel[117].setRotationPoint(-30.5F, -15F, -11.01F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 6, 0, 0F); // Box 192
		bodyModel[118].setRotationPoint(-30.5F, -15F, 11.01F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 193
		bodyModel[119].setRotationPoint(-29F, -9F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[120].setRotationPoint(-24F, -23F, 11F);
		bodyModel[120].rotateAngleX = 0.26179939F;

		bodyModel[121].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 204
		bodyModel[121].setRotationPoint(31F, -4F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[122].setRotationPoint(31F, -4F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 206
		bodyModel[123].setRotationPoint(31F, -3F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[124].setRotationPoint(31F, -4F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[125].setRotationPoint(31F, -3F, 7F);

		bodyModel[126].addBox(0F, 0F, 0F, 0, 6, 20, 0F); // Box 209
		bodyModel[126].setRotationPoint(36.01F, -4F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 210
		bodyModel[127].setRotationPoint(36.01F, 2F, -11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 211
		bodyModel[128].setRotationPoint(36.01F, 3F, -9F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 8, 6, 0F); // Box 234
		bodyModel[129].setRotationPoint(37.01F, -12F, -3F);

		bodyModel[130].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 235
		bodyModel[130].setRotationPoint(36F, -12F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[131].setRotationPoint(36F, -12F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[132].setRotationPoint(36F, -12F, 3F);

		bodyModel[133].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 238
		bodyModel[133].setRotationPoint(36F, -12F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[134].setRotationPoint(35F, -6F, -6.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 lamp
		bodyModel[135].setRotationPoint(35.25F, -6F, -6.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 lamp
		bodyModel[136].setRotationPoint(35.25F, -6F, 4.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[137].setRotationPoint(35F, -6F, 4.75F);

		bodyModel[138].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 243
		bodyModel[138].setRotationPoint(31.5F, -13F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 244
		bodyModel[139].setRotationPoint(31.5F, -11F, 10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[140].setRotationPoint(31F, -13F, 11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 246
		bodyModel[141].setRotationPoint(36F, -4F, 3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp
		bodyModel[142].setRotationPoint(33.75F, -23.5F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp
		bodyModel[143].setRotationPoint(33.75F, -21.5F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 249
		bodyModel[144].setRotationPoint(31.5F, -11F, -11.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 250
		bodyModel[145].setRotationPoint(31.5F, -13F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[146].setRotationPoint(31F, -13F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[147].setRotationPoint(31F, -6F, 1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[148].setRotationPoint(32F, -13F, 1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[149].setRotationPoint(31F, -13F, 5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[150].setRotationPoint(30.75F, -12F, 3.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 43
		bodyModel[151].setRotationPoint(30.75F, -10F, 4F);

		bodyModel[152].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 271 cull
		bodyModel[152].setRotationPoint(-28F, -29F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 272
		bodyModel[153].setRotationPoint(-25F, -29F, 6F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 273
		bodyModel[154].setRotationPoint(-27F, -29F, 5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 274
		bodyModel[155].setRotationPoint(-25F, -28F, 6F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 275 amtrak horn
		bodyModel[156].setRotationPoint(-29F, -25F, 8F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 276 amtrak horn
		bodyModel[157].setRotationPoint(-11F, -25F, -9F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 278
		bodyModel[158].setRotationPoint(-30F, -30F, -1.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 279
		bodyModel[159].setRotationPoint(-29F, -30F, -0.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 280
		bodyModel[160].setRotationPoint(-31F, -30F, 0.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281 cull
		bodyModel[161].setRotationPoint(-28F, -29F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[162].setRotationPoint(-15F, -30F, -5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[163].setRotationPoint(3F, -23F, -8.7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[164].setRotationPoint(3F, -24F, -8.7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[165].setRotationPoint(3.25F, -22.5F, -8.45F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[166].setRotationPoint(3F, -25F, -8.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[167].setRotationPoint(3F, -2.5F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 293
		bodyModel[168].setRotationPoint(3F, -2.5F, 10F);

		bodyModel[169].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 294
		bodyModel[169].setRotationPoint(9F, -27F, -3F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 295
		bodyModel[170].setRotationPoint(11F, -27F, -4F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 296
		bodyModel[171].setRotationPoint(10F, -27F, -5F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 297
		bodyModel[172].setRotationPoint(12F, -26F, -4F);

		bodyModel[173].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 299
		bodyModel[173].setRotationPoint(-20F, -29F, -8F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 300
		bodyModel[174].setRotationPoint(-20F, -28F, -8F);

		bodyModel[175].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 301
		bodyModel[175].setRotationPoint(-20F, -29F, 7F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 302
		bodyModel[176].setRotationPoint(-18F, -28F, 7F);

		bodyModel[177].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 305 cull
		bodyModel[177].setRotationPoint(-27F, -29F, 4.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306 cull
		bodyModel[178].setRotationPoint(-27F, -30F, 4.5F);

		bodyModel[179].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 307
		bodyModel[179].setRotationPoint(-15F, -29F, 2F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 308
		bodyModel[180].setRotationPoint(-13F, -28F, 1F);

		bodyModel[181].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 309
		bodyModel[181].setRotationPoint(-13F, -29F, 1F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 310
		bodyModel[182].setRotationPoint(-14F, -29F, 0F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 311
		bodyModel[183].setRotationPoint(29F, -26.5F, 5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 312
		bodyModel[184].setRotationPoint(29F, -25.5F, 5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[185].setRotationPoint(-26F, -23F, -6F);

		bodyModel[186].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[186].setRotationPoint(-11.5F, -23F, 10.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 15, 4, 22, 0F); // Box 316
		bodyModel[187].setRotationPoint(-26F, -9F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[188].setRotationPoint(-10F, -7F, 7F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 319
		bodyModel[189].setRotationPoint(-11F, -9F, 11.01F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 320
		bodyModel[190].setRotationPoint(-9F, -15F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 321
		bodyModel[191].setRotationPoint(-11F, -17F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[192].setRotationPoint(-8F, -15F, 11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 323
		bodyModel[193].setRotationPoint(3F, -23F, 7.7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 324
		bodyModel[194].setRotationPoint(3.25F, -22.5F, 7.95F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[195].setRotationPoint(3F, -24F, 7.7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 326
		bodyModel[196].setRotationPoint(3F, -25F, 7F);

		bodyModel[197].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[197].setRotationPoint(0.5F, -26.5F, -8F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[198].setRotationPoint(1.5F, -26.25F, -7F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[199].setRotationPoint(1F, -26.25F, -9F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[200].setRotationPoint(3F, -25.5F, -8F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[201].setRotationPoint(2F, -27.5F, -7.25F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[202].setRotationPoint(2F, -27.5F, -8.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 333
		bodyModel[203].setRotationPoint(33F, -25.5F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 334 lamp
		bodyModel[204].setRotationPoint(34.25F, -25.5F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 335 lamp
		bodyModel[205].setRotationPoint(34.25F, -25.5F, 0F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[206].setRotationPoint(-29F, -29F, -2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[207].setRotationPoint(-29.75F, -29F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[208].setRotationPoint(-29.75F, -29F, -2F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341
		bodyModel[209].setRotationPoint(11F, -27.5F, -5F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 342
		bodyModel[210].setRotationPoint(9F, -27.5F, -4F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 343
		bodyModel[211].setRotationPoint(10F, -27.5F, -6F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 344
		bodyModel[212].setRotationPoint(12F, -26.5F, -5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 345
		bodyModel[213].setRotationPoint(-25F, -31F, 0F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 346
		bodyModel[214].setRotationPoint(-26F, -29F, 7.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 347
		bodyModel[215].setRotationPoint(-24F, -28F, 7.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348 glow
		bodyModel[216].setRotationPoint(-26F, -30F, -2.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 349
		bodyModel[217].setRotationPoint(-25.82F, -30F, -2.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[218].setRotationPoint(-25F, -22F, -12F);

		bodyModel[219].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[219].setRotationPoint(-25F, -22F, 11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[220].setRotationPoint(-28.5F, -29F, -1F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353 lantern
		bodyModel[221].setRotationPoint(-28.75F, -29F, -1F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 354
		bodyModel[222].setRotationPoint(-20.5F, -28.5F, -5F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 355
		bodyModel[223].setRotationPoint(-19F, -27.75F, -6F);

		bodyModel[224].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 356
		bodyModel[224].setRotationPoint(-21.5F, -28.75F, -6F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 357
		bodyModel[225].setRotationPoint(-21F, -28.5F, -7F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 358
		bodyModel[226].setRotationPoint(-20F, -29.75F, -6.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 359
		bodyModel[227].setRotationPoint(-20F, -29.75F, -5.25F);

		bodyModel[228].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 360
		bodyModel[228].setRotationPoint(1F, -27.5F, 4F);

		bodyModel[229].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 361
		bodyModel[229].setRotationPoint(0.99F, -26.5F, 4.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 362
		bodyModel[230].setRotationPoint(17.01F, -26.5F, 4.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 363
		bodyModel[231].setRotationPoint(0.99F, -26.5F, -5.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 364
		bodyModel[232].setRotationPoint(1F, -27.5F, -6F);

		bodyModel[233].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 365
		bodyModel[233].setRotationPoint(17.01F, -26.5F, -5.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 1
		bodyModel[234].setRotationPoint(-24.5F, -22F, 12.51F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[235].setRotationPoint(-24.5F, -17F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3
		bodyModel[236].setRotationPoint(-24.5F, -22F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[237].setRotationPoint(-24.5F, -23F, 10.01F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 6
		bodyModel[238].setRotationPoint(-19.5F, -22F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 rotating lamp?
		bodyModel[239].setRotationPoint(-14F, -28F, 4.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[240].setRotationPoint(-13.85F, -28F, 4.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[241].setRotationPoint(36F, -1.5F, -2F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[242].setRotationPoint(-26F, -26F, -9F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[243].setRotationPoint(-12F, -26F, -9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[244].setRotationPoint(-25F, -26F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 335
		bodyModel[245].setRotationPoint(-25F, -26F, -9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[246].setRotationPoint(-37F, -1.5F, -2F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 12, 0, 0F); // Box 338
		bodyModel[247].setRotationPoint(-32.5F, -19F, -5.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 12, 0, 0F); // Box 340
		bodyModel[248].setRotationPoint(-32.5F, -19F, 5.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 343
		bodyModel[249].setRotationPoint(-30F, -7F, -11F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[250].setRotationPoint(-29.5F, -19F, 5.5F);
		bodyModel[250].rotateAngleY = -0.78539816F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[251].setRotationPoint(-36F, -3F, -3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 346
		bodyModel[252].setRotationPoint(31F, -3F, -3F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 350
		bodyModel[253].setRotationPoint(-37F, -3F, -9.5F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 351
		bodyModel[254].setRotationPoint(-37F, -3F, 6.5F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 352
		bodyModel[255].setRotationPoint(36F, -3F, -9.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 353
		bodyModel[256].setRotationPoint(36F, -3F, 6.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 359 lamp
		bodyModel[257].setRotationPoint(-37.25F, -4F, -6.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360 ditchlight cull
		bodyModel[258].setRotationPoint(-37F, -4F, -6.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 361 ditchlight cull
		bodyModel[259].setRotationPoint(-37F, -4F, 4.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 362 lamp
		bodyModel[260].setRotationPoint(-37.25F, -4F, 4.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338 cage cull
		bodyModel[261].setRotationPoint(-27.01F, -32.01F, 4F);

		bodyModel[262].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 352
		bodyModel[262].setRotationPoint(-19.5F, -22F, 12.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[263].setRotationPoint(-19.5F, -17F, 10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 354
		bodyModel[264].setRotationPoint(-19.5F, -23F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 355
		bodyModel[265].setRotationPoint(-14.5F, -22F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 356
		bodyModel[266].setRotationPoint(-37F, -4F, -6F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 357
		bodyModel[267].setRotationPoint(-32F, -6F, 6.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[268].setRotationPoint(-39F, 1F, 2F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[269].setRotationPoint(-39F, 2F, 0F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[270].setRotationPoint(-39.5F, 1F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[271].setRotationPoint(-39F, 2F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 365
		bodyModel[272].setRotationPoint(36F, 2F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 366
		bodyModel[273].setRotationPoint(36F, 2F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[274].setRotationPoint(36F, 1F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 368
		bodyModel[275].setRotationPoint(36.5F, 1F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[276].setRotationPoint(-36.5F, -3F, 7.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 lamp
		bodyModel[277].setRotationPoint(-36.75F, -3F, 7.25F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371 lamp
		bodyModel[278].setRotationPoint(-36.75F, -3F, -9.25F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[279].setRotationPoint(-36.5F, -3F, -9.25F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[280].setRotationPoint(-31F, -3F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[281].setRotationPoint(-31F, -3F, 11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 376
		bodyModel[282].setRotationPoint(29F, -3F, 11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 377
		bodyModel[283].setRotationPoint(29F, -3F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[284].setRotationPoint(-34.5F, -3F, 5.3F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 379
		bodyModel[285].setRotationPoint(-34.25F, -1.5F, 5.55F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 380
		bodyModel[286].setRotationPoint(-34.5F, -2F, 5.3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 285
		bodyModel[287].setRotationPoint(-19F, -31F, 7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -3F, -0.5F, 0F, -3F, -3F); // Box 286
		bodyModel[288].setRotationPoint(-19F, -31F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 287
		bodyModel[289].setRotationPoint(-19F, -33F, 5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[290].setRotationPoint(-19F, -33F, 8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[291].setRotationPoint(-19F, -34F, 8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[292].setRotationPoint(-19F, -34F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -3F, -0.5F, 0F, 0F, -3F); // Box 393
		bodyModel[293].setRotationPoint(-19F, -31F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[294].setRotationPoint(-19F, -33F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -3F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 395
		bodyModel[295].setRotationPoint(-19F, -31F, -8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 396
		bodyModel[296].setRotationPoint(-19F, -33F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[297].setRotationPoint(-19F, -34F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[298].setRotationPoint(-19F, -34F, -8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399 glow
		bodyModel[299].setRotationPoint(-28.65F, -30F, -0.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 400
		bodyModel[300].setRotationPoint(-28.5F, -30F, -0.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[301].setRotationPoint(9F, -3F, 9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 600
		bodyModel[302].setRotationPoint(-11F, -3F, 9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 lamp
		bodyModel[303].setRotationPoint(-33.75F, -15F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574
		bodyModel[304].setRotationPoint(-34F, -17F, -1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 lamp
		bodyModel[305].setRotationPoint(-33.75F, -17F, -1F);

		bodyModel[306].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 576
		bodyModel[306].setRotationPoint(-31F, -3F, -11F);

		bodyModel[307].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 577
		bodyModel[307].setRotationPoint(-31F, -3F, 10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[308].setRotationPoint(-36F, 3F, 9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[309].setRotationPoint(-36F, 1F, -10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[310].setRotationPoint(-36F, 3F, -10F);

		bodyModel[311].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 582
		bodyModel[311].setRotationPoint(-36F, 3F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 583
		bodyModel[312].setRotationPoint(-36F, 2F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[313].setRotationPoint(-36F, 0F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		bodyModel[314].setRotationPoint(-36F, -1F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[315].setRotationPoint(-36F, -2F, -7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[316].setRotationPoint(-36F, -3F, -9F);

		bodyModel[317].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 588
		bodyModel[317].setRotationPoint(31F, -3F, -11F);

		bodyModel[318].addBox(0F, 0F, 0F, 0, 6, 1, 0F); // Box 589
		bodyModel[318].setRotationPoint(31F, -3F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 590
		bodyModel[319].setRotationPoint(32F, 2F, 9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		bodyModel[320].setRotationPoint(31F, 3F, 9F);

		bodyModel[321].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 592
		bodyModel[321].setRotationPoint(31F, 3F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0F); // Box 593
		bodyModel[322].setRotationPoint(32F, 1F, 8F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 594
		bodyModel[323].setRotationPoint(32F, 0F, 8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[324].setRotationPoint(32F, -2F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 596
		bodyModel[325].setRotationPoint(32F, -3F, 7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 597
		bodyModel[326].setRotationPoint(32F, -1F, 7F);

		bodyModel[327].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 598
		bodyModel[327].setRotationPoint(31F, 3F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 599
		bodyModel[328].setRotationPoint(31F, 3F, -10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F); // Box 600
		bodyModel[329].setRotationPoint(32F, 2F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 601
		bodyModel[330].setRotationPoint(32F, 1F, -10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 602
		bodyModel[331].setRotationPoint(32F, 0F, -8F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[332].setRotationPoint(32F, -1F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[333].setRotationPoint(32F, -2F, -7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[334].setRotationPoint(32F, -3F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 15, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[335].setRotationPoint(-26F, -27F, -11F);

		bodyModel[336].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 607
		bodyModel[336].setRotationPoint(31F, -13F, 1F);

		bodyModel[337].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 608
		bodyModel[337].setRotationPoint(-10F, -24F, -7.25F);

		bodyModel[338].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 609
		bodyModel[338].setRotationPoint(-10F, -24F, 6.25F);

		bodyModel[339].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 610
		bodyModel[339].setRotationPoint(17F, -24F, 6.25F);

		bodyModel[340].addBox(0F, 0F, 0F, 13, 4, 1, 0F); // Box 611
		bodyModel[340].setRotationPoint(17F, -24F, -7.25F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837 glow
		bodyModel[341].setRotationPoint(-12.5F, -28F, 9.65F);
		bodyModel[341].rotateAngleX = -1.09955743F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 838
		bodyModel[342].setRotationPoint(-12.32F, -28F, 9.65F);
		bodyModel[342].rotateAngleX = -1.09955743F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839 glow
		bodyModel[343].setRotationPoint(-12.5F, -26.75F, 10.25F);
		bodyModel[343].rotateAngleX = -1.09955743F;

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 840
		bodyModel[344].setRotationPoint(-12.32F, -26.75F, 10.25F);
		bodyModel[344].rotateAngleX = -1.09955743F;

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841 glow
		bodyModel[345].setRotationPoint(-12.5F, -25.5F, 10.9F);
		bodyModel[345].rotateAngleX = -1.09955743F;

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 842
		bodyModel[346].setRotationPoint(-12.32F, -25.5F, 10.9F);
		bodyModel[346].rotateAngleX = -1.09955743F;

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843 glow
		bodyModel[347].setRotationPoint(-12.5F, -24.25F, 11.5F);
		bodyModel[347].rotateAngleX = -1.09955743F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 844
		bodyModel[348].setRotationPoint(-12.32F, -24.25F, 11.5F);
		bodyModel[348].rotateAngleX = -1.09955743F;

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		bodyModel[349].setRotationPoint(-13F, -28F, 8.5F);
		bodyModel[349].rotateAngleX = -1.09955743F;

		bodyModel[350].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 846
		bodyModel[350].setRotationPoint(-12.32F, -24.5F, -11.4F);
		bodyModel[350].rotateAngleX = 1.09955743F;

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 847
		bodyModel[351].setRotationPoint(-12.32F, -23.25F, -12F);
		bodyModel[351].rotateAngleX = 1.09955743F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848 glow
		bodyModel[352].setRotationPoint(-12.5F, -23.25F, -12F);
		bodyModel[352].rotateAngleX = 1.09955743F;

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849 glow
		bodyModel[353].setRotationPoint(-12.5F, -24.5F, -11.4F);
		bodyModel[353].rotateAngleX = 1.09955743F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850 glow
		bodyModel[354].setRotationPoint(-12.5F, -25.75F, -10.75F);
		bodyModel[354].rotateAngleX = 1.09955743F;

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 851
		bodyModel[355].setRotationPoint(-12.32F, -25.75F, -10.75F);
		bodyModel[355].rotateAngleX = 1.09955743F;

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 852
		bodyModel[356].setRotationPoint(-12.32F, -27F, -10.15F);
		bodyModel[356].rotateAngleX = 1.09955743F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853 glow
		bodyModel[357].setRotationPoint(-12.5F, -27F, -10.15F);
		bodyModel[357].rotateAngleX = 1.09955743F;

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 854
		bodyModel[358].setRotationPoint(-13F, -22.5F, -11.3F);
		bodyModel[358].rotateAngleX = 1.11701072F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[359].setRotationPoint(-24F, -23.25F, -11.97F);
		bodyModel[359].rotateAngleX = -0.26179939F;

		bodyModel[360].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 601
		bodyModel[360].setRotationPoint(33.25F, -13F, 2.75F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387 glow
		bodyModel[361].setRotationPoint(-13F, -30F, -4.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 388
		bodyModel[362].setRotationPoint(-12.85F, -30F, -4.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389 glow
		bodyModel[363].setRotationPoint(-26F, -28F, -0.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 390
		bodyModel[364].setRotationPoint(-25.85F, -28F, -0.5F);

		bodyModel[365].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 391
		bodyModel[365].setRotationPoint(5.5F, -27.5F, -3F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392 cull
		bodyModel[366].setRotationPoint(5.5F, -29.5F, -3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393 cull
		bodyModel[367].setRotationPoint(13.5F, -29.5F, -3F);

		bodyModel[368].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 394
		bodyModel[368].setRotationPoint(13.5F, -27.5F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395 cull
		bodyModel[369].setRotationPoint(10.75F, -29.5F, -3F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 396
		bodyModel[370].setRotationPoint(10.75F, -27.5F, -3F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397 cull
		bodyModel[371].setRotationPoint(8.25F, -29.5F, -3F);

		bodyModel[372].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 398
		bodyModel[372].setRotationPoint(8.25F, -27.5F, -3F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[373].setRotationPoint(-37F, -8F, -5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 373
		bodyModel[374].setRotationPoint(36.5F, -8F, 3F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 401
		bodyModel[375].setRotationPoint(-15F, -29F, -8F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 402
		bodyModel[376].setRotationPoint(-15F, -28F, -8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // DBox 89
		bodyModel[377].setRotationPoint(7.5F, -26.5F, -3F);

		bodyModel[378].addBox(0F, 0F, 0F, 6, 1, 14, 0F); // DBox 91
		bodyModel[378].setRotationPoint(7.5F, -26F, -7F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // DBox 101
		bodyModel[379].setRotationPoint(7.5F, -24F, 7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F); // DBox 105
		bodyModel[380].setRotationPoint(4.5F, -24F, 7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // DBox 172
		bodyModel[381].setRotationPoint(13.5F, -24F, 7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 173
		bodyModel[382].setRotationPoint(7.5F, -26F, 7F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // DBox 176
		bodyModel[383].setRotationPoint(4.5F, -26F, 7F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // DBox 177
		bodyModel[384].setRotationPoint(13.5F, -26F, 7F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 178
		bodyModel[385].setRotationPoint(7.5F, -26F, -9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 179
		bodyModel[386].setRotationPoint(13.5F, -26F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // DBox 180
		bodyModel[387].setRotationPoint(13.5F, -24F, -9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 181
		bodyModel[388].setRotationPoint(7.5F, -24F, -9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F); // DBox 182
		bodyModel[389].setRotationPoint(4.5F, -24F, -9F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // DBox 183
		bodyModel[390].setRotationPoint(4.5F, -26F, -9F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[391].setRotationPoint(30.5F, -25.5F, -1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 394 lamp
		bodyModel[392].setRotationPoint(35.75F, -3F, -5.75F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 395
		bodyModel[393].setRotationPoint(35.5F, -3F, -5.75F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 396 lamp
		bodyModel[394].setRotationPoint(35.75F, -3F, 3.75F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 397
		bodyModel[395].setRotationPoint(35.5F, -3F, 3.75F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[396].setRotationPoint(-36.5F, -2.25F, 2.75F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 399 lamp
		bodyModel[397].setRotationPoint(-36.75F, -2.25F, 2.75F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 400 lamp
		bodyModel[398].setRotationPoint(-36.75F, -2.25F, -4.75F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[399].setRotationPoint(-36.5F, -2.25F, -4.75F);

		bodyModel[400].addBox(0F, 0F, 0F, 5, 0, 7, 0F); // Box 73
		bodyModel[400].setRotationPoint(-27F, -29F, -5F);

		bodyModel[401].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 179
		bodyModel[401].setRotationPoint(-27F, -29F, -3F);

		bodyModel[402].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 180
		bodyModel[402].setRotationPoint(-27F, -29F, 0F);

		bodyModel[403].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 181
		bodyModel[403].setRotationPoint(-24F, -29F, 2F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 182
		bodyModel[404].setRotationPoint(-24F, -29F, -5F);

		bodyModel[405].addBox(0F, 0F, 0F, 5, 0, 6, 0F); // Box 282
		bodyModel[405].setRotationPoint(-16F, -29F, -6F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 2
		bodyModel[406].setRotationPoint(-13F, -29F, 0F);

		bodyModel[407].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 284
		bodyModel[407].setRotationPoint(-16F, -29F, -5F);

		bodyModel[408].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 285
		bodyModel[408].setRotationPoint(-16F, -29F, -2F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 286
		bodyModel[409].setRotationPoint(-13F, -29F, -6F);
	}
	ModelBlombergB theTrucks2 = new ModelBlombergB();
	ModelFB2 theTrucks1 = new ModelFB2();
	ModelTypeB theTrucks3 = new ModelTypeB();


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 410; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp") ) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.01, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.57, 0, 0);
			theTrucks1.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 5||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Grey.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();

		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 14) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/typeb_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.3, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.57, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.28, -0.15, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(2.55, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}

	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	public ModelRendererTurbo ModelCF7[];
}