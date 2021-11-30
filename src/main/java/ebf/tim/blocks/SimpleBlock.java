package ebf.tim.blocks;

import ebf.tim.TrainsInMotion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleBlock extends Block {
    public SimpleBlock(float hardness, float resistance, String unlocalizedName, String texture) {
        super(Material.ROCK);

        setHardness(hardness);
        setResistance(resistance);
        setTranslationKey(unlocalizedName);
        setBlockTextureName(texture);
        setHarvestLevel("pickaxe", 2); //iron pick for all blocks

        setCreativeTab(TrainsInMotion.creativeTab);
        GameRegistry.registerBlock(this, unlocalizedName);
    }
}
