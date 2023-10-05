package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;
import org.nhnacademy.attackType.Flyable;

public class Queen extends Zerg implements Flyable {
    private static final String UNIT_NAME = "Queen";

    public Queen() {
        super(15, 25);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }


}
