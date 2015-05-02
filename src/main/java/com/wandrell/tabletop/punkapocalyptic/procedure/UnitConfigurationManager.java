package com.wandrell.tabletop.punkapocalyptic.procedure;

import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitConfigurationManager extends ValidatedProcedure {

    public UnitConfigurationOptions getOptions();

    public Unit getUnit();

    public Boolean isGrouped();

    public void setUnit(final Unit unit);

}
