package ebf.tim.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.XmlBuilder;
import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.render.models.Model1x1Rail;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

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
        if(worldObj!=null) {
            worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, meta, 2);
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

    public void func_145828_a(@Nullable CrashReportCategory report)  {
        if (report == null) {
            if (!worldObj.isRemote) {
                return;
            }

            Minecraft.getMinecraft().entityRenderer.enableLightmap(1);
            TextureManager.adjustLightFixture(worldObj,xCoord,yCoord,zCoord);
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

                        Model1x1Rail.Model3DRail(worldObj, xCoord, yCoord, zCoord, route);

                        org.lwjgl.opengl.GL11.glEndList();
                    } else {
                        Model1x1Rail.Model3DRail(worldObj, xCoord, yCoord, zCoord, route);
                    }
                } // else {DebugUtil.println("NO DATA");}
            }
        } else {super.func_145828_a(report);}
    }

    @Override
    public boolean shouldRefresh(Block oldBlock, Block newBlock, int oldMeta, int newMeta, World world, int x, int y, int z) {
        return (oldBlock != newBlock) || (oldMeta != newMeta);
    }

    @Override
    public boolean canUpdate(){return false;}

    @Override
    public void updateEntity(){}

    @SideOnly(Side.CLIENT)
    public double getMaxRenderDistanceSquared()
    {
        return 16284.0D;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        if (boundingBox == null) {
            boundingBox = AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord+1, yCoord, zCoord+1);
        }
        return boundingBox;
    }


    public void dropItem(){

        ItemStack drop = ItemRail.setStackData(
                new ItemStack(TiMItems.railItem, 1), data.getItemStack("rail"),
                data.getItemStack("ballast"), data.getItemStack("ties"), data.getItemStack("wires"));
        if(drop!=null) {
            worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 0.5f, zCoord, drop));
        }
    }


    public void markDirty() {
        if (this.worldObj != null) {
            CommonUtil.markBlockForUpdate(worldObj, xCoord, yCoord, zCoord);
            worldObj.func_147453_f(this.xCoord, this.yCoord, this.zCoord, TiMBlocks.railBlock);
        }
        data.buildXML();
        glID=null;

    }

    @Override
    public void onChunkUnload() {}

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        super.onDataPacket(net, pkt);
        if(pkt ==null){return;}
        readFromNBT(pkt.func_148857_g());
        markDirty();
    }


    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        tag.setInteger("meta", meta);
        if(data!=null && data.toXMLString()!=null && data.toXMLString().length()>0) {
            tag.setString("raildata", data.toXMLString());
        }
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
