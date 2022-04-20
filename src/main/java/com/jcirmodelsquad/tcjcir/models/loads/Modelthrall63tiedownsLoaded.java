//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.04.2022 - 18:25:28
// Last changed on: 19.04.2022 - 18:25:28

package com.jcirmodelsquad.tcjcir.models.loads; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelthrall63tiedownsLoaded extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public Modelthrall63tiedownsLoaded() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, -4, 34, textureX, textureY); // Box 704 tiedowns
		bodyModel[1] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 706 tiedowns
		bodyModel[2] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Box 246 tiedowns
		bodyModel[3] = new ModelRendererTurbo(this, -3, 34, textureX, textureY); // Box 247 tiedowns
		bodyModel[4] = new ModelRendererTurbo(this, -3, 34, textureX, textureY); // Box 248 tiedowns

		bodyModel[0].addBox(0F, 0F, 0F, 81, 0, 8, 0F); // Box 704 tiedowns
		bodyModel[0].setRotationPoint(-40.5F, -24.01F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 81, 27, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706 tiedowns
		bodyModel[1].setRotationPoint(-40.5F, -23F, -11.01F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 81, 27, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246 tiedowns
		bodyModel[2].setRotationPoint(-40.5F, -23F, 11.01F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 81, 0, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 247 tiedowns
		bodyModel[3].setRotationPoint(-40.5F, -24.01F, 4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 81, 0, 7, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248 tiedowns
		bodyModel[4].setRotationPoint(-40.5F, -24.01F, -11F);
	}
}