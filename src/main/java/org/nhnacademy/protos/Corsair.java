package org.nhnacademy.protos;

import org.nhnacademy.Protos;
import org.nhnacademy.attackType.Flyable;

public class Corsair extends Protos implements Flyable {
    private static final int ATTACK_POWER = 4;
    private static final int DEFENSE_POWER = 12;
    private static final String UNIT_NAME = "Corsair";

    public Corsair() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
