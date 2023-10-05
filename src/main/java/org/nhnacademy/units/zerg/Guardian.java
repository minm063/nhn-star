package org.nhnacademy.units.zerg;

import org.nhnacademy.species.Zerg;
import org.nhnacademy.attackType.Flyable;

public class Guardian extends Zerg implements Flyable {
    private static final String UNIT_NAME = "Guardian";

    public Guardian() {
        super(3, 6);
    }

    @Override
    public String getUnitName() {
        return UNIT_NAME;
    }

}
