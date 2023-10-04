package org.nhnacademy;

import java.util.List;
import org.nhnacademy.attackType.HighAttack;

public class Attack {
    public static void attack(List<Unit> defenseList, Unit defenseUnit, Unit attackUnit) {
        if (defenseUnit instanceof HighAttack && !(attackUnit instanceof HighAttack)) {
            return;
        }
        defenseUnit.attackDefensePower(attackUnit.getAttackPower());
        if (defenseUnit.getDefensePower() <= 0) {
            defenseList.remove(defenseUnit);
        }
    }
}
