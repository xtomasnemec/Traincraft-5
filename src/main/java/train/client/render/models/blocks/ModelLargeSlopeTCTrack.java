package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLargeSlopeTCTrack extends ModelBase {
	private IModelCustom modeltrack;

	private IModelCustom embeddedModelTrack;
	private IModelCustom modelLargeSlopeWood;
	private IModelCustom modelLargeSlopeBallast;


	public ModelLargeSlopeTCTrack() {
		modeltrack = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_slope_long.obj"));
		modelLargeSlopeWood = AdvancedModelLoader
				.loadModel(new ResourceLocation(Info.modelPrefix + "supports_wood_long.obj"));
		modelLargeSlopeBallast = AdvancedModelLoader
				.loadModel(new ResourceLocation(Info.modelPrefix + "supports_ballast_long.obj"));
		embeddedModelTrack = AdvancedModelLoader
				.loadModel(new ResourceLocation(Info.modelPrefix+ "track_embedded_slope_long.obj"));
	}





	public void render(String type, String ballast, int ballastColour) {

		String[] ballastTexture = new String[2];
		if (ballast.contains(":")) {
			ballastTexture = ballast.split(":", 5);
		}
		else {
			ballastTexture[0] = "minecraft";
			ballastTexture[1] = ballast;

		}


		if(type.equals("wood")) {
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
			modelLargeSlopeWood.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();}
		if(type.equals("gravel")) {
			tmt.Tessellator.bindTexture(new ResourceLocation("minecraft", "textures/blocks/gravel.png"));
			modelLargeSlopeBallast.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();}
		if(type.equals("ballast")) {
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/ballast_test.png"));
			modelLargeSlopeBallast.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();}
		if (type.equals("snow")) {
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/snowgravel.png"));
			modelLargeSlopeBallast.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
		}
		if (type.equals("dynamic")) {
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
			float r = (float)(ballastColour >> 16 & 255) / 255.0F;
			float g = (float)(ballastColour >> 8 & 255) / 255.0F;
			float b = (float)(ballastColour & 255) / 255.0F;
			GL11.glColor4f(r,g,b,1);
			modelLargeSlopeBallast.renderAll();
		}
		if (type.equals("embedded_dynamic")) {
			tmt.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			embeddedModelTrack.renderAll();
			tmt.Tessellator.bindTexture(new ResourceLocation(ballastTexture[0],  "textures/blocks/" + ballastTexture[1] +".png"));
			float r = (float)(ballastColour >> 16 & 255) / 255.0F;
			float g = (float)(ballastColour >> 8 & 255) / 255.0F;
			float b = (float)(ballastColour & 255) / 255.0F;
			GL11.glColor4f(r,g,b,1);
			modelLargeSlopeBallast.renderAll();
		}
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		String iconName;
		Block block = Block.getBlockById(tcRail.getBallastMaterial());
		IIcon icon = block.getIcon(1, tcRail.ballastMetadata);
		int colour = block.colorMultiplier(tcRail.getWorldObj(), tcRail.xCoord, tcRail.yCoord - 1, tcRail.zCoord);
		if (icon != null) {
			iconName = icon.getIconName();
		}
		else {
			iconName = "tc:ballast_test";
			colour = 16777215;
		}

		render( type, facing, x, y, z, 1, 1, 1, 1, iconName, colour);
	}

	public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a, String ballastTexture, int colour)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			GL11.glRotatef(-90, 0, 1, 0);
		}
		if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
		}
		if(facing == 0){
			GL11.glRotatef(180, 0, 1, 0);
		}
		//GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		render(type, ballastTexture, colour);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}