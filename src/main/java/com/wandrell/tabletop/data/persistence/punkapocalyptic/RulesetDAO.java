package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.model.punkapocalyptic.ruleset.SpecialRule;
import com.wandrell.tabletop.model.punkapocalyptic.ruleset.UnitConstraint;

public interface RulesetDAO {

    public SpecialRule getSpecialRule(final String rule);

    public UnitConstraint getUnitConstraint(final String constraint,
            final String unit);

}
