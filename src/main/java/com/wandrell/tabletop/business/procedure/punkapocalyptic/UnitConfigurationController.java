package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;

public interface UnitConfigurationController extends ProcedureValidator {

    public Collection<Weapon> getWeaponsSelection();

    public void setUnit(final AvailabilityUnit unit);

}
