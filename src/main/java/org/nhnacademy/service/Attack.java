package org.nhnacademy.service;

import org.nhnacademy.Unit;
import org.nhnacademy.User;
import org.nhnacademy.attackType.Flyable;
import org.nhnacademy.attackType.Weapons;

public class Attack {
    public static void attack(Unit attackUnit, Unit defenseUnit, User defenseUser) {

        if (attackUnit instanceof Weapons) {
            // attack
            defenseUnit.attackDefensePower(attackUnit.getAttackPower());
        } else {
            if (defenseUnit instanceof Flyable) {
                throw new IllegalArgumentException(attackUnit.getUnitName() + "는 " + defenseUnit.getUnitName() + "을 공격할 수 없습니다.");
            }
            // attack
            defenseUnit.attackDefensePower(attackUnit.getAttackPower());
        }

        if (defenseUnit.getDefensePower() <= 0) {
            defenseUser.removeUnit(defenseUnit);
        }
    }
}
