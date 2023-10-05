package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;
import org.nhnacademy.attackType.Flyable;

public class Carrier extends Protos implements Flyable {
    private static final String UNIT_NAME = "Carrier";

    public Carrier() {
        super(25, 40);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
