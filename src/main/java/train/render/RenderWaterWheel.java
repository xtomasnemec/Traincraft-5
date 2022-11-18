package train.render;

import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.render.models.blocks.ModelWaterWheel;

public class RenderWaterWheel extends TiMTESR {

	static final ModelWaterWheel modelWaterWheel = new ModelWaterWheel();

	@Override
	public void render(TileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		GL11.glDisable(GL11.GL_LIGHTING);
		modelWaterWheel.render(tileEntity, x, y, z);
		GL11.glEnable(GL11.GL_LIGHTING);
	}
}
