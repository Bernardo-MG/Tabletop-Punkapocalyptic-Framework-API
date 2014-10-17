package com.wandrell.tabletop.data.service.punkapocalyptic.model;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.punkapocalyptic.AvailabilityUnit;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;

public interface PunkapocalypticModelDataService {

    public Map<String, Faction> getFactions();

    public Map<String, Collection<AvailabilityUnit>> getFactionUnits();

}
