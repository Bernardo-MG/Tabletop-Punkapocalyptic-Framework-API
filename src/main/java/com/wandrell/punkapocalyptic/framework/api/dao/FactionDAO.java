package com.wandrell.punkapocalyptic.framework.api.dao;

import java.util.Collection;

import com.wandrell.tabletop.punkapocalyptic.faction.Faction;

public interface FactionDAO {

    public Faction getFaction(final String faction);

    public Collection<String> getFactionNames();

    public Collection<String> getUnits(final String faction);

}
