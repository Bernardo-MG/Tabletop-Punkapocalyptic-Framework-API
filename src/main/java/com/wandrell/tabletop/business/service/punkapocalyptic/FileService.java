package com.wandrell.tabletop.business.service.punkapocalyptic;

import java.io.File;

import javafx.stage.Stage;

import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;

public interface FileService {

    public File getFileToPrintGangOnDesktop(final Stage stage);

    public String getTitleImagePath();

    public void saveGang(final Gang gang, final File file);

}
