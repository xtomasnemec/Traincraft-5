/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelGeneratorDiesel;
import train.common.library.Info;

public class ItemRenderGeneratorDiesel implements ICustomModelLoader {

	private static final ModelGeneratorDiesel generator = new ModelGeneratorDiesel(1F);
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "generator_diesel.png");

	public ItemRenderGeneratorDiesel() {

	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderGeneratorDiesel");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderGenerator(0.0F, 0F, 0.0F);
			//todo: theoretically if we just render it rather than returning a model,
			// it will render and we dont need to return a model
		/*	break;
		}
		case EQUIPPED: {
			renderGenerator(0F, 0.1F, 0F);
			break;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderGenerator(0F, 0.1F, 0F);
			return;
		}
		case INVENTORY: {
			renderGenerator(0.5F, -0.1F, 0.5F);
			break;
		}
		default:
			break;
		}
		*/
		return null;
	}

	private void renderGenerator(float f, float g, float h) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glTranslatef(f, g, h);
		GL11.glScalef(0.7F, 0.7F, 0.7F);
		generator.render2(0.0625F);
		GL11.glPopMatrix();
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
