package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitArmorAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitArmorAvailabilityRepository extends
        Repository<UnitArmorAvailability> {

    public UnitArmorAvailability getAvailabilityForUnit(final Unit unit);

}
