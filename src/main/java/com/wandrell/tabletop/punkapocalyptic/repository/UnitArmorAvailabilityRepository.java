package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitArmorAvailability;

public interface UnitArmorAvailabilityRepository extends
        Repository<UnitArmorAvailability> {

    public UnitArmorAvailability getAvailabilityForUnit(final String unit);

}
