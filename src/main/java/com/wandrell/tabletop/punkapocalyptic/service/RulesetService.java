package com.wandrell.tabletop.punkapocalyptic.service;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Gang;

public interface RulesetService {

    public Integer getBulletCost();

    public Integer getGangValoration(final Gang gang);

    public Integer getMaxAllowedUnits(final Gang gang);

    public Integer getPackMaxSize();

}
