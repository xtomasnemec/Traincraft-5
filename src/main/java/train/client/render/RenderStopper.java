/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;


import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelStopper;
import train.common.library.Info;
import train.common.tile.TileStopper;

public class RenderStopper extends TileEntitySpecialRenderer {

	private static final ModelStopper modelStopper = new ModelStopper(1.0F / 16.0F);
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "buffer.png");

	public RenderStopper() {
	}

	public void render(TileEntity var1, double x, double y, double z) {
		GL11.glPushMatrix();

		GL11.glTranslated(x, y, z);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);

		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		modelStopper.render(0.0625F, ((TileStopper) var1).getFacing());

		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
		render(te, x,y,z);
	}
}
