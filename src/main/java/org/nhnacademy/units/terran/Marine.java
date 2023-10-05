package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;

public class Marine extends Terran {
    private static final String UNIT_NAME = "Marine";
    public Marine() {
        super(3, 10);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
