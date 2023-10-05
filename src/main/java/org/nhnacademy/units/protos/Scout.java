package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;
import org.nhnacademy.attackType.Flyable;

public class Scout extends Protos implements Flyable {
    private static final String UNIT_NAME = "Scout";

    public Scout() {
        super(5, 10);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
