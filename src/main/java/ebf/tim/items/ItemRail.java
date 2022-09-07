package ebf.tim.items;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.RailTileEntity;
import ebf.tim.blocks.rails.BlockRailCore;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMItems;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.DebugUtil;
import mods.railcraft.api.items.ITrackItem;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * <h1>Key Item</h1>
 * the key used to allow people other than the owner to interact with a locked train or rollingstock.
 * @author Eternal Blue Flame
 */
public class ItemRail extends Item implements ITrackItem {

    public ItemRail(){}

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Deprecated
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(world.isRemote || player==null || player.getHeldItem(hand).getCount()==0){return EnumActionResult.FAIL;}
        int x=pos.getX(),y=pos.getY(),z=pos.getZ();
        net.minecraft.block.Block block = CommonUtil.getBlockAt(world, x, y, z);

        //for use from item, unlike external use, we want to give the player ability to "place ahead"
        if(block instanceof BlockRailBase){
            if (facing==EnumFacing.UP){//side 1/up
                int rotation = CommonUtil.floorDouble(player.rotationYawHead * 4.0F / 360.0F + 0.5D) & 3;
                switch (rotation){
                    case 0:{z++;
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){return EnumActionResult.FAIL;}
                        break;
                    }//south
                    case 1:{x--;
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){return EnumActionResult.FAIL;}}//west
                    break;
                    case 2:{z--;
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){z--;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){return EnumActionResult.FAIL;}}//north
                    break;
                    case 3:{x++;
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){x++;}
                        if(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockRailBase){return EnumActionResult.FAIL;}}//east
                }

            } else {//only allow placing on top of a block
                return EnumActionResult.FAIL;
            }
        } else {//if it's not a track block, then the Y position will be too low, raise it one.
            y++;
        }

        //now be sure the player can place there, and the chunk position is loaded
        if (!player.canPlayerEdit(new BlockPos(x,y,z), facing, player.getHeldItem(hand)) ||
                !world.getChunkProvider().isChunkGeneratedAt(x>>4, z>>4)) {
            return EnumActionResult.FAIL;
        }

        //continue with normal placement
        placeTrack(player.getHeldItem(hand), world, x, y, z,player);
        return EnumActionResult.SUCCESS;
    }

    public boolean isPlacedTileEntity(ItemStack stack, TileEntity tile){
        return tile.getClass() == RailTileEntity.class;
    }

    public net.minecraft.block.Block getPlacedBlock(){
        return TiMBlocks.railBlock;
    }

    //redirect for 3rd party mods
    public boolean placeTrack(ItemStack stack, World world, int x, int y, int z){
        return placeTrack(stack, world, x, y, z, null);
    }

    /**
     * normal placement
     * this is meant mainly for add-ons like railcraft, and tools like the track builder
     */
    public boolean placeTrack(ItemStack stack, World world, int x, int y, int z, @Nullable EntityPlayer p){
        if(world.isRemote){return true;}
        net.minecraft.block.Block block = CommonUtil.getBlockAt(world, x, y, z);
        BlockPos pos = new BlockPos(x,y,z);

        if (!(world.isSideSolid(pos.down(),EnumFacing.UP))){
            return false;
        }

        if(block.isReplaceable(world, pos) || block instanceof IPlantable){
            block.dropBlockAsItem(world, pos, world.getBlockState(pos),0);
            world.setBlockToAir(pos);
        }
        world.removeTileEntity(pos);

        if (world.mayPlace(getPlacedBlock(),pos, false, EnumFacing.UP, p)) {

            if (CommonUtil.setBlock(world, x, y, z, getPlacedBlock(), 0)) {
                if (CommonUtil.getBlockAt(world, x, y, z) == getPlacedBlock()) {
                    getPlacedBlock().onBlockPlacedBy(world, pos, world.getBlockState(pos),p, stack);
                    ((BlockRailCore) CommonUtil.getBlockAt(world, x, y, z)).updateShape(x, y, z, world,
                            //set rail
                            stack.getTagCompound().getTag("rail")!=null?
                                    new ItemStack(stack.getTagCompound().getCompoundTag("rail")):
                                    new ItemStack(Items.IRON_INGOT),
                            //set ties
                            stack.getTagCompound().getTag("ties")!=null?
                                    new ItemStack(stack.getTagCompound().getCompoundTag("ties")):
                                    null,

                            //set ballast
                            stack.getTagCompound().getTag("ballast")!=null?
                                    new ItemStack(stack.getTagCompound().getCompoundTag("ballast")):
                                    null,

                            //set wires
                            stack.getTagCompound().getTag("wires")!=null?
                                    new ItemStack(stack.getTagCompound().getCompoundTag("wires")):
                                    null
                    );
                }

                world.playSound(p,x + 0.5F, y + 0.5F, z + 0.5F, getPlacedBlock().getSoundType().getStepSound(), SoundCategory.BLOCKS ,(getPlacedBlock().getSoundType().getVolume() + 1.0F) / 2.0F, getPlacedBlock().getSoundType().getPitch() * 0.8F);
                getPlacedBlock().onBlockPlacedBy(world, pos,world.getBlockState(pos),p,stack);
                stack.shrink(1);
            }
        }

        return true;
    }

    /**
     * <h2>Description text</h2>
     * Allows items to add custom lines of information to the mouseover description, by adding new lines to stringList.
     * Each string added defines a new line.
     * We can cover the key and ticket description here, to simplify other classes.
     */
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> stringList, ITooltipFlag flagIn) {

        if(stack.hasTagCompound()){
            if(stack.getTagCompound().hasKey("rail")) {
                stringList.add(CommonUtil.translate("menu.rails") + " " + new ItemStack(stack.getTagCompound().getCompoundTag("rail")).getDisplayName());
            } else {
                stringList.add("default rails");
            }

            //todo: for some reason i ill never understand, the lang file returns ties and ballast backwards.
            if(stack.getTagCompound().hasKey("ballast") && new ItemStack(stack.getTagCompound().getCompoundTag("ballast")).getItem()!=Items.AIR) {
                stringList.add(CommonUtil.translate("menu.ballast") + " " + new ItemStack(stack.getTagCompound().getCompoundTag("ballast")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noballast"));
            }
            if(stack.getTagCompound().hasKey("ties") && new ItemStack(stack.getTagCompound().getCompoundTag("ties")).getItem()!=Items.AIR) {
                stringList.add(CommonUtil.translate("menu.ties")+ " " + new ItemStack(stack.getTagCompound().getCompoundTag("ties")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noties"));
            }

            if(stack.getTagCompound().hasKey("wires") && new ItemStack(stack.getTagCompound().getCompoundTag("wires")).getItem()!=Items.AIR) {
                stringList.add(CommonUtil.translate("menu.wires") + " " +new ItemStack(stack.getTagCompound().getCompoundTag("wires")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.nowires"));
            }
        }
    }

    public static ItemStack setStackData(ItemStack stack, ItemStack ingot, ItemStack ballast, ItemStack ties, ItemStack wires){
        //init stack NBT
        NBTTagCompound stackTag = new NBTTagCompound();
        //make a blank tag, write the item to it, then put it into the stack tag
        if(ingot!=null && ingot.getItem()!=null) {
            NBTTagCompound r =new NBTTagCompound();
            ingot.writeToNBT(r);
            stackTag.setTag("rail", r);
        }

        //rinse and repeat
        if(ties!=null && ties.getItem()!=null && !isItemBanned(ties)) {
            NBTTagCompound t =new NBTTagCompound();
            ties.writeToNBT(t);
            stackTag.setTag("ties", t);
        }
        if(ballast!=null && ballast.getItem()!=null && !isItemBanned(ballast)) {
            NBTTagCompound b =new NBTTagCompound();
            ballast.writeToNBT(b);
            stackTag.setTag("ballast", b);
        }
        if(wires!=null && wires.getItem()!=null && !isItemWires(wires)) {
            NBTTagCompound w =new NBTTagCompound();
            wires.writeToNBT(w);
            stackTag.setTag("wires", w);
        }
        //set the stack tag to the actual stack
        stack.setTagCompound(stackTag);
        return stack;
    }

    public static boolean isItemWires(ItemStack s){
        return true;
    }

    public static boolean isItemBanned(ItemStack s){
        return CommonUtil.stringContains(s.getItem().delegate.name().getPath(),"chisel") || Block.getBlockFromItem(s.getItem()).hasTileEntity();
    }

    //adds custom versions of this to the creative menu, with the necessary NBT and metadata
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubItems(CreativeTabs p_150895_2_, NonNullList<ItemStack> tabItems) {
        if(p_150895_2_== TrainsInMotion.creativeTab) {
            for (Item ingot : new Item[]{Items.IRON_INGOT, Items.GOLD_INGOT}) {
                for (Block b : new Block[]{null, Blocks.GRAVEL, Blocks.STONE}) {
                    for (Block t : new Block[]{Blocks.LOG, Blocks.PLANKS, Blocks.STONE, null})
                        tabItems.add(setStackData(new ItemStack(TiMItems.railItem), new ItemStack(ingot), new ItemStack(b), new ItemStack(t), null));
                }
            } else {
                tabItems.add(new ItemStack(p_150895_1_));
            }
        }
    }
}