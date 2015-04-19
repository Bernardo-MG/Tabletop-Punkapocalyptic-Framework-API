package com.wandrell.tabletop.punkapocalyptic.procedure.event;

import java.util.EventListener;

import com.wandrell.tabletop.event.ValueChangeEvent;

public interface GangBuilderStatusChangedListener extends EventListener {

    public void maxUnitsChanged(final ValueChangeEvent event);

}
