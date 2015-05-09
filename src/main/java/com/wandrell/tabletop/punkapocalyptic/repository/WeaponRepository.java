package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.UnitWeapon;

public interface WeaponRepository extends Repository<UnitWeapon> {

    public Collection<UnitWeapon>
            getByNamesList(final Collection<String> names);

}
