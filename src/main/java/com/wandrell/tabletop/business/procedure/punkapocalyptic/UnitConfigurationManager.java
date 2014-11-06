package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;

public interface UnitConfigurationManager extends ProcedureValidator {

    public Collection<Armor> getArmorOptions();

    public Unit getUnit();

    public void setUnit(final Unit unit);

}
