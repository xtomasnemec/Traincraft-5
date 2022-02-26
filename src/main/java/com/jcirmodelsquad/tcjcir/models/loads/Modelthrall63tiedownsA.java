//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: tiedowns
// Model Creator: bida
// Created on: 09.11.2021 - 11:48:30
// Last changed on: 09.11.2021 - 11:48:30

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelthrall63tiedownsA extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Modelthrall63tiedownsA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, -4, 34, textureX, textureY); // Box 704 tiedowns
		bodyModel[1] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 706 tiedowns
		bodyModel[2] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 708 tiedowns

		bodyModel[0].addBox(0F, 0F, 0F, 81, 0, 8, 0F); // Box 704 tiedowns
		bodyModel[0].setRotationPoint(-40.5F, -24.01F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 81, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 7.25F, 0F, -0.5F, 7.25F, 0F, -0.5F, -7.25F, 0F, -0.5F, -7.25F); // Box 706 tiedowns
		bodyModel[1].setRotationPoint(-40.5F, -24F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 81, 28, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -7.25F, 0F, -0.5F, -7.25F, 0F, -0.5F, 7.25F, 0F, -0.5F, 7.25F); // Box 708 tiedowns
		bodyModel[2].setRotationPoint(-40.5F, -24F, 4F);
	}
}