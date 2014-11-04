package com.wandrell.tabletop.business.procedure.punkapocalyptic.event;

import java.util.EventListener;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.event.UnitEvent;

public interface UnitChangedListener extends EventListener {

    public void unitAdded(final UnitEvent event);

    public void unitRemoved(final UnitEvent event);

}
