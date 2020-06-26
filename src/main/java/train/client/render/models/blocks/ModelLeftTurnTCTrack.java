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
public class ModelLeftTurnTCTrack extends ModelBase {
	private ModelRendererTurbo modelMediumLeftTurn= new ModelRendererTurbo(this).addObj("track_curve_medium.obj");
	private ModelRendererTurbo modelLargeLeftTurn = new ModelRendererTurbo(this).addObj("track_curve_big.obj");
	private ModelRendererTurbo modelVeryLargeLeftTurn = new ModelRendererTurbo(this).addObj("track_curve_very_big.obj");

	public ModelLeftTurnTCTrack() {
	}

	public void renderMedium() {
		modelMediumLeftTurn.render();
	}
	public void renderLarge() {
		modelLargeLeftTurn.render();
	}
	public void renderVeryLarge() {
		modelVeryLargeLeftTurn.render();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		switch (tcRail.getFacing()){
			case 3:{GL11.glRotatef(-90, 0, 1, 0);break;}
			case 0:{GL11.glRotatef(180, 0, 1, 0);break;}
			case 1:{GL11.glRotatef(90, 0, 1, 0);break;}
		}
		if(type.equals("medium")){
			GL11.glTranslatef(-3.0f, 0.0f, 1.0f);
			this.renderMedium();}
		else if(type.equals("large")){
			GL11.glTranslatef(-5.0f, 0.0f, 1.0f);
			this.renderLarge();}
		else if(type.equals("very_large")){
			GL11.glTranslatef(-0.5f, 0.0f, 0.535f);
			this.renderVeryLarge();}
	}

}
