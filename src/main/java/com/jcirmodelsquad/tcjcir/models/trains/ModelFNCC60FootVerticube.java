//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.11.2020 - 15:16:17
// Last changed on: 14.11.2020 - 15:16:17

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

public class ModelFNCC60FootVerticube extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelFNCC60FootVerticube() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[96];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 192, 56, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 78, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 40
		bodyModel[3] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 4, 134, textureX, textureY); // Box 43
		bodyModel[5] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 44
		bodyModel[6] = new ModelRendererTurbo(this, 25, 134, textureX, textureY); // Box 45
		bodyModel[7] = new ModelRendererTurbo(this, 69, 42, textureX, textureY); // Box 78
		bodyModel[8] = new ModelRendererTurbo(this, 174, 31, textureX, textureY); // Box 106
		bodyModel[9] = new ModelRendererTurbo(this, 68, 1, textureX, textureY); // Box 108
		bodyModel[10] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 67, 34, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 104, 130, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 192, 60, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 174, 28, textureX, textureY); // Box 106
		bodyModel[16] = new ModelRendererTurbo(this, 105, 75, textureX, textureY); // Box 106
		bodyModel[17] = new ModelRendererTurbo(this, 176, 1, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 2, 116, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 2, 109, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 2, 120, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 2, 105, textureX, textureY); // Box 40
		bodyModel[22] = new ModelRendererTurbo(this, 176, 57, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[23] = new ModelRendererTurbo(this, 12, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[24] = new ModelRendererTurbo(this, 176, 42, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[25] = new ModelRendererTurbo(this, 191, 102, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[26] = new ModelRendererTurbo(this, 202, 102, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[27] = new ModelRendererTurbo(this, 12, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[28] = new ModelRendererTurbo(this, 1, 77, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, "cull"); // Box 40 cul
		bodyModel[30] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 25, 36, textureX, textureY); // Box 3
		bodyModel[32] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 2, 131, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 2, 42, textureX, textureY); // Box 3
		bodyModel[35] = new ModelRendererTurbo(this, 108, 42, textureX, textureY); // Box 5
		bodyModel[36] = new ModelRendererTurbo(this, 213, 78, textureX, textureY); // Box 8
		bodyModel[37] = new ModelRendererTurbo(this, 187, 47, textureX, textureY); // Box 9
		bodyModel[38] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 210, 43, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 189, 117, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 165, 109, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 174, 5, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 239, 70, textureX, textureY); // Box 82
		bodyModel[59] = new ModelRendererTurbo(this, 234, 70, textureX, textureY); // Box 83
		bodyModel[60] = new ModelRendererTurbo(this, 234, 73, textureX, textureY); // Box 84
		bodyModel[61] = new ModelRendererTurbo(this, 239, 73, textureX, textureY); // Box 85
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[63] = new ModelRendererTurbo(this, 107, 1, textureX, textureY); // Box 105
		bodyModel[64] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 79
		bodyModel[65] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 80
		bodyModel[66] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 81
		bodyModel[67] = new ModelRendererTurbo(this, 147, 73, textureX, textureY); // Box 82
		bodyModel[68] = new ModelRendererTurbo(this, 245, 17, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 240, 25, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 229, 18, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 241, 18, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 212, 17, textureX, textureY); // Box 77
		bodyModel[74] = new ModelRendererTurbo(this, 199, 7, textureX, textureY); // Box 118
		bodyModel[75] = new ModelRendererTurbo(this, 199, 7, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 119, 133, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 119, 130, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 286
		bodyModel[79] = new ModelRendererTurbo(this, 46, 153, textureX, textureY); // Box 287
		bodyModel[80] = new ModelRendererTurbo(this, 46, 148, textureX, textureY); // Box 118
		bodyModel[81] = new ModelRendererTurbo(this, 57, 148, textureX, textureY); // Box 119
		bodyModel[82] = new ModelRendererTurbo(this, 62, 143, textureX, textureY); // Box 196
		bodyModel[83] = new ModelRendererTurbo(this, 87, 149, textureX, textureY); // Box 199
		bodyModel[84] = new ModelRendererTurbo(this, 67, 145, textureX, textureY); // Box 122
		bodyModel[85] = new ModelRendererTurbo(this, 87, 149, textureX, textureY); // Box 123
		bodyModel[86] = new ModelRendererTurbo(this, 49, 133, textureX, textureY); // Box 124
		bodyModel[87] = new ModelRendererTurbo(this, 26, 159, textureX, textureY); // Box 125
		bodyModel[88] = new ModelRendererTurbo(this, 76, 149, textureX, textureY); // Box 126
		bodyModel[89] = new ModelRendererTurbo(this, 54, 161, textureX, textureY); // Box 202
		bodyModel[90] = new ModelRendererTurbo(this, 66, 163, textureX, textureY); // Box 128
		bodyModel[91] = new ModelRendererTurbo(this, 68, 153, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 81, 152, textureX, textureY); // Box 130
		bodyModel[93] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 1, 156, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 68, 153, textureX, textureY); // Box 95

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28F, 5F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 81, 1, 22, 0F); // Box 1
		bodyModel[1].setRotationPoint(-40.5F, 2F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[2].setRotationPoint(-36F, 3F, 11F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 42
		bodyModel[3].setRotationPoint(-28F, 2.8F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 43
		bodyModel[4].setRotationPoint(-28F, 2.8F, 2F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 44
		bodyModel[5].setRotationPoint(24F, 2.8F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Box 45
		bodyModel[6].setRotationPoint(24F, 2.8F, 2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[7].setRotationPoint(-9F, -26F, -11.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[8].setRotationPoint(-27F, -27F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[9].setRotationPoint(-9F, -26F, 10.5F);

		bodyModel[10].addBox(-4F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[10].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 88, 2, 5, 0F); // Box 0
		bodyModel[11].setRotationPoint(-44F, 3F, -2.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 0
		bodyModel[12].setRotationPoint(-48F, 3F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 0
		bodyModel[13].setRotationPoint(24F, 5F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 72, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[14].setRotationPoint(-36F, 3F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[15].setRotationPoint(-27F, 3F, 10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[16].setRotationPoint(-9F, -27F, -11.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[17].setRotationPoint(-9F, 3F, -11.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[18].setRotationPoint(-40.5F, 3F, 11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(-40.5F, 3F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[20].setRotationPoint(36.5F, 3F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[21].setRotationPoint(36.5F, 3F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[22].setRotationPoint(40.5F, -7F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[23].setRotationPoint(36.5F, -7F, 11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[24].setRotationPoint(40.5F, -7F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[25].setRotationPoint(-41.5F, -7F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[26].setRotationPoint(-41.5F, -7F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[27].setRotationPoint(-40.5F, -7F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[28].setRotationPoint(36.5F, -7F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40 cul
		bodyModel[29].setRotationPoint(-40.5F, -7F, -12F);

		bodyModel[30].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[30].setRotationPoint(-8.5F, -27F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 3
		bodyModel[31].setRotationPoint(-8.5F, -27F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-26.5F, 4F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 51, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(-26.5F, 4F, 11F);

		bodyModel[34].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 3
		bodyModel[34].setRotationPoint(-40.5F, -27F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 5
		bodyModel[35].setRotationPoint(8.5F, -27F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 8
		bodyModel[36].setRotationPoint(-39.5F, -27F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 29, 20, 0F); // Box 9
		bodyModel[37].setRotationPoint(38.5F, -27F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-39.5F, -28F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 79, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-39.5F, -28F, 0F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 46
		bodyModel[40].setRotationPoint(39.5F, -1F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 47
		bodyModel[41].setRotationPoint(39.5F, -4F, -10F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 48
		bodyModel[42].setRotationPoint(39.5F, -7F, -10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 49
		bodyModel[43].setRotationPoint(39.5F, -10F, -10F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 50
		bodyModel[44].setRotationPoint(39.5F, -13F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 51
		bodyModel[45].setRotationPoint(39.5F, -16F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 52
		bodyModel[46].setRotationPoint(39.5F, -22F, -10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 53
		bodyModel[47].setRotationPoint(39.5F, -19F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 54
		bodyModel[48].setRotationPoint(39.5F, -25F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 57
		bodyModel[49].setRotationPoint(-40.5F, -25F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 58
		bodyModel[50].setRotationPoint(-40.5F, -22F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 59
		bodyModel[51].setRotationPoint(-40.5F, -19F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 60
		bodyModel[52].setRotationPoint(-40.5F, -16F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 61
		bodyModel[53].setRotationPoint(-40.5F, -13F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 62
		bodyModel[54].setRotationPoint(-40.5F, -10F, -10F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 63
		bodyModel[55].setRotationPoint(-40.5F, -7F, -10F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 64
		bodyModel[56].setRotationPoint(-40.5F, -4F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 65
		bodyModel[57].setRotationPoint(-40.5F, -1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[58].setRotationPoint(-40.5F, -28F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[59].setRotationPoint(-40.5F, -28F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[60].setRotationPoint(39.5F, -28F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[61].setRotationPoint(39.5F, -28F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 104
		bodyModel[62].setRotationPoint(8.5F, -27F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 32, 29, 1, 0F); // Box 105
		bodyModel[63].setRotationPoint(-40.5F, -27F, 10F);

		bodyModel[64].addBox(0F, -0.5F, 0F, 9, 1, 0, 0F); // Box 79
		bodyModel[64].setRotationPoint(-43F, 4F, -2.5F);
		bodyModel[64].rotateAngleY = -0.80285146F;
		bodyModel[64].rotateAngleZ = 0.13962634F;

		bodyModel[65].addBox(0F, -0.5F, 0F, 9, 1, 0, 0F); // Box 80
		bodyModel[65].setRotationPoint(-43F, 4F, 2.5F);
		bodyModel[65].rotateAngleY = 0.80285146F;
		bodyModel[65].rotateAngleZ = 0.13962634F;

		bodyModel[66].addBox(-9F, -0.5F, 0F, 9, 1, 0, 0F); // Box 81
		bodyModel[66].setRotationPoint(43F, 4F, -2.5F);
		bodyModel[66].rotateAngleY = 0.80285146F;
		bodyModel[66].rotateAngleZ = -0.13962634F;

		bodyModel[67].addBox(-9F, -0.5F, 0F, 9, 1, 0, 0F); // Box 82
		bodyModel[67].setRotationPoint(43F, 4F, 2.5F);
		bodyModel[67].rotateAngleY = -0.80285146F;
		bodyModel[67].rotateAngleZ = -0.13962634F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 72
		bodyModel[68].setRotationPoint(-42.01F, -5.5F, 1.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[69].setRotationPoint(-42F, -4F, 3F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 6, 3, 0F); // Box 87
		bodyModel[70].setRotationPoint(-41F, -5.5F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 7, 0, 0F); // Box 132
		bodyModel[71].setRotationPoint(-41.75F, -3F, 3.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 0, 10, 0F); // Box 87
		bodyModel[72].setRotationPoint(-43F, 1.99F, -5F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 0, 10, 0F); // Box 77
		bodyModel[73].setRotationPoint(40F, 1.99F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[74].setRotationPoint(-41.5F, -8F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 0, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[75].setRotationPoint(40.5F, -8F, -10F);

		bodyModel[76].addBox(0F, -0.5F, 0F, 11, 2, 0, 0F); // Box 80
		bodyModel[76].setRotationPoint(-46F, 4F, 1.5F);
		bodyModel[76].rotateAngleY = 1.04719755F;

		bodyModel[77].addBox(-11F, -0.5F, 0F, 11, 2, 0, 0F); // Box 81
		bodyModel[77].setRotationPoint(46F, 4F, -1.5F);
		bodyModel[77].rotateAngleY = 1.04719755F;

		bodyModel[78].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F); // Box 286
		bodyModel[78].setRotationPoint(1F, 5.5F, -4.5F);
		bodyModel[78].rotateAngleX = -0.78539816F;

		bodyModel[79].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.5F); // Box 287
		bodyModel[79].setRotationPoint(4F, 5.5F, -4.5F);
		bodyModel[79].rotateAngleX = -0.78539816F;

		bodyModel[80].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 118
		bodyModel[80].setRotationPoint(-2F, 5F, 4F);
		bodyModel[80].rotateAngleX = -0.78539816F;

		bodyModel[81].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 119
		bodyModel[81].setRotationPoint(-4F, 5F, 4F);
		bodyModel[81].rotateAngleX = -0.78539816F;

		bodyModel[82].addBox(-0.5F, 0F, -4F, 1, 0, 8, 0F); // Box 196
		bodyModel[82].setRotationPoint(-7F, 5.26F, 0F);
		bodyModel[82].rotateAngleY = -0.31415927F;

		bodyModel[83].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[83].setRotationPoint(-7F, 5.25F, 0F);
		bodyModel[83].rotateAngleY = -0.31415927F;

		bodyModel[84].addBox(-0.5F, 0F, -2F, 1, 0, 6, 0F); // Box 122
		bodyModel[84].setRotationPoint(11F, 5.26F, 0F);
		bodyModel[84].rotateAngleY = -0.10471976F;

		bodyModel[85].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 123
		bodyModel[85].setRotationPoint(11F, 5.25F, 0F);
		bodyModel[85].rotateAngleY = -0.10471976F;

		bodyModel[86].addBox(-0.5F, 0F, 0F, 1, 0, 18, 0F); // Box 124
		bodyModel[86].setRotationPoint(-7F, 5.26F, 0F);
		bodyModel[86].rotateAngleY = -1.57079633F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 38, 1, 0, 0F,0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 125
		bodyModel[87].setRotationPoint(-41.5F, 4F, 4F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 126
		bodyModel[88].setRotationPoint(9F, 4.5F, -2.25F);

		bodyModel[89].addBox(-19.5F, -0.75F, -0.5F, 20, 0, 1, 0F); // Box 202
		bodyModel[89].setRotationPoint(-8F, 6.01F, -3.5F);
		bodyModel[89].rotateAngleY = -0.19198622F;
		bodyModel[89].rotateAngleZ = 0.08726646F;

		bodyModel[90].addBox(-13.5F, -0.75F, -0.5F, 14, 0, 1, 0F); // Box 128
		bodyModel[90].setRotationPoint(11.5F, 6.01F, 3.5F);
		bodyModel[90].rotateAngleY = -3.40339204F;
		bodyModel[90].rotateAngleZ = 0.08726646F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 129
		bodyModel[91].setRotationPoint(-2.5F, 3F, 3F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Box 130
		bodyModel[92].setRotationPoint(2.5F, 3F, 7F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 116
		bodyModel[93].setRotationPoint(7.5F, 2.8F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 117
		bodyModel[94].setRotationPoint(-9.5F, 2.8F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 95
		bodyModel[95].setRotationPoint(2.5F, 3F, -5.5F);
	}
	Model70TonTruck2 bogie = new Model70TonTruck2();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 96; i++)
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
		GL11.glTranslated(-1.68,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.25,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }
}