package org.nhnacademy.protos;

import org.nhnacademy.Protos;

public class Zealot extends Protos {
    private static final int ATTACK_POWER = 5;
    private static final int DEFENSE_POWER = 20;
    private static final String UNIT_NAME = "Zealot";

    public Zealot() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
