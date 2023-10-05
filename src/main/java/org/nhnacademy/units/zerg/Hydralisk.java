package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;
import org.nhnacademy.attackType.Sting;

public class Hydralisk extends Zerg implements Sting {
    private static final String UNIT_NAME = "Hydralisk";

    public Hydralisk() {
        super(3, 7);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
