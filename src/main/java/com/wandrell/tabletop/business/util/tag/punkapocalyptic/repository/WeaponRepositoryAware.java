package com.wandrell.tabletop.business.util.tag.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;

public interface WeaponRepositoryAware {

    public void setWeaponRepository(final Repository<Weapon> repository);

}
