package com.wandrell.tabletop.business.service.punkapocalyptic;

public interface LocalizationService {

    public String getArmorString(final String armor);

    public String getAttributeString(final String attribute);

    public String getLabelString(final String key);

    public String getMessageString(final String message);

    public String getUnitNameString(final String unit);

    public String getWeaponString(final String weapon);

}
