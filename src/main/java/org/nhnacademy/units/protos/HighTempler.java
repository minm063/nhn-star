package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;

public class HighTempler extends Protos {
    private static final String UNIT_NAME = "HighTempler";

    public HighTempler() {
        super(10, 2);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
