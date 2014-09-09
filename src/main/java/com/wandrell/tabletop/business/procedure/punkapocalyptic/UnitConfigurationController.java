package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.AvailabilityUnit;

public interface UnitConfigurationController {

    public String getFailedConstraintsText();

    public Collection<Weapon> getWeaponsSelection();

    public Boolean isFinished();

    public void setUnit(final AvailabilityUnit unit);

}
