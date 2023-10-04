package org.nhnacademy.terran;

import org.nhnacademy.Terran;
import org.nhnacademy.attackType.Flyable;

public class BattleCruzer extends Terran implements Flyable {
    private static final int ATTACK_POWER = 20;
    private static final int DEFENSE_POWER = 30;
    private static final String UNIT_NAME = "BattleCruzer";

    public BattleCruzer() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
