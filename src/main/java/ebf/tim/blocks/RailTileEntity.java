package ebf.tim.blocks;

import ebf.XmlBuilder;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.render.models.Model1x1Rail;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.TextureManager;
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

import javax.annotation.Nullable;


public class RailTileEntity extends TileEntity {

    private AxisAlignedBB boundingBox = null;
    //management variables
    //todo public int snow=0;
    //todo public int timer=0;
    //todo public int overgrowth=0;
    public Integer railGLID=null;
    private int meta=0;
    private XmlBuilder data = new XmlBuilder();


    public int getMeta() {
        return meta;
    }
    public void setMeta(int i){
        if(meta==i){
            markDirty();
            return;
        }
        meta=i;
        if(world!=null) {
            CommonUtil.setBlockMeta(world,pos.getX(),pos.getY(),pos.getZ(),meta);
        }
        markDirty();
    }

    public void setData(XmlBuilder d){
        data=d;
        markDirty();
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
            TextureManager.adjustLightFixture(world,pos.getX(),pos.getY(),pos.getZ());
            if(railGLID!=null && !ClientProxy.disableCache){
                if(!org.lwjgl.opengl.GL11.glIsList(railGLID)){
                    railGLID=null;
                    return;
                }
                org.lwjgl.opengl.GL11.glCallList(railGLID);
            }
            if(railGLID==null && data !=null && data.floatArrayMap.size()>0){
                RailShapeCore route =new RailShapeCore().fromXML(data);
                if (route.activePath!=null) {
                    if(!ClientProxy.disableCache) {
                        railGLID = net.minecraft.client.renderer.GLAllocation.generateDisplayLists(1);
                        org.lwjgl.opengl.GL11.glNewList(railGLID, org.lwjgl.opengl.GL11.GL_COMPILE);

                        Model1x1Rail.Model3DRail(world, pos.getX(), pos.getY(), pos.getZ(), route);

                        org.lwjgl.opengl.GL11.glEndList();
                    } else {
                        Model1x1Rail.Model3DRail(world, pos.getX(), pos.getY(), pos.getZ(), route);
                    }
                } // else {DebugUtil.println("NO DATA");}*/
            }
        } else {super.addInfoToCrashReport(report);}
    }

    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
        return (oldState.getBlock() != newSate.getBlock()) ||
                (oldState.getBlock().getMetaFromState(oldState) != newSate.getBlock().getMetaFromState(newSate));
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

            if(world.isRemote && railGLID!=null) {
                org.lwjgl.opengl.GL11.glDeleteLists(railGLID, 1);
                railGLID = null;
            }
        }
        data.buildXML();

    }

    @Override
    public void onChunkUnload() {
        if(TrainsInMotion.proxy.isClient() && railGLID!=null){
            org.lwjgl.opengl.GL11.glDeleteLists(railGLID, 1);
            railGLID = null;
        }
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new SPacketUpdateTileEntity(pos, 0, nbttagcompound);
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
        }
    }

}
