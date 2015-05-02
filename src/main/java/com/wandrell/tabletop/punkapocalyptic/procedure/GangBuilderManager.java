package com.wandrell.tabletop.punkapocalyptic.procedure;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.GangBuilderStatusChangedListener;
import com.wandrell.tabletop.valuebox.ValueBox;

public interface GangBuilderManager extends ValidatedProcedure {

    public void addStatusChangedListener(
            final GangBuilderStatusChangedListener listener);

    public Gang getGang();

    public ValueBox getMaxUnits();

    public GangBuilderOptions getOptions();

    public void removeStatusChangedListener(
            final GangBuilderStatusChangedListener listener);

    public void setGang(final Gang gang);

}
