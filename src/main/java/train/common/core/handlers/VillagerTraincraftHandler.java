package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import train.common.generation.ComponentVillageTrainstation;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;

import java.util.List;
import java.util.Random;

public class VillagerTraincraftHandler implements VillagerRegistry.IVillageCreationHandler, IMerchant {
	EntityPlayer customer=null;
	MerchantRecipeList recipes;
	//private Random rand = new Random();
	@Override
	public void setRecipes(MerchantRecipeList recipeList) {
		Random random = new Random();
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Blocks.rail, random,20), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,20), new ItemStack(Blocks.rail)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Blocks.activator_rail, random,4), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,4), new ItemStack(Blocks.activator_rail)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Blocks.detector_rail, random,4), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,4), new ItemStack(Blocks.detector_rail)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Blocks.golden_rail, random,10), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,10), new ItemStack(Blocks.golden_rail)));
		
		recipeList.add(new MerchantRecipe(getRandomSizedStack(Blocks.clay, random,10), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,10), new ItemStack(Blocks.brick_block)));

		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.minecart, random,2), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,2), new ItemStack(Items.minecart)));

		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.chest_minecart, random,4), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,4), new ItemStack(Items.chest_minecart)));

		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.hopper_minecart, random,1), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,1), new ItemStack(Items.hopper_minecart)));

		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.furnace_minecart, random,2), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,2), new ItemStack(Items.furnace_minecart)));

		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.tnt_minecart, random,1), Items.emerald));
		recipeList.add(new MerchantRecipe(getRandomSizedItemStack(Items.emerald, random,1), new ItemStack(Items.tnt_minecart)));
		
		for(ItemIDs item : ItemIDs.values()){
			if(item!=null && item.item!=null){
				if(item.item instanceof ItemRollingStock){
					recipeList.add(new MerchantRecipe(new ItemStack(item.item), new ItemStack(Items.emerald,item.amountForEmerald)));
					recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald,item.amountForEmerald), item.item));
				}else if(item.amountForEmerald>0){
					recipeList.add(new MerchantRecipe(new ItemStack(item.item,item.amountForEmerald), Items.emerald));
					recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald), new ItemStack(item.item,item.amountForEmerald)));
				}
			}
		}

		recipes=recipeList;
	}
	private ItemStack getRandomSizedStack(Block par0, Random random, int amount)
    {
        return new ItemStack(par0, random.nextInt(amount)+1, 0);
    }
	private ItemStack getRandomSizedItemStack(Item par0, Random random, int amount)
	{
		return new ItemStack(par0, random.nextInt(amount)+1, 0);
	}
	
	@Override
	public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random random,
																	int size) {
		 return new StructureVillagePieces.PieceWeight(ComponentVillageTrainstation.class, 15, MathHelper.getRandomIntegerInRange(random, size, 1 + size));
	}
	@Override
	public Class<?> getComponentClass() {
		return ComponentVillageTrainstation.class;
	}


	@Override
	public StructureVillagePieces.Village buildComponent(StructureVillagePieces.PieceWeight villagePiece, StructureVillagePieces.Start startPiece, List<StructureComponent> pieces, Random random, int p1,
														 int p2, int p3, EnumFacing facing, int p5){
		return ComponentVillageTrainstation.buildComponent(startPiece, pieces, random, p1, p2, p3, facing, p5);

	}

	@Override
	public void setCustomer(EntityPlayer p_70932_1_) {
		customer=p_70932_1_;
	}

	@Override
	public EntityPlayer getCustomer() {
		return customer;
	}

	@Override
	public MerchantRecipeList getRecipes(EntityPlayer p_70934_1_) {
		return recipes;
	}


	@Override
	public void useRecipe(MerchantRecipe recipe) {
		//todo: i dont think this is necessary??
	}

	/**
	 * Notifies the merchant of a possible merchantrecipe being fulfilled or not. Usually, this is just a sound byte
	 * being played depending if the suggested itemstack is not null.
	 *
	 * @param stack
	 */
	@Override
	public void verifySellingItem(ItemStack stack) {

	}

	/**
	 * Get the formatted ChatComponent that will be used for the sender's username in chat
	 */
	@Override
	public IChatComponent getDisplayName() {
		return new ChatComponentText("Traincraft Villager");
	}
}
