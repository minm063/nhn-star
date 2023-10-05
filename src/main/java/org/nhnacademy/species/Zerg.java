package org.nhnacademy.species;

import org.nhnacademy.Unit;

public abstract class Zerg implements Unit {
    private int attackPower;
    private int defensePower;
    private String speciesName;


    protected Zerg(int attackPower, int defensePower) {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        speciesName = "Zerg";
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public int getDefensePower() {
        return defensePower;
    }

    public void attackDefensePower(int attackPower) {
        this.defensePower = (this.defensePower - attackPower);
    }

    public String getSpeciesName() {
        return speciesName;
    }

}
