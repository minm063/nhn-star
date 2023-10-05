package org.nhnacademy.species;

import org.nhnacademy.Unit;

public abstract class Terran implements Unit {
    private int attackPower;
    private int defensePower;
    private String speciesName;


    protected Terran(int attackPower, int defensePower) {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        speciesName = "Terran";
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
