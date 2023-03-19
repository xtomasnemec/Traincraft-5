package ebf.tim.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.DebugUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * <h1>Core Transport Item</h1>
 * this re-useable item is intended to work as an automation to create items for evert train and rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemTransport extends Item {

    /**the list of strings to use for the item description*/
    private final List<String> subtext = new ArrayList<>();
    /**the class for the entity*/
    private final Class<? extends GenericRailTransport> transport;
    public List<TrainsInMotion.transportTypes> types =null;
    private ResourceLocation itemTexture;

    @SideOnly(Side.CLIENT)
    GenericRailTransport entity;
    /**the main constructor.
     * @param cart the class for the entity*/
    public ItemTransport(GenericRailTransport cart, String MODID, CreativeTabs tabs) {
        super();
        setTranslationKey(cart.transportName().replace(" ",""));
        if(TrainsInMotion.proxy.isClient()) {
            setItemLore(cart);
        }
        transport=cart.getClass();
        setRegistryName(MODID+":textures/items/transports/"+getTranslationKey());
        itemTexture=new ResourceLocation(MODID, "textures/items/transports/"+getTranslationKey().toLowerCase() +".png");
        setCreativeTab(tabs);
        if(TrainsInMotion.proxy.isClient()){
            entity=cart;
        }
    }

    @SideOnly(Side.CLIENT)
    public void setItemLore(GenericRailTransport cart){
        if(cart.transportYear()!=null) {
            subtext.add(ChatFormatting.GRAY + t("menu.item.year") + ": " + cart.transportYear());
        }
        if(cart.transportcountry()!=null) {
            subtext.add(ChatFormatting.GRAY + t("menu.item.country") + ": " +
                    t("menu.item." + cart.transportcountry().toLowerCase()));
        }

        if(cart.transportFuelType()!=null && !cart.transportFuelType().equals("")) {
            subtext.add(ChatFormatting.RED + t("menu.item.fueltype") + ": " +
                    t("menu.item."+cart.transportFuelType().toLowerCase()));
        }
        if(cart.getTypes()!=null && cart.getTypes().size()>0){
            types=cart.getTypes();
            StringBuilder s = new StringBuilder();
            subtext.add(ChatFormatting.RED + t("menu.item.types")+":");
            boolean b=false;
            for(TrainsInMotion.transportTypes type : cart.getTypes()){
                if(type.isTrain()) {
                    s.append(t("menu.item.locomotive")+", ");
                    b=true;
                    break;
                }
            }
            if(!b){
                s.append(t("menu.item.rollingstock")+", ");
            }

            for(TrainsInMotion.transportTypes type : cart.getTypes()){
                if(type.isTrain()) {
                    continue;
                }
                s.append(t("menu.item."+type.name())).append(", ");
            }
            s.delete(s.lastIndexOf(", "),s.length());

            subtext.add(ChatFormatting.RED +s.toString());
        }
        subtext.add(ChatFormatting.GREEN + t("menu.item.weight") +": " + cart.weightKg() + "kg");
        if (cart.transportTopSpeed()!=0){
            subtext.add(ChatFormatting.GREEN + t("menu.item.speed") +": " + cart.transportTopSpeed() +" km/h");

            if (cart.transportMetricHorsePower() !=0){
                subtext.add(ChatFormatting.GREEN +t("menu.item.mhp") +": " + cart.transportMetricHorsePower());
            }
            if (cart.transportTractiveEffort() != 0){
                subtext.add(ChatFormatting.GREEN + t("menu.item.tractiveeffort") +": " + cart.transportTractiveEffort() + " lbf");
            }
        }
        if(cart.getInventoryRows()>0){
            subtext.add(ChatFormatting.BLUE +t("menu.item.isizeof")+ ": " + (cart.getInventoryRows()*9) + " " + t("menu.item.slots"));
        }
        if(cart.getRiderOffsets()!=null){
            subtext.add(ChatFormatting.BLUE +t("menu.item.seats")+ ": " + cart.getRiderOffsets().length);
        }
        if (cart.isFictional()){
            subtext.add(ChatFormatting.WHITE +t("menu.item.fictional"));
        }

        if (cart.additionalItemText()!=null){
            for (String s : cart.additionalItemText()) {
                if(!s.equals("")) {
                    subtext.add(ChatFormatting.LIGHT_PURPLE + s);
                }
            }
        }
    }

    /**
     * <h2>description text</h2>
     * this modifies the functionality of showing description text. in this case we're just adding more.
     * @param par1ItemStack the itemstack of which text is being displayed.
     * @param par2EntityPlayer the player holding said itemstack.
     * @param par3List the list of strings to define the description. rather than using \n like normal people, forge decided it a good idea to make each string in the array a new line.
     * @param par4 I have no idea what this is.
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, World w,List<String> par3List, ITooltipFlag par4) {
        par3List.addAll(subtext);
    }

    /**
     * <h2>place transport</h2>
     * this will place the transport in world, and decrease, or null, the itemstack if placement actually worked.
     * on the off chance the transport failed to cast to the proper class it will be printed to the log, the issue should ALWAYS be the fault of the transport's class.
     */
    @Override
    public EnumActionResult onItemUseFirst(EntityPlayer playerEntity, World worldObj, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        try {
            if(CommonUtil.placeOnRail(transport.getConstructor(UUID.class, World.class, double.class, double.class, double.class)
                    .newInstance(playerEntity.getUniqueID(), worldObj, pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D), playerEntity, playerEntity.getHeldItem(hand), worldObj, pos.getX(),pos.getY(),pos.getZ())){
                if (!playerEntity.capabilities.isCreativeMode) {
                    playerEntity.getHeldItem(hand).shrink(1);
                    if (playerEntity.getHeldItem(hand).getCount() <= 0) {
                        playerEntity.setHeldItem(hand, ItemStack.EMPTY);
                    }
                }
                return EnumActionResult.SUCCESS;
            }
            return EnumActionResult.FAIL;
        } catch (Exception e){
        	if(DebugUtil.dev){
            	e.printStackTrace();
        	}
        	DebugUtil.log("Failed to cast : " + transport.toString() + "to a new generic transport entity");
        }
        return EnumActionResult.SUCCESS;
    }

    private static String t(String translate){
        return CommonUtil.translate(translate);
    }

    public ResourceLocation getIconResource() {
        return itemTexture;
    }
}
