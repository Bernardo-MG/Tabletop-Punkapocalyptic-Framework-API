package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;

public interface WeaponRepository extends Repository<Weapon> {

    public Collection<Weapon> getByNamesList(final Collection<String> names);

}
