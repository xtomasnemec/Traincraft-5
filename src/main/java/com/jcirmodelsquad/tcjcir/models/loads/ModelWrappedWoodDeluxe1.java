//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WrappedWood3
// Model Creator: bida
// Created on: 01.11.2020 - 16:21:37
// Last changed on: 01.11.2020 - 16:21:37

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelWrappedWoodDeluxe1 extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelWrappedWoodDeluxe1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 98, 47, textureX, textureY); // Box 4 support
		bodyModel[1] = new ModelRendererTurbo(this, 63, 47, textureX, textureY); // Box 3 support
		bodyModel[2] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[3] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[4] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 14 strap
		bodyModel[5] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[6] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[7] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 14 strap
		bodyModel[8] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[9] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 14 strap
		bodyModel[10] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[11] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 14 strap
		bodyModel[12] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[13] = new ModelRendererTurbo(this, 53, 41, textureX, textureY); // Box 7 strap
		bodyModel[14] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 1 wood hyper

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4 support
		bodyModel[0].setRotationPoint(3.5F, 9F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3 support
		bodyModel[1].setRotationPoint(-5.5F, 9F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 7 strap
		bodyModel[2].setRotationPoint(4F, 5F, 4.51F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 7 strap
		bodyModel[3].setRotationPoint(4F, 10.01F, -4F);
		bodyModel[3].rotateAngleX = 1.57079633F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 14 strap
		bodyModel[4].setRotationPoint(4F, 9F, 4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 7 strap
		bodyModel[5].setRotationPoint(-5F, 10.01F, -4F);
		bodyModel[5].rotateAngleX = 1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 7 strap
		bodyModel[6].setRotationPoint(-5F, 5F, 4.51F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Box 14 strap
		bodyModel[7].setRotationPoint(-5F, 9F, 4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 7 strap
		bodyModel[8].setRotationPoint(4F, 5F, -4.51F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F); // Box 14 strap
		bodyModel[9].setRotationPoint(4F, 9F, -4.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 7 strap
		bodyModel[10].setRotationPoint(-5F, 5F, -4.51F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.5F, -0.125F, 0F, 0.5F); // Box 14 strap
		bodyModel[11].setRotationPoint(-5F, 9F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 7 strap
		bodyModel[12].setRotationPoint(4F, 4.99F, -4.5F);
		bodyModel[12].rotateAngleX = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 9, 0, 0F,-0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F); // Box 7 strap
		bodyModel[13].setRotationPoint(-5F, 4.99F, -4.5F);
		bodyModel[13].rotateAngleX = 1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 32, 15, 16, 0F,-7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -10F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F, -7.5F, -0.5F, -3.5F); // Box 1 wood hyper
		bodyModel[14].setRotationPoint(-16F, -5F, -8F);
	}
}