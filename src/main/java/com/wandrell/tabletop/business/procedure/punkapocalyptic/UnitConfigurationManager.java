package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.interval.Interval;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.mutation.Mutation;

public interface UnitConfigurationManager {

    public Interval getAllowedWeaponsInterval();

    public Collection<Armor> getArmorOptions();

    public Collection<Equipment> getEquipmentOptions();

    public Integer getMaxMutations();

    public Collection<Mutation> getMutations();

    public Unit getUnit();

    public Collection<String> getValidationMessages();

    public Collection<WeaponEnhancement> getWeaponEnhancements(
            final Weapon weapon);

    public Collection<Weapon> getWeaponOptions();

    public Boolean isGrouped();

    public void setUnit(final Unit unit);

    public Boolean validate();

}
