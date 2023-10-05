package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;

public class Tank extends Terran {
    private static final String UNIT_NAME = "Tank";
    public Tank() {
        super(7, 15);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
