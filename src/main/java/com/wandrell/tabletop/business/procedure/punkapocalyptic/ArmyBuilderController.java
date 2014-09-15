package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;

public interface ArmyBuilderController extends ProcedureValidator {

    public Gang getGang();

    public ValueHandler getMaxUnits();

    public UnitConfigurationController getUnitConfigurationController();

}
