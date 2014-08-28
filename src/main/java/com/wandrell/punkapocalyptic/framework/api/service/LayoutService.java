package com.wandrell.punkapocalyptic.framework.api.service;

import java.awt.LayoutManager;

public interface LayoutService {

    public LayoutManager getEmptyLayout();

    public LayoutManager getFillLayout();

    public LayoutManager getNoInsetsLayout();

}
