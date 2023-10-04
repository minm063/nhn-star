package org.nhnacademy;

public abstract class Protos implements Unit{
    private int attackPower;
    private int defensePower;
    private String speciesName;


    protected Protos(int attackPower, int defensePower) {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        speciesName = "Protos";
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
