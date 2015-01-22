package com.wandrell.tabletop.business.util.tag.punkapocalyptic.repository;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.util.repository.Repository;

public interface WeaponRepositoryAware {

    public void setWeaponRepository(final Repository<Weapon> repository);

}
