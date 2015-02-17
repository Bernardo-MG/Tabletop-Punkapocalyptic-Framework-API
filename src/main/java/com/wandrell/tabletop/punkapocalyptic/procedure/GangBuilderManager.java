package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.GangChangedListener;
import com.wandrell.tabletop.punkapocalyptic.procedure.event.UnitChangedListener;
import com.wandrell.tabletop.valuebox.ValueBox;

public interface GangBuilderManager {

    public void addGangChangedListener(final GangChangedListener listener);

    public void addUnitChangedListener(final UnitChangedListener listener);

    public Gang getGang();

    public ValueBox getMaxUnits();

    public Collection<Unit> getUnitOptions();

    public Collection<String> getValidationMessages();

    public void removeGangChangedListener(final GangChangedListener listener);

    public void removeUnitChangedListener(final UnitChangedListener listener);

    public void setGang(final Gang gang);

    public Boolean validate();

}
