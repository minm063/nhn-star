package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;
import org.nhnacademy.attackType.Missile;

public class Goliath extends Terran implements Missile {
    private static final String UNIT_NAME = "Goliath";

    public Goliath() {
        super(5, 15);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
