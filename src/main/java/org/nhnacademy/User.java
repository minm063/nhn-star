package org.nhnacademy;

import java.util.ArrayList;
import java.util.List;
import org.nhnacademy.service.MakeUnits;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);
    private String species;
    private ArrayList<Unit> units;

    public User(int index) {
        String[] speciesList = {"Terran", "Protos", "Zerg"};
        this.species = speciesList[index];
        setUnits();
    }


    public String getSpecies() {
        return species;
    }

    public void setUnits() {
        units = new ArrayList<>(MakeUnits.makeUnits(species));
    }

    public Unit getUnitInList(int index) {
        return units.get(index);
    }

    public void printUnit() {
        for (int i = 0; i < units.size(); i++) {
            logger.info("{}. {} (현재 방어력: {})",
                    i, units.get(i).getUnitName(), units.get(i).getDefensePower());
        }
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    // null인지 전체 체크
    public boolean defenseCheck() {
        return units.isEmpty();
    }

    public int getSize() {
        return units.size();
    }

}
