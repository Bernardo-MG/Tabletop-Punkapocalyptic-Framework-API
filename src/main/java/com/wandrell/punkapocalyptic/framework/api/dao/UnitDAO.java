package com.wandrell.punkapocalyptic.framework.api.dao;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.punkapocalyptic.unit.Unit;

public interface UnitDAO {

    public AvailabilityUnit getAvailabilityUnit(final String unit);

    public Collection<Unit> getUnits();

}
