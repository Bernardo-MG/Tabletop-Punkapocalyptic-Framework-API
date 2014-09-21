package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint.GangConstraint;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.specialrule.SpecialRule;

public interface RulesetDAO {

    public SpecialRule getSpecialRule(final String rule);

    public GangConstraint getUnitConstraint(final String constraint,
            final String unit);

}
