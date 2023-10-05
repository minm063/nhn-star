package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;

public class Zealot extends Protos {
    private static final String UNIT_NAME = "Zealot";

    public Zealot() {
        super(5, 20);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
