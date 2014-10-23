package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;
import com.wandrell.tabletop.business.procedure.punkapocalyptic.event.UnitConfigurationListener;

public interface UnitConfigurationController extends ProcedureValidator {

    public void addUnitConfigurationListener(
            final UnitConfigurationListener listener);

    public Unit getUnit();

    public void removeUnitConfigurationListener(
            final UnitConfigurationListener listener);

    public void setUnit(final Unit unit,
            final UnitWeaponAvailability availability);

}
