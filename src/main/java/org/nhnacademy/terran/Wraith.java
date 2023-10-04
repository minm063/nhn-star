package org.nhnacademy.terran;

import org.nhnacademy.Terran;
import org.nhnacademy.attackType.Flyable;

public class Wraith extends Terran implements Flyable {
    private static final int ATTACK_POWER = 3;
    private static final int DEFENSE_POWER = 10;
    private static final String UNIT_NAME = "Wraith";

    public Wraith() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
