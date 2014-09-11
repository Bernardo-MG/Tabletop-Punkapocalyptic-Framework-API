package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;

public interface ArmyBuilderController {

    public void addUnit(final AvailabilityUnit unit);

    public Gang getBand();

    public UnitConfigurationController getUnitConfigurationController();

    public void removeUnit(final AvailabilityUnit unit);

}
