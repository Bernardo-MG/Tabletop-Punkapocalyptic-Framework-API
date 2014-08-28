package com.wandrell.punkapocalyptic.framework.api.dao;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.interval.Interval;
import com.wandrell.tabletop.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.punkapocalyptic.unit.AvailabilityUnit;
import com.wandrell.tabletop.punkapocalyptic.unit.Unit;

public interface UnitDAO {

    public AvailabilityUnit getAvailabilityUnit(final String unit);

    public Collection<Armor> getAvailableArmors(final String unit);

    public Collection<Weapon> getAvailableWeapons(final String unit);

    public Map<String, Unit> getUnits();

    public Interval getWeaponsInterval(final String unit);

}
