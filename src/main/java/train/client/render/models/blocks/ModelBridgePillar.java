/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;
import train.common.tile.TileBridgePillar;

public class ModelBridgePillar extends ModelBase {
	private ModelRendererTurbo bridgePillar;

	public ModelBridgePillar() {
		bridgePillar = new ModelRendererTurbo(this).addObj("bridge_block.obj");
	}
	
	public void render() {
		bridgePillar.render();
	}
	
	public void render(TileBridgePillar pillar, double x, double y, double z) {
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
		GL11.glColor4f(1, 1, 1, 1);
		/*int facing = pillar.getWorldObj().getBlockMetadata(pillar.xCoord, pillar.yCoord, pillar.zCoord);
		if(facing == 2 || facing==0){
			GL11.glRotatef(90, 0, 1, 0);
		}*/
		render();
	}
}
