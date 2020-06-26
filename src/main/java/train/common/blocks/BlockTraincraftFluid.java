package train.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import train.common.library.Info;

public class BlockTraincraftFluid extends BlockFluidClassic {
	
	//@SideOnly(Side.CLIENT)
	//protected ModelResourceLocation[] theIcon;
	protected boolean flammable;
	protected int flammability = 0;	

	public BlockTraincraftFluid(Fluid fluid, Material material) {
		super(fluid, material);
	}

	/*@Override
	public IIcon getIcon(int side, int meta) {
		return this.theIcon != null ? side != 0 && side != 1 ? this.theIcon[1] : this.theIcon[0] : null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.theIcon = new IIcon[]{iconRegister.registerIcon(Info.modID.toLowerCase() + ":liquid_" + fluidName), iconRegister.registerIcon(Info.modID.toLowerCase() +":liquid_" + fluidName + "_flow")};
	}*/

	public BlockTraincraftFluid setFlammable(boolean flammable) {
		this.flammable = flammable;
		return this;
	}

	public BlockTraincraftFluid setFlammability(int flammability) {
		this.flammability = flammability;
		return this;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return flammable ? 300 : 0;
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return flammability;
	}

	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return flammable;
	}

	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
		return flammable && flammability == 0;
	}

	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		return  (world.getBlockState(pos).getBlock().getMaterial().isLiquid() && super.canDisplace(world, pos));
	}
	
	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		return (!world.getBlockState(pos).getBlock().getMaterial().isLiquid() && super.displaceIfPossible(world, pos));
	}
	
	@Override
	public String getUnlocalizedName() {
		return "fluid." + Info.modID + ":" + fluidName;
	}
}
