package train.client.render.models.blocks;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import train.common.library.Info;
import train.common.tile.TileLantern;

@SideOnly(Side.CLIENT)
public class ModelLantern extends ModelBase {
	private ModelRendererTurbo modelLantern;
	//private final RenderItem renderItem;

	public ModelLantern() {
		modelLantern = new ModelRendererTurbo(this).addObj("lantern.obj");
		//renderItem = new RenderItem(Minecraft.getMinecraft().getTextureManager(), new ModelManager(Minecraft.getMinecraft().getTextureMapBlocks()));

	}

	public void render() {
		modelLantern.render();
	}

	public void render(TileLantern lantern, double x, double y, double z) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y + 0.5f, (float) z + 0.5f);

		// Scale our object to about half-size in all directions (the OBJ file is a little large)
		GL11.glScalef(0.5f, 0.5f, 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "lantern_uv_draw_2.png"));
		int j = lantern.getRandomColor();
		//System.out.println(j);
		float f1 = 1.0F;
		float f2 = (float) (j >> 16 & 255) / 255.0F;
		float f3 = (float) (j >> 8 & 255) / 255.0F;
		float f4 = (float) (j & 255) / 255.0F;
		GL11.glColor4f(f1 * f2, f1 * f3, f1 * f4,1);
		// Render the object, using modelTutBox.renderAll();

		this.render();
		GL11.glColor4f(1, 1, 1,1);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		EntityItem ghostEntityItem = new EntityItem(lantern.getWorld());
		ghostEntityItem.setEntityItemStack(new ItemStack(Blocks.torch, 1));
		ghostEntityItem.hoverStart = 0.0F;

		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.1F, (float) z + 0.5F);
		GL11.glScalef(0.5F, 0.5F, 0.5F);
		//renderItem.renderItemAndEffectIntoGUI(ghostEntityItem.getEntityItem(), 0, 0);_H_

		GL11.glPopMatrix();
	}

}
