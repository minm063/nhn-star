package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;
import org.nhnacademy.attackType.Flyable;

public class Mutalisk extends Zerg implements Flyable {
    private static final String UNIT_NAME = "Mutalisk";

    public Mutalisk() {
        super(2, 8);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
