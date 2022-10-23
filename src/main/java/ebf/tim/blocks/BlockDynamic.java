package ebf.tim.blocks;

import depreciated.minecraft.util.IIcon;
import ebf.tim.TrainsInMotion;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.TransportSlotManager;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
    public int assemblyTableTier = -1; //only applies if it is an assembly table/traintable. no need to set otherwise. -1 unless set.
    public boolean isContainer=true;

    public boolean isBlockContainer=true;
    public String textureName="";

    public BlockDynamic(Material material, boolean isStorage, int tier) {
        super(material);
        this.isContainer=isStorage;
        this.assemblyTableTier = tier;
    }

    public BlockDynamic(Material material, boolean isStorage) {
        super(material);
        this.isContainer=isStorage;
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

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack){
        super.onBlockPlacedBy(world, pos,state, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.addTileEntity(createNewTileEntity(world,0));
        if(world.getTileEntity(pos) instanceof TileRenderFacing){
            ((TileRenderFacing) world.getTileEntity(pos)).setFacing(
                    CommonUtil.floorDouble((entity.rotationYaw / 90.0F) + 2.5D) & 3);
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
