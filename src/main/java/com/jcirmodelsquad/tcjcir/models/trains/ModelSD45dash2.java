//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.03.2019 - 14:12:15
// Last changed on: 27.03.2019 - 14:12:15

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located


import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C2H;
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

public class ModelSD45dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD45dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[513];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 262, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 256, 82, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 487, 84, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 461, 84, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 310, 116, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 323, 29, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 256, 129, textureX, textureY); // Box 112
		bodyModel[7] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[8] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[9] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[11] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[13] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[14] = new ModelRendererTurbo(this, 44, 135, textureX, textureY); // Box 143
		bodyModel[15] = new ModelRendererTurbo(this, 14, 135, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 98
		bodyModel[20] = new ModelRendererTurbo(this, 35, 103, textureX, textureY); // Box 197
		bodyModel[21] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 41, 135, textureX, textureY); // Box 144
		bodyModel[23] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[24] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 147
		bodyModel[25] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 148
		bodyModel[26] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 4, 160, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 38, 160, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 270, 76, textureX, textureY); // Box 159
		bodyModel[34] = new ModelRendererTurbo(this, 368, 168, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 392, 148, textureX, textureY); // Box 164
		bodyModel[36] = new ModelRendererTurbo(this, 374, 148, textureX, textureY); // Box 259
		bodyModel[37] = new ModelRendererTurbo(this, 399, 152, textureX, textureY); // Box 261
		bodyModel[38] = new ModelRendererTurbo(this, 367, 152, textureX, textureY); // Box 262
		bodyModel[39] = new ModelRendererTurbo(this, 392, 156, textureX, textureY); // Box 264
		bodyModel[40] = new ModelRendererTurbo(this, 374, 156, textureX, textureY); // Box 265
		bodyModel[41] = new ModelRendererTurbo(this, 371, 150, textureX, textureY); // Box 266
		bodyModel[42] = new ModelRendererTurbo(this, 448, 71, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 400, 166, textureX, textureY); // Box 143
		bodyModel[45] = new ModelRendererTurbo(this, 367, 168, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 370, 166, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 407, 168, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 397, 168, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 377, 168, textureX, textureY); // Box 81
		bodyModel[50] = new ModelRendererTurbo(this, 406, 150, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 380, 159, textureX, textureY); // Box 234
		bodyModel[52] = new ModelRendererTurbo(this, 397, 164, textureX, textureY); // Box 236
		bodyModel[53] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[54] = new ModelRendererTurbo(this, 439, 165, textureX, textureY); // Box 4
		bodyModel[55] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 424, 163, textureX, textureY); // Box 4
		bodyModel[58] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[59] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 247, 82, textureX, textureY); // Box 193
		bodyModel[61] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[62] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[63] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 72
		bodyModel[64] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 190
		bodyModel[65] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[66] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[67] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[68] = new ModelRendererTurbo(this, 377, 176, textureX, textureY); // Box 202
		bodyModel[69] = new ModelRendererTurbo(this, 390, 180, textureX, textureY); // Box 204
		bodyModel[70] = new ModelRendererTurbo(this, 373, 164, textureX, textureY); // Box 206
		bodyModel[71] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[72] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 11
		bodyModel[73] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 210
		bodyModel[74] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 211
		bodyModel[75] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[76] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[77] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[78] = new ModelRendererTurbo(this, 105, 37, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[79] = new ModelRendererTurbo(this, 105, 34, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[80] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 lamp
		bodyModel[81] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 lamp
		bodyModel[82] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 219
		bodyModel[83] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[84] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[85] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[86] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 223
		bodyModel[87] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 224
		bodyModel[88] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[89] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[90] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[91] = new ModelRendererTurbo(this, 268, 108, textureX, textureY); // Box 229
		bodyModel[92] = new ModelRendererTurbo(this, 270, 70, textureX, textureY); // Box 230
		bodyModel[93] = new ModelRendererTurbo(this, 378, 70, textureX, textureY); // Box 231
		bodyModel[94] = new ModelRendererTurbo(this, 370, 108, textureX, textureY); // Box 232
		bodyModel[95] = new ModelRendererTurbo(this, 308, 158, textureX, textureY); // Box 233
		bodyModel[96] = new ModelRendererTurbo(this, 308, 165, textureX, textureY); // Box 234
		bodyModel[97] = new ModelRendererTurbo(this, 309, 130, textureX, textureY); // Box 235
		bodyModel[98] = new ModelRendererTurbo(this, 309, 138, textureX, textureY); // Box 236
		bodyModel[99] = new ModelRendererTurbo(this, 272, 121, textureX, textureY); // Box 86
		bodyModel[100] = new ModelRendererTurbo(this, 272, 125, textureX, textureY); // Box 87
		bodyModel[101] = new ModelRendererTurbo(this, 272, 156, textureX, textureY); // Box 255
		bodyModel[102] = new ModelRendererTurbo(this, 272, 152, textureX, textureY); // Box 256
		bodyModel[103] = new ModelRendererTurbo(this, 333, 110, textureX, textureY); // Box 241
		bodyModel[104] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 242
		bodyModel[105] = new ModelRendererTurbo(this, 371, 68, textureX, textureY); // Box 243
		bodyModel[106] = new ModelRendererTurbo(this, 363, 110, textureX, textureY); // Box 244
		bodyModel[107] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[108] = new ModelRendererTurbo(this, 87, 103, textureX, textureY); // Box 246
		bodyModel[109] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[110] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[111] = new ModelRendererTurbo(this, 3, 133, textureX, textureY); // Box 176
		bodyModel[112] = new ModelRendererTurbo(this, 6, 125, textureX, textureY); // Box 177
		bodyModel[113] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 271
		bodyModel[114] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 272
		bodyModel[115] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 273
		bodyModel[116] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 274
		bodyModel[117] = new ModelRendererTurbo(this, 96, 136, textureX, textureY); // Box 258
		bodyModel[118] = new ModelRendererTurbo(this, 103, 136, textureX, textureY); // Box 260
		bodyModel[119] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[120] = new ModelRendererTurbo(this, 94, 125, textureX, textureY); // Box 267
		bodyModel[121] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[122] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[123] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[124] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[125] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[126] = new ModelRendererTurbo(this, 302, 1, textureX, textureY); // Box 273
		bodyModel[127] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[128] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[129] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[130] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[131] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[132] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[133] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[134] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[135] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[136] = new ModelRendererTurbo(this, 331, 22, textureX, textureY); // Box 285
		bodyModel[137] = new ModelRendererTurbo(this, 331, 15, textureX, textureY); // Box 286
		bodyModel[138] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 287
		bodyModel[139] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 288
		bodyModel[140] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 289
		bodyModel[141] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 290
		bodyModel[142] = new ModelRendererTurbo(this, 117, 125, textureX, textureY); // Box 291
		bodyModel[143] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 292
		bodyModel[144] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 293
		bodyModel[145] = new ModelRendererTurbo(this, 128, 107, textureX, textureY); // Box 294
		bodyModel[146] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[147] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[148] = new ModelRendererTurbo(this, 436, 22, textureX, textureY); // Box 297
		bodyModel[149] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 298
		bodyModel[150] = new ModelRendererTurbo(this, 436, 15, textureX, textureY); // Box 299
		bodyModel[151] = new ModelRendererTurbo(this, 413, 15, textureX, textureY); // Box 300
		bodyModel[152] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 301
		bodyModel[153] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[154] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[155] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[156] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[157] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[158] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[159] = new ModelRendererTurbo(this, 300, 25, textureX, textureY); // Box 308
		bodyModel[160] = new ModelRendererTurbo(this, 289, 20, textureX, textureY); // Box 309
		bodyModel[161] = new ModelRendererTurbo(this, 296, 15, textureX, textureY); // Box 310
		bodyModel[162] = new ModelRendererTurbo(this, 289, 11, textureX, textureY); // Box 311
		bodyModel[163] = new ModelRendererTurbo(this, 115, 136, textureX, textureY); // Box 312
		bodyModel[164] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[165] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[166] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[167] = new ModelRendererTurbo(this, 194, 136, textureX, textureY); // Box 316
		bodyModel[168] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[169] = new ModelRendererTurbo(this, 482, 81, textureX, textureY); // Box 318
		bodyModel[170] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[171] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 320 ptc forehead
		bodyModel[172] = new ModelRendererTurbo(this, 145, 50, textureX, textureY); // Box 321 ptc forehead
		bodyModel[173] = new ModelRendererTurbo(this, 119, 50, textureX, textureY); // Box 322 ptc forehead
		bodyModel[174] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 42
		bodyModel[175] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[176] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[177] = new ModelRendererTurbo(this, 10, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[178] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 43
		bodyModel[179] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[180] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[181] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[182] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[183] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[184] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[185] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[186] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[187] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[188] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[189] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[190] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[191] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 cnw bELL
		bodyModel[192] = new ModelRendererTurbo(this, 106, 54, textureX, textureY); // Box 355
		bodyModel[193] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[194] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[195] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[196] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[197] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[198] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[199] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[200] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[201] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[202] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[203] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[204] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 384
		bodyModel[205] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 385
		bodyModel[206] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 386
		bodyModel[207] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 387
		bodyModel[208] = new ModelRendererTurbo(this, 203, 55, textureX, textureY); // Box 388
		bodyModel[209] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[210] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[211] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[212] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[213] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[214] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 189 ditchlight f
		bodyModel[215] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 190 ditchlight f
		bodyModel[216] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[217] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 240 ditchlight r
		bodyModel[218] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 241 ditchlight r
		bodyModel[219] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[220] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[221] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[222] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[223] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[224] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[225] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, "lamp"); // Box 410 glow commander
		bodyModel[226] = new ModelRendererTurbo(this, 340, 108, textureX, textureY); // Box 411
		bodyModel[227] = new ModelRendererTurbo(this, 342, 70, textureX, textureY); // Box 412
		bodyModel[228] = new ModelRendererTurbo(this, 362, 70, textureX, textureY); // Box 413
		bodyModel[229] = new ModelRendererTurbo(this, 354, 108, textureX, textureY); // Box 414
		bodyModel[230] = new ModelRendererTurbo(this, 250, 51, textureX, textureY); // Box 415
		bodyModel[231] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 416 ditchlight f
		bodyModel[232] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[233] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 418 ditchlight f
		bodyModel[234] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[235] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[236] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[237] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[238] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[239] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[240] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[241] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[242] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[243] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[244] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[245] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[246] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[247] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[248] = new ModelRendererTurbo(this, 196, 9, textureX, textureY); // Box 894
		bodyModel[249] = new ModelRendererTurbo(this, 198, 12, textureX, textureY); // Box 895
		bodyModel[250] = new ModelRendererTurbo(this, 196, 3, textureX, textureY); // Box 202
		bodyModel[251] = new ModelRendererTurbo(this, 487, 83, textureX, textureY, "lamp"); // Box 438 headlight o canada
		bodyModel[252] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 439
		bodyModel[253] = new ModelRendererTurbo(this, 147, 154, textureX, textureY); // Box 86
		bodyModel[254] = new ModelRendererTurbo(this, 134, 156, textureX, textureY); // Box 87
		bodyModel[255] = new ModelRendererTurbo(this, 134, 161, textureX, textureY); // Box 86
		bodyModel[256] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Box 87
		bodyModel[257] = new ModelRendererTurbo(this, 330, 123, textureX, textureY); // Box 450 extended tank
		bodyModel[258] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 451
		bodyModel[259] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 452
		bodyModel[260] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 453
		bodyModel[261] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 454
		bodyModel[262] = new ModelRendererTurbo(this, 457, 80, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[263] = new ModelRendererTurbo(this, 501, 80, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[264] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 19
		bodyModel[265] = new ModelRendererTurbo(this, 272, 116, textureX, textureY); // Box 334
		bodyModel[266] = new ModelRendererTurbo(this, 257, 124, textureX, textureY); // Box 335
		bodyModel[267] = new ModelRendererTurbo(this, 257, 131, textureX, textureY); // Box 336
		bodyModel[268] = new ModelRendererTurbo(this, 233, 122, textureX, textureY); // Box 337
		bodyModel[269] = new ModelRendererTurbo(this, 236, 131, textureX, textureY); // Box 338
		bodyModel[270] = new ModelRendererTurbo(this, 236, 124, textureX, textureY); // Box 339
		bodyModel[271] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, "lamp"); // Box 340 glow commander
		bodyModel[272] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[273] = new ModelRendererTurbo(this, 303, 114, textureX, textureY); // Box 629
		bodyModel[274] = new ModelRendererTurbo(this, 293, 114, textureX, textureY); // Box 630
		bodyModel[275] = new ModelRendererTurbo(this, 405, 123, textureX, textureY); // Box 726
		bodyModel[276] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 727
		bodyModel[277] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 382
		bodyModel[278] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[279] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[280] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f
		bodyModel[281] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f
		bodyModel[282] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[283] = new ModelRendererTurbo(this, 77, 69, textureX, textureY, "lamp"); // Box 350 liveryimg 3 glow
		bodyModel[284] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 liveryimg 3 glow
		bodyModel[285] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[286] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 354
		bodyModel[287] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 355
		bodyModel[288] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 356
		bodyModel[289] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 357
		bodyModel[290] = new ModelRendererTurbo(this, 253, 51, textureX, textureY); // Box 369
		bodyModel[291] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[292] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[293] = new ModelRendererTurbo(this, 260, 56, textureX, textureY); // Box 372
		bodyModel[294] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[295] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[296] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[297] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[298] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[299] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[300] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[301] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[302] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[303] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[304] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[305] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[306] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[307] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[308] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[309] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[310] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[311] = new ModelRendererTurbo(this, 307, 152, textureX, textureY); // Box 278
		bodyModel[312] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 315
		bodyModel[313] = new ModelRendererTurbo(this, 256, 118, textureX, textureY); // Box 382
		bodyModel[314] = new ModelRendererTurbo(this, 234, 118, textureX, textureY); // Box 383
		bodyModel[315] = new ModelRendererTurbo(this, 463, 88, textureX, textureY, "lamp"); // Box 384 markerlight glow
		bodyModel[316] = new ModelRendererTurbo(this, 501, 88, textureX, textureY, "lamp"); // Box 385 markerlight glow
		bodyModel[317] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[318] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[319] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 388 ditchlight r
		bodyModel[320] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 389 ditchlight r
		bodyModel[321] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 446
		bodyModel[322] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 447
		bodyModel[323] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[324] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[325] = new ModelRendererTurbo(this, 63, 7, textureX, textureY); // Box 394 awvr window
		bodyModel[326] = new ModelRendererTurbo(this, 53, 2, textureX, textureY); // Box 394 awvr window
		bodyModel[327] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 396
		bodyModel[328] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 397
		bodyModel[329] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 398
		bodyModel[330] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 399
		bodyModel[331] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 400
		bodyModel[332] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 401
		bodyModel[333] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 402
		bodyModel[334] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 403
		bodyModel[335] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 395
		bodyModel[336] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 396
		bodyModel[337] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 397
		bodyModel[338] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 398
		bodyModel[339] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[340] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[341] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[342] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[343] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "lamp"); // Box 412 ditchlight f
		bodyModel[344] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "lamp"); // Box 412 ditchlight f
		bodyModel[345] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 414
		bodyModel[346] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 415
		bodyModel[347] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, "lamp"); // Box 416 ditchlight r
		bodyModel[348] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, "lamp"); // Box 417 ditchlight r
		bodyModel[349] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[350] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[351] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[352] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[353] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 394
		bodyModel[354] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 395
		bodyModel[355] = new ModelRendererTurbo(this, 73, 134, textureX, textureY); // Box 396
		bodyModel[356] = new ModelRendererTurbo(this, 73, 134, textureX, textureY); // Box 397
		bodyModel[357] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 398
		bodyModel[358] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 399
		bodyModel[359] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 400
		bodyModel[360] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 401
		bodyModel[361] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 402
		bodyModel[362] = new ModelRendererTurbo(this, 86, 134, textureX, textureY); // Box 403
		bodyModel[363] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 404
		bodyModel[364] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 405
		bodyModel[365] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[366] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[367] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[368] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[369] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[370] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[371] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[372] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[373] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[374] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[375] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[376] = new ModelRendererTurbo(this, 355, 171, textureX, textureY); // Box 418
		bodyModel[377] = new ModelRendererTurbo(this, 403, 171, textureX, textureY); // Box 419
		bodyModel[378] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[379] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[380] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[381] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[382] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[383] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[384] = new ModelRendererTurbo(this, 208, 12, textureX, textureY); // Box 421 prime base
		bodyModel[385] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[386] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[387] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[388] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[389] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[390] = new ModelRendererTurbo(this, 175, 5, textureX, textureY); // Box 287
		bodyModel[391] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 288
		bodyModel[392] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 289
		bodyModel[393] = new ModelRendererTurbo(this, 114, 58, textureX, textureY); // Box 43
		bodyModel[394] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 298
		bodyModel[395] = new ModelRendererTurbo(this, 485, 13, textureX, textureY); // Box 376
		bodyModel[396] = new ModelRendererTurbo(this, 459, 10, textureX, textureY); // Box 377
		bodyModel[397] = new ModelRendererTurbo(this, 459, 19, textureX, textureY); // Box 378
		bodyModel[398] = new ModelRendererTurbo(this, 500, 10, textureX, textureY); // Box 379
		bodyModel[399] = new ModelRendererTurbo(this, 459, 1, textureX, textureY); // Box 380
		bodyModel[400] = new ModelRendererTurbo(this, 474, 10, textureX, textureY); // Box 381
		bodyModel[401] = new ModelRendererTurbo(this, 269, 17, textureX, textureY); // Box 394
		bodyModel[402] = new ModelRendererTurbo(this, 269, 20, textureX, textureY); // Box 395
		bodyModel[403] = new ModelRendererTurbo(this, 269, 23, textureX, textureY); // Box 396
		bodyModel[404] = new ModelRendererTurbo(this, 267, 12, textureX, textureY); // Box 397
		bodyModel[405] = new ModelRendererTurbo(this, 269, 8, textureX, textureY); // Box 399
		bodyModel[406] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, "lamp"); // Box 340 glow commander
		bodyModel[407] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[408] = new ModelRendererTurbo(this, 260, 20, textureX, textureY); // Box 114
		bodyModel[409] = new ModelRendererTurbo(this, 260, 17, textureX, textureY); // Box 74
		bodyModel[410] = new ModelRendererTurbo(this, 260, 23, textureX, textureY); // Box 78
		bodyModel[411] = new ModelRendererTurbo(this, 258, 12, textureX, textureY); // Box 877
		bodyModel[412] = new ModelRendererTurbo(this, 260, 8, textureX, textureY); // Box 332
		bodyModel[413] = new ModelRendererTurbo(this, 260, 8, textureX, textureY); // Box 333
		bodyModel[414] = new ModelRendererTurbo(this, 269, 8, textureX, textureY); // Box 399
		bodyModel[415] = new ModelRendererTurbo(this, 232, 43, textureX, textureY); // Box 369
		bodyModel[416] = new ModelRendererTurbo(this, 234, 51, textureX, textureY); // Box 370
		bodyModel[417] = new ModelRendererTurbo(this, 234, 48, textureX, textureY); // Box 371
		bodyModel[418] = new ModelRendererTurbo(this, 237, 48, textureX, textureY); // Box 372
		bodyModel[419] = new ModelRendererTurbo(this, 244, 48, textureX, textureY); // Box 373
		bodyModel[420] = new ModelRendererTurbo(this, 244, 51, textureX, textureY); // Box 374
		bodyModel[421] = new ModelRendererTurbo(this, 221, 32, textureX, textureY); // Box 327
		bodyModel[422] = new ModelRendererTurbo(this, 223, 26, textureX, textureY); // Box 328
		bodyModel[423] = new ModelRendererTurbo(this, 223, 38, textureX, textureY); // Box 329
		bodyModel[424] = new ModelRendererTurbo(this, 232, 32, textureX, textureY); // Box 330
		bodyModel[425] = new ModelRendererTurbo(this, 225, 29, textureX, textureY); // Box 331
		bodyModel[426] = new ModelRendererTurbo(this, 225, 35, textureX, textureY); // Box 332
		bodyModel[427] = new ModelRendererTurbo(this, 171, 22, textureX, textureY); // Box 371
		bodyModel[428] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 371
		bodyModel[429] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[430] = new ModelRendererTurbo(this, 250, 53, textureX, textureY); // Box 415
		bodyModel[431] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 384
		bodyModel[432] = new ModelRendererTurbo(this, 239, 32, textureX, textureY); // Box 385
		bodyModel[433] = new ModelRendererTurbo(this, 239, 29, textureX, textureY); // Box 386
		bodyModel[434] = new ModelRendererTurbo(this, 246, 31, textureX, textureY); // Box 387
		bodyModel[435] = new ModelRendererTurbo(this, 251, 32, textureX, textureY); // Box 327
		bodyModel[436] = new ModelRendererTurbo(this, 253, 26, textureX, textureY); // Box 328
		bodyModel[437] = new ModelRendererTurbo(this, 253, 38, textureX, textureY); // Box 329
		bodyModel[438] = new ModelRendererTurbo(this, 262, 32, textureX, textureY); // Box 330
		bodyModel[439] = new ModelRendererTurbo(this, 255, 29, textureX, textureY); // Box 331
		bodyModel[440] = new ModelRendererTurbo(this, 255, 35, textureX, textureY); // Box 332
		bodyModel[441] = new ModelRendererTurbo(this, 267, 35, textureX, textureY); // Box 384
		bodyModel[442] = new ModelRendererTurbo(this, 269, 32, textureX, textureY); // Box 385
		bodyModel[443] = new ModelRendererTurbo(this, 269, 29, textureX, textureY); // Box 386
		bodyModel[444] = new ModelRendererTurbo(this, 276, 32, textureX, textureY); // Box 387
		bodyModel[445] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 373
		bodyModel[446] = new ModelRendererTurbo(this, 216, 20, textureX, textureY); // Box 421 prime base
		bodyModel[447] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[448] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[449] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[450] = new ModelRendererTurbo(this, 216, 16, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[451] = new ModelRendererTurbo(this, 182, 21, textureX, textureY); // Box 374
		bodyModel[452] = new ModelRendererTurbo(this, 200, 21, textureX, textureY); // Box 320
		bodyModel[453] = new ModelRendererTurbo(this, 200, 18, textureX, textureY); // Box 321
		bodyModel[454] = new ModelRendererTurbo(this, 197, 13, textureX, textureY); // Box 323
		bodyModel[455] = new ModelRendererTurbo(this, 197, 17, textureX, textureY); // Box 324
		bodyModel[456] = new ModelRendererTurbo(this, 250, 15, textureX, textureY, "lamp"); // Box 340 glow commander
		bodyModel[457] = new ModelRendererTurbo(this, 249, 19, textureX, textureY); // Box 341
		bodyModel[458] = new ModelRendererTurbo(this, 168, 56, textureX, textureY); // Box 384
		bodyModel[459] = new ModelRendererTurbo(this, 170, 53, textureX, textureY); // Box 385
		bodyModel[460] = new ModelRendererTurbo(this, 170, 50, textureX, textureY); // Box 386
		bodyModel[461] = new ModelRendererTurbo(this, 177, 52, textureX, textureY); // Box 387
		bodyModel[462] = new ModelRendererTurbo(this, 197, 43, textureX, textureY); // Box 384
		bodyModel[463] = new ModelRendererTurbo(this, 197, 40, textureX, textureY); // Box 385
		bodyModel[464] = new ModelRendererTurbo(this, 197, 37, textureX, textureY); // Box 386
		bodyModel[465] = new ModelRendererTurbo(this, 204, 40, textureX, textureY); // Box 387
		bodyModel[466] = new ModelRendererTurbo(this, 171, 25, textureX, textureY); // Box 373
		bodyModel[467] = new ModelRendererTurbo(this, 168, 25, textureX, textureY); // Box 373
		bodyModel[468] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[469] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[470] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[471] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[472] = new ModelRendererTurbo(this, 207, 16, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[473] = new ModelRendererTurbo(this, 477, 47, textureX, textureY); // Box 381 sp mount
		bodyModel[474] = new ModelRendererTurbo(this, 478, 40, textureX, textureY); // Box 31 sp mount
		bodyModel[475] = new ModelRendererTurbo(this, 490, 46, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[476] = new ModelRendererTurbo(this, 497, 46, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[477] = new ModelRendererTurbo(this, 497, 51, textureX, textureY, "lamp"); // Box 386 lamp rear
		bodyModel[478] = new ModelRendererTurbo(this, 490, 51, textureX, textureY, "lamp"); // Box 387lamp rear
		bodyModel[479] = new ModelRendererTurbo(this, 490, 41, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[480] = new ModelRendererTurbo(this, 485, 38, textureX, textureY); // Box 389 sp mount
		bodyModel[481] = new ModelRendererTurbo(this, 430, 101, textureX, textureY); // Box 34
		bodyModel[482] = new ModelRendererTurbo(this, 406, 115, textureX, textureY); // Box 34
		bodyModel[483] = new ModelRendererTurbo(this, 443, 135, textureX, textureY); // Box 34
		bodyModel[484] = new ModelRendererTurbo(this, 106, 51, textureX, textureY); // Box 355
		bodyModel[485] = new ModelRendererTurbo(this, 101, 53, textureX, textureY); // Box 356
		bodyModel[486] = new ModelRendererTurbo(this, 443, 132, textureX, textureY); // Box 34
		bodyModel[487] = new ModelRendererTurbo(this, 451, 132, textureX, textureY); // Box 34
		bodyModel[488] = new ModelRendererTurbo(this, 461, 130, textureX, textureY); // Box 34
		bodyModel[489] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 34
		bodyModel[490] = new ModelRendererTurbo(this, 469, 99, textureX, textureY); // Box 34
		bodyModel[491] = new ModelRendererTurbo(this, 464, 53, textureX, textureY); // Box 34
		bodyModel[492] = new ModelRendererTurbo(this, 180, 145, textureX, textureY); // Box 359 atsf 5700
		bodyModel[493] = new ModelRendererTurbo(this, 180, 166, textureX, textureY); // Box 497
		bodyModel[494] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull
		bodyModel[495] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull
		bodyModel[496] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull
		bodyModel[497] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull
		bodyModel[498] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull
		bodyModel[499] = new ModelRendererTurbo(this, 455, 142, textureX, textureY, "cull"); // Box 299 grate cull

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, 0F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(41.5F, -21F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(41.5F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 43, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-20.5F, -2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 56, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-20.5F, -21F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 112
		bodyModel[6].setRotationPoint(-8F, 3F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[7].setRotationPoint(-43.5F, 2F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[8].setRotationPoint(-47.51F, 0F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[9].setRotationPoint(-43.5F, 2F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[10].setRotationPoint(-43.5F, 0F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[11].setRotationPoint(-43.5F, 5F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[12].setRotationPoint(-43.5F, 5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[13].setRotationPoint(-43.5F, 0F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[14].setRotationPoint(-47.51F, -8F, -8F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-47.51F, -8F, 8F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-47.5F, -2F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-47.5F, -2F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[18].setRotationPoint(-51.5F, 4F, -1.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[19].setRotationPoint(-51.51F, 0F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 197
		bodyModel[20].setRotationPoint(-47.5F, 0F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(-47.5F, -8F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[22].setRotationPoint(-47.5F, -8F, -8F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[23].setRotationPoint(-48.5F, -8F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[24].setRotationPoint(-47.5F, -8F, 4F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[25].setRotationPoint(-47.5F, -8F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[26].setRotationPoint(-50.5F, 7F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(-50.5F, 6F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[28].setRotationPoint(-50.5F, 8F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-50.5F, 7F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(-51F, 6F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-50.5F, 8F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(-48.5F, 3.5F, -2F);

		bodyModel[33].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 159
		bodyModel[33].setRotationPoint(-42.5F, 0F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[34].setRotationPoint(46.5F, 0F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[35].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[36].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[37].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[38].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 264
		bodyModel[39].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[40].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 2, 14, 0F); // Box 266
		bodyModel[41].setRotationPoint(43.5F, 0F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(41.5F, 2F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[43].setRotationPoint(46.5F, 4F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[44].setRotationPoint(46.5F, -8F, -8F);
		bodyModel[44].rotateAngleY = -3.14159265F;

		bodyModel[45].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[45].setRotationPoint(46.51F, -2F, 10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[46].setRotationPoint(46.5F, -8F, 8F);

		bodyModel[47].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[47].setRotationPoint(46.51F, -2F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 80
		bodyModel[48].setRotationPoint(46.51F, -8F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 81
		bodyModel[49].setRotationPoint(46.51F, -8F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[50].setRotationPoint(47.5F, 0F, -2F);

		bodyModel[51].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 234
		bodyModel[51].setRotationPoint(47.49F, -8F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 236
		bodyModel[52].setRotationPoint(46.49F, -8F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[53].setRotationPoint(46.5F, 7F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[54].setRotationPoint(46.5F, 6F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[55].setRotationPoint(46.5F, 8F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(46.5F, 7F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[57].setRotationPoint(47F, 6F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[58].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[59].setRotationPoint(46.5F, 3.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[60].setRotationPoint(-47.5F, 2F, -3F);

		bodyModel[61].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[61].setRotationPoint(-32F, -18F, -10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[62].setRotationPoint(-21.5F, -18F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[63].setRotationPoint(-31.5F, -18F, 10F);

		bodyModel[64].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[64].setRotationPoint(-31.5F, -18F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[65].setRotationPoint(-32.5F, -18F, -7F);

		bodyModel[66].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[66].setRotationPoint(-21F, -18F, 10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[67].setRotationPoint(-32.5F, -4F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[68].setRotationPoint(46.5F, 0F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[69].setRotationPoint(46.5F, 0F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[70].setRotationPoint(46.49F, -8F, 4F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[71].setRotationPoint(46.5F, 7F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[72].setRotationPoint(-32.5F, -21F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[73].setRotationPoint(-21.5F, -21F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[74].setRotationPoint(-32.5F, -21F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[75].setRotationPoint(-34.5F, -21F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[76].setRotationPoint(-34.5F, -21F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[77].setRotationPoint(-34.5F, -21F, 1F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[78].setRotationPoint(-32.55F, -19.5F, -6F);
		bodyModel[78].rotateAngleY = 0.38397244F;

		bodyModel[79].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[79].setRotationPoint(-32.55F, -19.5F, 6F);
		bodyModel[79].rotateAngleY = -0.38397244F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[80].setRotationPoint(-35F, -21F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[81].setRotationPoint(-35F, -19F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[82].setRotationPoint(-21.5F, -21F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[83].setRotationPoint(-31.5F, -21F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[84].setRotationPoint(-31.5F, -21F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[85].setRotationPoint(-31.5F, -21F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[86].setRotationPoint(-21.5F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[87].setRotationPoint(-32.5F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[88].setRotationPoint(46.5F, 8F, -10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[89].setRotationPoint(-47.5F, 8F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[90].setRotationPoint(-47.5F, 7F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[91].setRotationPoint(-42.5F, 1F, -11F);

		bodyModel[92].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[92].setRotationPoint(-42.5F, 1F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 231
		bodyModel[93].setRotationPoint(11.5F, 1F, 7F);

		bodyModel[94].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 232
		bodyModel[94].setRotationPoint(11.5F, 1F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 233
		bodyModel[95].setRotationPoint(-8F, 3F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[96].setRotationPoint(-8F, 6F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 235
		bodyModel[97].setRotationPoint(-8F, 3F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 18, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 236
		bodyModel[98].setRotationPoint(-8F, 6F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[99].setRotationPoint(-5.5F, 0.5F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[100].setRotationPoint(-5.5F, 1.5F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[101].setRotationPoint(-5.5F, 1.5F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[102].setRotationPoint(-5.5F, 0.5F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[103].setRotationPoint(-12.5F, 1F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[104].setRotationPoint(-12.5F, 1F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[105].setRotationPoint(10.5F, 1F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[106].setRotationPoint(10.5F, 1F, -11F);

		bodyModel[107].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[107].setRotationPoint(-39.5F, -4F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 8, 4, 4, 0F); // Box 246
		bodyModel[108].setRotationPoint(-40.5F, -4F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[109].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[110].setRotationPoint(-43.5F, -6F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[111].setRotationPoint(-43.5F, -10F, 10.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 17, 2, 0F); // Box 177
		bodyModel[112].setRotationPoint(-43.5F, -12F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[113].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[114].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[115].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[116].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 8, 0, 0F); // Box 258
		bodyModel[117].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[118].setRotationPoint(-38.5F, -12F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[119].setRotationPoint(-40.5F, -8F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 267
		bodyModel[120].setRotationPoint(-43.5F, -12F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[121].setRotationPoint(-49.5F, 0F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[122].setRotationPoint(-49.5F, 0F, 0F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[123].setRotationPoint(-20.5F, -10F, -10F);

		bodyModel[124].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[124].setRotationPoint(-16F, -13F, -9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[125].setRotationPoint(-16F, -15F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[126].setRotationPoint(-17.5F, -22F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[127].setRotationPoint(-6.5F, -22.5F, -2.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[128].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[129].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[129].setRotationPoint(33.5F, -22F, -3F);

		bodyModel[130].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[130].setRotationPoint(26.5F, -22F, -3F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[131].setRotationPoint(-1.5F, -22F, -3F);

		bodyModel[132].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[132].setRotationPoint(19.5F, -22F, -3F);

		bodyModel[133].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[133].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[134].setRotationPoint(-40.5F, -4F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[135].setRotationPoint(-41.5F, -4F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 285
		bodyModel[136].setRotationPoint(-18.5F, -20.5F, -7.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 11, 5, 1, 0F); // Box 286
		bodyModel[137].setRotationPoint(-18.5F, -20.5F, 6.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[138].setRotationPoint(42.5F, -6F, -11.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[139].setRotationPoint(42.5F, -8F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[140].setRotationPoint(42.5F, -6F, 10.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[141].setRotationPoint(42.5F, -8F, 9F);

		bodyModel[142].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 291
		bodyModel[142].setRotationPoint(-16.5F, -8F, 11F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[143].setRotationPoint(-20.5F, -4F, 7F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[144].setRotationPoint(-18.5F, -4F, 11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[145].setRotationPoint(-17.5F, -4F, 11F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[146].setRotationPoint(-20.5F, -12F, 11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[147].setRotationPoint(-19.5F, -10F, 11F);

		bodyModel[148].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 297
		bodyModel[148].setRotationPoint(31F, -20.5F, -7.25F);

		bodyModel[149].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 298
		bodyModel[149].setRotationPoint(20.5F, -20.5F, -7.25F);

		bodyModel[150].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 299
		bodyModel[150].setRotationPoint(31F, -20.5F, 6.25F);

		bodyModel[151].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 300
		bodyModel[151].setRotationPoint(20.5F, -20.5F, 6.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[152].setRotationPoint(46.5F, 0F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[153].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[154].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[155].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[156].setRotationPoint(42.75F, -19F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[157].setRotationPoint(44F, -19F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[158].setRotationPoint(44F, -19F, 0F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[159].setRotationPoint(-20.5F, -21F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[160].setRotationPoint(-7.5F, -21F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[161].setRotationPoint(-20.5F, -21F, 7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[162].setRotationPoint(-7.5F, -21F, 7F);

		bodyModel[163].addBox(0F, 0F, 0F, 39, 8, 0, 0F); // Box 312
		bodyModel[163].setRotationPoint(-17.5F, -10F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[164].setRotationPoint(-19.5F, -12F, -11F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[165].setRotationPoint(-20.5F, -12F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[166].setRotationPoint(21.5F, -10F, -11F);

		bodyModel[167].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[167].setRotationPoint(23.5F, -8F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[168].setRotationPoint(12.5F, -22F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[169].setRotationPoint(41F, -21.5F, -0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[170].setRotationPoint(-42.5F, -13.5F, -0.5F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[171].setRotationPoint(-36.5F, -21F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[172].setRotationPoint(-37.5F, -21F, -7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[173].setRotationPoint(-37.5F, -21F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[174].setRotationPoint(-45.5F, -8F, -7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[175].setRotationPoint(-45.5F, -8F, 0F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[176].setRotationPoint(-43.4F, -11.5F, 5.5F);
		bodyModel[176].rotateAngleY = -0.43633231F;

		bodyModel[177].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[177].setRotationPoint(-43.4F, -11.5F, -5.5F);
		bodyModel[177].rotateAngleY = 0.43633231F;

		bodyModel[178].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 43
		bodyModel[178].setRotationPoint(-42.5F, -13F, -6F);

		bodyModel[179].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[179].setRotationPoint(-41.5F, -13F, -6F);

		bodyModel[180].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[180].setRotationPoint(-41.5F, -13F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[181].setRotationPoint(-41F, -8.5F, -7F);

		bodyModel[182].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[182].setRotationPoint(-40.5F, -6.5F, -7F);

		bodyModel[183].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[183].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[184].setRotationPoint(-41.5F, -9F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[185].setRotationPoint(-1.5F, -21F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[186].setRotationPoint(-1.5F, -21F, 7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[187].setRotationPoint(-6.5F, -21F, -9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[188].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[189].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[190].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[191].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[192].setRotationPoint(-41.5F, -12F, -7.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[193].setRotationPoint(-40.5F, -11F, -7.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[194].setRotationPoint(-36.5F, -19F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[195].setRotationPoint(-36.5F, -20F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[196].setRotationPoint(-36.25F, -18.5F, -0.25F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[197].setRotationPoint(-36.5F, -21F, -0.5F);

		bodyModel[198].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[198].setRotationPoint(-29.5F, -23F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[199].setRotationPoint(-30.5F, -23F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[200].setRotationPoint(-30.5F, -22F, 2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[201].setRotationPoint(13.5F, -22.5F, -7F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[202].setRotationPoint(12.5F, -23.5F, -6.75F);

		bodyModel[203].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[203].setRotationPoint(11.5F, -23.5F, -5.25F);

		bodyModel[204].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[204].setRotationPoint(-35.5F, -23F, -1.5F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[205].setRotationPoint(-34F, -23F, -0.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[206].setRotationPoint(-34.75F, -23F, 0.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[207].setRotationPoint(-33.75F, -22.5F, -0.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 388
		bodyModel[208].setRotationPoint(-29.5F, -22.5F, -5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[209].setRotationPoint(-13.5F, 3F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[210].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[211].setRotationPoint(-13.25F, 3.5F, -10.25F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[212].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[213].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[214].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[215].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[216].setRotationPoint(45.5F, -2F, -6.75F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[217].setRotationPoint(45.75F, -2F, -6.75F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[218].setRotationPoint(45.75F, -2F, 4.75F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[219].setRotationPoint(45.5F, -2F, 4.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[220].setRotationPoint(-19.5F, -19F, -8.7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[221].setRotationPoint(-19.5F, -20F, -8.7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[222].setRotationPoint(-19.25F, -18.5F, -8.45F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[223].setRotationPoint(-19.5F, -21F, -8.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[224].setRotationPoint(-33.82F, -22F, -0.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[225].setRotationPoint(-34F, -23F, -0.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[226].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[227].setRotationPoint(-28.5F, 2F, 7F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[228].setRotationPoint(25.5F, 2F, 7F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[229].setRotationPoint(25.5F, 2F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[230].setRotationPoint(-28.5F, -22F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f
		bodyModel[231].setRotationPoint(-48.25F, 1F, -5.75F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[232].setRotationPoint(-48F, 1F, -5.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f
		bodyModel[233].setRotationPoint(-48.25F, 1F, 3.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[234].setRotationPoint(-48F, 1F, 3.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[235].setRotationPoint(-30.5F, -18F, 11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[236].setRotationPoint(-30.5F, -18F, -12F);

		bodyModel[237].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[237].setRotationPoint(-31.5F, -16F, -12F);

		bodyModel[238].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[238].setRotationPoint(-31.5F, -16F, 11F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[239].setRotationPoint(-34.5F, -23F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[240].setRotationPoint(-35.25F, -23F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[241].setRotationPoint(-35.25F, -23F, -2F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[242].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[243].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[244].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[245].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[246].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[247].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[248].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[248].setRotationPoint(39.5F, -23F, 4.5F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[249].setRotationPoint(39.5F, -22F, 4.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[250].setRotationPoint(40.5F, -23.5F, 3.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight o canada
		bodyModel[251].setRotationPoint(44F, -19F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[252].setRotationPoint(-15.5F, -23F, -3F);

		bodyModel[253].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[253].setRotationPoint(-31.6F, -12F, -5F);
		bodyModel[253].rotateAngleY = -0.38397244F;

		bodyModel[254].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[254].setRotationPoint(-31.5F, -13F, -4F);

		bodyModel[255].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[255].setRotationPoint(-28.5F, -14F, -5.5F);
		bodyModel[255].rotateAngleY = -0.38397244F;

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[256].setRotationPoint(-30.5F, -13.75F, -4F);
		bodyModel[256].rotateAngleY = -0.38397244F;

		bodyModel[257].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[257].setRotationPoint(-11F, 1F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[258].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[259].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[260].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[261].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[262].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[262].setRotationPoint(41.95F, -16F, -6F);
		bodyModel[262].rotateAngleY = -0.41887902F;

		bodyModel[263].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[263].setRotationPoint(41.95F, -16F, 6F);
		bodyModel[263].rotateAngleY = 0.41887902F;

		bodyModel[264].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[264].setRotationPoint(-8F, 2F, -11.5F);
		bodyModel[264].rotateAngleX = 0.87266463F;

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[265].setRotationPoint(-8F, 3.5F, 8.75F);
		bodyModel[265].rotateAngleX = 0.87266463F;

		bodyModel[266].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 335
		bodyModel[266].setRotationPoint(-11F, 3F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[267].setRotationPoint(-11F, 6F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[268].setRotationPoint(-11F, 3F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[269].setRotationPoint(-11F, 6F, 8F);

		bodyModel[270].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 339
		bodyModel[270].setRotationPoint(-11F, 3F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[271].setRotationPoint(-28F, -23F, -0.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[272].setRotationPoint(-27.82F, -22F, -0.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[273].setRotationPoint(-26.5F, 4F, -1F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[274].setRotationPoint(-33.5F, 4F, -1F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[275].setRotationPoint(30.5F, 4F, -1F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[276].setRotationPoint(23.5F, 4F, -1F);

		bodyModel[277].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[277].setRotationPoint(-42.5F, -21F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[278].setRotationPoint(-45.5F, -21F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[279].setRotationPoint(-45.5F, -21F, 0F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f
		bodyModel[280].setRotationPoint(-46F, -19F, 0F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f
		bodyModel[281].setRotationPoint(-46F, -19F, -2F);

		bodyModel[282].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[282].setRotationPoint(-45.75F, -19F, -2F);

		bodyModel[283].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 liveryimg 3 glow
		bodyModel[283].setRotationPoint(-43F, -16F, 6F);
		bodyModel[283].rotateAngleY = -0.40142573F;

		bodyModel[284].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 liveryimg 3 glow
		bodyModel[284].setRotationPoint(-43F, -16F, -6F);
		bodyModel[284].rotateAngleY = 0.40142573F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[285].setRotationPoint(-42.5F, -21.5F, -0.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[286].setRotationPoint(-45F, -23F, -5.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[287].setRotationPoint(-44F, -22.75F, -4.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[288].setRotationPoint(-44.5F, -22.75F, -6.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[289].setRotationPoint(-42.5F, -22F, -5.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[290].setRotationPoint(-20.5F, -23F, 2F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[291].setRotationPoint(-20.5F, -23F, 2F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[292].setRotationPoint(-20.5F, -23F, 6F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[293].setRotationPoint(-20.5F, -24F, 4F);

		bodyModel[294].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[294].setRotationPoint(-17.5F, -23F, 6F);

		bodyModel[295].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[295].setRotationPoint(-17.5F, -23F, 2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[296].setRotationPoint(-45.5F, -10F, 1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[297].setRotationPoint(-44.48F, -13F, -1F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[298].setRotationPoint(-45.5F, -10F, -1F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[299].setRotationPoint(-45.5F, -12F, -1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[300].setRotationPoint(-45.5F, -13F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[301].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[302].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[303].setRotationPoint(-45.5F, -11F, -1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[304].setRotationPoint(-45.5F, -13F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[305].setRotationPoint(-45.5F, -13F, -7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[306].setRotationPoint(-45.25F, -12F, -2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[307].setRotationPoint(-45.25F, -12F, 0F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[308].setRotationPoint(-45.25F, -14F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[309].setRotationPoint(-44.48F, -14F, -1.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[310].setRotationPoint(-44.65F, -13F, -2F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[311].setRotationPoint(-8F, 2F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[312].setRotationPoint(-8F, 2F, 7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[313].setRotationPoint(-11F, 2F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[314].setRotationPoint(-11F, 2F, 7F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[315].setRotationPoint(41.4F, -13.5F, -5.5F);
		bodyModel[315].rotateAngleY = -0.43633231F;

		bodyModel[316].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[316].setRotationPoint(41.4F, -13.5F, 5.5F);
		bodyModel[316].rotateAngleY = 0.43633231F;

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[317].setRotationPoint(46F, 1F, 3.75F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[318].setRotationPoint(46F, 1F, -5.75F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r
		bodyModel[319].setRotationPoint(46.25F, 1F, -5.75F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r
		bodyModel[320].setRotationPoint(46.25F, 1F, 3.75F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[321].setRotationPoint(-51F, 4F, -10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[322].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[323].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[324].setRotationPoint(-50.5F, 5F, -10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[325].setRotationPoint(-33.5F, -17F, 0F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[326].setRotationPoint(-33.5F, -17F, -6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[327].setRotationPoint(42.5F, 3F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[328].setRotationPoint(43.5F, 1F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[329].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[330].setRotationPoint(42.5F, 8F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		bodyModel[331].setRotationPoint(42.5F, 8F, 9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 401
		bodyModel[332].setRotationPoint(42.5F, 5F, 8F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[333].setRotationPoint(42.5F, 3F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[334].setRotationPoint(43.5F, 1F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[335].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[336].setRotationPoint(46.5F, 5F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[337].setRotationPoint(47F, 4F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[338].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[339].setRotationPoint(-40.5F, -2F, -11F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[340].setRotationPoint(-41.5F, -2F, 7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[341].setRotationPoint(-48.5F, -3F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[342].setRotationPoint(-48.5F, -3F, 3F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[343].setRotationPoint(-48.75F, -3F, -5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[344].setRotationPoint(-48.75F, -3F, 3F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[345].setRotationPoint(46.5F, -3F, 3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[346].setRotationPoint(46.5F, -3F, -5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r
		bodyModel[347].setRotationPoint(46.75F, -3F, -5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r
		bodyModel[348].setRotationPoint(46.75F, -3F, 3F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[349].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[350].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[351].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[352].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[353].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[353].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[354].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[354].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[355].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[355].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 397
		bodyModel[356].setRotationPoint(43.5F, 2F, 7F);

		bodyModel[357].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 398
		bodyModel[357].setRotationPoint(42.5F, 4F, 8F);

		bodyModel[358].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 399
		bodyModel[358].setRotationPoint(42.5F, 7F, 9F);

		bodyModel[359].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[359].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[360].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[361].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[361].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[362].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 403
		bodyModel[362].setRotationPoint(43.5F, 2F, -7F);

		bodyModel[363].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 404
		bodyModel[363].setRotationPoint(42.5F, 4F, -8F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 405
		bodyModel[364].setRotationPoint(42.5F, 7F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[365].setRotationPoint(-31.5F, -22F, 7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[366].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[367].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[368].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[369].setRotationPoint(-31.5F, -22.5F, 7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[370].setRotationPoint(-32F, -21F, 7F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[371].setRotationPoint(-31.5F, -13F, 3F);

		bodyModel[372].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[372].setRotationPoint(-31.6F, -12F, 1F);
		bodyModel[372].rotateAngleY = -0.38397244F;

		bodyModel[373].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[373].setRotationPoint(-30F, -14F, 1F);
		bodyModel[373].rotateAngleY = -0.38397244F;

		bodyModel[374].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[374].setRotationPoint(-29.5F, -17F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[375].setRotationPoint(-29.5F, -18F, 10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[376].setRotationPoint(51.5F, 0F, 0F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[377].setRotationPoint(51.5F, 0F, -7F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[378].setRotationPoint(-32F, -21.5F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[379].setRotationPoint(-31.5F, -22.5F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[380].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[381].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[382].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[383].setRotationPoint(-31.5F, -23F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[384].setRotationPoint(-33.5F, -22F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[385].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[386].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[387].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[388].setRotationPoint(-33.5F, -22.5F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[389].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[390].setRotationPoint(-14F, 2F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[391].setRotationPoint(-14F, 3F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[392].setRotationPoint(-13.5F, 3.5F, -10.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 43
		bodyModel[393].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[394].setRotationPoint(-45.5F, -10F, -7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[395].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 377
		bodyModel[396].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[397].setRotationPoint(16.5F, -21F, -9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[398].setRotationPoint(40.5F, -21F, -9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 24, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 380
		bodyModel[399].setRotationPoint(16.5F, -21F, 7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 381
		bodyModel[400].setRotationPoint(40.5F, -21F, 7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[401].setRotationPoint(45F, -23F, -0.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[402].setRotationPoint(45F, -22F, -0.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[403].setRotationPoint(44.75F, -21.5F, -0.25F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 397
		bodyModel[404].setRotationPoint(44.75F, -23.51F, -1.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[405].setRotationPoint(43F, -23F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[406].setRotationPoint(-43F, -23F, 3.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[407].setRotationPoint(-42.82F, -22F, 3.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[408].setRotationPoint(-47F, -22F, -0.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[409].setRotationPoint(-47F, -23F, -0.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[410].setRotationPoint(-46.75F, -21.5F, -0.25F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[411].setRotationPoint(-46.75F, -23.51F, -1.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 332
		bodyModel[412].setRotationPoint(-46F, -23F, -1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 333
		bodyModel[413].setRotationPoint(-46F, -23F, 1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[414].setRotationPoint(43F, -23F, 1F);

		bodyModel[415].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[415].setRotationPoint(-24.5F, -23F, -5F);

		bodyModel[416].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[416].setRotationPoint(-24.5F, -23F, -5F);

		bodyModel[417].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[417].setRotationPoint(-24.5F, -23F, -1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[418].setRotationPoint(-24.5F, -24F, -3F);

		bodyModel[419].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[419].setRotationPoint(-21.5F, -23F, -1F);

		bodyModel[420].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 374
		bodyModel[420].setRotationPoint(-21.5F, -23F, -5F);

		bodyModel[421].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[421].setRotationPoint(-29F, -22.5F, -1.5F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[422].setRotationPoint(-28F, -22.25F, -0.5F);

		bodyModel[423].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[423].setRotationPoint(-26.5F, -22.25F, 0.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[424].setRotationPoint(-26.5F, -21.5F, -0.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[425].setRotationPoint(-27.5F, -23.5F, 0.25F);

		bodyModel[426].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[426].setRotationPoint(-26.5F, -23.5F, -1F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[427].setRotationPoint(-36.5F, -23F, 2F);

		bodyModel[428].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[428].setRotationPoint(-39.5F, -23F, -2F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[429].setRotationPoint(-25.5F, -22F, -5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[430].setRotationPoint(-28.5F, -22F, 0F);

		bodyModel[431].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[431].setRotationPoint(-34F, -22.5F, 7F);

		bodyModel[432].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[432].setRotationPoint(-33F, -22.5F, 5F);

		bodyModel[433].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[433].setRotationPoint(-33.25F, -22.5F, 6F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[434].setRotationPoint(-32.25F, -22F, 6F);

		bodyModel[435].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[435].setRotationPoint(-36.25F, -22.5F, -1.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[436].setRotationPoint(-34.25F, -22.5F, 0.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[437].setRotationPoint(-33.8F, -22.5F, -0.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[438].setRotationPoint(-33.75F, -21.5F, -0.5F);

		bodyModel[439].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[439].setRotationPoint(-34.75F, -23.5F, 0.25F);

		bodyModel[440].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[440].setRotationPoint(-33.75F, -23.5F, -1F);

		bodyModel[441].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[441].setRotationPoint(-31.5F, -22.5F, 2.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[442].setRotationPoint(-30F, -22.5F, 3.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[443].setRotationPoint(-30.75F, -22.5F, 4.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[444].setRotationPoint(-29.75F, -22F, 3.5F);

		bodyModel[445].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[445].setRotationPoint(-23.5F, -23F, 0F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[446].setRotationPoint(-32.5F, -22F, -4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[447].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[448].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[449].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[450].setRotationPoint(-32.5F, -22.5F, -4F);

		bodyModel[451].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374
		bodyModel[451].setRotationPoint(-16.5F, -23.5F, -1F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[452].setRotationPoint(-30F, -22.5F, -0.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[453].setRotationPoint(-30F, -23.5F, -0.5F);

		bodyModel[454].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 323
		bodyModel[454].setRotationPoint(-31.25F, -24F, -1.75F);
		bodyModel[454].rotateAngleY = -0.78539816F;

		bodyModel[455].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 324
		bodyModel[455].setRotationPoint(-31.25F, -23F, -1.75F);
		bodyModel[455].rotateAngleY = -0.78539816F;

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[456].setRotationPoint(-22F, -23F, -0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[457].setRotationPoint(-21.82F, -22F, -0.5F);

		bodyModel[458].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[458].setRotationPoint(-23.25F, -23F, -1.5F);

		bodyModel[459].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[459].setRotationPoint(-24F, -23F, -0.5F);

		bodyModel[460].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[460].setRotationPoint(-23F, -23F, 0.5F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[461].setRotationPoint(-23F, -22.5F, -0.5F);

		bodyModel[462].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 384
		bodyModel[462].setRotationPoint(24.5F, -24F, -1.5F);

		bodyModel[463].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[463].setRotationPoint(25F, -24F, -0.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[464].setRotationPoint(24.25F, -24F, 0.5F);

		bodyModel[465].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 387
		bodyModel[465].setRotationPoint(25.25F, -23.5F, -0.5F);

		bodyModel[466].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[466].setRotationPoint(-27F, -23F, 5F);

		bodyModel[467].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[467].setRotationPoint(-27F, -23F, -5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[468].setRotationPoint(-28.5F, -22F, -1F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[469].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[470].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[471].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[472].setRotationPoint(-28.5F, -22.5F, -1F);

		bodyModel[473].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[473].setRotationPoint(43F, -22.75F, -2F);

		bodyModel[474].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[474].setRotationPoint(45F, -20.75F, -2F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[475].setRotationPoint(45.25F, -20.75F, -2F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[476].setRotationPoint(45.25F, -20.75F, 0F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[477].setRotationPoint(44.25F, -18.75F, 0F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[478].setRotationPoint(44.25F, -18.75F, -2F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[479].setRotationPoint(45.25F, -22.75F, -1F);

		bodyModel[480].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[480].setRotationPoint(45F, -22.75F, -1F);

		bodyModel[481].addBox(0F, 0F, 0F, 5, 11, 14, 0F); // Box 34
		bodyModel[481].setRotationPoint(35.5F, -21F, -7F);

		bodyModel[482].addBox(0F, 0F, 0F, 5, 10, 13, 0F); // Box 34
		bodyModel[482].setRotationPoint(35.5F, -10F, -7F);

		bodyModel[483].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 34
		bodyModel[483].setRotationPoint(35.5F, -2F, 6F);

		bodyModel[484].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[484].setRotationPoint(36.5F, -9F, 6.75F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[485].setRotationPoint(37.5F, -8F, 5.75F);

		bodyModel[486].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[486].setRotationPoint(35.5F, -3F, 6F);

		bodyModel[487].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 34
		bodyModel[487].setRotationPoint(39.5F, -3F, 6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[488].setRotationPoint(39.5F, -10F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[489].setRotationPoint(35.5F, -10F, 6F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 21, 14, 0F); // Box 34
		bodyModel[490].setRotationPoint(40.5F, -21F, -7F);

		bodyModel[491].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 34
		bodyModel[491].setRotationPoint(35.5F, -10F, 6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 359 atsf 5700
		bodyModel[492].setRotationPoint(-21F, -8F, -11.05F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 0F, -10F, 0F); // Box 497
		bodyModel[493].setRotationPoint(-21F, -8F, 11.05F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[494].setRotationPoint(17.5F, -20.35F, 7.95F);
		bodyModel[494].rotateAngleX = -0.31415927F;

		bodyModel[495].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[495].setRotationPoint(17.5F, -20.05F, -8.95F);
		bodyModel[495].rotateAngleX = 0.31415927F;

		bodyModel[496].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[496].setRotationPoint(25.5F, -20.35F, 7.95F);
		bodyModel[496].rotateAngleX = -0.31415927F;

		bodyModel[497].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[497].setRotationPoint(25.5F, -20.05F, -8.95F);
		bodyModel[497].rotateAngleX = 0.31415927F;

		bodyModel[498].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[498].setRotationPoint(33.5F, -20.35F, 7.95F);
		bodyModel[498].rotateAngleX = -0.31415927F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 27, 19, 1, 0F,0.1F, 0F, 0F, -19.9F, 0F, 0F, -19.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -13.5F, 0F, -19.9F, -13.5F, 0F, -19.9F, -13.5F, 0F, 0.1F, -13.5F, 0F); // Box 299 grate cull
		bodyModel[499].setRotationPoint(33.5F, -20.05F, -8.95F);
		bodyModel[499].rotateAngleX = 0.31415927F;
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 462, 28, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[501] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401
		bodyModel[502] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[503] = new ModelRendererTurbo(this, 394, 208, textureX, textureY, "cull"); // Box 380 cull round ear
		bodyModel[504] = new ModelRendererTurbo(this, 392, 237, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[505] = new ModelRendererTurbo(this, 396, 230, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[506] = new ModelRendererTurbo(this, 454, 208, textureX, textureY, "cull"); // Box 380 cull round ear
		bodyModel[507] = new ModelRendererTurbo(this, 452, 237, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[508] = new ModelRendererTurbo(this, 456, 230, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[509] = new ModelRendererTurbo(this, 454, 217, textureX, textureY, "cull"); // Box 380 cull angle ear
		bodyModel[510] = new ModelRendererTurbo(this, 454, 224, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit
		bodyModel[511] = new ModelRendererTurbo(this, 394, 217, textureX, textureY, "cull"); // Box 380 cull angle ear
		bodyModel[512] = new ModelRendererTurbo(this, 394, 224, textureX, textureY, "cull"); // Box 380 cull ear pannel bullshit

		bodyModel[500].addBox(0F, 0F, 0F, 13, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[500].setRotationPoint(13F, -22.5F, -3.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[501].setRotationPoint(-33F, -23F, -3.5F);

		bodyModel[502].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[502].setRotationPoint(-32F, -23F, -3.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 24, 5, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, -2F, -0.5F, 0.25F, -2F, -0.5F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull round ear
		bodyModel[503].setRotationPoint(16.5F, -20.75F, 8.1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 24, 13, 5, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[504].setRotationPoint(16.5F, -15.75F, 6.1F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[505].setRotationPoint(16.5F, -20.75F, 7.1F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 24, 5, 3, 0F,0.25F, -2F, -0.5F, 0.15F, -2F, -0.5F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull round ear
		bodyModel[506].setRotationPoint(16.5F, -20.75F, -11.1F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 24, 13, 5, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[507].setRotationPoint(16.5F, -15.75F, -11.1F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 24, 5, 1, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[508].setRotationPoint(16.5F, -20.75F, -8.1F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F,0.25F, 0F, -2.5F, 0.15F, 0F, -2.5F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull angle ear
		bodyModel[509].setRotationPoint(16.5F, -20.75F, -11.1F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[510].setRotationPoint(16.5F, -17.75F, -11.1F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 24, 3, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -2.5F, 0.25F, 0F, -2.5F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull angle ear
		bodyModel[511].setRotationPoint(16.5F, -20.75F, 8.1F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 24, 2, 3, 0F,0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.25F, 0F, 0F); // Box 380 cull ear pannel bullshit
		bodyModel[512].setRotationPoint(16.5F, -17.75F, 8.1F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 513; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15435) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 11 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 18) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-1.975F, 0.01F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-1.9F, 0.01F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() {
		return new float[]{-1.9F, 0.15F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{2.5D, 1.5D, 0.0D});
			}
		};
	}
}