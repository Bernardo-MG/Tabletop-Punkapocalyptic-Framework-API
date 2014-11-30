package com.wandrell.tabletop.business.service.punkapocalyptic;

public interface LocalizationService {

    public String getArmorString(final String armor);

    public String getEquipmentString(final String equipment);

    public String getFactionNameString(final String faction);

    public String getMessageString(final String message);

    public String getSpecialRuleString(final String name);

    public String getUnitNameString(final String unit);

    public String getViewString(final String key);

    public String getWeaponEnhancementString(final String enhancement);

    public String getWeaponString(final String weapon);

}
