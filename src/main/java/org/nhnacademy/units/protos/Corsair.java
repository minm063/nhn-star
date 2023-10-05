package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;
import org.nhnacademy.attackType.Flyable;

public class Corsair extends Protos implements Flyable {
    private static final String UNIT_NAME = "Corsair";

    public Corsair() {
        super(4, 12);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
