package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;

public interface FactionDAO {

    public Faction getFaction(final String faction);

    public Collection<AvailabilityUnit> getUnits(final String faction);

}
