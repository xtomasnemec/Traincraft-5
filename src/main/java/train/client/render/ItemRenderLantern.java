package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelLantern;
import train.common.library.Info;

public class ItemRenderLantern implements ICustomModelLoader {
	private static final ModelLantern modelLantern= new ModelLantern();
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lantern_uv_draw_2.png");

	public ItemRenderLantern() {
	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderLantern");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderLantern(0f, 0f, 0f, 1f);

		//todo: theoretically if we just render it rather than returning a model,
		// it will render and we dont need to return a model
		/*	return;
		}
		case EQUIPPED: {
			renderLantern(0.2f, 1f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderLantern(0.2f, 1f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderLantern(0f, 0f, 0f, 0.7f);
			return;
		}
		default:
			break;
		}*/
		return null;
	}

	private void renderLantern(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
		float f2 = (float) (0x4f4e4a >> 16 & 255) / 255.0F;
		float f3 = (float) (0x4f4e4a >> 8 & 255) / 255.0F;
		float f4 = (float) (0x4f4e4a & 255) / 255.0F;
		GL11.glColor3f(f2, f3, f4);

		modelLantern.render();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
