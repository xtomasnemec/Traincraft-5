//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.11.2020 - 13:23:37
// Last changed on: 02.11.2020 - 13:23:37

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelLogcarNP_Archbar;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

public class ModelLogcarNP extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLogcarNP() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[39];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

		flipAll();


	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Load parts1
		bodyModel[19] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Load parts2
		bodyModel[20] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Load parts3
		bodyModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Load parts4
		bodyModel[22] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Load parts5
		bodyModel[23] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 124
		bodyModel[26] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 125
		bodyModel[27] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 126
		bodyModel[28] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 127
		bodyModel[29] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 128
		bodyModel[30] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 129
		bodyModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 130
		bodyModel[32] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 131
		bodyModel[33] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 132
		bodyModel[34] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 133
		bodyModel[35] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 196
		bodyModel[36] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 92
		bodyModel[37] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 93
		bodyModel[38] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 94

		bodyModel[0].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-35F, 0F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 72, 1, 22, 0F); // Box 3
		bodyModel[1].setRotationPoint(-36F, -1F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 70, 1, 20, 0F); // Box 5
		bodyModel[2].setRotationPoint(-35F, -2F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 70, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-35F, 0F, 5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 7
		bodyModel[4].setRotationPoint(-35F, -14F, -11F);

		bodyModel[5].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 8
		bodyModel[5].setRotationPoint(-26F, -16F, -11F);

		bodyModel[6].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 9
		bodyModel[6].setRotationPoint(-3F, -16F, -11F);

		bodyModel[7].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 10
		bodyModel[7].setRotationPoint(-15F, -16F, -11F);

		bodyModel[8].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 12
		bodyModel[8].setRotationPoint(10F, -16F, -11F);

		bodyModel[9].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 13
		bodyModel[9].setRotationPoint(21F, -16F, -11F);

		bodyModel[10].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 15
		bodyModel[10].setRotationPoint(32F, -16F, -11F);

		bodyModel[11].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 20
		bodyModel[11].setRotationPoint(-37F, -16F, 10F);

		bodyModel[12].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 21
		bodyModel[12].setRotationPoint(-26F, -16F, 10F);

		bodyModel[13].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 22
		bodyModel[13].setRotationPoint(-15F, -16F, 10F);

		bodyModel[14].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 23
		bodyModel[14].setRotationPoint(-3F, -16F, 10F);

		bodyModel[15].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 24
		bodyModel[15].setRotationPoint(10F, -16F, 10F);

		bodyModel[16].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 25
		bodyModel[16].setRotationPoint(21F, -16F, 10F);

		bodyModel[17].addBox(2F, 2F, 0F, 1, 13, 1, 0F); // Box 26
		bodyModel[17].setRotationPoint(32F, -16F, 10F);

		bodyModel[18].addBox(0F, 0F, 0F, 70, 6, 6, 0F); // Load parts1
		bodyModel[18].setRotationPoint(-35F, -8F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 70, 6, 6, 0F); // Load parts2
		bodyModel[19].setRotationPoint(-35F, -8F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 70, 6, 6, 0F); // Load parts3
		bodyModel[20].setRotationPoint(-35F, -8F, 3F);

		bodyModel[21].addBox(0F, 0F, 0F, 70, 6, 6, 0F); // Load parts4
		bodyModel[21].setRotationPoint(-35F, -14F, 0F);

		bodyModel[22].addBox(0F, 0F, 0F, 70, 6, 6, 0F); // Load parts5
		bodyModel[22].setRotationPoint(-35F, -14F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 38
		bodyModel[23].setRotationPoint(21F, 0F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 39
		bodyModel[24].setRotationPoint(-25F, 0F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[25].setRotationPoint(-7F, 3F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F); // Box 125
		bodyModel[26].setRotationPoint(-13F, 1F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[27].setRotationPoint(7F, 1F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[28].setRotationPoint(7F, 1F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[29].setRotationPoint(-7F, 3F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F); // Box 129
		bodyModel[30].setRotationPoint(-13F, 1F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[31].setRotationPoint(-7F, 1F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[32].setRotationPoint(6F, 1F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[33].setRotationPoint(6F, 1F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[34].setRotationPoint(-7F, 1F, 5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 196
		bodyModel[35].setRotationPoint(-36F, 0F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 3, 6, 0F); // Box 92
		bodyModel[36].setRotationPoint(33F, 0F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 93
		bodyModel[37].setRotationPoint(36F, 0F, -1.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 94
		bodyModel[38].setRotationPoint(-39F, 0F, -1.5F);
	}

	ModelLogcarNP_Archbar archbar = new ModelLogcarNP_Archbar();
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 39; i++)
		{
			bodyModel[i].render(f5);
		}

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/logcarNP_archbar.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(1.4,0.1,0);
		archbar.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/logcarNP_archbar.png"));

		GL11.glPushMatrix();
		GL11.glScalef(1,1,0.9f);
		GL11.glTranslated(-1.4,0.1,0);
		archbar.render(entity,f,f1,f2,f3,f4,f5);
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ModellogcarNP[];
}
