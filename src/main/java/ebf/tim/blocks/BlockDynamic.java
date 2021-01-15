package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
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
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

/**
 * <h1>Block core</h1>
 * Generic block class to simplify the process of creating new blocks.
 * All the functionality for every block can be managed here, and then just instanced in the registry with new parameters.
 *
 * @author Eternal Blue Flame
 */
public class BlockDynamic extends BlockContainer {

	public boolean isBlockContainer;//where did 1.7 inherit this from?
    public boolean rotates=true;
    public ModelBase model=null;
    public Object tesr=null;
    //for models 0 is entire texture, for blocks, texture is:
    //0 up, 1 down, 2 north, 3 south, 4 east, 5 west.
    public ResourceLocation texture=null;
    public int assemblyTableTier = -1; //only applies if it is an assembly table/traintable. no need to set otherwise. -1 unless set.

    public BlockDynamic(Material material, boolean isDirectional, boolean isStorage, int tier) {
        super(material);
        rotates=isDirectional;
        this.isBlockContainer=isStorage;
        this.assemblyTableTier = tier;
    }

    public BlockDynamic(Material material, boolean isDirectional, boolean isStorage) {
        super(material);
        rotates=isDirectional;
        this.isBlockContainer=isStorage;
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
    public void breakBlock(World w, BlockPos pos, IBlockState state){
        super.breakBlock(w, pos, state);
        w.removeTileEntity(pos);
    }

    public ResourceLocation getTexture(int x, int y, int z){
        return texture;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean hasTileEntity(IBlockState state){
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return isBlockContainer?new TileEntityStorage(this):new TileRenderFacing(this);
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase entity, ItemStack stack){
        super.onBlockPlacedBy(world, pos, state, entity, stack);
        if(world.getTileEntity(pos)==null){
            world.setTileEntity(pos,createNewTileEntity(world,0));
        }
        if(world.getTileEntity(pos) instanceof TileRenderFacing){
            ((TileRenderFacing) world.getTileEntity(pos)).setFacing(
                    MathHelper.floor((entity.rotationYaw / 90.0F) + 2.5D) & 3);
        }
    }


    @Override
    public boolean onBlockActivated(World worldOBJ, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (player.isSneaking() || !isBlockContainer) {
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

}
