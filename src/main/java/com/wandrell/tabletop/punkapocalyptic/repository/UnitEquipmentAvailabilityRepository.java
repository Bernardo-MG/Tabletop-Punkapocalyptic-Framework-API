package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitEquipmentAvailability;

public interface UnitEquipmentAvailabilityRepository extends
        Repository<UnitEquipmentAvailability> {

    public UnitEquipmentAvailability getAvailabilityForUnit(final String unit);

}
