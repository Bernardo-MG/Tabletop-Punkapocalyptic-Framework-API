package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

import com.wandrell.tabletop.interval.Interval;
import com.wandrell.tabletop.punkapocalyptic.model.availability.option.ArmorOption;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;
import com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.Mutation;

public interface UnitConfigurationManager {

    public Interval getAllowedWeaponsInterval();

    public Collection<ArmorOption> getArmorOptions();

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
