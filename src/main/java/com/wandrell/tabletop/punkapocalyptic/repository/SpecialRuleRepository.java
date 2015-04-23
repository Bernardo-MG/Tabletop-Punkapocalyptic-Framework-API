package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.ruleset.SpecialRule;

public interface SpecialRuleRepository extends Repository<SpecialRule> {

    public Collection<SpecialRule>
            getByNamesList(final Collection<String> names);

}
