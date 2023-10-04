package org.nhnacademy.protos;

import org.nhnacademy.Protos;
import org.nhnacademy.attackType.Laser;

public class Dragoon extends Protos implements Laser {
    private static final int ATTACK_POWER = 3;
    private static final int DEFENSE_POWER = 3;
    private static final String UNIT_NAME = "Dragoon";

    public Dragoon() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
