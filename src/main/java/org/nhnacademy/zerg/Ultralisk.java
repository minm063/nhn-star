package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;

public class Ultralisk extends Zerg {
    private static final int ATTACK_POWER = 5;
    private static final int DEFENSE_POWER = 15;
    private static final String UNIT_NAME = "Ultralisk";

    public Ultralisk() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
