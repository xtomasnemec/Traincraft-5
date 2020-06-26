package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightTurnTCTrack extends ModelBase {
	private ModelRendererTurbo modelMediumRightTurn = new ModelRendererTurbo(this).addObj("track_curve_medium.obj");
	private ModelRendererTurbo modelLargeRightTurn = new ModelRendererTurbo(this).addObj("track_curve_big.obj");
	private ModelRendererTurbo modelVeryLargeRightTurn = new ModelRendererTurbo(this).addObj("track_curve_very_big.obj");

	private static int GLID=-1;

	public ModelRightTurnTCTrack() {
	}

	public void renderMedium() {
		modelMediumRightTurn.render();
	}

	public void renderLarge() {
		modelLargeRightTurn.render();
	}
	public void renderVeryLarge() {
		modelVeryLargeRightTurn.render();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		switch (tcRail.getFacing()){
			case 0:{GL11.glRotatef(-90, 0, 1, 0);break;}
			case 1:{GL11.glRotatef(180, 0, 1, 0);break;}
			case 2:{GL11.glRotatef(90, 0, 1, 0);break;}
		}
		if (type.equals("medium")) {
			GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
			this.renderMedium();
		} else if (type.equals("large")) {
			GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			this.renderLarge();
		} else if (type.equals("very_large")){
			GL11.glTranslatef(8.5f, 0.0f, 9.54f);
			this.renderVeryLarge();
		}
	}
}