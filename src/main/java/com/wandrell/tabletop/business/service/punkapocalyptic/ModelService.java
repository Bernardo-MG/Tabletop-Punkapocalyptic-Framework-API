package com.wandrell.tabletop.business.service.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.RangedValue;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.FactionUnitAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitArmorAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitMutationAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.WeaponOption;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.MeleeWeapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.RangedWeapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.SpecialRule;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Mutation;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.Constraint;

public interface ModelService {

    public Armor getArmor(final String name, final Integer armor,
            final Collection<SpecialRule> rules);

    public Equipment getEquipment(final String name, final Integer cost);

    public Faction getFaction(final String name);

    public FactionUnitAvailability getFactionUnitAvailability(final Unit unit,
            final Collection<Constraint> constraints);

    public Gang getGang(final Faction faction);

    public MeleeWeapon getMeleeWeapon(final String name, final Integer cost,
            final Integer strength, final Integer penetration,
            final Integer combat);

    public Mutation getMutation(final String name, final Integer cost,
            final Integer actions, final Integer agility, final Integer combat,
            final Integer precision, final Integer strength,
            final Integer tech, final Integer toughness);

    public RangedValue getRangedValue(final Integer distanceShort,
            final Integer distanceMedium, final Integer distanceLong);

    public RangedWeapon getRangedWeapon(final String name, final Integer cost,
            final RangedValue penetration, final RangedValue strength,
            final RangedValue distanceCM, final RangedValue distanceInches,
            final MeleeWeapon weaponMelee);

    public SpecialRule getSpecialRule(final String name);

    public Unit getUnit(final String name, final Integer actions,
            final Integer agility, final Integer combat,
            final Integer precision, final Integer strength,
            final Integer tech, final Integer toughness, final Integer cost,
            final Collection<SpecialRule> rules);

    public UnitArmorAvailability getUnitArmorAvailability(
            final Collection<Armor> armorOptions, final Armor initialArmor);

    public Constraint getUnitGangConstraint(final String name,
            final String unit, final String... context);

    public UnitMutationAvailability getUnitMutationAvailability(
            final Integer max, final Collection<Mutation> mutations);

    public UnitWeaponAvailability getUnitWeaponAvailability(
            final Collection<WeaponOption> weaponOptions,
            final Integer minWeapons, final Integer maxWeapons);

    public WeaponEnhancement getWeaponEnhancement(final String name,
            final Integer cost);

    public WeaponOption getWeaponOption(final Weapon weapon,
            final Collection<WeaponEnhancement> enhancements);

}
