package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

public interface UnitDAO {

    public AvailabilityUnit getAvailabilityUnit(final String unit);

    public Collection<Unit> getUnits();

}
