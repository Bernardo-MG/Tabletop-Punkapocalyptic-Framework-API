package com.wandrell.tabletop.data.service.punkapocalyptic.model;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitArmorAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint.UnitGangConstraint;

public interface DataModelService {

    public Collection<Faction> getAllFactions();

    public Collection<AvailabilityUnit> getFactionUnits(final String faction);

    public UnitArmorAvailability getUnitArmorAvailability(final String unit);

    public Collection<UnitGangConstraint> getUnitConstraints(final String unit,
            final String faction);

    public UnitWeaponAvailability getUnitWeaponAvailability(final String unit);

}
