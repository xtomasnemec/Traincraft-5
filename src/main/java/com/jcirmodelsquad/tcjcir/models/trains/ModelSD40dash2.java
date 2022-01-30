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

public class ModelSD40dash2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40dash2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[571];

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
		bodyModel[4] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
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
		bodyModel[78] = new ModelRendererTurbo(this, 105, 37, textureX, textureY, "lamp"); // Box 117 numberboard front
		bodyModel[79] = new ModelRendererTurbo(this, 105, 34, textureX, textureY, "lamp"); // Box 118 numberboard front
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
		bodyModel[108] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[109] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[110] = new ModelRendererTurbo(this, 51, 129, textureX, textureY); // Box 81
		bodyModel[111] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[112] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[113] = new ModelRendererTurbo(this, 88, 132, textureX, textureY); // Box 271
		bodyModel[114] = new ModelRendererTurbo(this, 86, 146, textureX, textureY); // Box 272
		bodyModel[115] = new ModelRendererTurbo(this, 86, 141, textureX, textureY); // Box 273
		bodyModel[116] = new ModelRendererTurbo(this, 86, 136, textureX, textureY); // Box 274
		bodyModel[117] = new ModelRendererTurbo(this, 97, 136, textureX, textureY); // Box 258
		bodyModel[118] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[119] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[120] = new ModelRendererTurbo(this, 96, 125, textureX, textureY); // Box 265
		bodyModel[121] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[122] = new ModelRendererTurbo(this, 105, 125, textureX, textureY); // Box 267
		bodyModel[123] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[124] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[125] = new ModelRendererTurbo(this, 308, 38, textureX, textureY); // Box 270
		bodyModel[126] = new ModelRendererTurbo(this, 302, 55, textureX, textureY); // Box 271
		bodyModel[127] = new ModelRendererTurbo(this, 302, 50, textureX, textureY); // Box 272
		bodyModel[128] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[129] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[130] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[131] = new ModelRendererTurbo(this, 434, 2, textureX, textureY); // Box 276
		bodyModel[132] = new ModelRendererTurbo(this, 415, 5, textureX, textureY); // Box 277
		bodyModel[133] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[134] = new ModelRendererTurbo(this, 396, 2, textureX, textureY); // Box 279
		bodyModel[135] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[136] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[137] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[138] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[139] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[140] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[141] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[142] = new ModelRendererTurbo(this, 407, 160, textureX, textureY); // Box 287
		bodyModel[143] = new ModelRendererTurbo(this, 410, 155, textureX, textureY); // Box 288
		bodyModel[144] = new ModelRendererTurbo(this, 367, 160, textureX, textureY); // Box 289
		bodyModel[145] = new ModelRendererTurbo(this, 362, 155, textureX, textureY); // Box 290
		bodyModel[146] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[147] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 292
		bodyModel[148] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 293
		bodyModel[149] = new ModelRendererTurbo(this, 128, 107, textureX, textureY); // Box 294
		bodyModel[150] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[151] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[152] = new ModelRendererTurbo(this, 436, 22, textureX, textureY); // Box 297
		bodyModel[153] = new ModelRendererTurbo(this, 413, 22, textureX, textureY); // Box 298
		bodyModel[154] = new ModelRendererTurbo(this, 436, 15, textureX, textureY); // Box 299
		bodyModel[155] = new ModelRendererTurbo(this, 413, 15, textureX, textureY); // Box 300
		bodyModel[156] = new ModelRendererTurbo(this, 382, 180, textureX, textureY); // Box 301
		bodyModel[157] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[158] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[159] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[160] = new ModelRendererTurbo(this, 478, 84, textureX, textureY); // Box 31
		bodyModel[161] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 247 headlight r
		bodyModel[162] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 248 headlight r
		bodyModel[163] = new ModelRendererTurbo(this, 308, 25, textureX, textureY); // Box 308
		bodyModel[164] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 309
		bodyModel[165] = new ModelRendererTurbo(this, 306, 15, textureX, textureY); // Box 310
		bodyModel[166] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[167] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[168] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[169] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[170] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[171] = new ModelRendererTurbo(this, 192, 136, textureX, textureY); // Box 316
		bodyModel[172] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[173] = new ModelRendererTurbo(this, 482, 81, textureX, textureY); // Box 318
		bodyModel[174] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[175] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 320 ptc forehead
		bodyModel[176] = new ModelRendererTurbo(this, 145, 50, textureX, textureY); // Box 321 ptc forehead
		bodyModel[177] = new ModelRendererTurbo(this, 119, 50, textureX, textureY); // Box 322 ptc forehead
		bodyModel[178] = new ModelRendererTurbo(this, 17, 104, textureX, textureY); // Box 42
		bodyModel[179] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[180] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[181] = new ModelRendererTurbo(this, 10, 56, textureX, textureY, "lamp"); // Box 176 markerlight glow
		bodyModel[182] = new ModelRendererTurbo(this, 85, 46, textureX, textureY); // Box 43
		bodyModel[183] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[184] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[185] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[186] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[187] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[188] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[189] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[190] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[191] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[192] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[193] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[194] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[195] = new ModelRendererTurbo(this, 48, 42, textureX, textureY); // Box 354 cnw bELL
		bodyModel[196] = new ModelRendererTurbo(this, 106, 54, textureX, textureY); // Box 355
		bodyModel[197] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[198] = new ModelRendererTurbo(this, 161, 12, textureX, textureY); // Box 114
		bodyModel[199] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[200] = new ModelRendererTurbo(this, 161, 15, textureX, textureY); // Box 78
		bodyModel[201] = new ModelRendererTurbo(this, 159, 6, textureX, textureY); // Box 245
		bodyModel[202] = new ModelRendererTurbo(this, 208, 61, textureX, textureY); // Box 361
		bodyModel[203] = new ModelRendererTurbo(this, 201, 58, textureX, textureY); // Box 362
		bodyModel[204] = new ModelRendererTurbo(this, 201, 64, textureX, textureY); // Box 363
		bodyModel[205] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 364
		bodyModel[206] = new ModelRendererTurbo(this, 201, 44, textureX, textureY); // Box 365
		bodyModel[207] = new ModelRendererTurbo(this, 201, 50, textureX, textureY); // Box 366
		bodyModel[208] = new ModelRendererTurbo(this, 232, 54, textureX, textureY); // Box 367
		bodyModel[209] = new ModelRendererTurbo(this, 234, 59, textureX, textureY); // Box 368
		bodyModel[210] = new ModelRendererTurbo(this, 244, 59, textureX, textureY); // Box 369
		bodyModel[211] = new ModelRendererTurbo(this, 244, 57, textureX, textureY); // Box 370
		bodyModel[212] = new ModelRendererTurbo(this, 234, 57, textureX, textureY); // Box 371
		bodyModel[213] = new ModelRendererTurbo(this, 244, 52, textureX, textureY); // Box 372
		bodyModel[214] = new ModelRendererTurbo(this, 234, 52, textureX, textureY); // Box 373
		bodyModel[215] = new ModelRendererTurbo(this, 232, 45, textureX, textureY); // Box 374
		bodyModel[216] = new ModelRendererTurbo(this, 234, 48, textureX, textureY); // Box 375
		bodyModel[217] = new ModelRendererTurbo(this, 244, 48, textureX, textureY); // Box 376
		bodyModel[218] = new ModelRendererTurbo(this, 237, 48, textureX, textureY); // Box 377
		bodyModel[219] = new ModelRendererTurbo(this, 237, 57, textureX, textureY); // Box 378
		bodyModel[220] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[221] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[222] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[223] = new ModelRendererTurbo(this, 231, 47, textureX, textureY); // Box 382
		bodyModel[224] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 384
		bodyModel[225] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 385
		bodyModel[226] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 386
		bodyModel[227] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 387
		bodyModel[228] = new ModelRendererTurbo(this, 208, 53, textureX, textureY); // Box 388
		bodyModel[229] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[230] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[231] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[232] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[233] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[234] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 189 ditchlight f
		bodyModel[235] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 190 ditchlight f
		bodyModel[236] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[237] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 240 ditchlight r
		bodyModel[238] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 241 ditchlight r
		bodyModel[239] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[240] = new ModelRendererTurbo(this, 169, 12, textureX, textureY); // Box 114
		bodyModel[241] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 74
		bodyModel[242] = new ModelRendererTurbo(this, 169, 15, textureX, textureY); // Box 78
		bodyModel[243] = new ModelRendererTurbo(this, 168, 5, textureX, textureY); // Box 245
		bodyModel[244] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[245] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, "lamp"); // Box 410 glow commander
		bodyModel[246] = new ModelRendererTurbo(this, 340, 108, textureX, textureY); // Box 411
		bodyModel[247] = new ModelRendererTurbo(this, 342, 70, textureX, textureY); // Box 412
		bodyModel[248] = new ModelRendererTurbo(this, 362, 70, textureX, textureY); // Box 413
		bodyModel[249] = new ModelRendererTurbo(this, 354, 108, textureX, textureY); // Box 414
		bodyModel[250] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[251] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 416 ditchlight f
		bodyModel[252] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 417 cull
		bodyModel[253] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 418 ditchlight f
		bodyModel[254] = new ModelRendererTurbo(this, 19, 163, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[255] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box64
		bodyModel[256] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box65
		bodyModel[257] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 350
		bodyModel[258] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 351
		bodyModel[259] = new ModelRendererTurbo(this, 176, 44, textureX, textureY); // Box 336
		bodyModel[260] = new ModelRendererTurbo(this, 173, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[261] = new ModelRendererTurbo(this, 183, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[262] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[263] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[264] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[265] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[266] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[267] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[268] = new ModelRendererTurbo(this, 196, 9, textureX, textureY); // Box 894
		bodyModel[269] = new ModelRendererTurbo(this, 198, 12, textureX, textureY); // Box 895
		bodyModel[270] = new ModelRendererTurbo(this, 196, 3, textureX, textureY); // Box 202
		bodyModel[271] = new ModelRendererTurbo(this, 487, 83, textureX, textureY, "lamp"); // Box 438 headlight o canada
		bodyModel[272] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 439
		bodyModel[273] = new ModelRendererTurbo(this, 38, 98, textureX, textureY); // Box 440
		bodyModel[274] = new ModelRendererTurbo(this, 45, 99, textureX, textureY); // Box 441
		bodyModel[275] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 442
		bodyModel[276] = new ModelRendererTurbo(this, 446, 98, textureX, textureY); // Box 443
		bodyModel[277] = new ModelRendererTurbo(this, 456, 102, textureX, textureY); // Box 444
		bodyModel[278] = new ModelRendererTurbo(this, 449, 101, textureX, textureY); // Box 445
		bodyModel[279] = new ModelRendererTurbo(this, 147, 154, textureX, textureY); // Box 86
		bodyModel[280] = new ModelRendererTurbo(this, 134, 156, textureX, textureY); // Box 87
		bodyModel[281] = new ModelRendererTurbo(this, 134, 161, textureX, textureY); // Box 86
		bodyModel[282] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Box 87
		bodyModel[283] = new ModelRendererTurbo(this, 330, 123, textureX, textureY); // Box 450 extended tank
		bodyModel[284] = new ModelRendererTurbo(this, 68, 136, textureX, textureY); // Box 451
		bodyModel[285] = new ModelRendererTurbo(this, 70, 132, textureX, textureY); // Box 452
		bodyModel[286] = new ModelRendererTurbo(this, 68, 141, textureX, textureY); // Box 453
		bodyModel[287] = new ModelRendererTurbo(this, 68, 146, textureX, textureY); // Box 454
		bodyModel[288] = new ModelRendererTurbo(this, 457, 80, textureX, textureY, "lamp"); // Box 115 numberboard rear
		bodyModel[289] = new ModelRendererTurbo(this, 501, 80, textureX, textureY, "lamp"); // Box 116 numberboard rear
		bodyModel[290] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 19
		bodyModel[291] = new ModelRendererTurbo(this, 272, 116, textureX, textureY); // Box 334
		bodyModel[292] = new ModelRendererTurbo(this, 257, 124, textureX, textureY); // Box 335
		bodyModel[293] = new ModelRendererTurbo(this, 257, 131, textureX, textureY); // Box 336
		bodyModel[294] = new ModelRendererTurbo(this, 233, 122, textureX, textureY); // Box 337
		bodyModel[295] = new ModelRendererTurbo(this, 236, 131, textureX, textureY); // Box 338
		bodyModel[296] = new ModelRendererTurbo(this, 236, 124, textureX, textureY); // Box 339
		bodyModel[297] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, "lamp"); // Box 340 glow commander
		bodyModel[298] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[299] = new ModelRendererTurbo(this, 303, 114, textureX, textureY); // Box 629
		bodyModel[300] = new ModelRendererTurbo(this, 293, 114, textureX, textureY); // Box 630
		bodyModel[301] = new ModelRendererTurbo(this, 405, 123, textureX, textureY); // Box 726
		bodyModel[302] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 727
		bodyModel[303] = new ModelRendererTurbo(this, 74, 79, textureX, textureY); // Box 382
		bodyModel[304] = new ModelRendererTurbo(this, 67, 77, textureX, textureY); // Box 383
		bodyModel[305] = new ModelRendererTurbo(this, 53, 86, textureX, textureY); // Box 384
		bodyModel[306] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 385 headlight f
		bodyModel[307] = new ModelRendererTurbo(this, 118, 85, textureX, textureY, "lamp"); // Box 386 headlight f
		bodyModel[308] = new ModelRendererTurbo(this, 109, 78, textureX, textureY); // Box 387
		bodyModel[309] = new ModelRendererTurbo(this, 77, 69, textureX, textureY, "lamp"); // Box 350 numberboard hh
		bodyModel[310] = new ModelRendererTurbo(this, 109, 85, textureX, textureY, "lamp"); // Box 351 numberboard hh
		bodyModel[311] = new ModelRendererTurbo(this, 96, 76, textureX, textureY); // Box 352
		bodyModel[312] = new ModelRendererTurbo(this, 154, 32, textureX, textureY); // Box 354
		bodyModel[313] = new ModelRendererTurbo(this, 156, 29, textureX, textureY); // Box 355
		bodyModel[314] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 356
		bodyModel[315] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 357
		bodyModel[316] = new ModelRendererTurbo(this, 253, 51, textureX, textureY); // Box 369
		bodyModel[317] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[318] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[319] = new ModelRendererTurbo(this, 260, 56, textureX, textureY); // Box 372
		bodyModel[320] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[321] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[322] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[323] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48
		bodyModel[324] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp canada front
		bodyModel[325] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp canada front
		bodyModel[326] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[327] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[328] = new ModelRendererTurbo(this, 8, 46, textureX, textureY, "lamp"); // Box 301 lamp bnsf front
		bodyModel[329] = new ModelRendererTurbo(this, 8, 51, textureX, textureY, "lamp"); // Box 302 lamp bnsf front
		bodyModel[330] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[331] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[332] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp front
		bodyModel[333] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp front
		bodyModel[334] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp front gyralight
		bodyModel[335] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[336] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[337] = new ModelRendererTurbo(this, 307, 152, textureX, textureY); // Box 278
		bodyModel[338] = new ModelRendererTurbo(this, 307, 123, textureX, textureY); // Box 315
		bodyModel[339] = new ModelRendererTurbo(this, 256, 118, textureX, textureY); // Box 382
		bodyModel[340] = new ModelRendererTurbo(this, 234, 118, textureX, textureY); // Box 383
		bodyModel[341] = new ModelRendererTurbo(this, 463, 88, textureX, textureY, "lamp"); // Box 384 markerlight glow
		bodyModel[342] = new ModelRendererTurbo(this, 501, 88, textureX, textureY, "lamp"); // Box 385 markerlight glow
		bodyModel[343] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 386 cull
		bodyModel[344] = new ModelRendererTurbo(this, 360, 189, textureX, textureY, "cull"); // Box 387 cull
		bodyModel[345] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 388 ditchlight r
		bodyModel[346] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 389 ditchlight r
		bodyModel[347] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 446
		bodyModel[348] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 447
		bodyModel[349] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[350] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[351] = new ModelRendererTurbo(this, 63, 7, textureX, textureY); // Box 394 awvr window
		bodyModel[352] = new ModelRendererTurbo(this, 53, 2, textureX, textureY); // Box 394 awvr window
		bodyModel[353] = new ModelRendererTurbo(this, 77, 136, textureX, textureY); // Box 396
		bodyModel[354] = new ModelRendererTurbo(this, 79, 132, textureX, textureY); // Box 397
		bodyModel[355] = new ModelRendererTurbo(this, 77, 141, textureX, textureY); // Box 398
		bodyModel[356] = new ModelRendererTurbo(this, 77, 146, textureX, textureY); // Box 399
		bodyModel[357] = new ModelRendererTurbo(this, 59, 146, textureX, textureY); // Box 400
		bodyModel[358] = new ModelRendererTurbo(this, 59, 141, textureX, textureY); // Box 401
		bodyModel[359] = new ModelRendererTurbo(this, 59, 136, textureX, textureY); // Box 402
		bodyModel[360] = new ModelRendererTurbo(this, 61, 132, textureX, textureY); // Box 403
		bodyModel[361] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 395
		bodyModel[362] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 396
		bodyModel[363] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 397
		bodyModel[364] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 398
		bodyModel[365] = new ModelRendererTurbo(this, 76, 117, textureX, textureY); // Box 408
		bodyModel[366] = new ModelRendererTurbo(this, 76, 107, textureX, textureY); // Box 409
		bodyModel[367] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 410
		bodyModel[368] = new ModelRendererTurbo(this, 39, 162, textureX, textureY); // Box 411
		bodyModel[369] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "lamp"); // Box 412 ditchlight f
		bodyModel[370] = new ModelRendererTurbo(this, 39, 157, textureX, textureY, "lamp"); // Box 412 ditchlight f
		bodyModel[371] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 414
		bodyModel[372] = new ModelRendererTurbo(this, 400, 181, textureX, textureY); // Box 415
		bodyModel[373] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, "lamp"); // Box 416 ditchlight r
		bodyModel[374] = new ModelRendererTurbo(this, 393, 181, textureX, textureY, "lamp"); // Box 417 ditchlight r
		bodyModel[375] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 418
		bodyModel[376] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 419
		bodyModel[377] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 420
		bodyModel[378] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 421
		bodyModel[379] = new ModelRendererTurbo(this, 70, 144, textureX, textureY); // Box 394
		bodyModel[380] = new ModelRendererTurbo(this, 70, 139, textureX, textureY); // Box 395
		bodyModel[381] = new ModelRendererTurbo(this, 71, 134, textureX, textureY); // Box 396
		bodyModel[382] = new ModelRendererTurbo(this, 62, 134, textureX, textureY); // Box 397
		bodyModel[383] = new ModelRendererTurbo(this, 61, 139, textureX, textureY); // Box 398
		bodyModel[384] = new ModelRendererTurbo(this, 61, 144, textureX, textureY); // Box 399
		bodyModel[385] = new ModelRendererTurbo(this, 88, 144, textureX, textureY); // Box 400
		bodyModel[386] = new ModelRendererTurbo(this, 88, 139, textureX, textureY); // Box 401
		bodyModel[387] = new ModelRendererTurbo(this, 89, 134, textureX, textureY); // Box 402
		bodyModel[388] = new ModelRendererTurbo(this, 80, 134, textureX, textureY); // Box 403
		bodyModel[389] = new ModelRendererTurbo(this, 79, 139, textureX, textureY); // Box 404
		bodyModel[390] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 405
		bodyModel[391] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[392] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[393] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[394] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[395] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[396] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[397] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[398] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[399] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[400] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[401] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[402] = new ModelRendererTurbo(this, 449, 30, textureX, textureY, "cull"); // Box 196 winterization hatch
		bodyModel[403] = new ModelRendererTurbo(this, 355, 171, textureX, textureY); // Box 418
		bodyModel[404] = new ModelRendererTurbo(this, 403, 171, textureX, textureY); // Box 419
		bodyModel[405] = new ModelRendererTurbo(this, 237, 16, textureX, textureY, "cull"); // Box 420 cull
		bodyModel[406] = new ModelRendererTurbo(this, 238, 12, textureX, textureY); // Box 421 prime base
		bodyModel[407] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[408] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[409] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[410] = new ModelRendererTurbo(this, 238, 8, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[411] = new ModelRendererTurbo(this, 208, 12, textureX, textureY); // Box 421 prime base
		bodyModel[412] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[413] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[414] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[415] = new ModelRendererTurbo(this, 208, 8, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[416] = new ModelRendererTurbo(this, 175, 16, textureX, textureY); // Box 136
		bodyModel[417] = new ModelRendererTurbo(this, 175, 5, textureX, textureY); // Box 287
		bodyModel[418] = new ModelRendererTurbo(this, 175, 9, textureX, textureY); // Box 288
		bodyModel[419] = new ModelRendererTurbo(this, 177, 13, textureX, textureY); // Box 289
		bodyModel[420] = new ModelRendererTurbo(this, 469, 41, textureX, textureY); // Box 34
		bodyModel[421] = new ModelRendererTurbo(this, 498, 49, textureX, textureY); // Box 297
		bodyModel[422] = new ModelRendererTurbo(this, 472, 49, textureX, textureY); // Box 299
		bodyModel[423] = new ModelRendererTurbo(this, 488, 116, textureX, textureY); // Box 164
		bodyModel[424] = new ModelRendererTurbo(this, 467, 116, textureX, textureY); // Box 259
		bodyModel[425] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 261
		bodyModel[426] = new ModelRendererTurbo(this, 458, 113, textureX, textureY); // Box 262
		bodyModel[427] = new ModelRendererTurbo(this, 488, 124, textureX, textureY); // Box 264
		bodyModel[428] = new ModelRendererTurbo(this, 468, 124, textureX, textureY); // Box 265
		bodyModel[429] = new ModelRendererTurbo(this, 463, 114, textureX, textureY); // Box 266
		bodyModel[430] = new ModelRendererTurbo(this, 452, 132, textureX, textureY); // Box 61
		bodyModel[431] = new ModelRendererTurbo(this, 506, 132, textureX, textureY); // Box 63
		bodyModel[432] = new ModelRendererTurbo(this, 458, 114, textureX, textureY); // Box 234
		bodyModel[433] = new ModelRendererTurbo(this, 449, 147, textureX, textureY); // Box 319
		bodyModel[434] = new ModelRendererTurbo(this, 456, 147, textureX, textureY); // Box 322
		bodyModel[435] = new ModelRendererTurbo(this, 463, 147, textureX, textureY); // Box 323
		bodyModel[436] = new ModelRendererTurbo(this, 501, 147, textureX, textureY); // Box 326
		bodyModel[437] = new ModelRendererTurbo(this, 494, 147, textureX, textureY); // Box 327
		bodyModel[438] = new ModelRendererTurbo(this, 487, 147, textureX, textureY); // Box 329
		bodyModel[439] = new ModelRendererTurbo(this, 482, 150, textureX, textureY); // Box 268
		bodyModel[440] = new ModelRendererTurbo(this, 452, 150, textureX, textureY); // Box 269
		bodyModel[441] = new ModelRendererTurbo(this, 509, 132, textureX, textureY); // Box 241
		bodyModel[442] = new ModelRendererTurbo(this, 449, 132, textureX, textureY); // Box 251
		bodyModel[443] = new ModelRendererTurbo(this, 503, 136, textureX, textureY); // Box 234
		bodyModel[444] = new ModelRendererTurbo(this, 455, 136, textureX, textureY); // Box 234
		bodyModel[445] = new ModelRendererTurbo(this, 499, 42, textureX, textureY); // Box 318
		bodyModel[446] = new ModelRendererTurbo(this, 470, 145, textureX, textureY); // Box 323
		bodyModel[447] = new ModelRendererTurbo(this, 480, 145, textureX, textureY); // Box 329
		bodyModel[448] = new ModelRendererTurbo(this, 464, 43, textureX, textureY, "lamp"); // Box 295 lamp rear SDP40
		bodyModel[449] = new ModelRendererTurbo(this, 464, 43, textureX, textureY, "lamp"); // Box 295 lamp rear SDP40
		bodyModel[450] = new ModelRendererTurbo(this, 463, 48, textureX, textureY); // Box 31
		bodyModel[451] = new ModelRendererTurbo(this, 402, 116, textureX, textureY); // Box 36
		bodyModel[452] = new ModelRendererTurbo(this, 221, 145, textureX, textureY); // Box 315
		bodyModel[453] = new ModelRendererTurbo(this, 197, 147, textureX, textureY); // Box 312
		bodyModel[454] = new ModelRendererTurbo(this, 57, 78, textureX, textureY); // Box 355
		bodyModel[455] = new ModelRendererTurbo(this, 51, 78, textureX, textureY); // Box 356
		bodyModel[456] = new ModelRendererTurbo(this, 114, 58, textureX, textureY); // Box 43
		bodyModel[457] = new ModelRendererTurbo(this, 75, 59, textureX, textureY); // Box 43
		bodyModel[458] = new ModelRendererTurbo(this, 27, 84, textureX, textureY); // Box 298
		bodyModel[459] = new ModelRendererTurbo(this, 23, 92, textureX, textureY); // Box 42
		bodyModel[460] = new ModelRendererTurbo(this, 36, 93, textureX, textureY); // Box 42
		bodyModel[461] = new ModelRendererTurbo(this, 113, 53, textureX, textureY); // Box 43
		bodyModel[462] = new ModelRendererTurbo(this, 39, 85, textureX, textureY); // Box 298
		bodyModel[463] = new ModelRendererTurbo(this, 51, 82, textureX, textureY); // Box 43
		bodyModel[464] = new ModelRendererTurbo(this, 56, 75, textureX, textureY); // Box 43
		bodyModel[465] = new ModelRendererTurbo(this, 51, 75, textureX, textureY); // Box 298
		bodyModel[466] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 239
		bodyModel[467] = new ModelRendererTurbo(this, 449, 128, textureX, textureY, "lamp"); // Box 240 ditchlight r
		bodyModel[468] = new ModelRendererTurbo(this, 449, 128, textureX, textureY, "lamp"); // Box 241 ditchlight r
		bodyModel[469] = new ModelRendererTurbo(this, 456, 130, textureX, textureY); // Box 242
		bodyModel[470] = new ModelRendererTurbo(this, 451, 145, textureX, textureY); // Box 319
		bodyModel[471] = new ModelRendererTurbo(this, 458, 145, textureX, textureY); // Box 319
		bodyModel[472] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 319
		bodyModel[473] = new ModelRendererTurbo(this, 503, 145, textureX, textureY); // Box 319
		bodyModel[474] = new ModelRendererTurbo(this, 496, 145, textureX, textureY); // Box 319
		bodyModel[475] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 319
		bodyModel[476] = new ModelRendererTurbo(this, 453, 113, textureX, textureY); // Box 259
		bodyModel[477] = new ModelRendererTurbo(this, 453, 116, textureX, textureY); // Box 259
		bodyModel[478] = new ModelRendererTurbo(this, 501, 121, textureX, textureY); // Box 259
		bodyModel[479] = new ModelRendererTurbo(this, 501, 124, textureX, textureY); // Box 259
		bodyModel[480] = new ModelRendererTurbo(this, 416, 101, textureX, textureY); // Box 36
		bodyModel[481] = new ModelRendererTurbo(this, 198, 123, textureX, textureY); // Box 315
		bodyModel[482] = new ModelRendererTurbo(this, 208, 123, textureX, textureY); // Box 315
		bodyModel[483] = new ModelRendererTurbo(this, 201, 123, textureX, textureY); // Box 291
		bodyModel[484] = new ModelRendererTurbo(this, 474, 45, textureX, textureY); // Box 318
		bodyModel[485] = new ModelRendererTurbo(this, 470, 40, textureX, textureY); // Box 318
		bodyModel[486] = new ModelRendererTurbo(this, 477, 1, textureX, textureY); // Box 34
		bodyModel[487] = new ModelRendererTurbo(this, 498, 2, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[488] = new ModelRendererTurbo(this, 498, 2, textureX, textureY, "lamp"); // Box 294 lamp rear short SDP40
		bodyModel[489] = new ModelRendererTurbo(this, 503, 5, textureX, textureY); // Box 31
		bodyModel[490] = new ModelRendererTurbo(this, 501, 7, textureX, textureY, "lamp"); // Box 115 liveryimg 2 glow
		bodyModel[491] = new ModelRendererTurbo(this, 477, 7, textureX, textureY, "lamp"); // Box 116 liveryimg 2 glow
		bodyModel[492] = new ModelRendererTurbo(this, 498, 9, textureX, textureY, "lamp"); // Box 384 markerlight glow
		bodyModel[493] = new ModelRendererTurbo(this, 486, 9, textureX, textureY, "lamp"); // Box 385 markerlight glow
		bodyModel[494] = new ModelRendererTurbo(this, 498, 45, textureX, textureY); // Box 318
		bodyModel[495] = new ModelRendererTurbo(this, 279, 45, textureX, textureY); // Box 130
		bodyModel[496] = new ModelRendererTurbo(this, 281, 42, textureX, textureY); // Box 131
		bodyModel[497] = new ModelRendererTurbo(this, 279, 58, textureX, textureY); // Box 132
		bodyModel[498] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 314
		bodyModel[499] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 401

		bodyModel[0].addBox(0F, 0F, 0F, 84, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-42.5F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 88, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-44.5F, 0F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(37.5F, -21F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[4].setRotationPoint(-17.5F, -2F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 55, 21, 14, 0F); // Box 34
		bodyModel[5].setRotationPoint(-17.5F, -21F, -7F);

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
		bodyModel[18].setRotationPoint(-51.5F, 3F, -1.5F);

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
		bodyModel[32].setRotationPoint(-48.5F, 2.5F, -2F);

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
		bodyModel[43].setRotationPoint(46.5F, 3F, -1.5F);

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
		bodyModel[59].setRotationPoint(46.5F, 2.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[60].setRotationPoint(-47.5F, 2F, -3F);

		bodyModel[61].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[61].setRotationPoint(-29F, -18F, -10.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[62].setRotationPoint(-18.5F, -18F, -11F);

		bodyModel[63].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[63].setRotationPoint(-28.5F, -18F, 10F);

		bodyModel[64].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[64].setRotationPoint(-28.5F, -18F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[65].setRotationPoint(-29.5F, -18F, -7F);

		bodyModel[66].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[66].setRotationPoint(-18F, -18F, 10.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[67].setRotationPoint(-29.5F, -4F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[68].setRotationPoint(46.5F, 0F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[69].setRotationPoint(46.5F, 0F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[70].setRotationPoint(46.49F, -8F, 4F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[71].setRotationPoint(46.5F, 7F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[72].setRotationPoint(-29.5F, -21F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[73].setRotationPoint(-18.5F, -21F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[74].setRotationPoint(-29.5F, -21F, -7F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[75].setRotationPoint(-31.5F, -21F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[76].setRotationPoint(-31.5F, -21F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[77].setRotationPoint(-31.5F, -21F, 1F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 numberboard front
		bodyModel[78].setRotationPoint(-29.55F, -19.5F, -6F);
		bodyModel[78].rotateAngleY = 0.38397244F;

		bodyModel[79].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 numberboard front
		bodyModel[79].setRotationPoint(-29.55F, -19.5F, 6F);
		bodyModel[79].rotateAngleY = -0.38397244F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 lamp
		bodyModel[80].setRotationPoint(-32F, -21F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 lamp
		bodyModel[81].setRotationPoint(-32F, -19F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[82].setRotationPoint(-18.5F, -21F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[83].setRotationPoint(-28.5F, -21F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[84].setRotationPoint(-28.5F, -21F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[85].setRotationPoint(-28.5F, -21F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[86].setRotationPoint(-18.5F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[87].setRotationPoint(-29.5F, -21F, 7F);

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
		bodyModel[107].setRotationPoint(-36.5F, -4F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[108].setRotationPoint(-36.5F, -4F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[109].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[110].setRotationPoint(-43.5F, -6F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[111].setRotationPoint(-43.5F, -6F, 10.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[112].setRotationPoint(-43.5F, -8F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[113].setRotationPoint(-47.5F, 1F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[114].setRotationPoint(-47.5F, 8F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[115].setRotationPoint(-47.5F, 5F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[116].setRotationPoint(-47.5F, 3F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 258
		bodyModel[117].setRotationPoint(-43.5F, -8F, -11F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[118].setRotationPoint(-35.5F, -12F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[119].setRotationPoint(-39.5F, -8F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[120].setRotationPoint(-43.5F, -8F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[121].setRotationPoint(-39.5F, -8F, 11F);

		bodyModel[122].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 267
		bodyModel[122].setRotationPoint(-35.5F, -12F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[123].setRotationPoint(-49.5F, 0F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[124].setRotationPoint(-49.5F, 0F, 0F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[125].setRotationPoint(-17.5F, -10F, -10F);

		bodyModel[126].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[126].setRotationPoint(-14.5F, -13F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[127].setRotationPoint(-14.5F, -15F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[128].setRotationPoint(-15.5F, -22F, -6F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[129].setRotationPoint(-6.5F, -22.5F, -2.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[130].setRotationPoint(-7.5F, -21.5F, -4F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 276
		bodyModel[131].setRotationPoint(30.5F, -22F, -3F);

		bodyModel[132].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 277
		bodyModel[132].setRotationPoint(23.5F, -22F, -3F);

		bodyModel[133].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[133].setRotationPoint(-1.5F, -22F, -3F);

		bodyModel[134].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 279
		bodyModel[134].setRotationPoint(16.5F, -22F, -3F);

		bodyModel[135].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[135].setRotationPoint(5.5F, -22F, -3F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[136].setRotationPoint(-37.5F, -4F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[137].setRotationPoint(-38.5F, -4F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[138].setRotationPoint(-38.5F, -4F, 11F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[139].setRotationPoint(-37.5F, -4F, 11F);

		bodyModel[140].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[140].setRotationPoint(-16.5F, -20.5F, -7.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[141].setRotationPoint(-16.5F, -20.5F, 6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 287
		bodyModel[142].setRotationPoint(42.5F, -6F, -11.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 288
		bodyModel[143].setRotationPoint(42.5F, -8F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[144].setRotationPoint(42.5F, -6F, 10.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 290
		bodyModel[145].setRotationPoint(42.5F, -8F, 9F);

		bodyModel[146].addBox(0F, 0F, 0F, 56, 8, 0, 0F); // Box 291
		bodyModel[146].setRotationPoint(-13.5F, -8F, 11F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[147].setRotationPoint(-17.5F, -4F, 7F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[148].setRotationPoint(-15.5F, -4F, 11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[149].setRotationPoint(-14.5F, -4F, 11F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[150].setRotationPoint(-17.5F, -12F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[151].setRotationPoint(-16.5F, -10F, 11F);

		bodyModel[152].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 297
		bodyModel[152].setRotationPoint(27F, -19.5F, -7.25F);

		bodyModel[153].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 298
		bodyModel[153].setRotationPoint(16.5F, -19.5F, -7.25F);

		bodyModel[154].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 299
		bodyModel[154].setRotationPoint(27F, -19.5F, 6.25F);

		bodyModel[155].addBox(0F, 0F, 0F, 10, 4, 1, 0F); // Box 300
		bodyModel[155].setRotationPoint(16.5F, -19.5F, 6.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 301
		bodyModel[156].setRotationPoint(46.5F, 0F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[157].setRotationPoint(-48.5F, 0F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[158].setRotationPoint(-48.5F, 0F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[159].setRotationPoint(-48.5F, 0F, -6F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 31
		bodyModel[160].setRotationPoint(38.75F, -19F, -2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 headlight r
		bodyModel[161].setRotationPoint(40F, -19F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 headlight r
		bodyModel[162].setRotationPoint(40F, -19F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[163].setRotationPoint(-17.5F, -21F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[164].setRotationPoint(-7.5F, -21F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[165].setRotationPoint(-17.5F, -21F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[166].setRotationPoint(-7.5F, -21F, 7F);

		bodyModel[167].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[167].setRotationPoint(-14.5F, -10F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[168].setRotationPoint(-16.5F, -12F, -11F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[169].setRotationPoint(-17.5F, -12F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[170].setRotationPoint(21.5F, -10F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 19, 8, 0, 0F); // Box 316
		bodyModel[171].setRotationPoint(23.5F, -8F, -11F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[172].setRotationPoint(13.5F, -22F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[173].setRotationPoint(37F, -21.5F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 319
		bodyModel[174].setRotationPoint(-39.5F, -13.5F, -0.5F);

		bodyModel[175].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 320 ptc forehead
		bodyModel[175].setRotationPoint(-33.5F, -21F, -7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321 ptc forehead
		bodyModel[176].setRotationPoint(-34.5F, -21F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322 ptc forehead
		bodyModel[177].setRotationPoint(-34.5F, -21F, 0F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[178].setRotationPoint(-42.5F, -5F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[179].setRotationPoint(-42.5F, -8F, 0F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[180].setRotationPoint(-40.4F, -11.5F, 5.5F);
		bodyModel[180].rotateAngleY = -0.43633231F;

		bodyModel[181].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 markerlight glow
		bodyModel[181].setRotationPoint(-40.4F, -11.5F, -5.5F);
		bodyModel[181].rotateAngleY = 0.43633231F;

		bodyModel[182].addBox(0F, 0F, 0F, 1, 13, 13, 0F); // Box 43
		bodyModel[182].setRotationPoint(-39.5F, -13F, -6F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[183].setRotationPoint(-38.5F, -13F, -6F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 43
		bodyModel[184].setRotationPoint(-38.5F, -13F, -7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[185].setRotationPoint(-38F, -8.5F, -7F);

		bodyModel[186].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[186].setRotationPoint(-37.5F, -6.5F, -7F);

		bodyModel[187].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[187].setRotationPoint(-36.5F, -13F, -7F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[188].setRotationPoint(-38.5F, -9F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[189].setRotationPoint(-1.5F, -21F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[190].setRotationPoint(-1.5F, -21F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[191].setRotationPoint(-6.5F, -21F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[192].setRotationPoint(11.5F, -21F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[193].setRotationPoint(11.5F, -21F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[194].setRotationPoint(-6.5F, -21F, 7F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[195].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[196].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[196].setRotationPoint(-38.5F, -12F, -7.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[197].setRotationPoint(-37.5F, -11F, -7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[198].setRotationPoint(-33.5F, -19F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[199].setRotationPoint(-33.5F, -20F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[200].setRotationPoint(-33.25F, -18.5F, -0.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[201].setRotationPoint(-33.5F, -21F, -0.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 361
		bodyModel[202].setRotationPoint(-26.5F, -23F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[203].setRotationPoint(-27.5F, -23F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 363
		bodyModel[204].setRotationPoint(-27.5F, -22F, -6F);

		bodyModel[205].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 364
		bodyModel[205].setRotationPoint(-26.5F, -23F, 2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[206].setRotationPoint(-27.5F, -23F, 2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 366
		bodyModel[207].setRotationPoint(-27.5F, -22F, 2F);

		bodyModel[208].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 367
		bodyModel[208].setRotationPoint(-26.5F, -22F, -9F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 368
		bodyModel[209].setRotationPoint(-26.5F, -22F, -9F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 369
		bodyModel[210].setRotationPoint(-21.5F, -22F, -9F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 370
		bodyModel[211].setRotationPoint(-21.5F, -22F, -7F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 371
		bodyModel[212].setRotationPoint(-26.5F, -22F, -7F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 372
		bodyModel[213].setRotationPoint(-21.5F, -22F, 7F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 373
		bodyModel[214].setRotationPoint(-26.5F, -22F, 7F);

		bodyModel[215].addBox(0F, 0F, 0F, 6, 0, 2, 0F); // Box 374
		bodyModel[215].setRotationPoint(-26.5F, -22F, 7F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 375
		bodyModel[216].setRotationPoint(-26.5F, -22F, 9F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 376
		bodyModel[217].setRotationPoint(-21.5F, -22F, 9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[218].setRotationPoint(-26.5F, -23F, 8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[219].setRotationPoint(-23.5F, -23F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[220].setRotationPoint(13.5F, -22.5F, -7F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[221].setRotationPoint(12.5F, -23.5F, -6.75F);

		bodyModel[222].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[222].setRotationPoint(11.5F, -23.5F, -5.25F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 382
		bodyModel[223].setRotationPoint(-24F, -22F, -8F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[224].setRotationPoint(-32.5F, -23F, -1.5F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[225].setRotationPoint(-31F, -23F, -0.5F);

		bodyModel[226].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[226].setRotationPoint(-31.75F, -23F, 0.5F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[227].setRotationPoint(-30.75F, -22.5F, -0.5F);

		bodyModel[228].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 388
		bodyModel[228].setRotationPoint(-26.5F, -22.5F, 0F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[229].setRotationPoint(-13.5F, 3F, -10.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[230].setRotationPoint(-13.5F, 2F, -10.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[231].setRotationPoint(-13.25F, 3.5F, -10.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[232].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[233].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight f
		bodyModel[234].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f
		bodyModel[235].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[236].setRotationPoint(45.5F, -2F, -6.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[237].setRotationPoint(45.75F, -2F, -6.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[238].setRotationPoint(45.75F, -2F, 4.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[239].setRotationPoint(45.5F, -2F, 4.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[240].setRotationPoint(-17.5F, -19F, -8.7F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[241].setRotationPoint(-17.5F, -20F, -8.7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[242].setRotationPoint(-17.25F, -18.5F, -8.45F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 245
		bodyModel[243].setRotationPoint(-17.5F, -21F, -8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[244].setRotationPoint(-28.82F, -22F, -0.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 glow commander
		bodyModel[245].setRotationPoint(-29F, -23F, -0.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[246].setRotationPoint(-28.5F, 2F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[247].setRotationPoint(-28.5F, 2F, 7F);

		bodyModel[248].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[248].setRotationPoint(25.5F, 2F, 7F);

		bodyModel[249].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[249].setRotationPoint(25.5F, 2F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[250].setRotationPoint(-22.5F, -22F, -5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight f
		bodyModel[251].setRotationPoint(-48.25F, 1F, -5.75F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417 cull
		bodyModel[252].setRotationPoint(-48F, 1F, -5.75F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight f
		bodyModel[253].setRotationPoint(-48.25F, 1F, 3.75F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419 cull
		bodyModel[254].setRotationPoint(-48F, 1F, 3.75F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[255].setRotationPoint(-27.5F, -18F, 11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[256].setRotationPoint(-27.5F, -18F, -12F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[257].setRotationPoint(-28.5F, -16F, -12F);

		bodyModel[258].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[258].setRotationPoint(-28.5F, -16F, 11F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 336
		bodyModel[259].setRotationPoint(-31.5F, -23F, -2F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[260].setRotationPoint(-32.25F, -23F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[261].setRotationPoint(-32.25F, -23F, -2F);

		bodyModel[262].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[262].setRotationPoint(5F, -22.5F, -8.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[263].setRotationPoint(6F, -22.25F, -7.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[264].setRotationPoint(5.5F, -22.25F, -9.5F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[265].setRotationPoint(7.5F, -21.5F, -8.5F);

		bodyModel[266].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[266].setRotationPoint(6.5F, -23.5F, -7.75F);

		bodyModel[267].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[267].setRotationPoint(6.5F, -23.5F, -9F);

		bodyModel[268].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 894
		bodyModel[268].setRotationPoint(34.5F, -23F, 4.5F);

		bodyModel[269].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 895
		bodyModel[269].setRotationPoint(34.5F, -22F, 4.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 202
		bodyModel[270].setRotationPoint(35.5F, -23.5F, 3.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 438 headlight o canada
		bodyModel[271].setRotationPoint(40F, -19F, -1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[272].setRotationPoint(-13.5F, -23F, -3F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 440
		bodyModel[273].setRotationPoint(-43.5F, -7F, -2F);

		bodyModel[274].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 441
		bodyModel[274].setRotationPoint(-44F, -6.5F, -0.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 442
		bodyModel[275].setRotationPoint(-44F, -7.5F, -1.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 0, 3, 3, 0F); // Box 443
		bodyModel[276].setRotationPoint(42F, -7.5F, -1.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 444
		bodyModel[277].setRotationPoint(41F, -6.5F, -0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // Box 445
		bodyModel[278].setRotationPoint(40.5F, -7F, -2F);

		bodyModel[279].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 86
		bodyModel[279].setRotationPoint(-28.6F, -12F, -5F);
		bodyModel[279].rotateAngleY = -0.38397244F;

		bodyModel[280].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 87
		bodyModel[280].setRotationPoint(-28.5F, -13F, -4F);

		bodyModel[281].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 86
		bodyModel[281].setRotationPoint(-25.5F, -14F, -5.5F);
		bodyModel[281].rotateAngleY = -0.38397244F;

		bodyModel[282].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 87
		bodyModel[282].setRotationPoint(-27.5F, -13.75F, -4F);
		bodyModel[282].rotateAngleY = -0.38397244F;

		bodyModel[283].addBox(0F, 0F, 0F, 21, 2, 22, 0F); // Box 450 extended tank
		bodyModel[283].setRotationPoint(-11F, 1F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[284].setRotationPoint(-47.5F, 3F, 7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[285].setRotationPoint(-47.5F, 1F, 7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[286].setRotationPoint(-47.5F, 5F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[287].setRotationPoint(-47.5F, 8F, 9F);

		bodyModel[288].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 numberboard rear
		bodyModel[288].setRotationPoint(37.95F, -16F, -6F);
		bodyModel[288].rotateAngleY = -0.41887902F;

		bodyModel[289].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 numberboard rear
		bodyModel[289].setRotationPoint(37.95F, -16F, 6F);
		bodyModel[289].rotateAngleY = 0.41887902F;

		bodyModel[290].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[290].setRotationPoint(-7.9F, 2F, -11.5F);
		bodyModel[290].rotateAngleX = 0.87266463F;

		bodyModel[291].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[291].setRotationPoint(-7.9F, 3.5F, 8.75F);
		bodyModel[291].rotateAngleX = 0.87266463F;

		bodyModel[292].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 335
		bodyModel[292].setRotationPoint(-11F, 3F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[293].setRotationPoint(-11F, 6F, -11F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 337
		bodyModel[294].setRotationPoint(-11F, 3F, -8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[295].setRotationPoint(-11F, 6F, 8F);

		bodyModel[296].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 339
		bodyModel[296].setRotationPoint(-11F, 3F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 glow commander
		bodyModel[297].setRotationPoint(-25F, -23F, -0.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[298].setRotationPoint(-24.82F, -22F, -0.5F);

		bodyModel[299].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[299].setRotationPoint(-26.5F, 4F, -1F);

		bodyModel[300].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[300].setRotationPoint(-33.5F, 4F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[301].setRotationPoint(30.5F, 4F, -1F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[302].setRotationPoint(23.5F, 4F, -1F);

		bodyModel[303].addBox(0F, 0F, 0F, 10, 8, 14, 0F); // Box 382
		bodyModel[303].setRotationPoint(-39.5F, -21F, -7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[304].setRotationPoint(-42.5F, -21F, -7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 384
		bodyModel[305].setRotationPoint(-42.5F, -21F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385 headlight f
		bodyModel[306].setRotationPoint(-43F, -19F, 0F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386 headlight f
		bodyModel[307].setRotationPoint(-43F, -19F, -2F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 387
		bodyModel[308].setRotationPoint(-42.75F, -19F, -2F);

		bodyModel[309].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 350 numberboard hh
		bodyModel[309].setRotationPoint(-40F, -16F, 6F);
		bodyModel[309].rotateAngleY = -0.40142573F;

		bodyModel[310].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 351 numberboard hh
		bodyModel[310].setRotationPoint(-40F, -16F, -6F);
		bodyModel[310].rotateAngleY = 0.40142573F;

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 352
		bodyModel[311].setRotationPoint(-39.5F, -21.5F, -0.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[312].setRotationPoint(-42F, -23F, -5.5F);

		bodyModel[313].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[313].setRotationPoint(-41F, -22.75F, -4.5F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[314].setRotationPoint(-41.5F, -22.75F, -6.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[315].setRotationPoint(-39.5F, -22F, -5.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[316].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[317].setRotationPoint(-18.5F, -23F, 2F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[318].setRotationPoint(-18.5F, -23F, 6F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[319].setRotationPoint(-18.5F, -24F, 4F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[320].setRotationPoint(-15.5F, -23F, 6F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[321].setRotationPoint(-15.5F, -23F, 2F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[322].setRotationPoint(-42.5F, -10F, 1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48
		bodyModel[323].setRotationPoint(-41.48F, -13F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp canada front
		bodyModel[324].setRotationPoint(-42.5F, -10F, -1F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp canada front
		bodyModel[325].setRotationPoint(-42.5F, -12F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.57F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[326].setRotationPoint(-42.5F, -13F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.57F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[327].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 301 lamp bnsf front
		bodyModel[328].setRotationPoint(-42.5F, -13F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 302 lamp bnsf front
		bodyModel[329].setRotationPoint(-42.5F, -11F, -1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[330].setRotationPoint(-42.5F, -13F, 1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[331].setRotationPoint(-42.5F, -13F, -7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp front
		bodyModel[332].setRotationPoint(-42.25F, -12F, -2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp front
		bodyModel[333].setRotationPoint(-42.25F, -12F, 0F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp front gyralight
		bodyModel[334].setRotationPoint(-42.25F, -14F, -1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[335].setRotationPoint(-41.48F, -14F, -1.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[336].setRotationPoint(-41.65F, -13F, -2F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[337].setRotationPoint(-8F, 2F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[338].setRotationPoint(-8F, 2F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[339].setRotationPoint(-11F, 2F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[340].setRotationPoint(-11F, 2F, 7F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[341].setRotationPoint(37.4F, -13.5F, -5.5F);
		bodyModel[341].rotateAngleY = -0.43633231F;

		bodyModel[342].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[342].setRotationPoint(37.4F, -13.5F, 5.5F);
		bodyModel[342].rotateAngleY = 0.43633231F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 386 cull
		bodyModel[343].setRotationPoint(46F, 1F, 3.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 387 cull
		bodyModel[344].setRotationPoint(46F, 1F, -5.75F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 ditchlight r
		bodyModel[345].setRotationPoint(46.25F, 1F, -5.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 389 ditchlight r
		bodyModel[346].setRotationPoint(46.25F, 1F, 3.75F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[347].setRotationPoint(-51F, 4F, -10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 447
		bodyModel[348].setRotationPoint(-50.5F, 4F, 2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[349].setRotationPoint(-50.5F, 5F, 2F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[350].setRotationPoint(-50.5F, 5F, -10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 394 awvr window
		bodyModel[351].setRotationPoint(-30.5F, -17F, 0F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394 awvr window
		bodyModel[352].setRotationPoint(-30.5F, -17F, -6F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[353].setRotationPoint(42.5F, 3F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[354].setRotationPoint(43.5F, 1F, -8F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[355].setRotationPoint(42.5F, 5F, -10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[356].setRotationPoint(42.5F, 8F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 400
		bodyModel[357].setRotationPoint(42.5F, 8F, 9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 401
		bodyModel[358].setRotationPoint(42.5F, 5F, 8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[359].setRotationPoint(42.5F, 3F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 403
		bodyModel[360].setRotationPoint(43.5F, 1F, 7F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[361].setRotationPoint(46.5F, 5F, 2F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 396
		bodyModel[362].setRotationPoint(46.5F, 5F, -10F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 397
		bodyModel[363].setRotationPoint(47F, 4F, -10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[364].setRotationPoint(46.5F, 4F, 2F);

		bodyModel[365].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 408
		bodyModel[365].setRotationPoint(-37.5F, -2F, -11F);

		bodyModel[366].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 409
		bodyModel[366].setRotationPoint(-37.5F, -2F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[367].setRotationPoint(-48.5F, -3F, -5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[368].setRotationPoint(-48.5F, -3F, 3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[369].setRotationPoint(-48.75F, -3F, -5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 412 ditchlight f
		bodyModel[370].setRotationPoint(-48.75F, -3F, 3F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[371].setRotationPoint(46.5F, -3F, 3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 415
		bodyModel[372].setRotationPoint(46.5F, -3F, -5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 416 ditchlight r
		bodyModel[373].setRotationPoint(46.75F, -3F, -5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 417 ditchlight r
		bodyModel[374].setRotationPoint(46.75F, -3F, 3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 418
		bodyModel[375].setRotationPoint(15F, -21F, -8.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[376].setRotationPoint(15F, -20F, -8.7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 420
		bodyModel[377].setRotationPoint(15F, -19F, -8.7F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 421
		bodyModel[378].setRotationPoint(15.25F, -18.5F, -8.45F);

		bodyModel[379].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 394
		bodyModel[379].setRotationPoint(-47.5F, 7F, 9F);

		bodyModel[380].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 395
		bodyModel[380].setRotationPoint(-47.5F, 4F, 8F);

		bodyModel[381].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[381].setRotationPoint(-47.5F, 2F, 7F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 397
		bodyModel[382].setRotationPoint(43.5F, 2F, 7F);

		bodyModel[383].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 398
		bodyModel[383].setRotationPoint(42.5F, 4F, 8F);

		bodyModel[384].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 399
		bodyModel[384].setRotationPoint(42.5F, 7F, 9F);

		bodyModel[385].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 400
		bodyModel[385].setRotationPoint(-47.5F, 7F, -9F);

		bodyModel[386].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 401
		bodyModel[386].setRotationPoint(-47.5F, 4F, -8F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 402
		bodyModel[387].setRotationPoint(-47.5F, 2F, -7F);

		bodyModel[388].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 403
		bodyModel[388].setRotationPoint(43.5F, 2F, -7F);

		bodyModel[389].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 404
		bodyModel[389].setRotationPoint(42.5F, 4F, -8F);

		bodyModel[390].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 405
		bodyModel[390].setRotationPoint(42.5F, 7F, -9F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[391].setRotationPoint(-28.5F, -22F, 7F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[392].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[393].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[394].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[395].setRotationPoint(-28.5F, -22.5F, 7F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[396].setRotationPoint(-29F, -21F, 7F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[397].setRotationPoint(-28.5F, -13F, -3F);

		bodyModel[398].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[398].setRotationPoint(-28.6F, -12F, -5F);
		bodyModel[398].rotateAngleY = -0.38397244F;

		bodyModel[399].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[399].setRotationPoint(-27F, -14F, -5F);
		bodyModel[399].rotateAngleY = -0.38397244F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[400].setRotationPoint(-26.5F, -17F, 10F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[401].setRotationPoint(-26.5F, -18F, 10F);

		bodyModel[402].addBox(0F, 0F, 0F, 8, 2, 7, 0F); // Box 196 winterization hatch
		bodyModel[402].setRotationPoint(15F, -22.5F, -3.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[403].setRotationPoint(46.5F, 0F, 0F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[404].setRotationPoint(46.5F, 0F, -7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 420 cull
		bodyModel[405].setRotationPoint(-29F, -21.5F, -9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[406].setRotationPoint(-28.5F, -22.5F, -9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[407].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[408].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[409].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[410].setRotationPoint(-28.5F, -23F, -9F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[411].setRotationPoint(-30.5F, -22F, -1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[412].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[413].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[414].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[415].setRotationPoint(-30.5F, -22.5F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 136
		bodyModel[416].setRotationPoint(-14F, 3.5F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 287
		bodyModel[417].setRotationPoint(-14F, 2F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 288
		bodyModel[418].setRotationPoint(-14F, 3F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 289
		bodyModel[419].setRotationPoint(-13.5F, 3.5F, -10.5F);

		bodyModel[420].addBox(0F, 0F, 0F, 7, 21, 14, 0F); // Box 34
		bodyModel[420].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[421].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 297
		bodyModel[421].setRotationPoint(39.5F, -20.5F, -7.25F);

		bodyModel[422].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 299
		bodyModel[422].setRotationPoint(39.5F, -20.5F, 6.25F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[423].setRotationPoint(41.5F, 2F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[424].setRotationPoint(41.5F, 2F, 7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[425].setRotationPoint(41.5F, 0F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		bodyModel[426].setRotationPoint(41.5F, 0F, 7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[427].setRotationPoint(41.5F, 5F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 265
		bodyModel[428].setRotationPoint(41.5F, 5F, 7F);

		bodyModel[429].addBox(0F, 0F, 0F, 3, 2, 18, 0F); // Box 266
		bodyModel[429].setRotationPoint(43.5F, 0F, -9F);

		bodyModel[430].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 61
		bodyModel[430].setRotationPoint(46.5F, -8F, 11F);

		bodyModel[431].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 63
		bodyModel[431].setRotationPoint(46.5F, -8F, -12F);

		bodyModel[432].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 234
		bodyModel[432].setRotationPoint(47.5F, -8F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[433].setRotationPoint(43.5F, 8F, 9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[434].setRotationPoint(43.5F, 5F, 9F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[435].setRotationPoint(43.5F, 3F, 9F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[436].setRotationPoint(43.5F, 8F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[437].setRotationPoint(43.5F, 5F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[438].setRotationPoint(43.5F, 3F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[439].setRotationPoint(46.5F, 0F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[440].setRotationPoint(46.5F, 0F, 0F);

		bodyModel[441].addBox(0F, 0F, -1F, 0, 11, 1, 0F); // Box 241
		bodyModel[441].setRotationPoint(42.5F, -8F, -10.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 0, 11, 1, 0F); // Box 251
		bodyModel[442].setRotationPoint(42.5F, -8F, 10.5F);

		bodyModel[443].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[443].setRotationPoint(46.5F, -8F, -11F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 8, 0, 0F); // Box 234
		bodyModel[444].setRotationPoint(46.5F, -8F, 11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 318
		bodyModel[445].setRotationPoint(43F, -21.5F, -0.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 323
		bodyModel[446].setRotationPoint(43.5F, 0F, 9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 0, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[447].setRotationPoint(43.5F, 0F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear SDP40
		bodyModel[448].setRotationPoint(44.25F, -17F, -1F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp rear SDP40
		bodyModel[449].setRotationPoint(44.25F, -19F, -1F);

		bodyModel[450].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[450].setRotationPoint(43F, -19F, -1F);

		bodyModel[451].addBox(0F, 0F, 0F, 14, 2, 4, 0F); // Box 36
		bodyModel[451].setRotationPoint(22.5F, -2F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[452].setRotationPoint(35.5F, -10F, -11F);

		bodyModel[453].addBox(0F, 0F, 0F, 14, 8, 0, 0F); // Box 312
		bodyModel[453].setRotationPoint(21.5F, -10F, -11F);

		bodyModel[454].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[454].setRotationPoint(-39.5F, -9F, -6.75F);

		bodyModel[455].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[455].setRotationPoint(-38.5F, -8F, -6.75F);

		bodyModel[456].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 43
		bodyModel[456].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[457].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 43
		bodyModel[457].setRotationPoint(-38.5F, -10F, -7F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[458].setRotationPoint(-42.5F, -10F, -6F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[459].setRotationPoint(-42.5F, -8F, -6F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F); // Box 42
		bodyModel[460].setRotationPoint(-40.5F, -8F, -7F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 43
		bodyModel[461].setRotationPoint(-39.5F, -13F, -7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F); // Box 298
		bodyModel[462].setRotationPoint(-40.5F, -10F, -7F);

		bodyModel[463].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 43
		bodyModel[463].setRotationPoint(-39.5F, -5F, -7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[464].setRotationPoint(-39.5F, -10F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F); // Box 298
		bodyModel[465].setRotationPoint(-40.5F, -10F, -7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[466].setRotationPoint(46.5F, -2F, -6.75F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight r
		bodyModel[467].setRotationPoint(46.75F, -2F, -6.75F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241 ditchlight r
		bodyModel[468].setRotationPoint(46.75F, -2F, 4.75F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[469].setRotationPoint(46.5F, -2F, 4.75F);

		bodyModel[470].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[470].setRotationPoint(43.5F, 7F, 9F);

		bodyModel[471].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[471].setRotationPoint(43.5F, 4F, 9F);

		bodyModel[472].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[472].setRotationPoint(43.5F, 2F, 9F);

		bodyModel[473].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[473].setRotationPoint(43.5F, 7F, -9F);

		bodyModel[474].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[474].setRotationPoint(43.5F, 4F, -9F);

		bodyModel[475].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 319
		bodyModel[475].setRotationPoint(43.5F, 2F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[476].setRotationPoint(41.5F, 1F, 10.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 259
		bodyModel[477].setRotationPoint(41.5F, 2F, 10.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[478].setRotationPoint(41.5F, 1F, -11.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[479].setRotationPoint(41.5F, 2F, -11.5F);

		bodyModel[480].addBox(0F, 0F, 0F, 3, 3, 23, 0F); // Box 36
		bodyModel[480].setRotationPoint(32.5F, -2.5F, -11.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 315
		bodyModel[481].setRotationPoint(31.5F, -9F, 11F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[482].setRotationPoint(35.5F, -9F, 11F);

		bodyModel[483].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 291
		bodyModel[483].setRotationPoint(32.5F, -9F, 11F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[484].setRotationPoint(40F, -21.75F, 1.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[485].setRotationPoint(39.5F, -22.5F, 1F);

		bodyModel[486].addBox(0F, 0F, 0F, 3, 21, 14, 0F); // Box 34
		bodyModel[486].setRotationPoint(37.5F, -21F, -7F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[487].setRotationPoint(40.25F, -17F, -1F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp rear short SDP40
		bodyModel[488].setRotationPoint(40.25F, -19F, -1F);

		bodyModel[489].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 31
		bodyModel[489].setRotationPoint(39F, -19F, -1F);

		bodyModel[490].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 115 liveryimg 2 glow
		bodyModel[490].setRotationPoint(40.51F, -20F, -6.5F);

		bodyModel[491].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 116 liveryimg 2 glow
		bodyModel[491].setRotationPoint(40.51F, -20F, 6.5F);

		bodyModel[492].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 384 markerlight glow
		bodyModel[492].setRotationPoint(40F, -13.5F, -5.5F);
		bodyModel[492].rotateAngleY = -0.01745329F;

		bodyModel[493].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 385 markerlight glow
		bodyModel[493].setRotationPoint(40F, -13.5F, 5.5F);
		bodyModel[493].rotateAngleY = 0.01745329F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[494].setRotationPoint(38.5F, -21.75F, -4.5F);

		bodyModel[495].addShapeBox(3F, 0F, 0F, 8, 9, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[495].setRotationPoint(-17.5F, -14F, -10F);

		bodyModel[496].addShapeBox(3F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[496].setRotationPoint(-17.5F, -15F, -8F);

		bodyModel[497].addShapeBox(3F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[497].setRotationPoint(-17.5F, -5F, -10F);

		bodyModel[498].addShapeBox(3F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[498].setRotationPoint(-17.5F, -4F, -11F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 401
		bodyModel[499].setRotationPoint(-30F, -23F, -3.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 191, 21, textureX, textureY); // Box 402
		bodyModel[501] = new ModelRendererTurbo(this, 207, 20, textureX, textureY); // Box 421 prime base
		bodyModel[502] = new ModelRendererTurbo(this, 207, 16, textureX, textureY); // Box 6 PRIME3-1
		bodyModel[503] = new ModelRendererTurbo(this, 207, 16, textureX, textureY); // Box 7 PRIME3-3
		bodyModel[504] = new ModelRendererTurbo(this, 207, 16, textureX, textureY); // Box 8 PRIME3-2
		bodyModel[505] = new ModelRendererTurbo(this, 207, 16, textureX, textureY); // Box 9 PRIME3-4
		bodyModel[506] = new ModelRendererTurbo(this, 318, 208, textureX, textureY); // Box 34
		bodyModel[507] = new ModelRendererTurbo(this, 327, 216, textureX, textureY); // Box 34
		bodyModel[508] = new ModelRendererTurbo(this, 347, 216, textureX, textureY); // Box 34
		bodyModel[509] = new ModelRendererTurbo(this, 328, 221, textureX, textureY); // Box 34
		bodyModel[510] = new ModelRendererTurbo(this, 348, 221, textureX, textureY); // Box 34
		bodyModel[511] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[512] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[513] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[514] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[515] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[516] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[517] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[518] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[519] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[520] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[521] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[522] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[523] = new ModelRendererTurbo(this, 198, 22, textureX, textureY); // Box 114
		bodyModel[524] = new ModelRendererTurbo(this, 198, 19, textureX, textureY); // Box 74
		bodyModel[525] = new ModelRendererTurbo(this, 198, 25, textureX, textureY); // Box 78
		bodyModel[526] = new ModelRendererTurbo(this, 197, 15, textureX, textureY); // Box 245
		bodyModel[527] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[528] = new ModelRendererTurbo(this, 30, 217, textureX, textureY); // Box 352
		bodyModel[529] = new ModelRendererTurbo(this, 31, 208, textureX, textureY); // Box 353
		bodyModel[530] = new ModelRendererTurbo(this, 3, 208, textureX, textureY); // Box 354
		bodyModel[531] = new ModelRendererTurbo(this, 3, 198, textureX, textureY); // Box 356
		bodyModel[532] = new ModelRendererTurbo(this, 31, 198, textureX, textureY); // Box 357
		bodyModel[533] = new ModelRendererTurbo(this, 51, 185, textureX, textureY); // Box 358
		bodyModel[534] = new ModelRendererTurbo(this, 27, 207, textureX, textureY); // Box 360
		bodyModel[535] = new ModelRendererTurbo(this, 21, 207, textureX, textureY); // Box 361
		bodyModel[536] = new ModelRendererTurbo(this, 32, 201, textureX, textureY); // Box 362 markerlight glow
		bodyModel[537] = new ModelRendererTurbo(this, 32, 201, textureX, textureY); // Box 363 markerlight glow
		bodyModel[538] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 355
		bodyModel[539] = new ModelRendererTurbo(this, 22, 198, textureX, textureY); // Box 359
		bodyModel[540] = new ModelRendererTurbo(this, 30, 220, textureX, textureY); // Box 541
		bodyModel[541] = new ModelRendererTurbo(this, 31, 217, textureX, textureY); // Box 542
		bodyModel[542] = new ModelRendererTurbo(this, 16, 221, textureX, textureY); // Box 544
		bodyModel[543] = new ModelRendererTurbo(this, 52, 219, textureX, textureY); // Box 545 lamp bnsf front 2
		bodyModel[544] = new ModelRendererTurbo(this, 52, 214, textureX, textureY); // Box 546 lamp bnsf front 2
		bodyModel[545] = new ModelRendererTurbo(this, 52, 224, textureX, textureY); // Box 547 lamp canada front 2
		bodyModel[546] = new ModelRendererTurbo(this, 52, 229, textureX, textureY); // Box 548 lamp canada front 2
		bodyModel[547] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 381 sp mount
		bodyModel[548] = new ModelRendererTurbo(this, 426, 134, textureX, textureY); // Box 31 sp mount
		bodyModel[549] = new ModelRendererTurbo(this, 423, 133, textureX, textureY); // Box 247 lamp gyralight rear
		bodyModel[550] = new ModelRendererTurbo(this, 423, 133, textureX, textureY); // Box 248 lamp gyralight rear
		bodyModel[551] = new ModelRendererTurbo(this, 423, 128, textureX, textureY); // Box 388 light red gyralight rear
		bodyModel[552] = new ModelRendererTurbo(this, 430, 128, textureX, textureY); // Box 389 sp mount
		bodyModel[553] = new ModelRendererTurbo(this, 403, 132, textureX, textureY); // Box 394
		bodyModel[554] = new ModelRendererTurbo(this, 403, 135, textureX, textureY); // Box 395
		bodyModel[555] = new ModelRendererTurbo(this, 403, 138, textureX, textureY); // Box 396
		bodyModel[556] = new ModelRendererTurbo(this, 401, 127, textureX, textureY); // Box 397
		bodyModel[557] = new ModelRendererTurbo(this, 396, 128, textureX, textureY); // Box 399
		bodyModel[558] = new ModelRendererTurbo(this, 396, 128, textureX, textureY); // Box 399
		bodyModel[559] = new ModelRendererTurbo(this, 67, 103, textureX, textureY); // Box 561
		bodyModel[560] = new ModelRendererTurbo(this, 67, 103, textureX, textureY); // Box 562
		bodyModel[561] = new ModelRendererTurbo(this, 57, 102, textureX, textureY); // Box 563
		bodyModel[562] = new ModelRendererTurbo(this, 59, 107, textureX, textureY); // Box 564
		bodyModel[563] = new ModelRendererTurbo(this, 59, 110, textureX, textureY); // Box 565
		bodyModel[564] = new ModelRendererTurbo(this, 59, 113, textureX, textureY); // Box 566
		bodyModel[565] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Box 567
		bodyModel[566] = new ModelRendererTurbo(this, 220, 34, textureX, textureY); // Box 568
		bodyModel[567] = new ModelRendererTurbo(this, 225, 34, textureX, textureY); // Box 569
		bodyModel[568] = new ModelRendererTurbo(this, 225, 31, textureX, textureY); // Box 570
		bodyModel[569] = new ModelRendererTurbo(this, 107, 149, textureX, textureY); // Box 71 glow speedometer
		bodyModel[570] = new ModelRendererTurbo(this, 98, 151, textureX, textureY); // Box 307

		bodyModel[500].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 402
		bodyModel[500].setRotationPoint(-29F, -23F, -3.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421 prime base
		bodyModel[501].setRotationPoint(-25.5F, -22F, -1F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[502].setRotationPoint(-25.5F, -22.5F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[503].setRotationPoint(-25.5F, -22.5F, -1F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[504].setRotationPoint(-25.5F, -22.5F, -1F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[505].setRotationPoint(-25.5F, -22.5F, -1F);

		bodyModel[506].addBox(-8F, 0F, -1F, 8, 0, 16, 0F); // Box 34
		bodyModel[506].setRotationPoint(37.5F, -21.01F, -7F);

		bodyModel[507].addShapeBox(-4F, 0F, -5F, 1, 0, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 34
		bodyModel[507].setRotationPoint(37.5F, -21.01F, -7F);

		bodyModel[508].addShapeBox(-4F, 0F, 1F, 1, 0, 4, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 34
		bodyModel[508].setRotationPoint(37.5F, -21.01F, 7F);

		bodyModel[509].addShapeBox(-4F, 0F, -4F, 1, 0, 3, 0F,-1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -1F, 0.55F, 0F, -0.45F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 34
		bodyModel[509].setRotationPoint(35.5F, -21.01F, -7F);

		bodyModel[510].addShapeBox(-6F, 0F, 1F, 1, 0, 3, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0.55F, 0F, -0.45F, -1F, 0F, -1F); // Box 34
		bodyModel[510].setRotationPoint(37.5F, -21.01F, 7F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[511].setRotationPoint(-23F, -28F, 6F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[512].setRotationPoint(-23F, -28F, 8F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[513].setRotationPoint(-23F, -27F, 5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[514].setRotationPoint(-23F, -27F, 8F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[515].setRotationPoint(-23F, -25F, 7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[516].setRotationPoint(-23F, -25F, 5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[517].setRotationPoint(-23F, -25F, -8F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[518].setRotationPoint(-23F, -25F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[519].setRotationPoint(-23F, -27F, -9F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[520].setRotationPoint(-23F, -27F, -8F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[521].setRotationPoint(-23F, -28F, -8F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[522].setRotationPoint(-23F, -28F, -9F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[523].setRotationPoint(15F, -19.5F, 7.7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[524].setRotationPoint(15F, -20.5F, 7.7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[525].setRotationPoint(15.25F, -19F, 7.95F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[526].setRotationPoint(15F, -21.5F, 6.5F);

		bodyModel[527].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[527].setRotationPoint(-19.5F, -20F, -6F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[528].setRotationPoint(-46.5F, -8F, -7F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[529].setRotationPoint(-46.5F, -10F, -7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[530].setRotationPoint(-46.5F, -10F, 1F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[531].setRotationPoint(-46.5F, -13F, 1F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[532].setRotationPoint(-46.5F, -13F, -7F);

		bodyModel[533].addBox(0F, 0F, 0F, 4, 13, 14, 0F); // Box 358
		bodyModel[533].setRotationPoint(-43.5F, -13F, -7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[534].setRotationPoint(-46.5F, -13F, -1F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 361
		bodyModel[535].setRotationPoint(-46.5F, -13F, 0F);

		bodyModel[536].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 362 markerlight glow
		bodyModel[536].setRotationPoint(-44.4F, -11.5F, -5.5F);
		bodyModel[536].rotateAngleY = 0.43633231F;

		bodyModel[537].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363 markerlight glow
		bodyModel[537].setRotationPoint(-44.4F, -11.5F, 5.5F);
		bodyModel[537].rotateAngleY = -0.43633231F;

		bodyModel[538].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[538].setRotationPoint(-46.5F, -8F, 0F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 359
		bodyModel[539].setRotationPoint(-45.5F, -13F, -1F);

		bodyModel[540].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 541
		bodyModel[540].setRotationPoint(-42F, -12F, -7.5F);

		bodyModel[541].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 542
		bodyModel[541].setRotationPoint(-41F, -11F, -7.5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 544
		bodyModel[542].setRotationPoint(-44F, -13.5F, -0.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 545 lamp bnsf front 2
		bodyModel[543].setRotationPoint(-46.5F, -11F, -1F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 546 lamp bnsf front 2
		bodyModel[544].setRotationPoint(-46.5F, -13F, -1F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 547 lamp canada front 2
		bodyModel[545].setRotationPoint(-46.5F, -12F, -1F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 548 lamp canada front 2
		bodyModel[546].setRotationPoint(-46.5F, -10F, -1F);

		bodyModel[547].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 381 sp mount
		bodyModel[547].setRotationPoint(39.75F, -23F, -2F);

		bodyModel[548].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[548].setRotationPoint(40.75F, -21F, -2F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[549].setRotationPoint(41F, -21F, -2F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[550].setRotationPoint(41F, -21F, 0F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[551].setRotationPoint(41F, -23F, -1F);

		bodyModel[552].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[552].setRotationPoint(40.75F, -23F, -1F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[553].setRotationPoint(41F, -23F, -0.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 395
		bodyModel[554].setRotationPoint(41F, -22F, -0.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 396
		bodyModel[555].setRotationPoint(40.75F, -21.5F, -0.25F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 397
		bodyModel[556].setRotationPoint(40.75F, -23.51F, -1.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[557].setRotationPoint(39F, -23F, -1F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 399
		bodyModel[558].setRotationPoint(39F, -23F, 1F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 561
		bodyModel[559].setRotationPoint(-43F, -23F, -1F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 562
		bodyModel[560].setRotationPoint(-43F, -23F, 1F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 563
		bodyModel[561].setRotationPoint(-43.75F, -23.51F, -1.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[562].setRotationPoint(-44F, -23F, -0.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 565
		bodyModel[563].setRotationPoint(-44F, -22F, -0.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 566
		bodyModel[564].setRotationPoint(-43.75F, -21.5F, -0.25F);

		bodyModel[565].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 567
		bodyModel[565].setRotationPoint(35.5F, -22.75F, 3.5F);

		bodyModel[566].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 568
		bodyModel[566].setRotationPoint(35.5F, -22F, 4.5F);

		bodyModel[567].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 569
		bodyModel[567].setRotationPoint(35F, -23F, 4.5F);

		bodyModel[568].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 570
		bodyModel[568].setRotationPoint(34F, -22.75F, 5.5F);

		bodyModel[569].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[569].setRotationPoint(-26F, -16.25F, 2F);
		bodyModel[569].rotateAngleY = 0.78539816F;

		bodyModel[570].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307
		bodyModel[570].setRotationPoint(-26F, -16.25F, 2F);
		bodyModel[570].rotateAngleY = 0.78539816F;
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 571; i++) {
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
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6) {
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
				add(new double[]{2.3D, 1.4D, 0.0D});
			}
		};
	}
}