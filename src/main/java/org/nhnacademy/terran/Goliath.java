package org.nhnacademy.terran;

import org.nhnacademy.Terran;
import org.nhnacademy.attackType.Missile;

public class Goliath extends Terran implements Missile {
    private static final int ATTACK_POWER = 5;
    private static final int DEFENSE_POWER = 15;
    private static final String UNIT_NAME = "Goliath";

    public Goliath() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
