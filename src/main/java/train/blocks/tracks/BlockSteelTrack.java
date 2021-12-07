/**
 * @author Spitfire4466
 */
package train.blocks.tracks;

import depreciated.minecraft.util.IIcon;
import train.library.Tracks;

public class BlockSteelTrack extends TrackBaseTraincraft {
	public BlockSteelTrack() {
		this.speedController = SpeedControllerSteel.getInstance();
	}

	@Override
	public TrackType getTrackType() {
		return Tracks.STEEL_TRACK;
	}
	@Override
	public IIcon getIcon() {
		int meta = this.tileEntity.getBlockMetadata();
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