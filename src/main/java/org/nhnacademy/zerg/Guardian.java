package org.nhnacademy.zerg;

import org.nhnacademy.Zerg;
import org.nhnacademy.attackType.Flyable;

public class Guardian extends Zerg implements Flyable {
    private static final int ATTACK_POWER = 3;
    private static final int DEFENSE_POWER = 6;
    private static final String UNIT_NAME = "Guardian";

    public Guardian() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
