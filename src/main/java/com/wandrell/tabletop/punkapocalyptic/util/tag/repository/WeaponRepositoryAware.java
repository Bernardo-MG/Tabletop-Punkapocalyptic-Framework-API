package com.wandrell.tabletop.punkapocalyptic.util.tag.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;

public interface WeaponRepositoryAware {

    public void setWeaponRepository(final Repository<Weapon> repository);

}
