package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

public interface ValidatedProcedure {

    public Boolean validate();

    public Collection<String> getValidationMessages();

}
