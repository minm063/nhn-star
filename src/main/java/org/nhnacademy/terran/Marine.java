package org.nhnacademy.terran;

import org.nhnacademy.Terran;

public class Marine extends Terran {
    private static final String UNIT_NAME = "Marine";
    private static final int ATTACK_POWER = 3;
    private static final int DEFENSE_POWER = 10;
    public Marine() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
