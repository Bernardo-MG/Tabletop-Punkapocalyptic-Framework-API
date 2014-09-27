package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.AvailabilityUnit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;
import com.wandrell.tabletop.business.procedure.punkapocalyptic.event.UnitConfigurationListener;

public interface UnitConfigurationController extends ProcedureValidator {

    public void addUnitConfigurationListener(
            final UnitConfigurationListener listener);

    public AvailabilityUnit getUnit();

    public void removeUnitConfigurationListener(
            final UnitConfigurationListener listener);

    public void setUnit(final AvailabilityUnit unit);

}
