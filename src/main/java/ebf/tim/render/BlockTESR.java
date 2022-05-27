package ebf.tim.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class BlockTESR extends TileEntitySpecialRenderer {

    @Override
    public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha){
        GL11.glPushMatrix();
        if(te.getWorld()!=null) {
            GL11.glTranslated(x, y, z);
        }
        te.addInfoToCrashReport(null);
        GL11.glPopMatrix();
    }
}
