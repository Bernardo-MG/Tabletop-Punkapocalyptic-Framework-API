package com.wandrell.tabletop.punkapocalyptic.repository;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.UnitMutationAvailability;

public interface UnitMutationAvailabilityRepository extends
        Repository<UnitMutationAvailability> {

    public UnitMutationAvailability getAvailabilityForUnit(final String unit);

}
