package train.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import train.render.models.blocks.ModelWindMill;
import train.render.models.blocks.ModelWindMillWheel;

public class RenderWindMill extends TileEntitySpecialRenderer implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		renderTileEntityAt(null,0,0,0,0);
	}
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
