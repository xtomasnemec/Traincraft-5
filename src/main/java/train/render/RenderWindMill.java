package train.render;

import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.render.models.blocks.ModelWindMill;
import train.render.models.blocks.ModelWindMillWheel;

public class RenderWindMill extends TiMTESR {

	private static final ModelWindMill modelWindMill = new ModelWindMill();
	private static final ModelWindMillWheel modelWindMillWheel = new ModelWindMillWheel();

	@Override
	public void render(TileEntity tileEntity, double x, double y, double z, float tick, int destroyStage, float alp) {
		if(tileEntity !=null) {
			modelWindMill.render(tileEntity, x, y, z);
			modelWindMillWheel.render(tileEntity, x, y, z);
		}
	}
}
