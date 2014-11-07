package com.wandrell.tabletop.business.procedure.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.interval.Interval;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;
import com.wandrell.tabletop.business.procedure.ProcedureValidator;

public interface UnitConfigurationManager extends ProcedureValidator {

    public Interval getAllowedWeaponsInterval();

    public Collection<Armor> getArmorOptions();

    public Unit getUnit();

    public Collection<WeaponEnhancement> getWeaponEnhancements(
            final Weapon weapon);

    public Collection<Weapon> getWeaponOptions();

    public void setUnit(final Unit unit);

}
