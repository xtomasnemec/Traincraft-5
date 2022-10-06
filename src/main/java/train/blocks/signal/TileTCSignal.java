package train.blocks.signal;

import ebf.tim.blocks.TileSwitch;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

//client
public class TileTCSignal extends TileSwitch {

	public TileTCSignal() {
		super();
	}

	@Override
	public void updateEntity() {
		super.updateEntity();
		//check if given redstone signal, let that override normal detection.
		if(getEnabled()){
			return;
		}

		int x1 = 1;// x2
		int x3 = 1;// z2
		int x4 = 1;// x1
		int x5 = 1;// z1

		switch (this.facing) {
			case 2: {
				x4 = -1;
				x5 = -9;
				x1 = 1;
				x3 = 1;
				break;
			}

			case 3: {
				x3 = 9;
				x1 = 1;
				x4 = -1;
				x5 = 1;
				break;
			}

			case 4: {
				x4 = -9;
				x5 = -1;
				x1 = 1;
				x3 = 1;
				break;
			}

			case 5: {
				x3 = 1;
				x1 = 9;
				x4 = 1;
				x5 = -1;
				break;
			}
		}

		List list = this.worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getBoundingBox(
				this.xCoord + x4, this.yCoord, this.zCoord + x5,
				(this.xCoord + x1), (this.yCoord + 1), (this.zCoord + x3))
				.expand(1.0D, 1.0D, 1.0D));

		if (list != null && list.size() > 0) {
			Entity entity;
			for (Object o : list) {
				entity = (Entity) o;
				if (entity instanceof EntityMinecart) {
					setEnabled(true);
					return;
				}
			}
		}
	}
}