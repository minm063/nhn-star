package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;

public class Ultralisk extends Zerg {
    private static final String UNIT_NAME = "Ultralisk";

    public Ultralisk() {
        super(5, 15);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
