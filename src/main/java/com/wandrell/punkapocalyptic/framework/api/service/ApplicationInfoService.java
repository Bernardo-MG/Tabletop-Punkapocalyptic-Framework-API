package com.wandrell.punkapocalyptic.framework.api.service;

import java.net.URI;

public interface ApplicationInfoService {

    public String getApplicationName();

    public String getAuthor();

    public String getAuthorEmail();

    public URI getSCMURI();

    public String getVersion();

}
