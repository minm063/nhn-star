package org.nhnacademy;

public abstract class Unit {
    /**
     * makeUnits
     * getUnitByIndex
     * printUnits
     * getUnitName
     * getSpeciesName
     */

    private final String unitName;
    private int defensePower;
    private final int attackPower;
    private final String attackType;

    protected Unit(String unitName, String attackPower, String defensePower, String attackType) {
        this.unitName = unitName;
        this.attackPower = Integer.parseInt(attackPower);
        this.defensePower = Integer.parseInt(defensePower);
        this.attackType = attackType;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getAttackType() {
        return attackType;
    }

    public void attack(int attackPower, Unit attackUnit) {
        if (this.attackType.matches("Flyable|Laser|Missile|Sting") && attackUnit.attackType.isEmpty()) {
            throw new IllegalArgumentException("적의 타입이 " + this.attackType + "입니다. 공격할 수 없습니다.");
        }
        this.defensePower -= attackPower;
    }

    public boolean isUnitDead() {
        return defensePower < 0;
    }
}
