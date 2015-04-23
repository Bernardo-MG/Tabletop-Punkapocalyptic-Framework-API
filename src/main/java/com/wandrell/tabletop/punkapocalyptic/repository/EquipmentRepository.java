package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.Equipment;

public interface EquipmentRepository extends Repository<Equipment> {

    public Collection<Equipment> getByNamesList(final Collection<String> names);

}
