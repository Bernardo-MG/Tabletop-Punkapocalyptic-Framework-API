package com.wandrell.tabletop.business.procedure.punkapocalyptic.event;

import java.util.EventListener;

public interface GangChangedListener extends EventListener {

    public void gangChanged(final GangChangedEvent event);

}
