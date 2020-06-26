/**
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import net.minecraft.client.resources.model.ModelResourceLocation;
import train.common.library.Tracks;

public class BlockSteelTrack extends TrackBaseTraincraft {
	public BlockSteelTrack() {
		this.speedController = SpeedControllerSteel.getInstance();
	}

	@Override
	public Tracks getTrackType() {
		return Tracks.STEEL_TRACK;
	}
	@Override
	public ModelResourceLocation getIcon() {
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