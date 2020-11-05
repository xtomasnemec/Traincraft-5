//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.11.2020 - 14:46:31
// Last changed on: 01.11.2020 - 14:46:31

package com.jcirmodelsquad.tcjcir.models.trucks; //Path where the model is located

import tmt.ModelRendererTurbo;
import tmt.ModelConverter;

public class ModelLogcarNP_Archbar extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLogcarNP_Archbar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[28];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 30

		bodyModel[0].addBox(0F, 0F, 0F, 4, 1, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, 0F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-7F, 0F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-7F, 0F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(2F, 0F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[4].setRotationPoint(2F, 0F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(-9F, 1F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(7F, 1F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(-9F, 1F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(7F, 1F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-7F, 3F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(2F, 3F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(2F, 3F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-7F, 3F, 7F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 16
		bodyModel[13].setRotationPoint(-2F, 1F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 17
		bodyModel[14].setRotationPoint(-2F, 4F, -8F);

		bodyModel[15].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 18
		bodyModel[15].setRotationPoint(-2F, 4F, 7F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Box 19
		bodyModel[16].setRotationPoint(-2F, 1F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 20
		bodyModel[17].setRotationPoint(-8.5F, 3F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 21
		bodyModel[18].setRotationPoint(7.5F, 3F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 22
		bodyModel[19].setRotationPoint(-10.5F, 1F, -6F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 23
		bodyModel[20].setRotationPoint(-10.5F, 1F, 6F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 24
		bodyModel[21].setRotationPoint(5.5F, 1F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 5, 5, 0, 0F); // Box 25
		bodyModel[22].setRotationPoint(5.5F, 1F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 26
		bodyModel[23].setRotationPoint(-2F, -1F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(7F, 1F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-9F, 1F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-9F, 1F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(7F, 1F, -9F);
	}
}