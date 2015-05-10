package com.wandrell.tabletop.punkapocalyptic.service;

import com.wandrell.tabletop.punkapocalyptic.model.faction.Faction;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;

public interface ModelService {

    public Gang getGang(final Faction faction);

    public Unit getUnit(final UnitTemplate template);

}
