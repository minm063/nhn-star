package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;
import org.nhnacademy.attackType.Flyable;

public class Valkyrie extends Terran implements Flyable {
    private static final String UNIT_NAME = "Valkyrie";

    public Valkyrie() {
        super(4, 12);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
