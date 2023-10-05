package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;
import org.nhnacademy.attackType.Flyable;

public class Wraith extends Terran implements Flyable {
    private static final String UNIT_NAME = "Wraith";

    public Wraith() {
        super(3, 10);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
