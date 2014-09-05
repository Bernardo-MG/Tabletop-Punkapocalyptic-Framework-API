package com.wandrell.tabletop.data.dao.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.model.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.model.punkapocalyptic.unit.Unit;

public interface UnitDAO {

    public AvailabilityUnit getAvailabilityUnit(final String unit);

    public Collection<Unit> getUnits();

}
