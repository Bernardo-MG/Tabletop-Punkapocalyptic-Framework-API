package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitWeaponAvailabilityRepository extends
        Repository<UnitWeaponAvailability> {

    public UnitWeaponAvailability getAvailabilityForUnit(final Unit unit);

}
