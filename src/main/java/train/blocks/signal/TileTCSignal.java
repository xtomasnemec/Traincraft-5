package train.blocks.signal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.BlockSignal;
import ebf.tim.blocks.TileSwitch;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.library.Info;

public class TileTCSignal extends TileSwitch {
	public TileTCSignal() {
		super();
	}

	public TileTCSignal(BlockSignal block){
		host=block;
	}

	@Override
	public void updateEntity() {
		//super.updateEntity();
		//check if given redstone signal, let that override normal detection.
		tickTile();
		if(currentTick%5==0) {
			detectNearby(3, 16, true, false);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void renderModel(){
		org.lwjgl.opengl.GL11.glTranslatef( 0,  0.5f,  0);
		org.lwjgl.opengl.GL11.glRotatef(180, 0,  0,  1f);
		//modifications for item render
		if(getWorld()==null){
			GL11.glScalef(0.65f,0.65f,0.65f);
			org.lwjgl.opengl.GL11.glTranslatef( 0,  -0.5f,  0);
			org.lwjgl.opengl.GL11.glRotatef(225, 0,  1f,  0);
		} else {
			org.lwjgl.opengl.GL11.glRotatef(270, 0,  1f,  0);
		}
		//this would normally be the regular render() call, but this model is weird.
		new train.render.models.blocks.ModelBlockSignal()
				.render(null, 0, 0, 0, 0, 0, 0.0625f);

		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ResourceLocation getTexture(int x, int y, int z){
		if (getStrength(0)>0) {
			return new ResourceLocation(Info.modID, Info.trainsPrefix + "signal_suisse_green.png");
		} else {
			return new ResourceLocation(Info.modID,Info.trainsPrefix + "signal_suisse_red.png");
		}
	}

}