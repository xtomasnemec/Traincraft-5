package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.library.Info;

import static train.client.render.RenderBridgePillar.modelBridgePillar;

public class ItemRenderBridgePillar implements ICustomModelLoader {

	public ItemRenderBridgePillar() {
	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderBridgePillar");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderBridgePillar(0f, 0f, 0f);

		//todo: theoretically if we just render it rather than returning a model,
		// it will render and we dont need to return a model
		/*	return;
		}
		case EQUIPPED: {
			renderBridgePillar(0.2f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderBridgePillar(0.2f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderBridgePillar(0f, -0.5f, 0f);
			return;
		}
		default:
			break;
		}*/
		return null;
	}

	private void renderBridgePillar(float x, float y, float z) {
		GL11.glPushMatrix();
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
		GL11.glTranslatef(x, y, z);

		modelBridgePillar.render();
		GL11.glPopMatrix();
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
