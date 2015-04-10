package com.wandrell.tabletop.punkapocalyptic.util.tag.repository;

import com.google.common.base.Predicate;
import com.wandrell.pattern.repository.QueryableRepository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;

public interface WeaponRepositoryAware {

    public void setWeaponRepository(
            final QueryableRepository<Weapon, Predicate<Weapon>> repository);

}
