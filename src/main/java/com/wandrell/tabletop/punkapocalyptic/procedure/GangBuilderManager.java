package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.GangBuilderStatusChangedListener;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.GangChangedListener;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.UnitChangedListener;
import com.wandrell.tabletop.valuebox.ValueBox;

public interface GangBuilderManager extends ValidatedProcedure {

    public void addGangChangedListener(final GangChangedListener listener);

    public void addStatusChangedListener(
            final GangBuilderStatusChangedListener listener);

    public void addUnitChangedListener(final UnitChangedListener listener);

    public Gang getGang();

    public ValueBox getMaxUnits();

    public Collection<UnitTemplate> getUnitOptions();

    public void removeGangChangedListener(final GangChangedListener listener);

    public void removeStatusChangedListener(
            final GangBuilderStatusChangedListener listener);

    public void removeUnitChangedListener(final UnitChangedListener listener);

    public void setGang(final Gang gang);

}
