package com.wandrell.punkapocalyptic.framework.api.dao;

import java.util.Map;

import com.wandrell.tabletop.punkapocalyptic.rule.SpecialRule;

public interface SpecialRuleDAO {

    public Map<String, SpecialRule> getSpecialRulesMap();

}
