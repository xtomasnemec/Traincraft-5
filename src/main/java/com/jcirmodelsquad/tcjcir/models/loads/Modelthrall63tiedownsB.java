//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.02.2022 - 09:07:31
// Last changed on: 05.02.2022 - 09:07:31

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelthrall63tiedownsB extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Modelthrall63tiedownsB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 35, textureX, textureY); // Box 704 tiedowns
		bodyModel[1] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 706 tiedowns
		bodyModel[2] = new ModelRendererTurbo(this, 4, 36, textureX, textureY); // Box 704 tiedowns
		bodyModel[3] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 706 tiedowns

		bodyModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 0, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704 tiedowns
		bodyModel[0].setRotationPoint(-40.5F, 2.5F, -11.25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 81, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 10F, 0F, -0.5F, 10F, 0F, -0.5F, -10F, 0F, -0.5F, -10F); // Box 706 tiedowns
		bodyModel[1].setRotationPoint(-40.5F, -9F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 81, 1, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704 tiedowns
		bodyModel[2].setRotationPoint(-40.5F, 2.5F, 11.25F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 81, 12, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, -0.5F, 10F, 0F, -0.5F, 10F); // Box 706 tiedowns
		bodyModel[3].setRotationPoint(-40.5F, -9F, 1F);
	}
}