package com.wandrell.punkapocalyptic.framework.api.service;

import javax.swing.JDialog;
import javax.swing.JTable;

import com.wandrell.tabletop.punkapocalyptic.faction.Faction;

public interface ArmyBuilderSwingService {

    public JTable getAddedUnitsTable();

    public JDialog getAddUnitDialog(final Faction faction);

    public JTable getAddUnitTable();

    public void
            setUpAddUnitTableRows(final JTable table, final Faction faction);

}
