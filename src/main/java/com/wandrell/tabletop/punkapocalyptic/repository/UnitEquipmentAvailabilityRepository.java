package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitEquipmentAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitEquipmentAvailabilityRepository extends
        Repository<UnitEquipmentAvailability> {

    public UnitEquipmentAvailability getAvailabilityForUnit(final Unit unit);

}
