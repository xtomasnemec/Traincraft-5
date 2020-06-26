package train.client.render;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.client.model.IModel;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.ModelSwitchStandOn;
import train.common.library.Info;

public class ItemRenderSwitchStand implements ICustomModelLoader {
	private static final ModelSwitchStandOn modeSwitch = new ModelSwitchStandOn();
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "switchStand_uv_draw_1.png");

	public ItemRenderSwitchStand() {
	}

	private static ResourceLocation uri = new ResourceLocation("tc","ItemRenderSwitchStand");
	@Override
	public boolean accepts(ResourceLocation modelLocation) {
		return modelLocation==uri;
	}

	@Override
	public IModel loadModel(ResourceLocation resource) {
		if(resource!=uri){return null;}
		//switch (type) {
		//case ENTITY: {
			renderSwitch(0f, 0f, 0f, 1f);
		//todo: theoretically if we just render it rather than returning a model,
		// it will render and we dont need to return a model
		/*	return;
		}
		case EQUIPPED: {
			renderSwitch(0.2f, 1f, 1f, 1f);
			return;
		}
		case EQUIPPED_FIRST_PERSON: {
			renderSwitch(0.2f, 1f, 1f, 1f);
			return;
		}
		case INVENTORY: {
			renderSwitch(0f, 0f, 0f, 0.7f);
			return;
		}
		default:
			break;
		}*/
		return null;
	}

	private void renderSwitch(float x, float y, float z, float scale) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glRotated(180,0,0,1);
		GL11.glRotated(180,0,1,0);

		Tessellator.bindTexture(texture);

		modeSwitch.render(null,0,0,0,0,0,0.0625f);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager) {

	}
}
