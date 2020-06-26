/*
 * ******************************************************************************
 *  Copyright 2011-2015 CovertJaguar
 *
 *  This work (the API) is licensed under the "MIT" License, see LICENSE.md for details.
 * ***************************************************************************
 */

package mods.railcraft.api.tracks;

import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public interface ITrackItemIconProvider {

    ModelResourceLocation getTrackItemIcon(TrackSpec spec);
}
