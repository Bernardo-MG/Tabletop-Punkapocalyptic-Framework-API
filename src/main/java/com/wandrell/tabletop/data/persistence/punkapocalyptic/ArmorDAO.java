package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.model.punkapocalyptic.inventory.Armor;

public interface ArmorDAO {

    public Armor getArmor(final String armor, final Integer cost);

}
