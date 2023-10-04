package org.nhnacademy.terran;

import org.nhnacademy.Terran;

public class Tank extends Terran {
    private static final int ATTACK_POWER = 7;
    private static final int DEFENSE_POWER = 15;
    private static final String UNIT_NAME = "Tank";
    public Tank() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
