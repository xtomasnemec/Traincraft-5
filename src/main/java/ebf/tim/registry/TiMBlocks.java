package ebf.tim.registry;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.rails.BlockRailCore;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import train.library.Info;

import static ebf.tim.registry.TiMGenericRegistry.registerBlock;

public class TiMBlocks {

    /**the crafting table for trains*/
    public static BlockDynamic trainTable = new BlockDynamic(new Material(MapColor.WOOD),true, 0); //tier 0 = "no tier"

    public static BlockDynamic railTable = new BlockDynamic(new Material(MapColor.IRON),true);

    public static BlockRailCore railBlock = new BlockRailCore(750,1f);


    public static void registerBlocks(){
        trainTable.setTextureName(TrainsInMotion.MODID +":textures/blocks/train_table.png");
        railTable.setTextureName(TrainsInMotion.MODID +":textures/blocks/rail_table.png");

        registerBlock(railBlock, null, TrainsInMotion.MODID,"block.timrail", null, TrainsInMotion.proxy.getTESR());

        //register the train crafting table
        GameRegistry.addShapedRecipe(new ResourceLocation(TrainsInMotion.MODID,"traintable"), new ResourceLocation(TrainsInMotion.MODID, "crafters"),
                new ItemStack(registerBlock(trainTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.traintable", null, null),1),
                "WWW", "WIW", "WWW", 'W', Blocks.PLANKS, 'I', Items.IRON_INGOT); //original

        GameRegistry.addShapedRecipe(new ResourceLocation(TrainsInMotion.MODID,"railtable"), new ResourceLocation(TrainsInMotion.MODID, "crafters") ,
                new ItemStack(registerBlock(railTable, TrainsInMotion.creativeTab, TrainsInMotion.MODID,"block.railtable", null, null),1),
                "IRI", "WCW", "WWW", 'I', Items.IRON_INGOT, 'W', Blocks.PLANKS, 'C', Blocks.CRAFTING_TABLE, 'R', Blocks.RAIL);

        trainTable.setHardness(3);
        railTable.setHardness(3);

        railBlock.setHardness(0.7f);
        railBlock.setResistance(0.7f);
    }
}
