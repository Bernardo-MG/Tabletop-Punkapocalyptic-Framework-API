package com.wandrell.tabletop.data.service.punkapocalyptic.model;

import java.util.Collection;

import com.wandrell.tabletop.business.model.interval.Interval;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitArmorAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint.UnitGangConstraint;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

public interface DataModelService {

    public Collection<Faction> getAllFactions();

    public Collection<Unit> getFactionUnits(final String faction);

    public Interval getUnitAllowedWeaponsInterval(final String unit);

    public UnitArmorAvailability getUnitArmorAvailability(final String unit);

    public Collection<UnitGangConstraint> getUnitConstraints(final String unit,
            final String faction);

    public Collection<WeaponEnhancement> getWeaponEnhancements(
            final String unit, final String weapon);

    public Collection<Weapon> getWeaponOptions(final String unit);

}
