package com.wandrell.tabletop.punkapocalyptic.service;

public interface LocalizationService {

    public String getMessageString(final String message);

    public String getReportString(final String key);

    public String getViewString(final String key);

}
