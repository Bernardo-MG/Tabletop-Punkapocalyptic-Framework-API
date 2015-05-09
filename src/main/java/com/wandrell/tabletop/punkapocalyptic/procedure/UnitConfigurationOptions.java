package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

import com.wandrell.tabletop.interval.Interval;
import com.wandrell.tabletop.punkapocalyptic.model.availability.option.ArmorOption;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.UnitWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;
import com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.Mutation;

public interface UnitConfigurationOptions {

    public Interval getAllowedWeaponsInterval();

    public Collection<ArmorOption> getArmorOptions();

    public Collection<Equipment> getEquipmentOptions();

    public Integer getMaxMutations();

    public Collection<Mutation> getMutations();

    public Collection<WeaponEnhancement> getWeaponEnhancements(
            final UnitWeapon weapon);

    public Collection<UnitWeapon> getWeaponOptions();

}
