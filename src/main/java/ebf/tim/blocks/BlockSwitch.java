package ebf.tim.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSwitch extends BlockDynamic {


    public BlockSwitch(Material material, boolean isStorage) {
        super(material, isStorage);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }


    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileSwitch(this);
    }


    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        } else {

            TileSwitch t = (TileSwitch)world.getTileEntity(pos);
            if(t!=null){
                t.toggleEnabled(0);
                world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "random.click", 0.3F, t.getStrength(0)>0 ? 0.6F : 0.5F);
                world.notifyBlocksOfNeighborChange(x, y, z, this);
            }

            return true;
        }
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        world.notifyNeighborsOfStateChange(pos, this, false);
        super.breakBlock(world, pos, state);
    }


    @Override
    public int getWeakPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return getStrongPower(state,world,pos,side);
    }

    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int meta) {
        TileSwitch t = (TileSwitch)world.getTileEntity(x,y,z);
        if(t!=null && t.getStrength(0)>0){
            return 15;
        }
        return 0;
    }
    @Override
    public boolean canProvidePower(IBlockState state) {
        return true;
    }


    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos,state);
        TileSwitch te = (TileSwitch) world.getTileEntity(pos);
        if (te !=null) {
            te.setStrength(0,0);
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos other) {
        super.neighborChanged(state, world, pos, block, other);
    }
}
