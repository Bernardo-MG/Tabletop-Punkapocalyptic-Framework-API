package com.wandrell.tabletop.business.procedure.punkapocalyptic.event;

import java.util.EventListener;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.event.UnitEvent;

public interface UnitConfigurationListener extends EventListener {

    public void unitSelected(final UnitEvent event);

}
