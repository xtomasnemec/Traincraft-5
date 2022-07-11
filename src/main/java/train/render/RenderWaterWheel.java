package train.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import train.render.models.blocks.ModelWaterWheel;

public class RenderWaterWheel extends TileEntitySpecialRenderer implements IItemRenderer {

	@Override
	public void render(TileEntity tileEntity, double x, double y, double z, float tick, int destroyStage, float alpha) {
			modelWaterWheel.render(tileEntity, x, y, z);
	}
}
