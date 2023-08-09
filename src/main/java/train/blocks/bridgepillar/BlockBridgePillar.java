/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks.bridgepillar;

import depreciated.minecraft.util.IIcon;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import train.Traincraft;
import train.library.Info;

public class BlockBridgePillar extends BlockDynamic {

	private IIcon texture;

	public BlockBridgePillar() {
		super(Material.WOOD, false);
		setCreativeTab(Traincraft.tcTab);
	}


	@Override
	public IIcon getIcon(int i, int j) {
		return texture;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new tilePillar(this);
	}
	

	/*@Override
	@OnlyIn(Dist.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		texture = iconRegister.registerIcon(Info.modID.toLowerCase() + ":assembly_1_bottom");
	}*/
}