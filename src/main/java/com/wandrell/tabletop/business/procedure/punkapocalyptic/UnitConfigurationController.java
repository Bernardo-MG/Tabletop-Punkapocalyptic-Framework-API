package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;

public interface UnitConfigurationController extends ProcedureValidator {

    public Unit getUnit();

    public void setUnit(final Unit unit);

}
