package com.wandrell.tabletop.punkapocalyptic.service;

public interface ModelLocalizationService {

    public String getArmorNameString(final String name);

    public String getFactionNameString(final String name);

    public String getMutationNameString(final String name);

    public String getSpecialRuleNameString(final String name);

    public String getUnitNameString(final String name);

    public String getWeaponNameString(final String name);

}
