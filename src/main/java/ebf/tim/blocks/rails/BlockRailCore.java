package ebf.tim.blocks.rails;

import ebf.XmlBuilder;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.items.ItemRail;
import ebf.tim.registry.TiMItems;
import ebf.tim.utility.CommonUtil;
import net.minecraft.block.BlockRail;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Eternal Blue Flame
 */
public class BlockRailCore extends BlockRail implements ITileEntityProvider {

    private static final int[] updateMatrix = {-2,-1,0,1,2};






    //750mm single gauge track, each entry in the array is another gauge the rails would support
    public final int[] gaugemm;
    //scales the model parts
    public final float renderScale;


    public BlockRailCore(){
        setCreativeTab(null);
        gaugemm=new int[]{750};
        renderScale=1;
    }

    public BlockRailCore(int gauge, float renderScale){
        setCreativeTab(null);
        gaugemm=new int[]{gauge};
        this.renderScale=renderScale;
    }

    public BlockRailCore(int[] gauge, float renderScale){
        setCreativeTab(null);
        gaugemm=gauge;
        this.renderScale=renderScale;
    }


    @Override
    public int tickRate(World world){return 40;}

    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean getTickRandomly(){return false;}

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean isFlexibleRail(IBlockAccess world, BlockPos pos){return true;}

    @Override
    public float getRailMaxSpeed(World world, EntityMinecart cart, BlockPos p){
        return 0.4f;//getTile(world, x, y, z)!=null?getTile(world, x, y, z).getRailSpeed():0.4f;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos) {
        int meta = CommonUtil.getRailMeta(world, null, pos.getX(),pos.getY(),pos.getZ());
        if (meta >1 && meta <6) {
            return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 1f, 1.0F);
        } else {
            return new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World world, BlockPos pos) {
        return getBoundingBox(state,world,pos);
    }
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos){
        return getBoundingBox(state,world,pos);
    }

    public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        int meta = CommonUtil.getRailMeta(world, null,pos.getX(),pos.getY(),pos.getZ());
        if (meta > 1 && meta < 6) {
            //todo: return twi hitboxes so it can be climbed like stairs
            super.addCollisionBoxToList(state, world, pos, entityBox, collidingBoxes, entityIn, isActualState);
        } else {
            super.addCollisionBoxToList(state, world, pos, entityBox, collidingBoxes, entityIn, isActualState);
        }

    }


    public boolean isBlockSolid(IBlockAccess p_149747_1_, int p_149747_2_, int p_149747_3_, int p_149747_4_, int p_149747_5_) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta){
        return new RailTileEntity();
    }



    @Override
    public EnumRailDirection getRailDirection(IBlockAccess world, BlockPos pos, IBlockState state, EntityMinecart cart) {

        int x = pos.getX(), y=pos.getY(),z=pos.getZ();

        if(!(getTileEntity(world,x,y,z) instanceof RailTileEntity)){
            return EnumRailDirection.byMetadata(0);
        }
        int meta = ((RailTileEntity) getTileEntity(world,x,y,z)).getMeta();
        if(isPowered) {
            meta = meta & 7;
        }

        if (cart == null || cart.getEntityData() == null){
                return EnumRailDirection.byMetadata(meta);
            }
        //first be sure the key exists, and create it if it doesn't, that way we be sure we don't crash. Also if it doesn't exist we can just return the base meta unchanged.
        if (!cart.getEntityData().hasKey("tim.lastusedrail.meta")){
            cart.getEntityData().setInteger("tim.lastusedrail.meta",meta);
            return EnumRailDirection.byMetadata(meta);
        }
        boolean changed = false;
        switch (meta) {
            //add support for intersections
            case 0: {
                //only part that theoretically works.
                if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                    meta = 1;
                }
                changed = true;
                break;
            }
            case 1: {
                if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                    meta = 0;
                }
                changed = true;
                break;
            }
            case 6:{
                if(getTileEntityMeta(world,x+1,y,z)==9 && cart.motionZ>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return EnumRailDirection.byMetadata(0);//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x+1,y,z)==7){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==7){
                        return EnumRailDirection.byMetadata(9);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z+1)==8 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return EnumRailDirection.byMetadata(1);//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z+1)==9) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return EnumRailDirection.byMetadata(1);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 9) {
                        return EnumRailDirection.byMetadata(7);//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 7:{
                if(getTileEntityMeta(world,x-1,y,z)==9 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return EnumRailDirection.byMetadata(0);//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x-1,y,z)==8){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==9){
                        return EnumRailDirection.byMetadata(6);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z+1)==9 && cart.motionX<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return EnumRailDirection.byMetadata(1);//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z+1)==8) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return EnumRailDirection.byMetadata(1);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 7) {
                        return EnumRailDirection.byMetadata(6);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x-1,y,z)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 6) {
                        return EnumRailDirection.byMetadata(8);//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 8:{
                if(getTileEntityMeta(world,x-1,y,z)==6 && cart.motionZ<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return EnumRailDirection.byMetadata(0);//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x-1,y,z)==9){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==9){
                        return EnumRailDirection.byMetadata(7);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z-1)==6 && cart.motionX<0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return EnumRailDirection.byMetadata(1);//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z-1)==7) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return EnumRailDirection.byMetadata(1);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 7) {
                        return EnumRailDirection.byMetadata(9);//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            case 9:{
                if(getTileEntityMeta(world,x+1,y,z)==6 && cart.motionZ>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==0){
                    return EnumRailDirection.byMetadata(0);//this already worked fine, but make it smoother
                } else if(getTileEntityMeta(world,x+1,y,z)==7){
                    if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==0 && cart.motionZ<0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if(cart.getEntityData().getInteger("tim.lastusedrail.meta")==8){
                        return EnumRailDirection.byMetadata(6);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x,y,z-1)==7 && cart.motionX>0 && cart.getEntityData().getInteger("tim.lastusedrail.meta")==1){
                    return EnumRailDirection.byMetadata(1);//this already worked fine, but make it smoother
                } else if (getTileEntityMeta(world,x,y,z-1)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 1) {
                        return EnumRailDirection.byMetadata(1);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 6) {
                        return EnumRailDirection.byMetadata(8);//cover parallel off shape
                    }
                } else if(getTileEntityMeta(world,x+1,y,z)==8 && getTileEntityMeta(world,x+1,y,z-1)==6) {
                    if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 0) {
                        return EnumRailDirection.byMetadata(0);//cover parallel entering from wrong end on straight
                    } else if (cart.getEntityData().getInteger("tim.lastusedrail.meta") == 9) {
                        return EnumRailDirection.byMetadata(6);//cover parallel off shape
                    }
                }
                changed = true;
                break;
            }
            default: {
                changed = false;
            }
        }
        //note changes in the entity so we can keep track of whether or not this is an intersection
        if (changed){
            cart.getEntityData().setInteger("tim.lastusedrail.meta",meta);
            cart.getEntityData().setInteger("tim.lastusedrail.x",x);
            cart.getEntityData().setInteger("tim.lastusedrail.z",z);
        }
        return EnumRailDirection.byMetadata(meta);
    }

    public int getTileEntityMeta(IBlockAccess w, int x, int y, int z){
        if(getTileEntity(w,x,y,z) instanceof RailTileEntity){
            return ((RailTileEntity) getTileEntity(w,x,y,z)).getMeta();
        }
        return -1;
    }

    @Override
    public void onBlockAdded(World p_149726_1_, BlockPos pos, IBlockState state) {
        updateNearbyShapes(p_149726_1_, pos.getX(),pos.getY(),pos.getZ());

        if (this.isPowered) {
            this.updateNearbyShapes(p_149726_1_, pos.getX(),pos.getY(),pos.getZ());
        }
    }


    @Override
    public Material getMaterial(IBlockState state){
        return Blocks.IRON_BLOCK.getMaterial(Blocks.IRON_BLOCK.getDefaultState());
    }


    @Override
    public boolean canPlaceBlockAt(World p_149742_1_, BlockPos pos) {
        return true;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        if(world.getTileEntity(pos) instanceof RailTileEntity) {
            XmlBuilder xml =((RailTileEntity) world.getTileEntity(pos)).getData();
            return ItemRail.setStackData(
                    new ItemStack(TiMItems.railItem, 1), xml.getItemStack("rail"),
                    xml.getItemStack("ballast"), xml.getItemStack("ties"), xml.getItemStack("wires"));
        } else {
            return null;
        }
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
    }



    @Override
    public void onNeighborChange(IBlockAccess worldObj, BlockPos block, BlockPos other) {
        updateNearbyShapes((World) worldObj,block.getX(),block.getY(),block.getZ());
    }


    @Override
    public void breakBlock(World p_149749_1_, BlockPos pos, IBlockState state) {
        if(p_149749_1_!=null && !p_149749_1_.isRemote){
            EntityPlayer p = p_149749_1_.getClosestPlayer(pos.getX(),pos.getY(),pos.getZ(),6, false);
            if(p!=null && p.capabilities!=null && !p.capabilities.isCreativeMode) {
                TileEntity e = p_149749_1_.getTileEntity(pos);
                if (e instanceof RailTileEntity && p_149749_1_.getGameRules().getBoolean("doTileDrops")) {
                    ((RailTileEntity) e).dropItem();
                }
            }
        }
        if(p_149749_1_!=null) {
            p_149749_1_.getChunk(pos.getX() >> 4, pos.getZ() >> 4)
                    .removeTileEntity(new BlockPos(pos.getX() & 15, pos.getY(), pos.getZ() & 15));
        }
    }

    public void updateNearbyShapes(World world, int xCoord, int yCoord, int zCoord){
        //update the meta of just this rail
        new RailData(world,xCoord,yCoord,zCoord).rebuildRailMeta();

        //rails above and below the current rail don't always get updated because of how vanilla handles updating nearby blocks.
        // force it.
        for(int x : updateMatrix) {
            for (int z : updateMatrix) {
                new RailData(world,xCoord+x,yCoord+1,zCoord+z).rebuildRailMeta();
                new RailData(world,xCoord+x,yCoord-1,zCoord+z).rebuildRailMeta();
            }
        }

        //update all the other nearby rails.
        TileEntity te;
        for(int x : updateMatrix){
            for(int z : updateMatrix){
                for(int y : updateMatrix){
                    te=getTileEntity(world,x+xCoord,y+yCoord,z+zCoord);
                    if(te instanceof RailTileEntity && ((RailTileEntity) te).getData()!=null){
                        RailShapeCore.processPoints(x+xCoord,y+yCoord, z+zCoord,world,
                                getShape(world, x+xCoord,y+yCoord, z+zCoord),
                                ((RailTileEntity) te).getData());
                    }
                }
            }
        }
    }

    //override this to provide a different gauge
    public void updateShape(int xPos, int yPos, int zPos, World worldObj, ItemStack rail, @Nullable ItemStack ties, @Nullable ItemStack ballast, @Nullable ItemStack wires){
        RailShapeCore.processPoints(xPos, yPos, zPos, getShape(worldObj, xPos, yPos, zPos),gaugemm, renderScale, worldObj, rail, ties, ballast, wires);
    }



    public static RailSimpleShape getShape(World worldObj, int xPos, int yPos, int zPos){
        if(!(CommonUtil.getBlockAt(worldObj, xPos,yPos,zPos) instanceof BlockRailCore)){
            return null;
        }
        TileEntity te= worldObj.getTileEntity(new BlockPos(xPos,yPos,zPos));
        if(!(te instanceof RailTileEntity)){
            te = new RailTileEntity();
            te.setPos(new BlockPos(xPos,yPos,zPos));
        }
        switch (((RailTileEntity)te).getMeta()){
            //Z straight
            case 0: {
                return RailVanillaShapes.vanillaZStraight(worldObj, xPos, yPos, zPos);
            }
            //X straight
            case 1: {
                return RailVanillaShapes.vanillaXStraight(worldObj, xPos, yPos, zPos);
            }

            //curves
            case 9: {
                return RailVanillaShapes.vanillaCurve9(worldObj, xPos, yPos, zPos);
            }
            case 8: {
                return RailVanillaShapes.vanillaCurve8(worldObj, xPos, yPos, zPos);
            }
            case 7: {
                return RailVanillaShapes.vanillaCurve7(worldObj, xPos, yPos, zPos);
            }
            case 6: {
                return RailVanillaShapes.vanillaCurve6(worldObj, xPos, yPos, zPos);
            }
            //Z slopes
            case 5 :{
                return RailVanillaShapes.vanillaSlopeZ5(worldObj, xPos, yPos, zPos);
            }
            case 4 :{
                return RailVanillaShapes.vanillaSlopeZ4(worldObj, xPos, yPos, zPos);
            }
            //X slopes
            case 2 :{
                return RailVanillaShapes.vanillaSlopeX2(worldObj, xPos, yPos, zPos);
            }
            case 3 :{
                return RailVanillaShapes.vanillaSlopeX3(worldObj, xPos, yPos, zPos);
            }
        }
        return null;
    }


    /**
     * checks an array of blocks for a specific class and meta to check if the shape should be made.
     * @param world
     * @return boolean for if the shape can be made
     */
    public static boolean checkBlockMeta(World world, int xCoord, int yCoord, int zCoord, int ... meta){
        if (!world.getChunkProvider().isChunkGeneratedAt(xCoord/16, zCoord/16) ||
                !(CommonUtil.getBlockAt(world, xCoord,yCoord,zCoord) instanceof BlockRailBase)){
            return false;
        }else {
            int block = getRailMeta(world, xCoord, yCoord, zCoord,null);
            for (int m : meta) {
                if (m==block){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Simplifies getting rail metadata for a block, returns -1 is the block is not a rail.
     * in 1.8+ this will have to change to returning the expected int based on the block state, or the getBasicRailMetadata for TiM rails
     */
    public static int getRailMeta(IBlockAccess world, int x, int y, int z, @Nullable EntityMinecart cart){
        if(!(CommonUtil.getBlockAt((World) world,x,y,z) instanceof BlockRailBase)){
            return -1;
        }
        return CommonUtil.getRailMeta(world, cart,x,y,z);
    }


    public static int[] getNearbyMeta(World world, int xCoord, int yCoord, int zCoord){
        int[] meta = new int[9];
        int i=0;
        for(int z=-1;z<2;z++){
            for(int x=-1;x<2;x++){
                meta[i]= getRailMeta(world, xCoord+x,yCoord,zCoord+z,null);
                i++;
            }
        }
        return meta;
    }

    @Deprecated //this was a quick lazy way to do this, should replace with a more proper thing later.
    private static TileEntity getTileEntity(IBlockAccess world, int x, int y, int z){
        return world.getTileEntity(new BlockPos(x,y,z));
    }



    /*@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return Blocks.RAIL.getIcon(0, 0);
    }*/


    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return -1;
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    protected String getTextureName() {
        Blocks.flowing_water.getTextureName();
    }*/

}
