package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.ArmyBuilderUnitConstraint;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.SpecialRule;

public interface RulesetDAO {

    public SpecialRule getSpecialRule(final String rule);

    public ArmyBuilderUnitConstraint getUnitConstraint(final String constraint,
            final String unit);

}
