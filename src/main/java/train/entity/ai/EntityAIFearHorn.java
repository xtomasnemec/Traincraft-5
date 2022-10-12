package train.entity.ai;

import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.utility.CommonUtil;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EntityAIFearHorn extends EntityAIBase{
	
	private EntityAnimal entity;
    private double randPosX;
    private double randPosY;
    private double randPosZ;
	
	public EntityAIFearHorn(EntityAnimal e) {
		entity = e;
        this.setMutexBits(1);
	}

	@Override
	public boolean shouldExecute() {
		if(entity.getAttackTarget() instanceof EntityPlayer &&
                (entity.getAttackTarget().getRidingEntity() instanceof EntityTrainCore || entity.getAttackTarget().getRidingEntity() instanceof EntitySeat)) {
			entity.detachHome();
            Vec3d vec3 = RandomPositionGenerator.
                    findRandomTargetBlockAwayFrom(entity, 10, 8,
                            new Vec3d(entity.getAttackTarget().posX, entity.getAttackTarget().posY, entity.getAttackTarget().posZ));

            if (vec3 == null)
            {
                return false;
            } else {
                this.randPosX = vec3.x;
                this.randPosY = vec3.y;
                this.randPosZ = vec3.z;
    			entity.setAttackTarget(null);
                return true;
            }
		}
		return false;
	}
	
    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
    	tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, 2.0D);
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting() {
        return !this.entity.getNavigator().noPath();
    }
    
    /**
     * Returns the path to the given coordinates
     */
    private Path getPathToXYZ(double x, double y, double z) {
        return getEntityPathToXYZ(CommonUtil.floorDouble(x), (int)y, CommonUtil.floorDouble(z),
                (int)entity.getNavigator().getPathSearchRange()+8, false, false, false);
    }

    /**
     * Try to find and set a path to XYZ. Returns true if successful.
     */
    private boolean tryMoveToXYZ(double x, double y, double z, double speed) {
        if(entity==null || entity.getNavigator()==null){
            return false;
        }
        PathEntity pathentity = this.getPathToXYZ((double)CommonUtil.floorDouble(x), (double)((int)y), (double)CommonUtil.floorDouble(z));
        return entity.getNavigator().setPath(pathentity, speed);
    }
    
    private Path getEntityPathToXYZ(int targetX, int targetY, int targetZ, int range, boolean canPassOpenDoor, boolean canPassClosedDoor, boolean canSwim) {
        return new PathFinder(null).findPath(entity.world, entity,new BlockPos(targetX,targetY,targetZ),range);
    }
}
