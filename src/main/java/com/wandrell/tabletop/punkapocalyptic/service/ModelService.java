package com.wandrell.tabletop.punkapocalyptic.service;

import java.util.List;

import com.wandrell.tabletop.procedure.Constraint;
import com.wandrell.tabletop.punkapocalyptic.model.faction.Faction;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;

public interface ModelService {

    public Constraint getConstraint(final Gang gang, final String name,
            final String unit, final List<String> context);

    public Gang getGang(final Faction faction);

    public Unit getUnit(final UnitTemplate template);

}
