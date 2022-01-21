package ebf.tim.items;

import ebf.tim.blocks.RailTileEntity;
import ebf.tim.blocks.rails.BlockRailCore;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.utility.CommonUtil;
import mods.railcraft.api.items.ITrackItem;
import net.minecraft.block.*;
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
        if(world.isRemote){return EnumActionResult.PASS;}
        net.minecraft.block.Block block = CommonUtil.getBlockAt(world, pos.getX(), pos.getY(),pos.getZ());
        int x = pos.getX(), y=pos.getY(),z=pos.getZ();
        ItemStack stack = player.getHeldItem(hand);

        int meta = facing.getIndex();
        if (block != Blocks.VINE && block != Blocks.TALLGRASS && block != Blocks.DEADBUSH){
            switch (meta) {
                case 0:{--y;break;}
                case 1:{++y;break;}
                case 2:{--z;break;}
                case 3:{++z;break;}
                case 4:{--x;break;}
                case 5:{++x;break;}
            }
        }

        if(block instanceof BlockRailBase){
            if(meta==0) {
                return EnumActionResult.FAIL;
            } else if (meta==1){
                y--;
                int rotation = MathHelper.floor((player!=null?player.rotationYawHead:hitZ) * 4.0F / 360.0F + 0.5D) & 3;
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

            }
        }

        if (!player.canPlayerEdit(new BlockPos(x,y,z), facing, stack) || stack.getCount()==0 ||
        !world.getChunkProvider().isChunkGeneratedAt(
                x>>4, z>>4)) {
            return EnumActionResult.FAIL;
        } else {
            if(!(CommonUtil.getBlockAt(world, x,y,z) instanceof BlockAir)){
                //replaceable covers things like fluids, IPlantable and IGrowable cover things like grass and flowers
                if(!CommonUtil.getBlockAt(world, x,y,z).isReplaceable(world,new BlockPos(x,y,z))
                        && !(block instanceof IPlantable) && !(block instanceof IGrowable)){
                    return EnumActionResult.FAIL;
                } else if (block != Blocks.VINE && block != Blocks.TALLGRASS && block != Blocks.DEADBUSH) {
                    //if it is replaceable, try to spawn the dropped item.
                    List<ItemStack> blockStacks = CommonUtil.getBlockAt(world, x,y,z).getDrops(world,new BlockPos(x,y,z),world.getBlockState(new BlockPos(x,y,z)),0);
                    for(ItemStack stak : blockStacks){
                        world.spawnEntity(new EntityItem(world,x,y+0.5,z, stak));
                    }
                }
            }

            if (CommonUtil.setBlock(world,x,y,z, getPlacedBlock(), 0)) {
                getPlacedBlock().onBlockPlacedBy(world, new BlockPos(x,y,z), world.getBlockState(new BlockPos(x,y,z)), player, stack);
                if (CommonUtil.getBlockAt(world, x,y,z) == getPlacedBlock()) {
                    getPlacedBlock().onBlockPlacedBy(world, new BlockPos(x,y,z),world.getBlockState(new BlockPos(x,y,z)), player, stack);

                    ((BlockRailCore)CommonUtil.getBlockAt(world, x,y,z)).updateShape(x,y,z,world,
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

                world.playSound(player,x + 0.5F, y + 0.5F, z + 0.5F, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, (getPlacedBlock().getSoundType().getVolume() + 1.0F) / 2.0F, getPlacedBlock().getSoundType().getPitch() * 0.8F);
                stack.shrink(1);
            }
            return EnumActionResult.SUCCESS;
        }
    }

    public boolean isPlacedTileEntity(ItemStack stack, TileEntity tile){
        return tile.getClass() == RailTileEntity.class;
    }

    public net.minecraft.block.Block getPlacedBlock(){
        return TiMBlocks.railBlock;
    }


    public boolean placeTrack(ItemStack stack, @Nullable EntityPlayer player, World world, BlockPos pos, @Nullable BlockRailBase.EnumRailDirection trackShape){
        if(world.isRemote){return true;}

        int x = pos.getX(), y=pos.getY(),z=pos.getZ();
        net.minecraft.block.Block block = CommonUtil.getBlockAt(world, x, y, z);

        if (!(world.isSideSolid(new BlockPos(x, y, z),EnumFacing.UP))){
            return false;
        }

        if(block.isReplaceable(world, new BlockPos(x, y+1, z)) || block instanceof BlockFlower || block == Blocks.DOUBLE_PLANT || block instanceof BlockMushroom){
            block.dropBlockAsItem(world, new BlockPos(x, y+1, z), world.getBlockState(new BlockPos(x, y+1, z)), 0);
        }


        if (world.mayPlace(getPlacedBlock(),new BlockPos(x,y,z), false, EnumFacing.UP, player)) {
            getPlacedBlock().onBlockPlacedBy(world, new BlockPos(x, y, z), block.getDefaultState(), player,stack);

            if (CommonUtil.setBlock(world,x, y, z, getPlacedBlock(), 0)) {
                if (CommonUtil.getBlockAt(world, x, y, z) == getPlacedBlock()) {
                    //if you got the item with a null NBT, you messed up,
                    // but thanks to forge/mojank we gotta compensate for what was impossible in 1.7.
                    if(stack.getTagCompound()==null){
                        ((BlockRailCore) CommonUtil.getBlockAt(world, x, y, z)).updateShape(x, y, z, world,
                                new ItemStack(Items.IRON_INGOT),null,null,null);
                    } else {
                        ((BlockRailCore) CommonUtil.getBlockAt(world, x, y, z)).updateShape(x, y, z, world,
                                //set rail
                                stack.getTagCompound().getTag("rail") != null ?
                                        new ItemStack(stack.getTagCompound().getCompoundTag("rail")) :
                                        new ItemStack(Items.IRON_INGOT),
                                //set ties
                                stack.getTagCompound().getTag("ties") != null ?
                                        new ItemStack(stack.getTagCompound().getCompoundTag("ties")) :
                                        null,

                                //set ballast
                                stack.getTagCompound().getTag("ballast") != null ?
                                        new ItemStack(stack.getTagCompound().getCompoundTag("ballast")) :
                                        null,

                                //set wires
                                stack.getTagCompound().getTag("wires") != null ?
                                        new ItemStack(stack.getTagCompound().getCompoundTag("wires")) :
                                        null
                        );
                    }
                }

                world.playSound(player,x + 0.5F, y + 0.5F, z + 0.5F, SoundEvents.BLOCK_METAL_PLACE, SoundCategory.BLOCKS, (getPlacedBlock().getSoundType().getVolume() + 1.0F) / 2.0F, getPlacedBlock().getSoundType().getPitch() * 0.8F);
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
    public void addInformation(ItemStack stack, EntityPlayer player, List stringList, boolean p_77624_4_) {


        if( stack.hasTagCompound()){
            if(stack.getTagCompound().hasKey("rail")) {
                stringList.add(CommonUtil.translate("menu.rails") + " " + new ItemStack(stack.getTagCompound().getCompoundTag("rail")).getDisplayName());
            } else {
                stringList.add("default rails");
            }

            //todo: for some reason i ill never understand, the lang file returns ties and ballast backwards.
            if(stack.getTagCompound().hasKey("ballast")) {
                stringList.add(CommonUtil.translate("menu.ballast")+ " " + new ItemStack(stack.getTagCompound().getCompoundTag("ballast")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noballast"));
            }
            if(stack.getTagCompound().hasKey("ties")) {
                stringList.add(CommonUtil.translate("menu.ties")+ " " + new ItemStack(stack.getTagCompound().getCompoundTag("ties")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.noties"));
            }

            if(stack.getTagCompound().hasKey("wires")) {
                stringList.add(CommonUtil.translate("menu.wires") + " " +new ItemStack(stack.getTagCompound().getCompoundTag("wires")).getDisplayName());
            } else {
                stringList.add(CommonUtil.translate("menu.nowires"));
            }
        }
    }

    public static ItemStack setStackData(ItemStack stack, ItemStack ingot, ItemStack ballast, ItemStack ties, ItemStack wires){
        //init stack NBT
        stack.setTagCompound(new NBTTagCompound());
        //add a tag for the stack then put the stack in it.
        if(ingot!=null && ingot.getItem()!=null) {
            stack.getTagCompound().setTag("rail", new NBTTagCompound());
            ingot.writeToNBT(stack.getTagCompound().getCompoundTag("rail"));
        }

        //rinse and repeat
        if(ties!=null && ties.getItem()!=null && !isItemBanned(ties)) {
            stack.getTagCompound().setTag("ties",new NBTTagCompound());
            ties.writeToNBT(stack.getTagCompound().getCompoundTag("ties"));
        } else if(ties!=null && ties.getItem()!=null){
            return null;
        }
        if(ballast!=null && ballast.getItem()!=null && !isItemBanned(ballast)) {
            stack.getTagCompound().setTag("ballast",new NBTTagCompound());
            ballast.writeToNBT(stack.getTagCompound().getCompoundTag("ballast"));
        } else if(ballast!=null && ballast.getItem()!=null){
            return null;
        }
        if(wires!=null && wires.getItem()!=null && !isItemWires(wires)) {
            stack.getTagCompound().setTag("wires",new NBTTagCompound());
            wires.writeToNBT(stack.getTagCompound().getCompoundTag("wires"));
        } else if(wires!=null && wires.getItem()!=null){
            return null;
        }
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
        for(Item ingot : new Item[]{Items.IRON_INGOT, Items.GOLD_INGOT}){
            for(Block b : new Block[]{null, Blocks.GRAVEL, Blocks.STONE}){
                for(Block t : new Block[]{Blocks.LOG, Blocks.PLANKS, Blocks.DOUBLE_STONE_SLAB, null})
                tabItems.add(setStackData(new ItemStack(TiMBlocks.railBlock),new ItemStack(ingot), new ItemStack(b),new ItemStack(t), null));
            }
        }
    }
}