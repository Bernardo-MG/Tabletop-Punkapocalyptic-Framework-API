package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;
import com.wandrell.tabletop.business.procedure.punkapocalyptic.event.GangChangedListener;

public interface GangBuilderManager extends ProcedureValidator {

    public void addGangChangedListener(final GangChangedListener listener);

    public Gang getGang();

    public ValueHandler getMaxUnits();

    public UnitConfigurationManager getUnitConfigurationController();

    public void removeGangChangedListener(final GangChangedListener listener);

    public void setGang(final Gang gang);

}
