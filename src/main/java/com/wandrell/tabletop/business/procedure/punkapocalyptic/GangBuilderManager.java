package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;
import com.wandrell.tabletop.business.procedure.punkapocalyptic.event.GangChangedListener;
import com.wandrell.tabletop.business.procedure.punkapocalyptic.event.UnitChangedListener;

public interface GangBuilderManager extends ProcedureValidator {

    public void addGangChangedListener(final GangChangedListener listener);

    public void addUnitChangedListener(final UnitChangedListener listener);

    public Gang getGang();

    public ValueHandler getMaxUnits();

    public UnitConfigurationManager getUnitConfigurationController();

    public Collection<Unit> getUnitOptions();

    public void removeGangChangedListener(final GangChangedListener listener);

    public void removeUnitChangedListener(final UnitChangedListener listener);

    public void setGang(final Gang gang);

}
