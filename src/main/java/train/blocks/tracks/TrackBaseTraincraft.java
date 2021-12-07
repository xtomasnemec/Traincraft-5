/**
 * This is based on Railcraft's code
 * @author CovertJaguar
 */
package train.blocks.tracks;

import com.mojang.authlib.GameProfile;
import mods.railcraft.api.tracks.IOutfittedTrackTile;
import mods.railcraft.api.tracks.ITrackKitInstance;
import mods.railcraft.api.tracks.TrackRegistry;
import mods.railcraft.api.tracks.TrackType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityMinecart;
import depreciated.minecraft.util.IIcon;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class TrackBaseTraincraft extends Block implements IOutfittedTrackTile {

	public SpeedController speedController;

	public TrackBaseTraincraft(Material materialIn) {
		super(materialIn);
	}

	public abstract TrackType getTrackType();
	@Override
	public float getRailMaxSpeed(EntityMinecart cart) {
		if (this.speedController == null) {
			this.speedController = SpeedController.getInstance();
		}
		return this.speedController.getMaxSpeed(this, cart);
	}
	@Override
	public ITrackKitInstance getTrackKitInstance() {
		return TrackRegistry.getCombinations(getTrackType().ordinal() + 513);
	}

	@Override
	public void sendUpdateToClient() {

	}

	@Override
	public GameProfile getOwner() {
		return null;
	}

	public ITrackKitInstance getTrackSpec(){return getTrackKitInstance();}
	//@Override
	public IIcon getIcon() {
		return getIcon(0);
	}

	public IIcon getIcon(int index) {
		return TrackTextureLoader.INSTANCE.getTrackIcons(getTrackSpec())[index];
	}

	public int getPowerPropagation() {
		return 0;
	}

	public void writeToNBT(NBTTagCompound data){}

	public void readFromNBT(NBTTagCompound data){}

	public void updateEntity(){}

	public boolean canUpdate(){return false;}

	public void writePacketData(DataOutputStream data) throws IOException {}
	public void readPacketData(DataInputStream data) throws IOException {}

	public int getPowerOutput(){}


	public void setTile(TileEntity tile){
		tile.setPos(new BlockPos(getX(),getY(),getZ()));
		getWorld().addTileEntity(tile);
	}

	public TileEntity getTile();

	public int getX();

	public int getY();

	public int getZ();

	public World getWorld();
}
