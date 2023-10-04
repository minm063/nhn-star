package org.nhnacademy.protos;

import org.nhnacademy.Protos;

public class HighTempler extends Protos {
    private static final int ATTACK_POWER = 10;
    private static final int DEFENSE_POWER = 2;
    private static final String UNIT_NAME = "HighTempler";

    public HighTempler() {
        super(ATTACK_POWER, DEFENSE_POWER);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
