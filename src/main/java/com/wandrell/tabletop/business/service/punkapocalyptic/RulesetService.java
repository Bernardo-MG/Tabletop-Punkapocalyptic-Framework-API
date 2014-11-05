package com.wandrell.tabletop.business.service.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

public interface RulesetService {

    public Collection<Weapon> filterWeaponOptions(final Unit unit,
            final Collection<Weapon> weapons);

    public Integer getBulletCost();

    public Integer getGangValoration(final Gang gang);

    public Integer getMaxAllowedUnits(final Gang gang);

    public Integer getUnitValoration(final Unit unit);

}
