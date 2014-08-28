package com.wandrell.punkapocalyptic.framework.api.dao;

import com.wandrell.tabletop.punkapocalyptic.inventory.Armor;

public interface ArmorDAO {

    public Armor getArmor(final String armor, final Integer cost);

}
