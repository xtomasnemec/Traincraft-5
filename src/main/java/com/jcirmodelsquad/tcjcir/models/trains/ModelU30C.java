//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U30C
// Model Creator: Bida
// Created on: 27.08.2021 - 21:30:37
// Last changed on: 27.08.2021 - 21:30:37

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB3;
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

public class ModelU30C extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelU30C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[411];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 317, 167, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 254, 2, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 8, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 311, 140, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 10, 6, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 6, textureX, textureY); // Box 30
		bodyModel[12] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 31
		bodyModel[13] = new ModelRendererTurbo(this, 125, 78, textureX, textureY); // Box 32
		bodyModel[14] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 188, 101, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 147, 101, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[19] = new ModelRendererTurbo(this, 59, 43, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 30, 43, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 77, 25, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 35, 25, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 464, 115, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 471, 110, textureX, textureY); // Box 149
		bodyModel[25] = new ModelRendererTurbo(this, 447, 110, textureX, textureY); // Box 150
		bodyModel[26] = new ModelRendererTurbo(this, 272, 82, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 330, 196, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 330, 188, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 109, 9, textureX, textureY); // Box 160
		bodyModel[30] = new ModelRendererTurbo(this, 35, 45, textureX, textureY); // Box 161
		bodyModel[31] = new ModelRendererTurbo(this, 90, 45, textureX, textureY); // Box 162
		bodyModel[32] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 163
		bodyModel[33] = new ModelRendererTurbo(this, 75, 45, textureX, textureY); // Box 164
		bodyModel[34] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 165
		bodyModel[35] = new ModelRendererTurbo(this, 99, 43, textureX, textureY); // Box 166
		bodyModel[36] = new ModelRendererTurbo(this, 105, 29, textureX, textureY); // Box 167
		bodyModel[37] = new ModelRendererTurbo(this, 70, 43, textureX, textureY); // Box 168
		bodyModel[38] = new ModelRendererTurbo(this, 109, 21, textureX, textureY); // Box 169
		bodyModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[42] = new ModelRendererTurbo(this, 8, 42, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[43] = new ModelRendererTurbo(this, 7, 39, textureX, textureY); // Box 175
		bodyModel[44] = new ModelRendererTurbo(this, 1, 76, textureX, textureY); // Box 185
		bodyModel[45] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[46] = new ModelRendererTurbo(this, 82, 132, textureX, textureY); // Box 196
		bodyModel[47] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[48] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[49] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[50] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[51] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[52] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[53] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[54] = new ModelRendererTurbo(this, 143, 152, textureX, textureY); // box65
		bodyModel[55] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[56] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[57] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[59] = new ModelRendererTurbo(this, 474, 157, textureX, textureY); // Box 231
		bodyModel[60] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 233, 62, textureX, textureY); // Box 251
		bodyModel[64] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[65] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[66] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[67] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[68] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[69] = new ModelRendererTurbo(this, 225, 74, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[70] = new ModelRendererTurbo(this, 224, 77, textureX, textureY); // Box 165
		bodyModel[71] = new ModelRendererTurbo(this, 55, 188, textureX, textureY); // Box 275 cs
		bodyModel[72] = new ModelRendererTurbo(this, 119, 42, textureX, textureY); // Box 277
		bodyModel[73] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[74] = new ModelRendererTurbo(this, 149, 65, textureX, textureY); // Box 284
		bodyModel[75] = new ModelRendererTurbo(this, 165, 122, textureX, textureY); // Box 285
		bodyModel[76] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[77] = new ModelRendererTurbo(this, 172, 111, textureX, textureY); // Box 300
		bodyModel[78] = new ModelRendererTurbo(this, 172, 90, textureX, textureY); // Box 303
		bodyModel[79] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[80] = new ModelRendererTurbo(this, 371, 125, textureX, textureY); // Box 305
		bodyModel[81] = new ModelRendererTurbo(this, 365, 125, textureX, textureY); // Box 305
		bodyModel[82] = new ModelRendererTurbo(this, 336, 85, textureX, textureY); // Box 19
		bodyModel[83] = new ModelRendererTurbo(this, 357, 98, textureX, textureY); // Box 305
		bodyModel[84] = new ModelRendererTurbo(this, 351, 97, textureX, textureY); // Box 305
		bodyModel[85] = new ModelRendererTurbo(this, 266, 122, textureX, textureY); // Box 19
		bodyModel[86] = new ModelRendererTurbo(this, 266, 105, textureX, textureY); // Box 19
		bodyModel[87] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 240 glow liveryimg 2
		bodyModel[90] = new ModelRendererTurbo(this, 481, 109, textureX, textureY, "lamp"); // Box 241 glow liveryimg 2
		bodyModel[91] = new ModelRendererTurbo(this, 164, 32, textureX, textureY); // Box 247
		bodyModel[92] = new ModelRendererTurbo(this, 164, 35, textureX, textureY); // Box 248
		bodyModel[93] = new ModelRendererTurbo(this, 173, 34, textureX, textureY); // Box 249
		bodyModel[94] = new ModelRendererTurbo(this, 164, 38, textureX, textureY); // Box 250
		bodyModel[95] = new ModelRendererTurbo(this, 144, 32, textureX, textureY); // Box 248
		bodyModel[96] = new ModelRendererTurbo(this, 144, 36, textureX, textureY); // Box 250
		bodyModel[97] = new ModelRendererTurbo(this, 152, 33, textureX, textureY); // Box 249
		bodyModel[98] = new ModelRendererTurbo(this, 119, 111, textureX, textureY); // Box 205
		bodyModel[99] = new ModelRendererTurbo(this, 415, 139, textureX, textureY); // Box 205
		bodyModel[100] = new ModelRendererTurbo(this, 124, 101, textureX, textureY); // Box 36
		bodyModel[101] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[103] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[104] = new ModelRendererTurbo(this, 139, 1, textureX, textureY); // Box 78
		bodyModel[105] = new ModelRendererTurbo(this, 71, 133, textureX, textureY); // Box 2603
		bodyModel[106] = new ModelRendererTurbo(this, 84, 132, textureX, textureY); // Box 261
		bodyModel[107] = new ModelRendererTurbo(this, 491, 128, textureX, textureY); // Box 263
		bodyModel[108] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[109] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[110] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 190 ditchlight f1
		bodyModel[111] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[112] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 275 ditchlight f2
		bodyModel[113] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r1
		bodyModel[114] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r2
		bodyModel[115] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "lamp"); // Box 186 Headlight Front up
		bodyModel[116] = new ModelRendererTurbo(this, 1, 52, textureX, textureY, "lamp"); // Box 187 Headlight Front down
		bodyModel[117] = new ModelRendererTurbo(this, 4, 71, textureX, textureY, "lamp"); // Box 247 Headlight Front nose R
		bodyModel[118] = new ModelRendererTurbo(this, 12, 81, textureX, textureY, "lamp"); // Box 248 Headlight Front nose L
		bodyModel[119] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 284 Headlight Rear down
		bodyModel[120] = new ModelRendererTurbo(this, 447, 112, textureX, textureY, "lamp"); // Box 285 Headlight Rear up
		bodyModel[121] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[123] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[124] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[125] = new ModelRendererTurbo(this, 156, 65, textureX, textureY); // Box 279
		bodyModel[126] = new ModelRendererTurbo(this, 444, 127, textureX, textureY); // Box 280
		bodyModel[127] = new ModelRendererTurbo(this, 488, 132, textureX, textureY); // Box 281
		bodyModel[128] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[129] = new ModelRendererTurbo(this, 56, 67, textureX, textureY); // Box 289
		bodyModel[130] = new ModelRendererTurbo(this, 153, 16, textureX, textureY); // Box 292
		bodyModel[131] = new ModelRendererTurbo(this, 167, 2, textureX, textureY); // Box 293
		bodyModel[132] = new ModelRendererTurbo(this, 163, 8, textureX, textureY); // Box 294
		bodyModel[133] = new ModelRendererTurbo(this, 44, 66, textureX, textureY); // Box 295
		bodyModel[134] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 296
		bodyModel[135] = new ModelRendererTurbo(this, 10, 66, textureX, textureY); // Box 297
		bodyModel[136] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 298 headlight f hh
		bodyModel[137] = new ModelRendererTurbo(this, 1, 39, textureX, textureY, "lamp"); // Box 299 headlight f h
		bodyModel[138] = new ModelRendererTurbo(this, 19, 74, textureX, textureY); // Box 303
		bodyModel[139] = new ModelRendererTurbo(this, 34, 78, textureX, textureY); // Box 304
		bodyModel[140] = new ModelRendererTurbo(this, 41, 74, textureX, textureY); // Box 305
		bodyModel[141] = new ModelRendererTurbo(this, 34, 74, textureX, textureY); // Box 306
		bodyModel[142] = new ModelRendererTurbo(this, 50, 72, textureX, textureY); // Box 307
		bodyModel[143] = new ModelRendererTurbo(this, 10, 72, textureX, textureY); // Box 308
		bodyModel[144] = new ModelRendererTurbo(this, 128, 45, textureX, textureY); // Box 354
		bodyModel[145] = new ModelRendererTurbo(this, 130, 42, textureX, textureY); // Box 355
		bodyModel[146] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Box 356
		bodyModel[147] = new ModelRendererTurbo(this, 139, 45, textureX, textureY); // Box 357
		bodyModel[148] = new ModelRendererTurbo(this, 210, 32, textureX, textureY); // Box 286
		bodyModel[149] = new ModelRendererTurbo(this, 219, 35, textureX, textureY); // Box 287
		bodyModel[150] = new ModelRendererTurbo(this, 210, 38, textureX, textureY); // Box 288
		bodyModel[151] = new ModelRendererTurbo(this, 208, 35, textureX, textureY); // Box 289
		bodyModel[152] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[153] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[154] = new ModelRendererTurbo(this, 83, 54, textureX, textureY); // Box 298
		bodyModel[155] = new ModelRendererTurbo(this, 78, 55, textureX, textureY); // Box 299
		bodyModel[156] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 300
		bodyModel[157] = new ModelRendererTurbo(this, 70, 59, textureX, textureY); // Box 301
		bodyModel[158] = new ModelRendererTurbo(this, 41, 101, textureX, textureY); // Box 302
		bodyModel[159] = new ModelRendererTurbo(this, 19, 101, textureX, textureY); // Box 303
		bodyModel[160] = new ModelRendererTurbo(this, 34, 105, textureX, textureY); // Box 304
		bodyModel[161] = new ModelRendererTurbo(this, 112, 60, textureX, textureY); // Box 305
		bodyModel[162] = new ModelRendererTurbo(this, 112, 52, textureX, textureY); // Box 306
		bodyModel[163] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[164] = new ModelRendererTurbo(this, 1, 65, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[165] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 309
		bodyModel[166] = new ModelRendererTurbo(this, 314, 117, textureX, textureY); // Box 310
		bodyModel[167] = new ModelRendererTurbo(this, 243, 117, textureX, textureY); // Box 311
		bodyModel[168] = new ModelRendererTurbo(this, 98, 5, textureX, textureY); // Box 52 door swing right
		bodyModel[169] = new ModelRendererTurbo(this, 56, 5, textureX, textureY); // Box 314 door swing right
		bodyModel[170] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[171] = new ModelRendererTurbo(this, 207, 129, textureX, textureY); // Box 319
		bodyModel[172] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[173] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[174] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[175] = new ModelRendererTurbo(this, 493, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[176] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 402
		bodyModel[177] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[178] = new ModelRendererTurbo(this, 207, 126, textureX, textureY); // Box 280
		bodyModel[179] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[180] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[181] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 287 glow liveryimg 2
		bodyModel[182] = new ModelRendererTurbo(this, 8, 50, textureX, textureY, "lamp"); // Box 288 glow liveryimg 2
		bodyModel[183] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[184] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[185] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[186] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[187] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[188] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[189] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[190] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[191] = new ModelRendererTurbo(this, 134, 62, textureX, textureY); // Box 417
		bodyModel[192] = new ModelRendererTurbo(this, 157, 64, textureX, textureY); // Box 418
		bodyModel[193] = new ModelRendererTurbo(this, 178, 65, textureX, textureY, "cull"); // Box 419 cull
		bodyModel[194] = new ModelRendererTurbo(this, 215, 77, textureX, textureY); // Box 364 prime base
		bodyModel[195] = new ModelRendererTurbo(this, 215, 73, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[196] = new ModelRendererTurbo(this, 215, 73, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[197] = new ModelRendererTurbo(this, 215, 73, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[198] = new ModelRendererTurbo(this, 215, 73, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[199] = new ModelRendererTurbo(this, 181, 63, textureX, textureY); // Box 425
		bodyModel[200] = new ModelRendererTurbo(this, 128, 61, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[201] = new ModelRendererTurbo(this, 150, 7, textureX, textureY); // Box 364 prime base
		bodyModel[202] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 6 PRIME2-1
		bodyModel[203] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 7 PRIME2-3
		bodyModel[204] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 8 PRIME2-2
		bodyModel[205] = new ModelRendererTurbo(this, 150, 2, textureX, textureY, "lamp"); // Box 9 PRIME2-4
		bodyModel[206] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[207] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 441 ditchlight r2
		bodyModel[208] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[209] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 443 ditchlight r1
		bodyModel[210] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[211] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, "lamp"); // Box 445 ditchlight f2
		bodyModel[212] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, "lamp"); // Box 446 ditchlight f1
		bodyModel[213] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[214] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[215] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[216] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[217] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[218] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[219] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[220] = new ModelRendererTurbo(this, 180, 112, textureX, textureY); // Box 322
		bodyModel[221] = new ModelRendererTurbo(this, 180, 136, textureX, textureY); // Box 323
		bodyModel[222] = new ModelRendererTurbo(this, 116, 42, textureX, textureY); // Box 324
		bodyModel[223] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[224] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 335
		bodyModel[225] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[226] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 330
		bodyModel[227] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, "lamp"); // Box 334 commander beacon
		bodyModel[228] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 335
		bodyModel[229] = new ModelRendererTurbo(this, 166, 42, textureX, textureY); // Box 333
		bodyModel[230] = new ModelRendererTurbo(this, 176, 45, textureX, textureY); // Box 334
		bodyModel[231] = new ModelRendererTurbo(this, 166, 45, textureX, textureY); // Box 335
		bodyModel[232] = new ModelRendererTurbo(this, 166, 48, textureX, textureY); // Box 336
		bodyModel[233] = new ModelRendererTurbo(this, 113, 42, textureX, textureY); // Box 337
		bodyModel[234] = new ModelRendererTurbo(this, 237, 49, textureX, textureY); // Box 418
		bodyModel[235] = new ModelRendererTurbo(this, 228, 46, textureX, textureY); // Box 419
		bodyModel[236] = new ModelRendererTurbo(this, 226, 49, textureX, textureY); // Box 420
		bodyModel[237] = new ModelRendererTurbo(this, 228, 52, textureX, textureY); // Box 421
		bodyModel[238] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 6 PRIME3-1
		bodyModel[239] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 7 PRIME3-3
		bodyModel[240] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 8 PRIME3-2
		bodyModel[241] = new ModelRendererTurbo(this, 151, 55, textureX, textureY, "lamp"); // Box 9 PRIME3-4
		bodyModel[242] = new ModelRendererTurbo(this, 161, 56, textureX, textureY, "cull"); // Box 426 cull
		bodyModel[243] = new ModelRendererTurbo(this, 151, 59, textureX, textureY); // Box 428
		bodyModel[244] = new ModelRendererTurbo(this, 26, 197, textureX, textureY); // Box 412 cs
		bodyModel[245] = new ModelRendererTurbo(this, 40, 196, textureX, textureY); // Box 413 cs
		bodyModel[246] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86
		bodyModel[247] = new ModelRendererTurbo(this, 147, 14, textureX, textureY); // Box 352
		bodyModel[248] = new ModelRendererTurbo(this, 147, 17, textureX, textureY); // Box 353
		bodyModel[249] = new ModelRendererTurbo(this, 147, 11, textureX, textureY); // Box 354
		bodyModel[250] = new ModelRendererTurbo(this, 140, 22, textureX, textureY); // Box 877
		bodyModel[251] = new ModelRendererTurbo(this, 138, 21, textureX, textureY); // Box 332
		bodyModel[252] = new ModelRendererTurbo(this, 138, 21, textureX, textureY); // Box 333
		bodyModel[253] = new ModelRendererTurbo(this, 112, 38, textureX, textureY); // Box 413
		bodyModel[254] = new ModelRendererTurbo(this, 433, 67, textureX, textureY); // Box 298
		bodyModel[255] = new ModelRendererTurbo(this, 440, 57, textureX, textureY); // Box 369
		bodyModel[256] = new ModelRendererTurbo(this, 440, 44, textureX, textureY); // Box 370
		bodyModel[257] = new ModelRendererTurbo(this, 446, 53, textureX, textureY); // Box 371
		bodyModel[258] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[259] = new ModelRendererTurbo(this, 448, 98, textureX, textureY); // Box 278
		bodyModel[260] = new ModelRendererTurbo(this, 470, 98, textureX, textureY); // Box 279
		bodyModel[261] = new ModelRendererTurbo(this, 3, 87, textureX, textureY); // Box 291
		bodyModel[262] = new ModelRendererTurbo(this, 232, 63, textureX, textureY); // Box 18
		bodyModel[263] = new ModelRendererTurbo(this, 230, 70, textureX, textureY); // Box 21
		bodyModel[264] = new ModelRendererTurbo(this, 134, 78, textureX, textureY); // Box 688
		bodyModel[265] = new ModelRendererTurbo(this, 225, 99, textureX, textureY); // Box 37
		bodyModel[266] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[267] = new ModelRendererTurbo(this, 234, 99, textureX, textureY); // Box 557
		bodyModel[268] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[269] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[270] = new ModelRendererTurbo(this, 500, 152, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[271] = new ModelRendererTurbo(this, 462, 104, textureX, textureY); // Box 288
		bodyModel[272] = new ModelRendererTurbo(this, 1, 91, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[273] = new ModelRendererTurbo(this, 8, 91, textureX, textureY, "lamp"); // Box 290gyralight rear r
		bodyModel[274] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[275] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[276] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[277] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[278] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[279] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[280] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[281] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[282] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[283] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[284] = new ModelRendererTurbo(this, 28, 101, textureX, textureY); // Box 316
		bodyModel[285] = new ModelRendererTurbo(this, 40, 100, textureX, textureY); // Box 317
		bodyModel[286] = new ModelRendererTurbo(this, 28, 100, textureX, textureY); // Box 318
		bodyModel[287] = new ModelRendererTurbo(this, 42, 101, textureX, textureY); // Box 319
		bodyModel[288] = new ModelRendererTurbo(this, 116, 45, textureX, textureY); // Box 276
		bodyModel[289] = new ModelRendererTurbo(this, 76, 5, textureX, textureY); // Box 123
		bodyModel[290] = new ModelRendererTurbo(this, 95, 24, textureX, textureY); // Box 350
		bodyModel[291] = new ModelRendererTurbo(this, 98, 24, textureX, textureY); // Box 321
		bodyModel[292] = new ModelRendererTurbo(this, 16, 55, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[293] = new ModelRendererTurbo(this, 17, 50, textureX, textureY); // Box 5
		bodyModel[294] = new ModelRendererTurbo(this, 34, 5, textureX, textureY); // Box 311
		bodyModel[295] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[296] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[297] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[298] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[299] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[300] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[301] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[302] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[303] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[304] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[305] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[306] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[307] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[308] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[309] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[310] = new ModelRendererTurbo(this, 89, 166, textureX, textureY); // Box 734
		bodyModel[311] = new ModelRendererTurbo(this, 188, 57, textureX, textureY); // Box 114
		bodyModel[312] = new ModelRendererTurbo(this, 188, 54, textureX, textureY); // Box 74
		bodyModel[313] = new ModelRendererTurbo(this, 188, 60, textureX, textureY); // Box 78
		bodyModel[314] = new ModelRendererTurbo(this, 193, 56, textureX, textureY); // Box 245
		bodyModel[315] = new ModelRendererTurbo(this, 234, 34, textureX, textureY); // Box 373
		bodyModel[316] = new ModelRendererTurbo(this, 242, 38, textureX, textureY); // Box 374
		bodyModel[317] = new ModelRendererTurbo(this, 231, 38, textureX, textureY); // Box 375
		bodyModel[318] = new ModelRendererTurbo(this, 231, 28, textureX, textureY); // Box 376
		bodyModel[319] = new ModelRendererTurbo(this, 242, 28, textureX, textureY); // Box 377
		bodyModel[320] = new ModelRendererTurbo(this, 233, 24, textureX, textureY); // Box 378
		bodyModel[321] = new ModelRendererTurbo(this, 218, 49, textureX, textureY); // Box 745
		bodyModel[322] = new ModelRendererTurbo(this, 206, 49, textureX, textureY); // Box 746
		bodyModel[323] = new ModelRendererTurbo(this, 208, 46, textureX, textureY); // Box 747
		bodyModel[324] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 748
		bodyModel[325] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 6 PRIME4-1
		bodyModel[326] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 7 PRIME4-3
		bodyModel[327] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 8 PRIME4-2
		bodyModel[328] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, "lamp"); // Box 9 PRIME4-4
		bodyModel[329] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[330] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[331] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[332] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[333] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[334] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[335] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[336] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[337] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[338] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 19
		bodyModel[339] = new ModelRendererTurbo(this, 315, 89, textureX, textureY); // Box 548
		bodyModel[340] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[341] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[342] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[343] = new ModelRendererTurbo(this, 467, 23, textureX, textureY); // Box 293
		bodyModel[344] = new ModelRendererTurbo(this, 483, 32, textureX, textureY); // Box 293
		bodyModel[345] = new ModelRendererTurbo(this, 476, 32, textureX, textureY); // Box 293
		bodyModel[346] = new ModelRendererTurbo(this, 467, 32, textureX, textureY); // Box 293
		bodyModel[347] = new ModelRendererTurbo(this, 478, 10, textureX, textureY); // Box 293
		bodyModel[348] = new ModelRendererTurbo(this, 471, 10, textureX, textureY); // Box 293
		bodyModel[349] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[350] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 307 glowey marker
		bodyModel[351] = new ModelRendererTurbo(this, 8, 59, textureX, textureY, "lamp"); // Box 308 glowey marker
		bodyModel[352] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 785
		bodyModel[353] = new ModelRendererTurbo(this, 195, 46, textureX, textureY); // Box 786
		bodyModel[354] = new ModelRendererTurbo(this, 186, 43, textureX, textureY); // Box 787
		bodyModel[355] = new ModelRendererTurbo(this, 184, 46, textureX, textureY); // Box 788
		bodyModel[356] = new ModelRendererTurbo(this, 186, 49, textureX, textureY); // Box 789
		bodyModel[357] = new ModelRendererTurbo(this, 144, 120, textureX, textureY); // Box 790
		bodyModel[358] = new ModelRendererTurbo(this, 56, 90, textureX, textureY); // Box 410
		bodyModel[359] = new ModelRendererTurbo(this, 69, 90, textureX, textureY); // Box 310
		bodyModel[360] = new ModelRendererTurbo(this, 84, 93, textureX, textureY); // Box 81
		bodyModel[361] = new ModelRendererTurbo(this, 99, 112, textureX, textureY); // Box 81
		bodyModel[362] = new ModelRendererTurbo(this, 103, 108, textureX, textureY); // Box 275
		bodyModel[363] = new ModelRendererTurbo(this, 94, 95, textureX, textureY); // Box 250
		bodyModel[364] = new ModelRendererTurbo(this, 99, 108, textureX, textureY); // Box 276
		bodyModel[365] = new ModelRendererTurbo(this, 490, 23, textureX, textureY); // Box 293
		bodyModel[366] = new ModelRendererTurbo(this, 485, 1, textureX, textureY); // Box 293
		bodyModel[367] = new ModelRendererTurbo(this, 37, 62, textureX, textureY); // Box 402
		bodyModel[368] = new ModelRendererTurbo(this, 61, 96, textureX, textureY); // Box 106
		bodyModel[369] = new ModelRendererTurbo(this, 176, 65, textureX, textureY); // Box 401
		bodyModel[370] = new ModelRendererTurbo(this, 185, 59, textureX, textureY); // Box 402
		bodyModel[371] = new ModelRendererTurbo(this, 422, 62, textureX, textureY); // Box 388
		bodyModel[372] = new ModelRendererTurbo(this, 422, 70, textureX, textureY); // Box 389
		bodyModel[373] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 390
		bodyModel[374] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 391
		bodyModel[375] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 392
		bodyModel[376] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 393
		bodyModel[377] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 394
		bodyModel[378] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 395
		bodyModel[379] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 396
		bodyModel[380] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 397
		bodyModel[381] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 398
		bodyModel[382] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 399
		bodyModel[383] = new ModelRendererTurbo(this, 72, 90, textureX, textureY); // Box 400
		bodyModel[384] = new ModelRendererTurbo(this, 81, 90, textureX, textureY, "lamp"); // Box 401 sp emergency gyra
		bodyModel[385] = new ModelRendererTurbo(this, 120, 39, textureX, textureY); // Box 402
		bodyModel[386] = new ModelRendererTurbo(this, 201, 72, textureX, textureY); // Box 403
		bodyModel[387] = new ModelRendererTurbo(this, 201, 75, textureX, textureY); // Box 404
		bodyModel[388] = new ModelRendererTurbo(this, 201, 78, textureX, textureY); // Box 405
		bodyModel[389] = new ModelRendererTurbo(this, 206, 74, textureX, textureY, "cull"); // Box 407 sp bell holder cull
		bodyModel[390] = new ModelRendererTurbo(this, 176, 65, textureX, textureY); // Box 397
		bodyModel[391] = new ModelRendererTurbo(this, 202, 35, textureX, textureY); // Box 398
		bodyModel[392] = new ModelRendererTurbo(this, 193, 32, textureX, textureY); // Box 399
		bodyModel[393] = new ModelRendererTurbo(this, 191, 35, textureX, textureY); // Box 400
		bodyModel[394] = new ModelRendererTurbo(this, 193, 38, textureX, textureY); // Box 401
		bodyModel[395] = new ModelRendererTurbo(this, 187, 74, textureX, textureY); // Box 354 cnw bELL
		bodyModel[396] = new ModelRendererTurbo(this, 190, 75, textureX, textureY, "cull"); // Box 403 cnw step cull thing
		bodyModel[397] = new ModelRendererTurbo(this, 145, 165, textureX, textureY, "cull"); // Import Box208cul
		bodyModel[398] = new ModelRendererTurbo(this, 145, 162, textureX, textureY, "cull"); // Import Box278cul
		bodyModel[399] = new ModelRendererTurbo(this, 124, 152, textureX, textureY, "cull"); // Import Box279cul
		bodyModel[400] = new ModelRendererTurbo(this, 127, 159, textureX, textureY); // Box 407
		bodyModel[401] = new ModelRendererTurbo(this, 144, 110, textureX, textureY); // Box 429
		bodyModel[402] = new ModelRendererTurbo(this, 100, 105, textureX, textureY); // box65
		bodyModel[403] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[404] = new ModelRendererTurbo(this, 124, 42, textureX, textureY); // Box 404
		bodyModel[405] = new ModelRendererTurbo(this, 150, 47, textureX, textureY, "lamp"); // Box 6 PRIME5-1
		bodyModel[406] = new ModelRendererTurbo(this, 150, 47, textureX, textureY, "lamp"); // Box 7 PRIME5-3
		bodyModel[407] = new ModelRendererTurbo(this, 150, 47, textureX, textureY, "lamp"); // Box 8 PRIME5-2
		bodyModel[408] = new ModelRendererTurbo(this, 150, 47, textureX, textureY, "lamp"); // Box 9 PRIME5-4
		bodyModel[409] = new ModelRendererTurbo(this, 150, 51, textureX, textureY); // Box 428
		bodyModel[410] = new ModelRendererTurbo(this, 236, 65, textureX, textureY); // Box 669

		bodyModel[0].addBox(0F, 0F, 0F, 86, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43F, -2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 23, 4, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-11F, 5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 3
		bodyModel[2].setRotationPoint(-47.01F, -2F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 67, 20, 14, 0F); // Box 6
		bodyModel[3].setRotationPoint(-24F, -22F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-36F, -20F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 8
		bodyModel[5].setRotationPoint(-47F, -2F, -7F);

		bodyModel[6].addBox(0F, 0F, 0F, 23, 4, 22, 0F); // Box 10
		bodyModel[6].setRotationPoint(-11F, 1F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[7].setRotationPoint(13F, 3F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 11, 14, 1, 0F); // Box 24
		bodyModel[8].setRotationPoint(-36F, -20F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 4, 22, 0F); // Box 25
		bodyModel[9].setRotationPoint(-37F, -6F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 28
		bodyModel[10].setRotationPoint(-25F, -20F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 30
		bodyModel[11].setRotationPoint(-37F, -20F, -7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 4, 0F); // Box 31
		bodyModel[12].setRotationPoint(-40F, -6F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 32
		bodyModel[13].setRotationPoint(-41F, -4F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 33
		bodyModel[14].setRotationPoint(-41F, -6F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 16, 4, 4, 0F); // Box 35
		bodyModel[15].setRotationPoint(-24F, -6F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 36
		bodyModel[16].setRotationPoint(-24F, -6F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[17].setRotationPoint(-51F, 3F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[18].setRotationPoint(-43F, 0F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[19].setRotationPoint(-37F, -23F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(-37F, -23F, -11F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 106
		bodyModel[21].setRotationPoint(-25F, -23F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 107
		bodyModel[22].setRotationPoint(-37F, -23F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 21, 2, 0F); // Box 148
		bodyModel[23].setRotationPoint(43F, -23F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 149
		bodyModel[24].setRotationPoint(43F, -23F, 1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[25].setRotationPoint(43F, -23F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 29, 1, 3, 0F); // Box 156
		bodyModel[26].setRotationPoint(-43F, 0F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 23, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[27].setRotationPoint(-11F, 5F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 23, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[28].setRotationPoint(-11F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[29].setRotationPoint(-36F, -24F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[30].setRotationPoint(-37F, -24F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[31].setRotationPoint(-25F, -24F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[32].setRotationPoint(-37F, -24F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[33].setRotationPoint(-25F, -24F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[34].setRotationPoint(-36F, -23F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[35].setRotationPoint(-25F, -23F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[36].setRotationPoint(-36F, -23F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[37].setRotationPoint(-25F, -23F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 169
		bodyModel[38].setRotationPoint(-36F, -24F, 1F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 48
		bodyModel[39].setRotationPoint(-38F, -24F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(-38F, -23F, -6F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[41].setRotationPoint(-37.05F, -23F, -6F);
		bodyModel[41].rotateAngleY = 0.19198622F;

		bodyModel[42].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[42].setRotationPoint(-37.05F, -23F, 6F);
		bodyModel[42].rotateAngleY = -0.19198622F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 175
		bodyModel[43].setRotationPoint(-38F, -23F, 1F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 185
		bodyModel[44].setRotationPoint(-43.75F, -14.75F, -2F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 195
		bodyModel[45].setRotationPoint(-44F, -2F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[46].setRotationPoint(-44F, 7F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[47].setRotationPoint(-47F, 8F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[48].setRotationPoint(-44F, 7F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[49].setRotationPoint(-47F, -2F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[50].setRotationPoint(-47F, 0F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[51].setRotationPoint(-47F, -2F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[52].setRotationPoint(-47F, 0F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[53].setRotationPoint(-47F, 8F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[54].setRotationPoint(-48F, 8F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 215
		bodyModel[55].setRotationPoint(43F, -2F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[56].setRotationPoint(43F, 7F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[57].setRotationPoint(43F, 7F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[58].setRotationPoint(47F, 3F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 231
		bodyModel[59].setRotationPoint(47F, 8F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[60].setRotationPoint(-47F, -2F, 10F);

		bodyModel[61].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[61].setRotationPoint(-47F, -2F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[62].setRotationPoint(-47F, -10F, -8F);

		bodyModel[63].addBox(0F, 0F, 0F, 86, 2, 16, 0F); // Box 251
		bodyModel[63].setRotationPoint(-43F, 0F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[64].setRotationPoint(-47F, -5F, -6.75F);

		bodyModel[65].addBox(0F, 0F, 0F, 0, 9, 20, 0F); // Box 256
		bodyModel[65].setRotationPoint(47.01F, -2F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[66].setRotationPoint(47.01F, -2F, 10F);

		bodyModel[67].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[67].setRotationPoint(47.01F, -10F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[68].setRotationPoint(47.01F, -2F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162 commander beacon
		bodyModel[69].setRotationPoint(-36.68F, -26F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F); // Box 165
		bodyModel[70].setRotationPoint(-36.5F, -25.5F, -0.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 275 cs
		bodyModel[71].setRotationPoint(-36F, -15F, -1F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[72].setRotationPoint(-40.5F, -12F, 6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[73].setRotationPoint(46F, -5F, -6.75F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 284
		bodyModel[74].setRotationPoint(-29F, -25.5F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 18, 10, 0, 0F); // Box 285
		bodyModel[75].setRotationPoint(-24F, -14F, 11.01F);

		bodyModel[76].addBox(0F, 0F, 0F, 46, 8, 0, 0F); // Box 288
		bodyModel[76].setRotationPoint(-2F, -10F, 11F);

		bodyModel[77].addBox(0F, 0F, 0F, 11, 10, 0, 0F); // Box 300
		bodyModel[77].setRotationPoint(-24F, -14F, -11.01F);

		bodyModel[78].addBox(0F, 0F, 0F, 53, 8, 0, 0F); // Box 303
		bodyModel[78].setRotationPoint(-9F, -10F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 296
		bodyModel[79].setRotationPoint(44F, -10F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[80].setRotationPoint(13F, 0F, -9.01F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[81].setRotationPoint(13F, 0F, 9.01F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[82].setRotationPoint(-13F, 3F, -9F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 305
		bodyModel[83].setRotationPoint(-13F, 1F, -9.01F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 5, 0, 0F); // Box 305
		bodyModel[84].setRotationPoint(-13F, 0F, 9.01F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[85].setRotationPoint(0F, 0F, -11.75F);
		bodyModel[85].rotateAngleX = 0.71558499F;

		bodyModel[86].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 19
		bodyModel[86].setRotationPoint(0F, 0F, 11.75F);
		bodyModel[86].rotateAngleX = -0.71558499F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(-47.5F, -2F, -6.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[88].setRotationPoint(47F, -2F, -6.75F);

		bodyModel[89].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 240 glow liveryimg 2
		bodyModel[89].setRotationPoint(42.3F, -20.5F, 6F);
		bodyModel[89].rotateAngleY = 0.15707963F;

		bodyModel[90].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 241 glow liveryimg 2
		bodyModel[90].setRotationPoint(42.3F, -20.5F, -6F);
		bodyModel[90].rotateAngleY = -0.15707963F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 247
		bodyModel[91].setRotationPoint(-37F, -25.5F, -2.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[92].setRotationPoint(-36.5F, -25.5F, -1F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 249
		bodyModel[93].setRotationPoint(-35.5F, -24.5F, -2F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[94].setRotationPoint(-36F, -25.5F, 0.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 248
		bodyModel[95].setRotationPoint(-38F, -25F, 3F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 250
		bodyModel[96].setRotationPoint(-37.5F, -25F, 4.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 249
		bodyModel[97].setRotationPoint(-36F, -24F, 3.25F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[98].setRotationPoint(-49F, 8F, -10F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 0, 20, 0F); // Box 205
		bodyModel[99].setRotationPoint(47F, 8F, -10F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36
		bodyModel[100].setRotationPoint(-23F, -10F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[101].setRotationPoint(-13F, 2F, 9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[102].setRotationPoint(-13F, 1F, 9.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[103].setRotationPoint(-12.75F, 2.5F, 9.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[104].setRotationPoint(-12.75F, 0F, 7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[105].setRotationPoint(-43F, 0F, 7F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 261
		bodyModel[106].setRotationPoint(-44F, -2F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[107].setRotationPoint(41F, 0F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 264
		bodyModel[108].setRotationPoint(43F, -2F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[109].setRotationPoint(-47F, 1F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[110].setRotationPoint(-47.25F, -5F, -6.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[111].setRotationPoint(42F, 1F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[112].setRotationPoint(-47.75F, -2F, -6.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[113].setRotationPoint(46.75F, -5F, -6.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[114].setRotationPoint(47.25F, -2F, -6.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front up
		bodyModel[115].setRotationPoint(-38.25F, -24F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front down
		bodyModel[116].setRotationPoint(-38.25F, -22F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 Headlight Front nose R
		bodyModel[117].setRotationPoint(-44.5F, -14.7F, -2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 Headlight Front nose L
		bodyModel[118].setRotationPoint(-44.5F, -14.7F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 284 Headlight Rear down
		bodyModel[119].setRotationPoint(43.25F, -18.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 285 Headlight Rear up
		bodyModel[120].setRotationPoint(43.25F, -20.5F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-48F, 2.5F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[122].setRotationPoint(47F, 2.5F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[123].setRotationPoint(41F, 0F, 7F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 10, 3, 0F); // Box 271
		bodyModel[124].setRotationPoint(43F, -2F, 7F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[125].setRotationPoint(-32F, -25.5F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[126].setRotationPoint(44F, -5F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[127].setRotationPoint(44F, -5F, 10.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 0, 15, 2, 0F); // Box 282
		bodyModel[128].setRotationPoint(44F, -10F, 9F);

		bodyModel[129].addBox(0F, 0F, 0F, 6, 8, 14, 0F); // Box 289
		bodyModel[129].setRotationPoint(-43F, -22F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[130].setRotationPoint(-24F, -23F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 46, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[131].setRotationPoint(-24F, -23F, 3F);

		bodyModel[132].addBox(0F, 0F, 0F, 46, 1, 6, 0F); // Box 294
		bodyModel[132].setRotationPoint(-24F, -23F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[133].setRotationPoint(-43F, -23F, -7F);

		bodyModel[134].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 296
		bodyModel[134].setRotationPoint(-43F, -23F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[135].setRotationPoint(-43F, -23F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 298 headlight f hh
		bodyModel[136].setRotationPoint(-44.25F, -20.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 299 headlight f h
		bodyModel[137].setRotationPoint(-44.25F, -18.5F, -1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[138].setRotationPoint(-44F, -22F, 1F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 20, 2, 0F); // Box 304
		bodyModel[139].setRotationPoint(-44F, -22F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 20, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[140].setRotationPoint(-44F, -22F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[141].setRotationPoint(-44F, -23F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[142].setRotationPoint(-44F, -23F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 308
		bodyModel[143].setRotationPoint(-44F, -23F, 1F);

		bodyModel[144].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 354
		bodyModel[144].setRotationPoint(-44F, -24.5F, -2F);

		bodyModel[145].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 355
		bodyModel[145].setRotationPoint(-43F, -24.25F, -1F);

		bodyModel[146].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 356
		bodyModel[146].setRotationPoint(-43.5F, -24.25F, -3F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 357
		bodyModel[147].setRotationPoint(-41.5F, -23.5F, -2F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 286
		bodyModel[148].setRotationPoint(41F, -25.5F, 3.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 287
		bodyModel[149].setRotationPoint(42.5F, -24.75F, 2.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 288
		bodyModel[150].setRotationPoint(41.5F, -25.5F, 1.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 289
		bodyModel[151].setRotationPoint(41F, -25.75F, 2.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[152].setRotationPoint(-13F, -14F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[153].setRotationPoint(-6F, -14F, 11F);

		bodyModel[154].addBox(0F, 0F, 0F, 6, 12, 14, 0F); // Box 298
		bodyModel[154].setRotationPoint(-43F, -14F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 299
		bodyModel[155].setRotationPoint(-43F, -15F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[156].setRotationPoint(-43F, -15F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[157].setRotationPoint(-43F, -15F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 302
		bodyModel[158].setRotationPoint(-44F, -14F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[159].setRotationPoint(-44F, -14F, 1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 304
		bodyModel[160].setRotationPoint(-44F, -14F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 305
		bodyModel[161].setRotationPoint(-44F, -15F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		bodyModel[162].setRotationPoint(-44F, -15F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[163].setRotationPoint(-43.9F, -13.7F, -7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[164].setRotationPoint(-43.9F, -13.7F, 5F);

		bodyModel[165].addBox(0F, 0F, 0F, 13, 1, 2, 0F); // Box 309
		bodyModel[165].setRotationPoint(-37F, -24F, -1F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 310
		bodyModel[166].setRotationPoint(12F, 2F, -7F);

		bodyModel[167].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 311
		bodyModel[167].setRotationPoint(-13F, 2F, -7F);

		bodyModel[168].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[168].setRotationPoint(-36.5F, -20F, -10.5F);

		bodyModel[169].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[169].setRotationPoint(-24.5F, -20F, 10.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 318
		bodyModel[170].setRotationPoint(27F, 0F, -11F);

		bodyModel[171].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 319
		bodyModel[171].setRotationPoint(-30F, 0F, 8F);

		bodyModel[172].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[172].setRotationPoint(47.01F, 7F, -11F);

		bodyModel[173].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[173].setRotationPoint(-47.01F, 7F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[174].setRotationPoint(43F, -16.7F, -7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[175].setRotationPoint(43F, -16.7F, 5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[176].setRotationPoint(-42.5F, -15F, -1F);

		bodyModel[177].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 253
		bodyModel[177].setRotationPoint(-39F, 0F, 9F);
		bodyModel[177].rotateAngleZ = -0.17453293F;

		bodyModel[178].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 280
		bodyModel[178].setRotationPoint(-41F, 0F, 9F);

		bodyModel[179].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 283
		bodyModel[179].setRotationPoint(22F, -21F, -7.5F);

		bodyModel[180].addBox(0F, 0F, 0F, 21, 19, 1, 0F); // Box 284
		bodyModel[180].setRotationPoint(22F, -21F, 6.5F);

		bodyModel[181].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 287 glow liveryimg 2
		bodyModel[181].setRotationPoint(-43.5F, -18.5F, 6F);
		bodyModel[181].rotateAngleY = -0.15707963F;

		bodyModel[182].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 288 glow liveryimg 2
		bodyModel[182].setRotationPoint(-43.5F, -18.5F, -6F);
		bodyModel[182].rotateAngleY = 0.15707963F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[183].setRotationPoint(-47.01F, -10F, -10F);
		bodyModel[183].rotateAngleY = -3.14159265F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[184].setRotationPoint(-47.01F, -10F, 11F);
		bodyModel[184].rotateAngleY = -3.14159265F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[185].setRotationPoint(47.01F, -10F, -10F);
		bodyModel[185].rotateAngleY = -3.14159265F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[186].setRotationPoint(47.01F, -10F, 11F);
		bodyModel[186].rotateAngleY = -3.14159265F;

		bodyModel[187].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 411
		bodyModel[187].setRotationPoint(-47F, 7F, -8F);

		bodyModel[188].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 412
		bodyModel[188].setRotationPoint(-47F, 7F, 8F);

		bodyModel[189].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 413
		bodyModel[189].setRotationPoint(44F, 7F, 8F);

		bodyModel[190].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 414
		bodyModel[190].setRotationPoint(44F, 7F, -8F);

		bodyModel[191].addBox(0F, 0F, 0F, 4, 2, 6, 0F); // Box 417
		bodyModel[191].setRotationPoint(-34F, -25.05F, -3F);

		bodyModel[192].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 418
		bodyModel[192].setRotationPoint(-29.25F, -25.05F, -3F);

		bodyModel[193].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 419 cull
		bodyModel[193].setRotationPoint(-28F, -25F, 3.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[194].setRotationPoint(-34F, -24F, -9.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[195].setRotationPoint(-34F, -24.5F, -9.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[196].setRotationPoint(-34F, -24.5F, -9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[197].setRotationPoint(-34F, -24.5F, -9.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[198].setRotationPoint(-34F, -24.5F, -9.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[199].setRotationPoint(-28F, -26F, 5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[200].setRotationPoint(-34.5F, -23F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[201].setRotationPoint(-42F, -24F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[202].setRotationPoint(-42F, -24.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[203].setRotationPoint(-42F, -24.5F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[204].setRotationPoint(-42F, -24.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[205].setRotationPoint(-42F, -24.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[206].setRotationPoint(47F, -2F, 4.75F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[207].setRotationPoint(47.25F, -2F, 4.75F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[208].setRotationPoint(46F, -5F, 4.75F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[209].setRotationPoint(46.75F, -5F, 4.75F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[210].setRotationPoint(-47.5F, -2F, 4.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[211].setRotationPoint(-47.75F, -2F, 4.75F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[212].setRotationPoint(-47.25F, -5F, 4.75F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[213].setRotationPoint(-47F, -5F, 4.75F);

		bodyModel[214].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[214].setRotationPoint(44F, 8F, -11F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[215].setRotationPoint(44F, 0F, -9F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[216].setRotationPoint(44F, -2F, -8F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[217].setRotationPoint(44F, 8F, 8F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[218].setRotationPoint(44F, 0F, 7F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[219].setRotationPoint(44F, -2F, 7F);

		bodyModel[220].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 322
		bodyModel[220].setRotationPoint(28F, 1F, -11F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 1, 22, 0F); // Box 323
		bodyModel[221].setRotationPoint(-29F, 1F, -11F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 324
		bodyModel[222].setRotationPoint(-38F, -25F, -1.5F);

		bodyModel[223].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[223].setRotationPoint(-35F, -24F, 7.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[224].setRotationPoint(-35F, -24F, 7.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[225].setRotationPoint(-35.5F, -23F, -9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[226].setRotationPoint(-35.5F, -23F, 7F);

		bodyModel[227].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[227].setRotationPoint(-35F, -24F, -8.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[228].setRotationPoint(-35F, -24F, -8.5F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 333
		bodyModel[229].setRotationPoint(-23F, -24.5F, 3.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 334
		bodyModel[230].setRotationPoint(-21.5F, -24F, 4.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 335
		bodyModel[231].setRotationPoint(-22F, -25F, 4.5F);

		bodyModel[232].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 336
		bodyModel[232].setRotationPoint(-23F, -24.5F, 5.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[233].setRotationPoint(-23F, -25F, -1.5F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 418
		bodyModel[234].setRotationPoint(4.5F, -23.5F, -6.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 419
		bodyModel[235].setRotationPoint(3F, -24.25F, -5.5F);

		bodyModel[236].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 420
		bodyModel[236].setRotationPoint(2F, -24.5F, -6.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 421
		bodyModel[237].setRotationPoint(3.5F, -24.25F, -7.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME3-1
		bodyModel[238].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME3-3
		bodyModel[239].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME3-2
		bodyModel[240].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME3-4
		bodyModel[241].setRotationPoint(-34F, -24.5F, 7.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426 cull
		bodyModel[242].setRotationPoint(-34.5F, -23F, 7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[243].setRotationPoint(-34F, -24F, 7.5F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 9, 2, 0F); // Box 412 cs
		bodyModel[244].setRotationPoint(-31F, -15F, -6F);

		bodyModel[245].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Box 413 cs
		bodyModel[245].setRotationPoint(-37.1F, -13F, -2F);
		bodyModel[245].rotateAngleY = -0.82030475F;

		bodyModel[246].addShapeBox(-1F, 0F, -0.5F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[246].setRotationPoint(-35.5F, -15F, -2F);
		bodyModel[246].rotateAngleY = -0.82030475F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 352
		bodyModel[247].setRotationPoint(44.5F, -23F, -0.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[248].setRotationPoint(44.75F, -22.5F, -0.25F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[249].setRotationPoint(44.5F, -24F, -0.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 877
		bodyModel[250].setRotationPoint(44.75F, -25F, -1.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 332
		bodyModel[251].setRotationPoint(42.5F, -24.5F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 333
		bodyModel[252].setRotationPoint(42.5F, -24.5F, 1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[253].setRotationPoint(-28F, -25F, 0F);

		bodyModel[254].addBox(0F, 0F, 0F, 21, 2, 16, 0F); // Box 298
		bodyModel[254].setRotationPoint(22F, -23F, -8F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[255].setRotationPoint(22F, -24F, 1F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 21, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[256].setRotationPoint(22F, -24F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[257].setRotationPoint(22F, -24F, -1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[258].setRotationPoint(42F, -24F, -1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[259].setRotationPoint(43F, -24F, -8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 279
		bodyModel[260].setRotationPoint(43F, -24F, 1F);

		bodyModel[261].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[261].setRotationPoint(43F, -24.25F, 0F);

		bodyModel[262].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 18
		bodyModel[262].setRotationPoint(16.5F, -24.5F, -2.5F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 21
		bodyModel[263].setRotationPoint(16F, -23.5F, -3F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[264].setRotationPoint(-41F, -6F, -11F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[265].setRotationPoint(-15F, -4F, -10F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[266].setRotationPoint(-8F, -4F, 7F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[267].setRotationPoint(-15F, -6F, -11F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[268].setRotationPoint(-8F, -6F, 10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[269].setRotationPoint(43F, -22.7F, -7.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[270].setRotationPoint(43F, -22.7F, 5.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288
		bodyModel[271].setRotationPoint(43.75F, -22.75F, -2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[272].setRotationPoint(44.5F, -22.7F, -2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290gyralight rear r
		bodyModel[273].setRotationPoint(44.5F, -22.7F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[274].setRotationPoint(47F, -2F, -7F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[275].setRotationPoint(47F, -10F, -2F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[276].setRotationPoint(47F, -10F, 2F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[277].setRotationPoint(47F, -2F, 2F);

		bodyModel[278].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[278].setRotationPoint(47F, -2F, 2F);
		bodyModel[278].rotateAngleY = -3.14159265F;
		bodyModel[278].rotateAngleZ = -1.48352986F;

		bodyModel[279].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[279].setRotationPoint(-47F, -2F, -2F);
		bodyModel[279].rotateAngleZ = -1.48352986F;

		bodyModel[280].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[280].setRotationPoint(-48F, -10F, -2F);

		bodyModel[281].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[281].setRotationPoint(-48F, -10F, 2F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[282].setRotationPoint(-48F, -2F, -7F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[283].setRotationPoint(-48F, -2F, 2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[284].setRotationPoint(-42F, -14.75F, 6F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 317
		bodyModel[285].setRotationPoint(-42F, -14.75F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[286].setRotationPoint(-42F, -14.75F, 3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[287].setRotationPoint(-42F, -14.75F, -6F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 4, 0, 0F); // Box 276
		bodyModel[288].setRotationPoint(-42F, -13.5F, 7.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[289].setRotationPoint(-35F, -20F, -11F);
		bodyModel[289].rotateAngleX = -0.61086524F;

		bodyModel[290].addBox(0F, 0F, -1F, 0, 4, 1, 0F); // Box 350
		bodyModel[290].setRotationPoint(-33F, -18F, -11F);

		bodyModel[291].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 321
		bodyModel[291].setRotationPoint(-33.01F, -18F, 11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[292].setRotationPoint(-33F, -18F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[293].setRotationPoint(-33F, -19F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[294].setRotationPoint(-35F, -20F, 11F);
		bodyModel[294].rotateAngleX = 0.61086524F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[295].setRotationPoint(-51F, 7F, 0F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[296].setRotationPoint(-51F, 7F, -10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[297].setRotationPoint(-50F, 6F, 0F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[298].setRotationPoint(-50F, 5F, 2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[299].setRotationPoint(-50F, 6F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[300].setRotationPoint(-50F, 5F, -10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[301].setRotationPoint(-50F, 4F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[302].setRotationPoint(-50F, 4F, -8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[303].setRotationPoint(49F, 6F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[304].setRotationPoint(49F, 6F, -10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[305].setRotationPoint(50F, 7F, -10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[306].setRotationPoint(50F, 7F, 0F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[307].setRotationPoint(49F, 5F, 2F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[308].setRotationPoint(49F, 4F, 2F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[309].setRotationPoint(49F, 5F, -10F);

		bodyModel[310].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[310].setRotationPoint(49F, 4F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[311].setRotationPoint(-18F, -20.25F, -9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[312].setRotationPoint(-18F, -21.25F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[313].setRotationPoint(-17.75F, -19.75F, -8.75F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 245
		bodyModel[314].setRotationPoint(-18F, -22.25F, -8.8F);

		bodyModel[315].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 373
		bodyModel[315].setRotationPoint(-18.5F, -21F, -7.25F);

		bodyModel[316].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 374
		bodyModel[316].setRotationPoint(-18.5F, -18.5F, -7.25F);

		bodyModel[317].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 375
		bodyModel[317].setRotationPoint(-16F, -18.5F, -7.25F);

		bodyModel[318].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 376
		bodyModel[318].setRotationPoint(-16F, -18.5F, 6.25F);

		bodyModel[319].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 377
		bodyModel[319].setRotationPoint(-18.5F, -18.5F, 6.25F);

		bodyModel[320].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 378
		bodyModel[320].setRotationPoint(-18.5F, -21F, 6.25F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 745
		bodyModel[321].setRotationPoint(-18.5F, -24F, -0.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 746
		bodyModel[322].setRotationPoint(-21F, -25F, -0.5F);

		bodyModel[323].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 747
		bodyModel[323].setRotationPoint(-20F, -24.75F, 0.5F);

		bodyModel[324].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 748
		bodyModel[324].setRotationPoint(-19.5F, -24.75F, -1.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[325].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[326].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[327].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[328].setRotationPoint(-29F, -25.5F, -1F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[329].setRotationPoint(-29F, -25F, -1F);

		bodyModel[330].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[330].setRotationPoint(-47F, 3F, 8F);

		bodyModel[331].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[331].setRotationPoint(-47F, 3F, -10F);

		bodyModel[332].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[332].setRotationPoint(44F, 3F, -10F);

		bodyModel[333].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[333].setRotationPoint(44F, 3F, 8F);

		bodyModel[334].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[334].setRotationPoint(44F, 2F, 8F);

		bodyModel[335].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[335].setRotationPoint(-47F, 2F, 8F);

		bodyModel[336].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[336].setRotationPoint(-47F, 2F, -8F);

		bodyModel[337].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[337].setRotationPoint(44F, 2F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[338].setRotationPoint(-14F, 4F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[339].setRotationPoint(-12F, 4F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[340].setRotationPoint(12F, 4F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[341].setRotationPoint(14F, 4F, -9F);

		bodyModel[342].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[342].setRotationPoint(31F, -16F, 7F);

		bodyModel[343].addBox(0F, 0F, 0F, 10, 7, 1, 0F); // Box 293
		bodyModel[343].setRotationPoint(31F, -16F, -8F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[344].setRotationPoint(28.5F, -16F, -7.75F);

		bodyModel[345].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[345].setRotationPoint(26F, -16F, -7.75F);

		bodyModel[346].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[346].setRotationPoint(22.5F, -9F, -7.75F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[347].setRotationPoint(28.5F, -16F, 6.75F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 293
		bodyModel[348].setRotationPoint(26F, -16F, 6.75F);

		bodyModel[349].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[349].setRotationPoint(22.5F, -9F, 6.75F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 307 glowey marker
		bodyModel[350].setRotationPoint(-43.9F, -20.7F, -7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F); // Box 308 glowey marker
		bodyModel[351].setRotationPoint(-43.9F, -20.7F, 5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[352].setRotationPoint(-22F, -24F, 0F);

		bodyModel[353].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 786
		bodyModel[353].setRotationPoint(-20.5F, -23.5F, -4.5F);

		bodyModel[354].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 787
		bodyModel[354].setRotationPoint(-21F, -24.25F, -3.5F);

		bodyModel[355].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 788
		bodyModel[355].setRotationPoint(-23F, -24.5F, -4.5F);

		bodyModel[356].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 789
		bodyModel[356].setRotationPoint(-22F, -24.25F, -5.5F);

		bodyModel[357].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 790
		bodyModel[357].setRotationPoint(-21F, -10F, -11F);

		bodyModel[358].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 410
		bodyModel[358].setRotationPoint(-43F, -14F, 11F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 19, 0, 0F); // Box 310
		bodyModel[359].setRotationPoint(-44F, -14F, 11F);

		bodyModel[360].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 81
		bodyModel[360].setRotationPoint(-44.01F, -9F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[361].setRotationPoint(-44.01F, -6F, -11.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[362].setRotationPoint(-44F, -13F, -9.5F);

		bodyModel[363].addBox(0F, 0F, 0F, 7, 8, 0, 0F); // Box 250
		bodyModel[363].setRotationPoint(-44F, -14F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[364].setRotationPoint(-44F, -14F, -11F);

		bodyModel[365].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[365].setRotationPoint(22.5F, -20F, -7.75F);

		bodyModel[366].addBox(0F, 0F, 0F, 3, 6, 1, 0F); // Box 293
		bodyModel[366].setRotationPoint(22.5F, -20F, 6.75F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyModel[367].setRotationPoint(-43.75F, -23.5F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[368].setRotationPoint(-27F, -23F, -7F);

		bodyModel[369].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F); // Box 401
		bodyModel[369].setRotationPoint(-36F, -25.5F, 0F);
		bodyModel[369].rotateAngleY = -0.06981317F;

		bodyModel[370].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[370].setRotationPoint(-36.15F, -26F, -0.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 388
		bodyModel[371].setRotationPoint(19F, -23F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 389
		bodyModel[372].setRotationPoint(19F, -23F, 3F);

		bodyModel[373].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 390
		bodyModel[373].setRotationPoint(-30F, 3F, -2F);

		bodyModel[374].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 391
		bodyModel[374].setRotationPoint(27F, 3F, -2F);

		bodyModel[375].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 392
		bodyModel[375].setRotationPoint(-47F, 5.5F, 8F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 393
		bodyModel[376].setRotationPoint(-47F, 4.5F, 8F);

		bodyModel[377].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 394
		bodyModel[377].setRotationPoint(-47F, 4.5F, -8F);

		bodyModel[378].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 395
		bodyModel[378].setRotationPoint(-47F, 5.5F, -10F);

		bodyModel[379].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 396
		bodyModel[379].setRotationPoint(44F, 4.5F, -8F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 397
		bodyModel[380].setRotationPoint(44F, 5.5F, -10F);

		bodyModel[381].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 398
		bodyModel[381].setRotationPoint(44F, 4.5F, 8F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 399
		bodyModel[382].setRotationPoint(44F, 5.5F, 8F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 400
		bodyModel[383].setRotationPoint(-38F, -26F, -1F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 401 sp emergency gyra
		bodyModel[384].setRotationPoint(-38.25F, -26F, -1F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 402
		bodyModel[385].setRotationPoint(-34.5F, -26F, 0F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[386].setRotationPoint(-16F, -25.5F, -1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 404
		bodyModel[387].setRotationPoint(-16F, -24.5F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 405
		bodyModel[388].setRotationPoint(-15.75F, -24F, -0.75F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 407 sp bell holder cull
		bodyModel[389].setRotationPoint(-16F, -25.5F, -2F);

		bodyModel[390].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F); // Box 397
		bodyModel[390].setRotationPoint(-36F, -25.5F, 0F);
		bodyModel[390].rotateAngleY = 0.06981317F;

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[391].setRotationPoint(-35.5F, -25F, -0.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 399
		bodyModel[392].setRotationPoint(-37F, -25.75F, 0.5F);

		bodyModel[393].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 400
		bodyModel[393].setRotationPoint(-38F, -26F, -0.5F);

		bodyModel[394].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 401
		bodyModel[394].setRotationPoint(-36.5F, -25.75F, -1.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 354 cnw bELL
		bodyModel[395].setRotationPoint(-41.75F, -5F, 8F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 403 cnw step cull thing
		bodyModel[396].setRotationPoint(-42F, -6F, 7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208cul
		bodyModel[397].setRotationPoint(-49F, -2F, -9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box278cul
		bodyModel[398].setRotationPoint(-49F, -2F, 8F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Import Box279cul
		bodyModel[399].setRotationPoint(-49F, -2F, -8F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 407
		bodyModel[400].setRotationPoint(-49F, -1F, -3F);

		bodyModel[401].addBox(0F, 0F, 0F, 7, 6, 3, 0F); // Box 429
		bodyModel[401].setRotationPoint(-23F, -12F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[402].setRotationPoint(-47F, 8F, -9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[403].setRotationPoint(47F, 8F, -9F);

		bodyModel[404].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 404
		bodyModel[404].setRotationPoint(-26F, -25.5F, 0F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME5-1
		bodyModel[405].setRotationPoint(-37F, -25.5F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME5-3
		bodyModel[406].setRotationPoint(-37F, -25.5F, -1F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME5-2
		bodyModel[407].setRotationPoint(-37F, -25.5F, -1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME5-4
		bodyModel[408].setRotationPoint(-37F, -25.5F, -1F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[409].setRotationPoint(-37F, -25F, -1F);

		bodyModel[410].addBox(0F, 0F, 0F, 86, 1, 13, 0F); // Box 669
		bodyModel[410].setRotationPoint(-43F, 2F, -6.5F);
	}
	ModelFB3 theTrucks2 = new ModelFB3();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 411; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
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
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 6||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 1544) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13451){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_UpMoment.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/fb3_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.75, 0.07, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.52, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
	public float[] getTrans() {
		return new float[]{-1.6F, 0.15F, 0.00F};
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
				add(new double[]{0.5D, 1.45D, 0.0D});
			}
		};
	}
}