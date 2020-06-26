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
import train.client.render.models.blocks.ModelStopper;
import train.common.library.Info;

public class ItemRenderStopper implements ICustomModelLoader {
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "buffer.png");
	private static final ModelStopper stopper = new ModelStopper(1F);

	public ItemRenderStopper() {
	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderStopper");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderStopper(0.0F, 0F, 0.0F, 0.0F);
			//todo: theoretically if we just render it rather than returning a model,
			// it will render and we dont need to return a model
		/*	break;
		}
		case EQUIPPED: {
			renderStopper(0F, 0.4F, 0F, 180.0F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderStopper(0F, 0.4F, 0F, 180.0F);
			return;
		}
		case INVENTORY: {
			renderStopper(1F, 0.65F, 1F, 0.0F);
			break;
		}
		default:
			break;
		}
		*/
		return null;
	}

	private void renderStopper(float f, float g, float h, float rotation) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix(); //start
		GL11.glTranslatef(f, g, h); //size
		GL11.glRotatef(rotation, f, g, h);
		stopper.render2(0.0625F);
		GL11.glPopMatrix(); //end
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
