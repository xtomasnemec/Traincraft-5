/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import train.common.library.Info;

public class ModelLights extends ModelBase {
	private ModelRendererTurbo present;
	
	public ModelLights() {
		present = new ModelRendererTurbo(this).addObj("lights2.obj");
	}
	
	public void render(String partname) {
		present.render();
	}
	
	public void render(int color) {
		//GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
		GL11.glRotatef(90f, 0, 1, 0);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lights3.png"));
		render("Branch_1");
		Minecraft.getMinecraft().entityRenderer.disableLightmap();
		GL11.glEnable(GL11.GL_BLEND);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lights.png"));
		render("Bulb_1");
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 0.3f);
		render("Plane_1");
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		Minecraft.getMinecraft().entityRenderer.enableLightmap();
		GL11.glPopMatrix();
	}
}
