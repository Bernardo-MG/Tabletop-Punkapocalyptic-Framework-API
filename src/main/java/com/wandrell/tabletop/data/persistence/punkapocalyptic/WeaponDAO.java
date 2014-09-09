package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;

public interface WeaponDAO {

    public Weapon getWeapon(final String weapon);

}
