package ebf.tim.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.TransportSlotManager;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.List;

/**
 * <h1>Block core</h1>
 * Generic block class to simplify the process of creating new blocks.
 * All the functionality for every block can be managed here, and then just instanced in the registry with new parameters.
 *
 * @author Eternal Blue Flame
 */
public class BlockDynamic extends BlockContainer {

    public ModelBase model=null;
    public Object tesr=null;
    public boolean isContainer=true;

    public BlockDynamic(Material material, boolean isStorage) {
        super(material);
        this.isContainer=isStorage;
    }

    @Override//1.7 version of getting if block is opaque, used for server side checks like if creatures can spawn on it
    public boolean func_149730_j(){return true;}

    public Block setModel(ModelBase modelBase){
        model=modelBase;
        return this;
    }


    public Block setTESR(Object modelRender){
        tesr=modelRender;
        return this;
    }

    @Override
    public void breakBlock(World w, int x, int y, int z, Block b, int meta) {
        //super.breakBlock(w, x, y, z, b, meta);
        w.getChunkFromChunkCoords(x >> 4, z >> 4)
                .removeTileEntity(x & 15, y, z & 15);
    }

    @Override
    public Block setBlockTextureName(String name){return this;}

    public Block setTextureName(String name){
        textureName=name;
        return this;
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getTexture(int x, int y, int z){
        return new ResourceLocation(this.textureName == null ? "MISSING_ICON_BLOCK_" + getIdFromBlock(this) + "_" + this.getUnlocalizedName() :textureName);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int a, int b){
        return new particleTexture(textureName,32,0,16);
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return isContainer?new TileEntityStorage(this):new TileRenderFacing(this);
    }

    //returns a series of values to define the size of the block from start to end, with a normal block starting at 0 and ending at 1.
    public float[] hitboxShape(){return new float[]{0,0,0,1,1,1};}

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox(x+hitboxShape()[0], y+hitboxShape()[1], z+hitboxShape()[2],
                x+hitboxShape()[3], y+hitboxShape()[4], z+hitboxShape()[5]);
    }
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB hitboxSelf, List p_149743_6_, Entity collidingEntity) {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        AxisAlignedBB axisalignedbb1 = this.getCollisionBoundingBoxFromPool(world, x, y, z);
        if (hitboxSelf.intersectsWith(axisalignedbb1)) {
            p_149743_6_.add(axisalignedbb1);
        }
    }

    @Override
    public TileEntity createTileEntity(World world, int meta) {
        return createNewTileEntity(world, meta);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack){
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z,createNewTileEntity(world,0));
        if(world.getTileEntity(x,y,z) instanceof TileRenderFacing){
            ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(
                    CommonUtil.floorDouble((entity.rotationYaw / 90.0F) + 2.5D) & 3);
        }
    }


    @Override
    public boolean onBlockActivated(World worldOBJ, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (player.isSneaking() || !isContainer) {
            return false;
        } else if (worldOBJ.isRemote) {
            return true;
        }

        if (worldOBJ.getTileEntity(x, y, z) instanceof TileEntityStorage) {
            player.openGui(TrainsInMotion.instance, 0, worldOBJ, x, y, z);
            return true;
        } else {
            return false;
        }
    }

    @SideOnly(Side.CLIENT)
    public Object getGUI(EntityPlayer player, TileEntity te){
        return new ebf.tim.gui.GUITrainTable(player.inventory, (TileEntityStorage) te);
    }

    public Object getInventoryManager(EntityPlayer player, TileEntity te){
        return new TransportSlotManager(player.inventory, (TileEntityStorage) te);
    }


    public class particleTexture extends TextureAtlasSprite {


        public particleTexture(String textureName, int xOffset, int yOffset, int scale){
            super(textureName);
            initSprite(scale,scale,xOffset,yOffset,false);
        }
    }

}
