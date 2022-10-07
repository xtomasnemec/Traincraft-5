package train.blocks.signal;

import ebf.tim.blocks.BlockSignal;
import ebf.tim.blocks.TileSwitch;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class TileTCSignal extends TileSwitch {

	public TileTCSignal() {
		super();
	}

	public TileTCSignal(BlockSignal block){
		host=block;
	}

	@Override
	public void update() {
		super.update();
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

		List list = this.getWorld().getEntitiesWithinAABB(EntityMinecart.class, new AxisAlignedBB(
				this.pos.getX() + x4, this.pos.getY()-1, this.pos.getZ() + x5,
				(this.pos.getX() + x1), (this.pos.getY() + 1), (this.pos.getZ() + x3))
				.expand(1.0D, 2.0D, 1.0D));

		if (list != null && list.size() > 0) {
			for (Object o : list) {
				if (o instanceof EntityMinecart) {
					setEnabled(true);
					return;
				}
			}
		}
	}
}