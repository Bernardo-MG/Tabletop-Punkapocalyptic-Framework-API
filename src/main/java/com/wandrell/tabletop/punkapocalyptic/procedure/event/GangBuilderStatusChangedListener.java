package com.wandrell.tabletop.punkapocalyptic.procedure.event;

import java.util.EventListener;

import com.wandrell.tabletop.stats.event.ValueChangeEvent;

public interface GangBuilderStatusChangedListener extends EventListener,
        GangChangedListener, UnitChangedListener {

    public void maxUnitsChanged(final ValueChangeEvent event);

}
