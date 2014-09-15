package com.wandrell.tabletop.business.service.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

public interface RulesetService {

    public Integer getBulletCost();

    public Integer getGangValoration(final Gang gang);

    public Integer getMaxAllowedUnits(final Gang gang);

    public Integer getUnitValoration(final Unit unit);

}
