package ebf.tim.blocks;

import ebf.XmlBuilder;
import ebf.tim.blocks.rails.BlockRailCore;
import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.render.models.Model1x1Rail;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;


public class RailTileEntity extends TileEntity {

    private AxisAlignedBB boundingBox = null;
    //management variables
    //todo public int snow=0;
    //todo public int timer=0;
    //todo public int overgrowth=0;
    //public Integer railGLID=null;
    public static Map<XmlBuilder,Integer> displayListMap = new HashMap<>();
    private int meta=0;
    private XmlBuilder data = new XmlBuilder();
    private Integer glID=null;


    public int getMeta() {
        return meta;
    }
    public void setMeta(int i){
        if(meta==i){
            return;
        }
        meta=i;
        if(world!=null && CommonUtil.getBlockAt(getWorld(),pos.getX(),pos.getY(),pos.getZ()) instanceof BlockRailBase) {
            CommonUtil.setBlockMeta(getWorld(),pos.getX(),pos.getY(),pos.getZ(),meta);
        }
        markDirty();
    }

    public void setData(XmlBuilder d){
        if(data!=d) {
            data = d;
            markDirty();
        }
    }

    public XmlBuilder getData() {
        return data;
    }

    @Override
    public void addInfoToCrashReport(@Nullable CrashReportCategory report)  {
        if (report == null) {
            if (!world.isRemote) {
                return;
            }

            Minecraft.getMinecraft().entityRenderer.enableLightmap();
            TextureManager.adjustLightFixture(getWorld(),getPos().getX(),getPos().getY(),getPos().getZ());
            if(!ClientProxy.disableCache && glID!=null){
                org.lwjgl.opengl.GL11.glCallList(glID);
            }
            else if(data !=null && data.floatArrayMap.size()>0){
                RailShapeCore route =new RailShapeCore().fromXML(data);
                if(displayListMap.containsKey(data)){
                    glID=displayListMap.get(data);
                    org.lwjgl.opengl.GL11.glCallList(glID);
                }
                else if (route.activePath!=null) {
                    if(!ClientProxy.disableCache) {
                        displayListMap.put(data,
                            net.minecraft.client.renderer.GLAllocation.generateDisplayLists(1));
                        org.lwjgl.opengl.GL11.glNewList(displayListMap.get(data), org.lwjgl.opengl.GL11.GL_COMPILE);

                        Model1x1Rail.Model3DRail(world, pos.getX(), pos.getY(), pos.getZ(), route);

                        org.lwjgl.opengl.GL11.glEndList();
                    } else {
                        Model1x1Rail.Model3DRail(world, pos.getX(), pos.getY(), pos.getZ(), route);
                    }
                } // else {DebugUtil.println("NO DATA");}
            }
        } else {super.addInfoToCrashReport(report);}
    }

    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
        return false;
    }

    @Override
    public void updateContainingBlockInfo(){
        super.updateContainingBlockInfo();
        BlockRailCore.updateNearbyShapes(getWorld(), pos.getX(),pos.getY(),pos.getZ());
    }

    //@Override
    public void updateEntity(){}

    @SideOnly(Side.CLIENT)
    public double getMaxRenderDistanceSquared()
    {
        return 16284.0D;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = new AxisAlignedBB(pos.getX()-1, pos.getY()-1, pos.getZ()-1, pos.getX()+1, pos.getY(), pos.getZ()+1);
        }
        return boundingBox;
    }


    public void dropItem(){

        ItemStack drop = ItemRail.setStackData(
                new ItemStack(TiMItems.railItem, 1), data.getItemStack("rail"),
                data.getItemStack("ballast"), data.getItemStack("ties"), data.getItemStack("wires"));
        if(drop!=null) {
            world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY() + 0.5f, pos.getZ(), drop));
        }
    }


    public void markDirty() {
        //super.markDirty();
        if (this.world != null) {
            world.markChunkDirty(pos, this);
            this.world.notifyNeighborsOfStateChange(this.pos, TiMBlocks.railBlock,true);
        }
        data.buildXML();
    }

    @Override
    public void onChunkUnload() {}

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new SPacketUpdateTileEntity(pos, 0, nbttagcompound);
    }

    @Override
    public NBTTagCompound getUpdateTag()
    {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        if(pkt ==null){return;}
        readFromNBT(pkt.getNbtCompound());
        markDirty();
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setInteger("meta", meta);
        if(data!=null && data.toXMLString()!=null && data.toXMLString().length()>0) {
            tag.setString("raildata", data.toXMLString());
        }
        return tag;
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        meta=tag.getInteger("meta");
        if(tag.hasKey("raildata")) {
            data = new XmlBuilder(tag.getString("raildata"));
            glID=null;
        }
    }

}
