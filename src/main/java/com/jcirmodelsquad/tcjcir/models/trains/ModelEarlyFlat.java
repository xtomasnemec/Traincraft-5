//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EarlyFlatCar
// Model Creator: Bida
// Created on: 06.08.2021 - 22:49:17
// Last changed on: 06.08.2021 - 22:49:17

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFrictionTruck;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelEarlyFlat extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelEarlyFlat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[1] = new ModelRendererTurbo(this, 28, 8, textureX, textureY); // Box 1 coupler
		bodyModel[2] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 4, 14, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // Box 76
		bodyModel[6] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 286
		bodyModel[7] = new ModelRendererTurbo(this, 10, 9, textureX, textureY); // Box 287
		bodyModel[8] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 73
		bodyModel[10] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 194
		bodyModel[11] = new ModelRendererTurbo(this, 4, 20, textureX, textureY); // Box 195
		bodyModel[12] = new ModelRendererTurbo(this, -2, 38, textureX, textureY); // Box 196
		bodyModel[13] = new ModelRendererTurbo(this, 29, 37, textureX, textureY); // Box 197
		bodyModel[14] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 198
		bodyModel[15] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 199
		bodyModel[16] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 200
		bodyModel[17] = new ModelRendererTurbo(this, -3, 38, textureX, textureY); // Box 201
		bodyModel[18] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 202
		bodyModel[19] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Box 203
		bodyModel[20] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 204
		bodyModel[21] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 210
		bodyModel[22] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 211
		bodyModel[23] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 212
		bodyModel[24] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 213
		bodyModel[25] = new ModelRendererTurbo(this, 54, 37, textureX, textureY); // Box 222
		bodyModel[26] = new ModelRendererTurbo(this, 38, 37, textureX, textureY); // Box 223

		bodyModel[0].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[0].setRotationPoint(-39F, 3F, -1.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 1 coupler
		bodyModel[1].setRotationPoint(36F, 3F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 1
		bodyModel[2].setRotationPoint(-27F, 5F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 72, 2, 4, 0F); // Box 10
		bodyModel[3].setRotationPoint(-36F, 3F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 65
		bodyModel[4].setRotationPoint(23F, 5F, -2F);

		bodyModel[5].addBox(0F, 0F, 0F, 71, 1, 20, 0F); // Box 76
		bodyModel[5].setRotationPoint(-35.5F, 2F, -10F);

		bodyModel[6].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F); // Box 286
		bodyModel[6].setRotationPoint(2F, 6F, -2F);
		bodyModel[6].rotateAngleX = -0.78539816F;

		bodyModel[7].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.25F); // Box 287
		bodyModel[7].setRotationPoint(5F, 6F, -2F);
		bodyModel[7].rotateAngleX = -0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[8].setRotationPoint(-26.5F, 3F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[9].setRotationPoint(-26.5F, 3F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[10].setRotationPoint(23.5F, 3F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 195
		bodyModel[11].setRotationPoint(23.5F, 3F, 2F);

		bodyModel[12].addBox(-0.5F, 0F, -3F, 1, 0, 6, 0F); // Box 196
		bodyModel[12].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[12].rotateAngleY = -0.52359878F;

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 197
		bodyModel[13].setRotationPoint(3F, 3.5F, -3F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 198
		bodyModel[14].setRotationPoint(-4.5F, 6F, -2.5F);

		bodyModel[15].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 199
		bodyModel[15].setRotationPoint(-3F, 6.01F, 0F);
		bodyModel[15].rotateAngleY = -0.52359878F;

		bodyModel[16].addBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F); // Box 200
		bodyModel[16].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[16].rotateAngleY = -0.26179939F;

		bodyModel[17].addBox(-0.5F, 0F, -2F, 1, 0, 4, 0F); // Box 201
		bodyModel[17].setRotationPoint(11F, 6.01F, 0F);
		bodyModel[17].rotateAngleY = -0.26179939F;

		bodyModel[18].addBox(-20.5F, 0F, 2F, 22, 0, 1, 0F); // Box 202
		bodyModel[18].setRotationPoint(-3F, 6.01F, -0.5F);
		bodyModel[18].rotateAngleY = 0.10471976F;
		bodyModel[18].rotateAngleZ = 0.05235988F;

		bodyModel[19].addBox(0F, 0F, 0F, 14, 0, 1, 0F); // Box 203
		bodyModel[19].setRotationPoint(-3F, 6F, 0F);

		bodyModel[20].addBox(-1F, 0F, -1.5F, 15, 0, 1, 0F); // Box 204
		bodyModel[20].setRotationPoint(11F, 6.01F, -0.5F);
		bodyModel[20].rotateAngleY = 0.17453293F;
		bodyModel[20].rotateAngleZ = -0.05235988F;

		bodyModel[21].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 210
		bodyModel[21].setRotationPoint(-35.5F, 3F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 211
		bodyModel[22].setRotationPoint(-35.5F, 3F, 10F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 212
		bodyModel[23].setRotationPoint(31.5F, 3F, 10F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 3, 0, 0F); // Box 213
		bodyModel[24].setRotationPoint(31.5F, 3F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 222
		bodyModel[25].setRotationPoint(-35.5F, -2F, 5F);

		bodyModel[26].addShapeBox(-3.5F, -0.5F, -3F, 5, 0, 5, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 223
		bodyModel[26].setRotationPoint(-35F, -1.5F, 5F);
	}
	ModelFrictionTruck bogie = new ModelFrictionTruck();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 27; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/FrictionTruck_Greyish.png"));
		GL11.glPushMatrix();
		GL11.glScalef(1,1,1f);
		GL11.glTranslated(-1.55,-0.0,-0.0);
		bogie.render(entity,f,f1,f2,f3,f4,f5);

		GL11.glTranslated(3.1,-0.0,0.00);
		bogie.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public float[] getTrans() { return new float[]{-0F, 0.15F, 0F}; }

}
