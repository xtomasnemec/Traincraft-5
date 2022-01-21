package ebf.tim.blocks;

import depreciated.minecraft.util.IIcon;
import ebf.tim.TrainsInMotion;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <h2>Fluid Block</h2>
 * similar to the vanilla fluid block, but allows setting for flammable fluids.
 * TODO: it may be possible to use this to house all the fluid data, meaning bucket, fluid, and block.
 *
 * @author Eternal Blue Flame
 */
public class BlockTrainFluid extends BlockFluidClassic {
    /**the texture for the block, the first value is the top and bottom, the second is for the sides.*/
    @SideOnly(Side.CLIENT)
    private IIcon[] sidedTexture;
    private String modID= TrainsInMotion.MODID;
    /**returns if this is flammable*/
    private boolean flammable = false;
    /**returns the flammability of this*/
    private int flammability = 0;

    public BlockTrainFluid(Fluid fluid, Material material) {
        super(fluid, material);
    }

    /**
     * <h3>define texture</h3>
     * uses the sidedTexture to define the texture for the block.
     */
    /*@Override
    public IIcon getIcon(int side, int meta) {
        if (this.sidedTexture == null){
            return null;
        }
        return side != 0 && side != 1 ? this.sidedTexture[1] : this.sidedTexture[0];
    }*/

    public void setModID(String id){
        modID=id;
    }

    /**
     * <h3>Register iicon</h3>
     * used to register the icon for the block.
     */
    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.sidedTexture = new IIcon[]{iconRegister.registerIcon(modID+":fluids/"+fluidName), iconRegister.registerIcon(modID+":fluids/"+fluidName +"_flow")};
    }*/

    /**
     * <h3>flammability</h3>
     * allows you to set the flammability of the block, this allows for a check if it can be set on fire and if it is the source of the fire.
     * similar to lava.
     * The following functions use this information to define how the fire spreads.
     */
    public BlockTrainFluid setFlammable(boolean flammable, int flammability) {
        this.flammable = flammable;
        this.flammability = flammability;
        return this;
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {return flammable ? 300 : 0;}

    @Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {return flammability;}

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return flammable;
    }

    @Override
    public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {return flammable && flammability == 0;}

    /**
     * disable host tick system
     *
    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        int fluidHeight = quantaPerBlock - this.getMetaFromState(state);
        int newHeight = -101;

        // check adjacent block levels if non-source
        if (fluidHeight < quantaPerBlock) {
            int y2 =  densityDir;

            if (CommonUtil.getBlockAt(world, pos.getX(),y2,pos.getZ()) == this ||
                    CommonUtil.getBlockAt(world, pos.getX() - 1, y2, pos.getZ()) == this ||
                    CommonUtil.getBlockAt(world,pos.getX() + 1, y2, pos.getZ()) == this ||
                    CommonUtil.getBlockAt(world,pos.getX(),y2, pos.getZ() - 1) == this ||
                    CommonUtil.getBlockAt(world,pos.getX(), y2, pos.getZ() + 1) == this)
            {
                newHeight = quantaPerBlock - 1;
            } else {
                int maxQuanta = -100;
                maxQuanta = getLargerQuanta(world, new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), maxQuanta);
                maxQuanta = getLargerQuanta(world, new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), maxQuanta);
                maxQuanta = getLargerQuanta(world, new BlockPos(pos.getX(),pos.getY(), pos.getZ() - 1), maxQuanta);
                maxQuanta = getLargerQuanta(world, new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), maxQuanta);

                newHeight = maxQuanta - 1;
            }

            // decay calculation
            if (newHeight != fluidHeight) {
                fluidHeight = newHeight;

                if (newHeight <= 0) {
                    CommonUtil.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), Blocks.AIR);
                } else {
                    CommonUtil.setBlockMeta(world, pos.getX(), pos.getY(), pos.getZ(), quantaPerBlock - newHeight);
                    world.scheduleBlockUpdate(pos, this, tickRate,3);
                    world.notifyNeighborsOfStateChange(pos, this, true);
                }
            }
        }
        // This is a "source" block, set meta to zero, and send a server only update
        else if (fluidHeight != quantaPerBlock) {
            CommonUtil.setBlockMeta(world, pos.getX(), pos.getY(), pos.getZ(), quantaPerBlock - newHeight);
            world.scheduleBlockUpdate(pos, this, tickRate,2);
            world.notifyNeighborsOfStateChange(pos, this, true);
        }

        // Flow vertically if possible
        if (canDisplace(world, new BlockPos(pos.getX(), pos.getY() + densityDir, pos.getZ()))) {
            flowIntoBlock(world, new BlockPos(pos.getX(), pos.getY() + densityDir, pos.getZ()), 1);
            return;
        }

        // Flow outward if possible
        int flowMeta = quantaPerBlock - fluidHeight + 1;
        if (flowMeta >= quantaPerBlock) {
            return;
        }

        if (isSourceBlock(world, pos) || !isFlowingVertically(world, pos)) {
            if (CommonUtil.getBlockAt(world,pos.getX(), pos.getY() + densityDir, pos.getZ()) == this) {
                flowMeta = 1;
            }
            boolean[] flowTo = getOptimalFlowDirections(world, pos);

            if (flowTo[0]) flowIntoBlock(world, new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()),flowMeta);
            if (flowTo[1]) flowIntoBlock(world, new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()),flowMeta);
            if (flowTo[2]) flowIntoBlock(world, new BlockPos(pos.getX(),pos.getY(), pos.getZ() - 1), flowMeta);
            if (flowTo[3]) flowIntoBlock(world, new BlockPos(pos.getX(),pos.getY(), pos.getZ() + 1), flowMeta);
        }

    }

    @Override
    protected boolean[] getOptimalFlowDirections(World world, BlockPos pos) {
        int x2,z2;
        for (int side = 0; side < 4; side++) {
            flowCost[side] = 1000;

            x2 = pos.getX();
            z2 = pos.getZ();

            switch (side) {
                case 0: --x2; break;
                case 1: ++x2; break;
                case 2: --z2; break;
                case 3: ++z2; break;
            }

            if (!canFlowInto(world, new BlockPos(x2, pos.getY(), z2)) || isSourceBlock(world, new BlockPos(x2, pos.getY(), z2))) {
                continue;
            }

            if (canFlowInto(world, new BlockPos(x2, pos.getY() + densityDir, z2))) {
                flowCost[side] = 0;
            }
            else {
                flowCost[side] = calculateFlowCost(world, new BlockPos(x2, pos.getY(), z2), 1, side);
            }
        }

        int min = Math.min(Math.min(flowCost[0], flowCost[1]), Math.min(flowCost[2], flowCost[3]));
        for (int side = 0; side < 4; side++) {
            isOptimalFlowDirection[side] = flowCost[side] == min;
        }
        return isOptimalFlowDirection;
    }

    @Override
    protected int calculateFlowCost(World world, BlockPos pos, int recurseDepth, int side) {
        int cost = 1000, x2, z2;
        for (int adjSide = 0; adjSide < 4; adjSide++) {
            if ((adjSide == 0 && side == 1) ||
                    (adjSide == 1 && side == 0) ||
                    (adjSide == 2 && side == 3) ||
                    (adjSide == 3 && side == 2)) {
                continue;
            }

            x2 = pos.getX();
            z2 = pos.getZ();

            switch (adjSide) {
                case 0: --x2; break;
                case 1: ++x2; break;
                case 2: --z2; break;
                case 3: ++z2; break;
            }

            if (!canFlowInto(world, new BlockPos(x2, pos.getY(), z2)) || isSourceBlock(world, new BlockPos(x2, pos.getY(), z2))) {
                continue;
            }

            if (canFlowInto(world, new BlockPos(x2, pos.getY() + densityDir, z2))) {
                return recurseDepth;
            }

            if (recurseDepth >= 4) {
                continue;
            }

            cost=Math.min(cost, calculateFlowCost(world, new BlockPos(x2, pos.getY(), z2), recurseDepth + 1, adjSide));
        }
        return cost;
    }

    @Override
    protected void flowIntoBlock(World world, BlockPos pos, int meta) {
        if (meta>=0 && displaceIfPossible(world, pos)) {
            CommonUtil.setBlock(world, pos.getX(), pos.getY(), pos.getZ(), this, meta);
        }
    }

    @Override
    protected boolean canFlowInto(IBlockAccess world, BlockPos pos) {
        IBlockState block = world.getBlockState(pos);
        if (block.getBlock().isAir(block,world,pos) || block.getBlock() == this){
            return true;
        } else if (displacements.containsKey(block.getBlock())) {
            return displacements.get(block.getBlock());
        } else if (block.getMaterial().blocksMovement()  ||
                block.getMaterial() == Material.WATER ||
                block.getMaterial() == Material.LAVA  ||
                block.getMaterial() == Material.PORTAL)
        {
            return false;
        }

        int density = getDensity(world, pos);

        return density == Integer.MAX_VALUE || this.density > density;
    }

    @Override
    protected int getLargerQuanta(IBlockAccess world, BlockPos pos, int compare) {
        if (world.isAirBlock(pos) || world.getBlockState(pos).getBlock() != this){
            return compare;
        } else {
            return Math.max(quantaPerBlock - world.getBlockState(pos).getValue(LEVEL), compare);
        }
    }*/


}
