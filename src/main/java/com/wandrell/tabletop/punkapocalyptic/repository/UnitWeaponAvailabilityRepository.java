package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.UnitWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;

public interface UnitWeaponAvailabilityRepository extends
        Repository<UnitWeaponAvailability> {

    public UnitWeaponAvailability getAvailabilityForUnit(final String unit);

    public Collection<UnitWeapon> getAvailableWeaponsForUnit(final String unit);

    public Collection<WeaponEnhancement> getEnhancementsForUnitAndWeapon(
            final String unit, final String weapon);

}
