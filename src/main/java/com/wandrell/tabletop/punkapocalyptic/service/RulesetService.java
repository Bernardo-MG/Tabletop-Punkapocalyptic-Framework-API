package com.wandrell.tabletop.punkapocalyptic.service;

import com.wandrell.tabletop.punkapocalyptic.model.inventory.MeleeWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface RulesetService {

    public Integer getBulletCost();

    public Integer getGangValoration(final Gang gang);

    public Integer getMaxAllowedUnits(final Gang gang);

    public Integer getPackMaxSize();

    public MeleeWeapon getTwoHandedMeleeEquivalent();

    public Integer getUnitValoration(final Unit unit);

}
