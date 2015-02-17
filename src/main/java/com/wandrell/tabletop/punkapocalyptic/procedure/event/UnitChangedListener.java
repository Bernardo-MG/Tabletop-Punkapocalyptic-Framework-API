package com.wandrell.tabletop.punkapocalyptic.procedure.event;

import java.util.EventListener;

import com.wandrell.tabletop.punkapocalyptic.model.unit.event.UnitEvent;

public interface UnitChangedListener extends EventListener {

    public void unitAdded(final UnitEvent event);

    public void unitRemoved(final UnitEvent event);

}
