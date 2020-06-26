package train.client.render.models.blocks;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.library.Info;

@SideOnly(Side.CLIENT)
public class ModelTwoWaysCrossingTCTrack extends ModelBase {
	private ModelRendererTurbo modelTwoWaysCrossing= new ModelRendererTurbo(this).addObj("track_x.obj");

	public ModelTwoWaysCrossingTCTrack() {
	}

	public void render() {
		modelTwoWaysCrossing.render();
	}

	public void render(double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		this.render();
	}
}