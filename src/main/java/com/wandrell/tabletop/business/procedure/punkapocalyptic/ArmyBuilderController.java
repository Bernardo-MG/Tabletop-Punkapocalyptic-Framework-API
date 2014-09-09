package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Band;

public interface ArmyBuilderController {

    public void addUnit(final AvailabilityUnit unit);

    public Band getBand();

    public UnitConfigurationController getUnitConfigurationController();

    public void removeUnit(final AvailabilityUnit unit);

}
