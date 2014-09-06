package com.wandrell.tabletop.procedure.punkapocalyptic;

import com.wandrell.tabletop.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.model.punkapocalyptic.unit.Band;

public interface ArmyBuilderController {

    public void addUnit(final AvailabilityUnit unit);

    public Band getBand();

    public UnitConfigurationController getUnitConfigurationController();

}
