package com.wandrell.tabletop.punkapocalyptic.service;

import java.util.Collection;

import com.wandrell.tabletop.procedure.Constraint;
import com.wandrell.tabletop.procedure.ConstraintData;
import com.wandrell.tabletop.punkapocalyptic.model.availability.FactionUnitAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitArmorAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitEquipmentAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitMutationAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.availability.WeaponOption;
import com.wandrell.tabletop.punkapocalyptic.model.faction.Faction;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.MeleeWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.RangedWeapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;
import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;
import com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.Mutation;
import com.wandrell.tabletop.punkapocalyptic.model.util.RangedValue;

public interface ModelService {

    public Armor getArmor(final String name, final Integer armor,
            final Collection<SpecialRule> rules);

    public Equipment getEquipment(final String name, final Integer cost);

    public Faction getFaction(final String name);

    public FactionUnitAvailability getFactionUnitAvailability(
            final Faction faction, final UnitTemplate unit,
            final Collection<ConstraintData> constraints);

    public Gang getGang(final Faction faction);

    public MeleeWeapon getMeleeWeapon(final String name, final Integer cost,
            final Integer strength, final Integer penetration,
            final Integer combat, final Collection<SpecialRule> rules);

    public Mutation getMutation(final String name, final Integer cost,
            final Integer actions, final Integer agility, final Integer combat,
            final Integer precision, final Integer strength,
            final Integer tech, final Integer toughness);

    public RangedValue getRangedValue(final Integer distanceShort,
            final Integer distanceMedium, final Integer distanceLong);

    public RangedWeapon getRangedWeapon(final Unit unit, final String name,
            final Integer cost, final Collection<SpecialRule> rules,
            final RangedValue penetration, final RangedValue strength,
            final RangedValue distanceCM, final RangedValue distanceInches,
            final MeleeWeapon weaponMelee);

    public SpecialRule getSpecialRule(final String name);

    public Unit getUnit(final UnitTemplate template, final Integer actions,
            final Integer agility, final Integer combat,
            final Integer precision, final Integer strength,
            final Integer tech, final Integer toughness, final Integer cost,
            final Collection<SpecialRule> rules);

    public UnitArmorAvailability getUnitArmorAvailability(
            final UnitTemplate unit, final Collection<Armor> armorOptions,
            final Armor initialArmor);

    public UnitEquipmentAvailability getUnitEquipmentAvailability(
            final UnitTemplate unit, final Collection<Equipment> equipment);

    public Constraint getUnitGangConstraint(final Gang gang, final String name,
            final String unit, final String... context);

    public UnitMutationAvailability getUnitMutationAvailability(
            final UnitTemplate unit, final Integer max,
            final Collection<Mutation> mutations);

    public UnitWeaponAvailability getUnitWeaponAvailability(
            final UnitTemplate unit,
            final Collection<WeaponOption> weaponOptions,
            final Integer minWeapons, final Integer maxWeapons);

    public WeaponEnhancement getWeaponEnhancement(final String name,
            final Integer cost);

    public WeaponOption getWeaponOption(final Weapon weapon,
            final Collection<WeaponEnhancement> enhancements);

}
