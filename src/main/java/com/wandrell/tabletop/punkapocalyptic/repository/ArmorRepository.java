package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Armor;

public interface ArmorRepository extends Repository<Armor> {

    public Armor getByName(final String name);

    public Collection<Armor> getByNamesList(final Collection<String> names);

}
