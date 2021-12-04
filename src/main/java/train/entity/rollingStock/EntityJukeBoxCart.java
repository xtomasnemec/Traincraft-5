package train.entity.rollingStock;

import net.minecraft.entity.Entity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemPaintBucket;
import ebf.tim.networking.PacketInteract;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import train.Traincraft;
import train.core.util.MP3Player;
import train.library.GuiIDs;

public class EntityJukeBoxCart extends GenericRailTransport {
	
	public boolean isPlaying = false;
	public boolean isInvalid = false;
	public String streamURL = "";
	private Side side;
	public float volume = 1.0f;
	public MP3Player player;

	public static final DataParameter<Integer> VOLUME = EntityDataManager.<Integer>createKey(Entity.class, DataSerializers.VARINT);
	public static final DataParameter<String> STREAM = EntityDataManager.<String>createKey(Entity.class, DataSerializers.STRING);

	public EntityJukeBoxCart(World world) {
		super(world);
		dataManager.set(STREAM, streamURL);
		dataManager.set(VOLUME, 0);
		side = FMLCommonHandler.instance().getEffectiveSide();
	}

	public EntityJukeBoxCart(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + getYOffset(), d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void setDead() {
		this.stopStream();
		super.setDead();
		isDead = true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!world.isRemote && this.ticksExisted % 10 == 0) {
			this.dataManager.set(STREAM, streamURL);
			if (isPlaying) {
				this.dataManager.set(VOLUME, 1);
			}
			else {
				this.dataManager.set(VOLUME, 0);
			}
		}
		if (side == Side.CLIENT) {
			
			if (this.ticksExisted % 10 == 0 && !this.isPlaying() && this.dataManager.get(VOLUME) != 0) {
				this.streamURL = this.dataManager.get(STREAM);
				this.startStream();
			}
			if ((Minecraft.getMinecraft().player != null) && (this.player != null) && (!isInvalid)) {
				float vol = (float) getDistanceSq(Minecraft.getMinecraft().player.posX,
						Minecraft.getMinecraft().player.posY, Minecraft.getMinecraft().player.posZ);
				if (vol >= (volume * 1000.0F)) {
					this.player.setVolume(0.0F);
				} else {
					float v2 = 10000.0F / vol / 100.0F;
//					System.out.println(vol);
					if (v2 > 1.0F) {
						this.player.setVolume(volume);
					} else {
						float v1 = 1.0f - volume;
						if (v2 - v1 > 0) {
							v2 = v2 - v1;
						} else {
							v2 = 0.0f;
						}
						this.player.setVolume(v2);
					}
				}
				if (vol == 0) {
					this.invalidate();
				}
				if (this.isPlaying && rand.nextInt(5) == 0 && (this.player != null && this.player.isPlaying())) {
					int random2 = rand.nextInt(24) + 1;
					world.spawnParticle(EnumParticleTypes.NOTE, posX, posY + 1.2D, posZ, random2 / 24.0D, 0.0D, 0.0D);
				}
			}
			
		}
	}

	/**
	 * server side
	 * 
	 * @param url
	 * @param playing
	 */
	public void recievePacket(String url, boolean playing) {
		this.streamURL = url;
		this.isPlaying = playing;
	}

	@SideOnly(Side.CLIENT)
	public void invalidate() {
		isInvalid = true;
		stopStream();
	}

	@SuppressWarnings("static-access")
	public void startStream() {
		
		if (!this.isPlaying) {
			this.isPlaying = true;
			if (side == Side.CLIENT) {
				this.player = new MP3Player(this.streamURL, this.world, this.getEntityId());
				player.setVolume(0);
				Traincraft.proxy.playerList.add(this.player);
			}
		}
		
	}

	@SuppressWarnings("static-access")
	public void stopStream() {
		
		if (this.isPlaying) {
			this.isPlaying = false;
			if (side == Side.CLIENT && this.player != null) {
				this.player.stop();
				Traincraft.proxy.playerList.remove(this.player);
			}
		}
		
	}

	public boolean isPlaying() {
		return this.isPlaying;
	}

	@Override
	public boolean interact(int player, boolean isFront, boolean isBack, int key) {

		EntityPlayer p =((EntityPlayer)world.getEntityByID(player));
		if (world.isRemote) {
			if (p.getHeldItem(EnumHand.MAIN_HAND) != null && p.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemPaintBucket) {
				p.openGui(Traincraft.instance, GuiIDs.JUKEBOX, world, this.getEntityId(), -1, (int) this.posZ);
			}
			TrainsInMotion.keyChannel.sendToServer(new PacketInteract(key, getEntityId()));
		} else {
			super.interact(player,isFront,isBack,key);
		}
		return true;
	}

	@Override
	public boolean isPoweredCart() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.85F;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setString("StreamUrl", this.streamURL);
		nbttagcompound.setBoolean("isPlaying", this.isPlaying());
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.streamURL = nbttagcompound.getString("StreamUrl");
		this.isPlaying = nbttagcompound.getBoolean("isPlaying");
		this.dataManager.set(STREAM, streamURL);
		if (isPlaying) {
			this.dataManager.set(VOLUME, 1);
		} else {
			this.dataManager.set(VOLUME, 0);
		}
	}
}