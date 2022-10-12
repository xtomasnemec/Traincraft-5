package train.blocks.switchstand;

import ebf.tim.blocks.BlockSwitch;
import ebf.tim.blocks.TileSwitch;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.library.Info;

import java.util.Random;

public class TileSwitchStand extends TileSwitch implements ITickable {

    public TileSwitchStand(BlockSwitch host){
        super(host);
    }

    public TileSwitchStand(){
        super();
    }

    //@Override
    //public boolean canUpdate(){return true;}

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return new AxisAlignedBB(getPos().getX()-1, getPos().getY()-1, getPos().getZ()-1,
                getPos().getX() + 2, getPos().getY() + 2, getPos().getZ() + 2);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderModel(){
        //item render
        if(getWorld()==null){
            org.lwjgl.opengl.GL11.glTranslated( -0.2,  0,  0);
            org.lwjgl.opengl.GL11.glScalef(0.65f,0.65f,0.65f);

            new train.render.models.ModelSwitchStandOff().renderBlock();
        }
        //inworld render
        else {
            org.lwjgl.opengl.GL11.glTranslated(0, -0.2f, 0);

            //extra offset for track height
            if(ebf.tim.utility.ClientProxy.railSkin==3){
                org.lwjgl.opengl.GL11.glTranslatef(0, 0.09f, 0);
            } else {
                org.lwjgl.opengl.GL11.glTranslatef(0, 0.01875f, 0);
            }

            //on
            if (getEnabled()) {
                new train.render.models.ModelSwitchStandOn().renderBlock();
            } else {//off
                new train.render.models.ModelSwitchStandOff().renderBlock();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getTexture(int x, int y, int z){
        if (!getEnabled()) {
            return new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "switchStand_uv_draw_2.png");
        } else {
            return new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "switchStand_uv_draw_1.png");
        }
    }
}