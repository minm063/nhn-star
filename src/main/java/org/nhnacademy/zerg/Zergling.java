package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;

public class Zergling extends Zerg {
    private static final int ATTACK_POWER = 2;
    private static final int DEFENSE_POWER = 2;
    private static final String UNIT_NAME = "Zergling";

    public Zergling() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
