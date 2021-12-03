package train.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;
import train.blocks.BlockBridgePillar;
import train.render.models.blocks.ModelBridgePillar;

public class RenderBridgePillar extends TileEntitySpecialRenderer {
	static final ModelBridgePillar modelBridgePillar = new ModelBridgePillar();

	@Override
	public void render(TileEntity tileEntity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		GL11.glPushMatrix();
		modelBridgePillar.render(tileEntity, x, y, z);
		GL11.glPopMatrix();
	}
}
