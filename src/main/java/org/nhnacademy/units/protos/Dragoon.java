package org.nhnacademy.units.protos;

import org.nhnacademy.species.Protos;
import org.nhnacademy.attackType.Laser;

public class Dragoon extends Protos implements Laser {
    private static final String UNIT_NAME = "Dragoon";

    public Dragoon() {
        super(3, 3);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
