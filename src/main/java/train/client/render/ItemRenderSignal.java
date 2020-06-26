/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBlockSignal;
import train.common.library.Info;

public class ItemRenderSignal implements ICustomModelLoader {

	private static final ModelBlockSignal signal = new ModelBlockSignal(1F);
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.trainsPrefix + "signal_suisse_green.png");

	public ItemRenderSignal() {
	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderSignal");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderSignal(0.0F, 0F, 0.0F, 0.0F, 1F);

			//todo: theoretically if we just render it rather than returning a model,
			// it will render and we dont need to return a model
		/*	break;
		}
		case EQUIPPED: {
			renderSignal(0F, 0.05F, 0F, 180.0F, 0.7F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderSignal(0F, 0.05F, 0F, 180.0F, 0.7F);
			return;
		}
		case INVENTORY: {
			renderSignal(0F, -0.8F, 0F, 180.0F, 0.65F);
			break;
		}
		default:
			break;
		}*/
		return null;
	}

	private void renderSignal(float f, float g, float h, float rotation, float scale) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix(); //start
		GL11.glTranslatef(f, g, h); //size
		GL11.glRotatef(rotation, f, g, h);
		GL11.glScalef(scale, scale, scale);
		signal.render2(0.0625F);
		GL11.glPopMatrix(); //end
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
