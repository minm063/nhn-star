package org.nhnacademy;

public enum SpeciesNumber {
    PROTOS(4),
    TERRAN(5),
    ZERG(8);

    private int number;
    SpeciesNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
