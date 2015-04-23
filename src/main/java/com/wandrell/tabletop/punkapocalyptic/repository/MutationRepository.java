package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.unit.mutation.Mutation;

public interface MutationRepository extends Repository<Mutation> {

    public Collection<Mutation> getByNamesList(final Collection<String> names);

}
