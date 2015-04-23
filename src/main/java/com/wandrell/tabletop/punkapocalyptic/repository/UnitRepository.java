package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitRepository extends Repository<Unit> {

    public Unit getByName(final String name);

}
