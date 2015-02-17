package com.wandrell.tabletop.punkapocalyptic.procedure.event;

import java.util.EventListener;

public interface GangChangedListener extends EventListener {

    public void gangChanged(final GangChangedEvent event);

}
