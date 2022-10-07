package train.render;

import net.minecraft.tileentity.TileEntity;
import train.render.models.blocks.ModelLantern;

public class RenderLantern extends TiMTESR {
	private static final ModelLantern modelLantern = new ModelLantern();

	@Override
	public void render(TileEntity tileEntity, double x, double y, double z, float tick, int destroyStage, float alpha) {
		modelLantern.render(tileEntity, x, y, z);
	}
}
