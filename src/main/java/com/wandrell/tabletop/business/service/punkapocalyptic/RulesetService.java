package com.wandrell.tabletop.business.service.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.MeleeWeapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.model.valuebox.derived.DerivedValueBox;

public interface RulesetService {

    public Collection<Weapon> filterWeaponOptions(
            final Collection<Weapon> weaponsHas,
            final Collection<Weapon> weapons);

    public Integer getBulletCost();

    public Integer getGangValoration(final Gang gang);

    public Integer getMaxAllowedUnits(final Gang gang);

    public Integer getPackMaxSize();

    public MeleeWeapon getTwoHandedMeleeEquivalent();

    public Integer getUnitValoration(final Unit unit);

    public void setUpMaxUnitsValueHandler(final DerivedValueBox value,
            final Gang gang);

}
