package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;
import train.common.tile.TileTCRail;

public class ModelVeryLargeSlopeTCTrack extends ModelBase {
	
	private ModelRendererTurbo modeltrack = new ModelRendererTurbo(this).addObj("track_slope_verylong.obj");
	private ModelRendererTurbo modelVeryLargeSlopeWood = new ModelRendererTurbo(this).addObj("supports_wood_verylong.obj");
	private ModelRendererTurbo modelVeryLargeSlopeBallast = new ModelRendererTurbo(this).addObj("supports_ballast_verylong.obj");
	
	public ModelVeryLargeSlopeTCTrack() {

	}
	
	public void render(String type) {
		if (type.equals("wood")) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
			modelVeryLargeSlopeWood.render();
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.render();
		}
		if (type.equals("gravel")) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/gravel.png"));
			modelVeryLargeSlopeBallast.render();
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.render();
		}
		if (type.equals("ballast")) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/ballast_test.png"));
			modelVeryLargeSlopeBallast.render();
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.render();
		}
	}
	
	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		GL11.glColor4f(1, 1, 1, 1);
		// GL11.glScalef(0.5f, 0.5f, 0.5f);
		switch (tcRail.getFacing()){
			case 0:{GL11.glRotatef(180, 0, 1, 0);break;}
			case 1:{GL11.glRotatef(90, 0, 1, 0);break;}
			case 3:{GL11.glRotatef(-90, 0, 1, 0);break;}
		}
		// GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		render(type);

	}
}