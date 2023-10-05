package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;

public class Zergling extends Zerg {
    private static final String UNIT_NAME = "Zergling";

    public Zergling() {
        super(2, 2);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
