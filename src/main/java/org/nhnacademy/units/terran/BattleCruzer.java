package org.nhnacademy.units.terran;

import org.nhnacademy.species.Terran;
import org.nhnacademy.attackType.Flyable;

public class BattleCruzer extends Terran implements Flyable {
    private static final String UNIT_NAME = "BattleCruzer";

    public BattleCruzer() {
        super(20, 30);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
