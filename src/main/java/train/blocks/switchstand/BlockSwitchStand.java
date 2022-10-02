package train.blocks.switchstand;

import ebf.tim.blocks.BlockSwitch;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.Traincraft;

public class BlockSwitchStand extends BlockSwitch {

	public BlockSwitchStand() {
		super(Material.ROCK, false);
		setCreativeTab(Traincraft.tcTab);
		this.setTickRandomly(true);
	}


	public TileEntity createTileEntity(World world, int metadata) {
		return new TileSwitchStand(this);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileSwitchStand(this);
	}
}
