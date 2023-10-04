package org.nhnacademy.protos;

import org.nhnacademy.Protos;
import org.nhnacademy.attackType.Flyable;

public class Carrier extends Protos implements Flyable {
    private static final int ATTACK_POWER = 25;
    private static final int DEFENSE_POWER = 40;
    private static final String UNIT_NAME = "Carrier";

    public Carrier() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
