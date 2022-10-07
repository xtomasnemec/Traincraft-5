package train.render;

import ebf.tim.blocks.TileSwitch;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.library.Info;
import train.render.models.blocks.ModelBlockSignal;

public class RenderSignal extends TiMTESR {

	private static final ModelBlockSignal modelSignal = new ModelBlockSignal(1.0F / 16.0F);
	public RenderSignal() {}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.46F, (float) y, (float) z + 0.46F);
		if(tileentity instanceof TileSwitch) {
			if (!((TileSwitch) tileentity).getEnabled()) {
				TextureManager.bindTexture(new ResourceLocation(Info.modID,Info.trainsPrefix + "signal_suisse_green.png"));
			} else {
				TextureManager.bindTexture(new ResourceLocation(Info.modID,Info.trainsPrefix + "signal_suisse_red.png"));
			}
			modelSignal.render(0.0625F, ((TileSwitch)tileentity).facing);
		} else {
			TextureManager.bindTexture(new ResourceLocation(Info.modID,Info.trainsPrefix + "signal_suisse_green.png"));
			modelSignal.render(0.0625F, 0);
		}
		GL11.glPopMatrix();
	}
}