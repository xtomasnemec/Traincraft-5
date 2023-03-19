package ebf.tim.blocks;

import depreciated.minecraft.util.IIcon;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

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
    public String textureName="";

    public BlockDynamic(Material material, boolean isStorage) {
        super(material);
        this.isContainer=isStorage;
        setBlockBounds(hitboxShape()[0],hitboxShape()[1],hitboxShape()[2],hitboxShape()[3],hitboxShape()[4],hitboxShape()[5]);
    }

    public Block setModel(ModelBase modelBase){
        model=modelBase;
        return this;
    }


    public Block setTESR(Object modelRender){
        tesr=modelRender;
        return this;
    }

    @Override
    public void breakBlock(World w, BlockPos pos, IBlockState state) {
        //super.breakBlock(w, x, y, z, b, meta);
        w.getChunk(pos.getX() >> 4, pos.getZ() >> 4)
                .removeTileEntity(new BlockPos(pos.getX() & 15, pos.getY(), pos.getZ() & 15));
    }

    public Block setTextureName(String name){
        textureName=name;
        return this;
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getTexture(int x, int y, int z){
        return new ResourceLocation(this.textureName == null ? "MISSING_ICON_BLOCK_" + getIdFromBlock(this) + "_" + this.getTranslationKey() :textureName);
    }

    @SideOnly(Side.CLIENT)
    //@Override
    public IIcon getIcon(int a, int b){
        return new particleTexture(textureName,32,0,16);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos){
        return false;
    }

    @Override
    public boolean hasTileEntity(){
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
        return AxisAlignedBB.getBoundingBox((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)y + this.maxY, (double)z + this.maxZ);
    }
    @Override
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB hitboxSelf, List p_149743_6_, Entity collidingEntity) {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        p_149743_6_.add(this.getCollisionBoundingBoxFromPool(world, x, y, z));
    }
    @Override
    public boolean getBlocksMovement(IBlockAccess p_149655_1_, int p_149655_2_, int p_149655_3_, int p_149655_4_) {
        return hitboxShape()[4]>1;
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
            switch ((CommonUtil.floorDouble(((entity.rotationYaw-45)%360) / 90.0F)&3)){
                case 0: ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(ForgeDirection.WEST);break;
                case 1: ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(ForgeDirection.NORTH);break;
                case 2: ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(ForgeDirection.EAST);break;
                case 3: ((TileRenderFacing) world.getTileEntity(x,y,z)).setFacing(ForgeDirection.SOUTH);break;

            }
            ;

        }
    }


    @Override
    public boolean onBlockActivated(World worldOBJ, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (player.isSneaking() || !isContainer) {
            return false;
        } else if (worldOBJ.isRemote) {
            return true;
        }

        if (worldOBJ.getTileEntity(pos) instanceof TileEntityStorage) {
            player.openGui(TrainsInMotion.instance, 0, worldOBJ, pos.getX(), pos.getY(), pos.getZ());
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


    public class particleTexture extends IIcon {


        public particleTexture(String textureName, int xOffset, int yOffset, int scale){
            super(textureName);
            initSprite(scale,scale,xOffset,yOffset,false);
        }
    }

}
