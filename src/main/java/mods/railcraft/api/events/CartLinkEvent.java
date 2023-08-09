/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2020

 This work (the API) is licensed under the "MIT" License,
 see LICENSE.md for details.
 -----------------------------------------------------------------------------*/

package mods.railcraft.api.events;

import net.minecraft.entity.item.MinecartEntity;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * These events are fired on {@link net.minecraftforge.common.MinecraftForge#EVENT_BUS}.
 *
 * <p>In order to cancel linking, call {@link mods.railcraft.api.carts.ILinkageManager#breakLink(MinecartEntity, MinecartEntity)}</p>
 */
public class CartLinkEvent extends Event {

    private final MinecartEntity one;
    private final MinecartEntity two;

    CartLinkEvent(MinecartEntity one, MinecartEntity two) {
        this.one = one;
        this.two = two;
    }

    public MinecartEntity getCartOne() {
        return one;
    }

    public MinecartEntity getCartTwo() {
        return two;
    }

    public static final class Link extends CartLinkEvent {
        public Link(MinecartEntity one, MinecartEntity two) {
            super(one, two);
        }
    }

    public static final class Unlink extends CartLinkEvent {
        public Unlink(MinecartEntity one, MinecartEntity two) {
            super(one, two);
        }
    }
}
