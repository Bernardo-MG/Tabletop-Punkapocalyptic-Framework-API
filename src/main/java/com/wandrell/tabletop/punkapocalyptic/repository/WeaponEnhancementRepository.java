package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.inventory.WeaponEnhancement;

public interface WeaponEnhancementRepository extends
        Repository<WeaponEnhancement> {

    public Collection<WeaponEnhancement> getByNamesList(
            final Collection<String> names);

}
