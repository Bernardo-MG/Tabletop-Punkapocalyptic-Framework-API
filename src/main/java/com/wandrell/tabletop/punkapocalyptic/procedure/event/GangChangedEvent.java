package com.wandrell.tabletop.punkapocalyptic.procedure.event;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.EventObject;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;

public final class GangChangedEvent extends EventObject {

    private static final long serialVersionUID = 1L;
    private final Gang        newGang;
    private final Gang        oldGang;

    public GangChangedEvent(final Object source, final Gang oldValue,
            final Gang newValue) {
        super(source);

        checkNotNull(newValue, "Received a null pointer as the new gang");

        oldGang = oldValue;
        newGang = newValue;
    }

    public final Gang getNewGang() {
        return newGang;
    }

    public final Gang getOldGang() {
        return oldGang;
    }

}
