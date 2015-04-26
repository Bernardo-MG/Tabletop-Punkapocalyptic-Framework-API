package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.unit.UnitTemplate;

public interface UnitTemplateRepository extends Repository<UnitTemplate> {

    public UnitTemplate getByNameToken(final String name);

}
