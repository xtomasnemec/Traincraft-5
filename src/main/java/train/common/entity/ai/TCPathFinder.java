package train.common.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.pathfinder.NodeProcessor;

public class TCPathFinder extends PathFinder{

	public TCPathFinder(IBlockAccess worldMap) {
		super(new NodeProcessor() {
            @Override
            public PathPoint getPathPointTo(Entity entityIn) {
                return null;
            }

            @Override
            public PathPoint getPathPointToCoords(Entity entityIn, double x, double y, double target) {
                return null;
            }

            @Override
            public int findPathOptions(PathPoint[] pathOptions, Entity entityIn, PathPoint currentPoint, PathPoint targetPoint, float maxDistance) {
                return 0;
            }
        });
	}

	/*@Override
    public int getVerticalOffset(Entity entity, BlockPos pos, PathPoint point)
    {
        return getVertical(entity, x, y, z, point);
    }

    public static int getVertical(Entity entity, int x, int y, int z, PathPoint point)
    {
        boolean flag3 = false;

        for (int i = x; i < x + point.xCoord; ++i)
        {
            for (int j = y; j < y + point.yCoord; ++j)
            {
                for (int k = z; k < z + point.zCoord; ++k)
                {
                    Block block = entity.worldObj.getBlockState(new BlockPos(i, j, k)).getBlock();

                    if (block.getMaterial() != Material.air && !(block instanceof BlockTCRail) && !(block instanceof BlockTCRailGag))
                    {
                        if (block == Blocks.trapdoor)
                        {
                            flag3 = true;
                        }
                        else if (block != Blocks.flowing_water && block != Blocks.water)
                        {
                            if (block == Blocks.oak_door /*|| other doors*/ /*)
                            {
                                return 0;
                            }
                        }
                        else
                        {

                            flag3 = true;
                        }

                        int k1 = block.getRenderType();

                        if (entity.worldObj.getBlockState(new BlockPos(i, j, k)).getBlock().getRenderType() == 9)
                        {
                            int j2 = MathHelper.floor_double(entity.posX);
                            int l1 = MathHelper.floor_double(entity.posY);
                            int i2 = MathHelper.floor_double(entity.posZ);

                            if (entity.worldObj.getBlockState(new BlockPos(j2, l1, i2)).getBlock().getRenderType() != 9 && entity.worldObj.getBlockState(new BlockPos(j2, l1 - 1, i2)).getBlock().getRenderType() != 9)
                            {
                                return -3;
                            }
                        }
                        else if (!block.getBlocksMovement(entity.worldObj, i, j, k))
                        {
                            if (k1 == 11 || block == Blocks.oak_fence_gate || k1 == 32)
                            {
                                return -3;
                            }

                            if (block == Blocks.trapdoor)
                            {
                                return -4;
                            }

                            Material material = block.getMaterial();

                            if (material != Material.lava)
                            {
                                return 0;
                            }

                            if (!entity.isInLava())
                            {
                                return -2;
                            }
                        }
                    }
                }
            }
        }

        return flag3 ? 2 : 1;
    }*/
}
