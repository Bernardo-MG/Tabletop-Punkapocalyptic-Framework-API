package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.MeleeWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;

public interface WeaponRepository extends Repository<Weapon> {

    public MeleeWeapon getRangedMeleeWeapon();

}
