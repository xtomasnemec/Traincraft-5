package train.common.entity.zeppelin;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import train.common.library.ItemIDs;

public class EntityZeppelinTwoBalloons extends AbstractZeppelin{
	
	public EntityZeppelinTwoBalloons(World world) {
		super(world);
	}
	public EntityZeppelinTwoBalloons(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}
	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote || isDead) {
			return true;
		}
		boatRockDirection = -boatRockDirection;
		boatTimeSinceHit = 10;
		boatCurrentDamage += i * 10;
		if (damagesource.getEntity() instanceof EntityPlayer) {
			if (damagesource.getEntity() instanceof EntityPlayer && ((EntityPlayer) damagesource.getEntity()).capabilities.isCreativeMode) {
				this.boatCurrentDamage = 1000;
			}
		}
		setBeenAttacked();
		if (boatCurrentDamage > 40) {
			if (damagesource.getEntity() instanceof EntityPlayer && !(((EntityPlayer) damagesource.getEntity()).capabilities.isCreativeMode)) {
				dropItem(ItemIDs.airship.item, 1);
			}
			setDead();
		}
		return true;
	}
	@Override
	public String getName() {
		return "Zeppelin Two Balloons";
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {

	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {

	}
}
