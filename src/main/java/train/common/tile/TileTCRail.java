package train.common.tile;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import train.common.items.ItemTCRail;

import java.util.ArrayList;
import java.util.List;

public class TileTCRail extends TileEntity implements ITickable {

	public double r;
	public double cx;
	public double cy;
	public double cz;
	public double slopeHeight;
	public double slopeLength;
	public double slopeAngle;
	private String type;
	private int facingMeta;
	public boolean isLinkedToRail = false;
	public int linkedX;
	public int linkedY;
	public int linkedZ;
	public boolean hasModel = true;
	private boolean switchActive = false;
	/** stores the latest redstone state */
	public boolean previousRedstoneState;
	public boolean canTypeBeModifiedBySwitch = false;
	private boolean manualOverride = false;
	private int updateTicks;
	private int updateTicks2;
	public Item		idDrop;
	private static final float f = 0.125F;
	public boolean hasRotated = false;
	private int isLeftFlag = -5;

	public TileTCRail() {
		if(this.worldObj != null)
			facingMeta = this.getBlockMetadata();
	}

	public int getFacing() {

		return facingMeta;
	}

	public void setFacing(int facing) {

		this.facingMeta = facing;
	}

	public void setType(String type) {
		worldObj.markBlockForUpdate(pos);
		this.type = type;
	}

	public String getType() {

		return this.type;
	}

	private ItemTCRail.TrackTypes renderType = null;
	public ItemTCRail.TrackTypes getTrackType(){
		if (renderType == null && hasModel && getType() != null){
			for(ItemTCRail.TrackTypes rail : ItemTCRail.TrackTypes.values()){
				if (rail.getLabel().equals(getType())){
					renderType = rail;
				}
			}
		}
		return renderType;
	}

	public boolean getSwitchState() {

		return switchActive;
	}

	public void printInfo() {
		System.out.println(type);
		System.out.println(getSwitchState());
		System.out.println(ItemTCRail.isTCStraightTrack(this));
	}

	@Override
	public void update() {
		if (worldObj.isRemote || !canTypeBeModifiedBySwitch) {

			return;
		}

		updateTicks2++;

		/*if (updateTicks2 % 20 == 0 && !isLinkedToRail && getType() != null && getType().equals(TrackTypes.SMALL_STRAIGHT.getLabel()) && !hasRotated) {
			TileEntity tileNorth = worldObj.getBlockTileEntity(pos.getX(), pos.getY(),pos.getZ() - 1);
			TileEntity tileSouth = worldObj.getBlockTileEntity(pos.getX(), pos.getY(),pos.getZ() + 1);
			TileEntity tileEast = worldObj.getBlockTileEntity(pos.getX() + 1, pos.getY(), pos.getZ());
			TileEntity tileWest = worldObj.getBlockTileEntity(pos.getX() - 1, pos.getY(), pos.getZ());
			if (tileNorth != null && (tileNorth instanceof TileTCRail)) {//&& (tileNorth.getBlockMetadata() == 2 || tileNorth.getBlockMetadata() == 0)) {
				worldObj.setBlockMetadataWithNotify(pos.getX(), pos.getY(),pos.getZ(), 2, 2);
				hasRotated = true;
			}
			if (tileSouth != null && (tileSouth instanceof TileTCRail)) {//&& (tileSouth.getBlockMetadata() == 0 || tileSouth.getBlockMetadata() == 2)) {
				worldObj.setBlockMetadataWithNotify(pos.getX(), pos.getY(),pos.getZ(), 0, 2);
				hasRotated = true;
			}
			if (tileEast != null && (tileEast instanceof TileTCRail)) {// && ( tileEast.getBlockMetadata() == 3 || tileEast.getBlockMetadata() == 1)) {
				worldObj.setBlockMetadataWithNotify(pos.getX(), pos.getY(),pos.getZ(), 3, 2);
				hasRotated = true;
			}
			if (tileWest != null && (tileWest instanceof TileTCRail)) {//&& ( tileWest.getBlockMetadata() == 1 || tileWest.getBlockMetadata() == 3)) {
				worldObj.setBlockMetadataWithNotify(pos.getX(), pos.getY(),pos.getZ(), 1, 2);
				hasRotated = true;
			}
		}*/

		if (updateTicks2 % 11 == 0) {
			updateTicks2 =0;
			TileEntity tile1 = null;

			switch (worldObj.getBlockState(pos).getBlock().getMetaFromState(worldObj.getBlockState(pos))) {

				case 0: {
					tile1 = worldObj.getTileEntity(new BlockPos(pos.getX(), pos.getY(),pos.getZ() - 1));
					break;
				}
				case 1: {
					tile1 = worldObj.getTileEntity(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()));
					break;
				}
				case 2: {
					tile1 = worldObj.getTileEntity(new BlockPos(pos.getX(), pos.getY(),pos.getZ() + 1));
					break;
				}
				case 3: {
					tile1 = worldObj.getTileEntity(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()));
					break;
				}
			}
			if (tile1 instanceof TileTCRail && ItemTCRail.isTCSwitch((TileTCRail) tile1)) {

				TileTCRail tileSwitch = (TileTCRail) tile1;
				boolean flag1 = 15<worldObj.isBlockIndirectlyGettingPowered(new BlockPos(pos.getX(), pos.getY(),pos.getZ()));

				if (tileSwitch.previousRedstoneState != flag1 && ! (15<worldObj.isBlockIndirectlyGettingPowered(tileSwitch.pos))) {

					tileSwitch.changeSwitchState(worldObj, tileSwitch, tile1.getPos().getX(), tile1.getPos().getY(), tile1.getPos().getZ());
					tileSwitch.previousRedstoneState = flag1;
				}
			}
			/*
			 * if (tile2 != null && tile2 instanceof TileTCRail &&
			 * ItemTCRail.isTCSwitch((TileTCRail) tile2)) { TileTCRail
			 * tileSwitch = (TileTCRail) tile2; boolean flag1 =
			 * worldObj.isBlockIndirectlyGettingPowered(pos.getX(), pos.getY(),
			 * pos.getZ()); boolean flag2 =
			 * worldObj.isBlockIndirectlyGettingPowered(tileSwitch.pos.getX(),
			 * tileSwitch.pos.getY(), tileSwitch.pos.getZ());
			 * //System.out.println(flag2+" flag2"); //boolean switchState2
			 * = tileSwitch.getSwitchState(); if
			 * (tileSwitch.previousRedstoneState != flag1 && !flag2) {
			 * tileSwitch.changeSwitchState(worldObj, tile2, tile2.pos.getX(),
			 * tile2.pos.getY(), tile2.pos.getZ()); tileSwitch.previousRedstoneState
			 * = flag1; } }
			 */
		}

		if (manualOverride) {

			updateTicks++;

			if (updateTicks > 60) {
				List list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(pos.getX() + f,
						pos.getY(), pos.getZ() + f, pos.getX() + 1 - f, pos.getY() + 1 - f, pos.getZ() + 1 - f));

				if (list.isEmpty()) {

					manualOverride = false;
					//setSwitchState(false,false);
					// worldObj.setBlockMetadataWithNotify(pos.getX(), pos.getY(),pos.getZ(), facingMeta, 2);
					// System.out.println("X: " + pos.getX() + " Y: " + pos.getY() + " Z: " + pos.getZ());
					changeSwitchState(worldObj, this, pos.getX(), pos.getY(),pos.getZ());
					setSwitchState(previousRedstoneState, false);
					updateTicks = 0;
				} else {
					updateTicks -=20;
				}
			}
		}

		if (!getSwitchState() && updateTicks2 % 10 ==0) {

			/* Right-handed switch types create a value of 1, left-handed switch types a value of type -1. If neither cases match, value is set to 0. */
			if (isLeftFlag == -5) {
				if (ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel().equals(type) || ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel().equals(type) || ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel().equals(type)){
					isLeftFlag =1;
				} else if (ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel().equals(type) || ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel().equals(type) || ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel().equals(type)){
					isLeftFlag = -1;
				} else {
					isLeftFlag=0;
				}
			}

			if (isLeftFlag != 0) {
				List list;

				switch (facingMeta) {

					case 0: {
						if (isLeftFlag == 1) {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() - 2.0D, this.pos.getY(), this.pos.getZ() + 2.0D, this.pos.getX() - f, this.pos.getY() + 1.0D - f, this.pos.getZ() + 2.0D - f));
						} else {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() + 1.0D, this.pos.getY(), this.pos.getZ() + 1.0D, this.pos.getX() + 2.0D - f, this.pos.getY() + 1.0D - f, this.pos.getZ() + 2.0D - f));
						}
						break;
					}
					case 1: {
						if (isLeftFlag == 1) {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() - 1.0D, this.pos.getY(), this.pos.getZ() - 1.0D, this.pos.getX() - f, this.pos.getY() + 1.0D - f, this.pos.getZ() - f));
						} else {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() - 1.0D, this.pos.getY(), this.pos.getZ() + 1.0D, this.pos.getX() - f, this.pos.getY() + 1.0D - f, this.pos.getZ() + 2.0D - f));
						}
						break;
					}
					case 2: {
						if (isLeftFlag == 1) {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() + 1.0D, this.pos.getY(), this.pos.getZ() - 1.0D, this.pos.getX() + 2.0D - f, this.pos.getY() + 1.0D - f, this.pos.getZ() - f));
						} else {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() - 1.0D, this.pos.getY(), this.pos.getZ() - 1.0D, this.pos.getX() - f, this.pos.getY() + 1.0D - f, this.pos.getZ() - f));
						}
						break;
					}
					case 3: {
						if (isLeftFlag == 1) {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() + 1.0D, this.pos.getY(), this.pos.getZ() + 1.0D, this.pos.getX() + 3.0D - f, this.pos.getY() + 1.0D - f, this.pos.getZ() + 2.0D - f));
						} else {

							list = worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.fromBounds(this.pos.getX() + 1.0D, this.pos.getY(), this.pos.getZ() - 1.0D, this.pos.getX() + 3.0D - f, this.pos.getY() + 1.0 - f, this.pos.getZ() - f));
						}
						break;
					}
					default: {
						list = new ArrayList();
						break;
					}
				}
				if (!list.isEmpty()) {

					changeSwitchState(worldObj, this, pos.getX(), pos.getY(),pos.getZ());
					setSwitchState(true, true);
				}
			}
		}
	}

	public void setSwitchState(boolean state, boolean manualOverride) {
		previousRedstoneState = 15<worldObj.isBlockIndirectlyGettingPowered(pos);
		this.switchActive = state;
		this.manualOverride = manualOverride;

		if (manualOverride) {
			updateTicks = 0;
		}

		this.markDirty();
		this.worldObj.markBlockForUpdate(this.pos);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		facingMeta = nbt.getByte("Orientation");
		r = nbt.getDouble("r");
		cx = nbt.getDouble("cx");
		cy = nbt.getDouble("cy");
		cz = nbt.getDouble("cz");
		cy = nbt.getDouble("cy");
		slopeHeight = nbt.getDouble("slopeHeight");
		slopeLength = nbt.getDouble("slopeLength");
		slopeAngle = nbt.getDouble("slopeAngle");
		linkedX = nbt.getInteger("linkedX");
		linkedY = nbt.getInteger("linkedY");
		linkedZ = nbt.getInteger("linkedZ");
		String tempType = nbt.getString("type");
		if (tempType != null) {
			type = tempType;
		} else {
			type = ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel();
		}
		/**
		 * Hacky TC Code to fix already placed slopes
		 */
		if (type.equals(ItemTCRail.TrackTypes.SLOPE_WOOD.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.SLOPE_GRAVEL.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.SLOPE_BALLAST.getLabel())) {
			slopeAngle = 0.13;
		}
		
		if (type.equals(ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST.getLabel())) {
			slopeAngle = 0.0666;
		}
		
		if (type.equals(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL.getLabel())
				|| type.equals(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST.getLabel())) {
			slopeAngle = 0.0444;
		}
		isLinkedToRail = nbt.getBoolean("isLinkedToRail");
		hasModel = nbt.getBoolean("hasModel");
		switchActive = nbt.getBoolean("switchActive");
		canTypeBeModifiedBySwitch = nbt.getBoolean("canTypeBeModifiedBySwitch");
		manualOverride = nbt.getBoolean("manualOverride");
		idDrop = Item.getItemById(nbt.getInteger("idDrop"));
		hasRotated = nbt.getBoolean("hasRotated");
		previousRedstoneState = nbt.getBoolean("previousRedstoneState");
		super.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setDouble("r", r);
		nbt.setDouble("cx", cx);
		nbt.setDouble("cy", cy);
		nbt.setDouble("cz", cz);
		nbt.setDouble("slopeHeight", slopeHeight);
		nbt.setDouble("slopeLength", slopeLength);
		nbt.setDouble("slopeAngle", slopeAngle);
		nbt.setInteger("linkedX", linkedX);
		nbt.setInteger("linkedY", linkedY);
		nbt.setInteger("linkedZ", linkedZ);
		if (type != null) {
			nbt.setString("type", type);
		}
		nbt.setBoolean("isLinkedToRail", isLinkedToRail);
		nbt.setBoolean("hasModel", hasModel);
		nbt.setBoolean("switchActive", switchActive);
		nbt.setBoolean("canTypeBeModifiedBySwitch", canTypeBeModifiedBySwitch);
		nbt.setBoolean("manualOverride", manualOverride);
		nbt.setBoolean("hasRotated", hasRotated);
		nbt.setInteger("idDrop", Item.getIdFromItem(idDrop));
		nbt.setBoolean("previousRedstoneState", previousRedstoneState);
		super.writeToNBT(nbt);
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.pos, 1, nbt);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
		this.readFromNBT(pkt.getNbtCompound());
		super.onDataPacket(net, pkt);
	}

	public void changeSwitchState(World world, TileTCRail tileEntity, int i, int j, int k) {
		if (tileEntity.getType() != null && (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()))) {
			if (tileEntity.getSwitchState()) {
				tileEntity.setSwitchState(false, false);
				if (tileEntity.getBlockMetadata() == 2) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i, j, k - 1));
					if (te1 != null) {
						((TileTCRail) te1).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k - 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 0) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i, j, k + 1));
					if (te1 instanceof TileTCRail) {
						((TileTCRail) te1).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k + 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 1) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i - 1, j, k));
					if (te1 != null) {
						((TileTCRail) te1).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(new BlockPos(i - 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 3) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i + 1, j, k));
					if (te1 != null) {
						((TileTCRail) te1).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel()) || tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							TileEntity te2 = world.getTileEntity(new BlockPos(i + 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.SMALL_STRAIGHT.getLabel());
						}
					}
				}
			}
			else if (!tileEntity.getSwitchState()) {
				tileEntity.setSwitchState(true, false);
				if (tileEntity.getBlockMetadata() == 2) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i, j, k - 1));
					if (te1 != null) {
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k - 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k - 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k - 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k - 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
						}

					}
				}
				if (tileEntity.getBlockMetadata() == 0) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i, j, k + 1));
					if (te1 != null) {
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k + 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k + 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k + 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i, j, k + 2));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 1) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i - 1, j, k));
					if (te1 != null) {
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i - 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i - 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i - 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i - 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
				if (tileEntity.getBlockMetadata() == 3) {
					TileEntity te1 = world.getTileEntity(new BlockPos(i + 1, j, k));
					if (te1 != null) {
						if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_RIGHT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i + 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.MEDIUM_LEFT_PARALLEL_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i + 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.MEDIUM_LEFT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_RIGHT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i + 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_RIGHT_TURN.getLabel());
						}
						else if (tileEntity.getType().equals(ItemTCRail.TrackTypes.LARGE_LEFT_SWITCH.getLabel())) {
							((TileTCRail) te1).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
							TileEntity te2 = world.getTileEntity(new BlockPos(i + 2, j, k));
							if (te2 != null) ((TileTCRail) te2).setType(ItemTCRail.TrackTypes.LARGE_LEFT_TURN.getLabel());
						}
					}
				}
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 16384.0D;
	}
}
