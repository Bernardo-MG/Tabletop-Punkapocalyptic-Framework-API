package com.wandrell.tabletop.punkapocalyptic.procedure;

import java.util.Collection;

public interface ValidatedProcedure {

    public Collection<String> getValidationMessages();

    public Boolean validate();

}
