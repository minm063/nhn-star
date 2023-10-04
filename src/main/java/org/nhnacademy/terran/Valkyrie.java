package org.nhnacademy.terran;

import org.nhnacademy.Terran;
import org.nhnacademy.attackType.Flyable;

public class Valkyrie extends Terran implements Flyable {
    private static final int ATTACK_POWER = 4;
    private static final int DEFENSE_POWER = 12;
    private static final String UNIT_NAME = "Valkyrie";

    public Valkyrie() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
