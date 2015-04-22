package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitMutationAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.unit.Unit;

public interface UnitMutationAvailabilityRepository extends
        Repository<UnitMutationAvailability> {

    public UnitMutationAvailability getAvailabilityForUnit(final Unit unit);

}
