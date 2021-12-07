/**
 * @author Spitfire4466
 */
package train.blocks.tracks;

import depreciated.minecraft.util.IIcon;
import mods.railcraft.api.tracks.TrackType;
import net.minecraft.block.material.Material;
import train.library.Tracks;

public class BlockSnowyCopperTrack extends TrackBaseTraincraft {
	public BlockSnowyCopperTrack() {
		super(Material.CIRCUITS);
		this.speedController = SpeedControllerCopper.getInstance();
	}

	@Override
	public TrackType getTrackType() {
		return Tracks.SNOWY_COPPER_TRACK;
	}
	@Override
	public IIcon getIcon() {
		int meta = this.getTile().getBlockMetadata();
		if (meta >= 6) {
			return getIcon(1);
		}
		return getIcon(0);
	}
	@Override
	public boolean isFlexibleRail() {
		return true;
	}
}