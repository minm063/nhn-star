package org.nhnacademy;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.nhnacademy.unitType.ProtosUnit;
import org.nhnacademy.unitType.TerranUnit;
import org.nhnacademy.unitType.ZergUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private String species;
    private List<Unit> units;

    public User(int index) {
        switch (index) {
            case 0:
                this.species = "Terran";
                makeUnit(SpeciesNumber.TERRAN.getNumber());
                break;
            case 1:
                this.species = "Protos";
                makeUnit(SpeciesNumber.PROTOS.getNumber());
                break;
            case 2:
                this.species = "Zerg";
                makeUnit(SpeciesNumber.ZERG.getNumber());
                break;
            default:
                throw new IllegalArgumentException("잘못된 번호입니다.");
        }
    }


    public String getSpecies() {
        return species;
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

    public boolean hasFlyableWeapon() {
        int count = 0;
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).getAttackType().matches("Flyable|Laser|Missile|Sting")) {
                count++;
            }
        }
        return units.size() == count;
    }

    public boolean hasNonWeapon() {
        int count = 0;
        for (int i = 0; i < units.size(); i++) {
            if (units.get(i).getAttackType().isBlank()) {
                count++;
            }
        }
        return units.size() == count;
    }

    public void removeUnit() {
        units.removeIf(Unit::isUnitDead);
    }

    // null인지 전체 체크
    public boolean defenseCheck() {
        return units.isEmpty();
    }

    public int getSize() {
        return units.size();
    }

    public void makeUnit(int speciesNumber) {
        Random random = new Random();
        units = new ArrayList<>();
        try {
            JSONParser parser = new JSONParser();
            JSONObject unitObj = (JSONObject) parser.parse(new FileReader("src/main/resources/units.json"));
            JSONArray unitJson = (JSONArray) unitObj.get(species);
            for (int i = 0; i < speciesNumber; i++) {
                JSONObject obj = (JSONObject) unitJson.get(random.nextInt(unitJson.size()));
                units.add(
                        unitBySpecies((String) obj.get("name"), (String) obj.get("attack"), (String) obj.get("defense"),
                                (String) obj.get("type")));
            }
        } catch (IOException | ParseException e) {
            logger.warn(e.getMessage());
        }
    }

    private Unit unitBySpecies(String name, String attack, String defense, String type) {

        switch (species) {
            case "Protos":
                return new ProtosUnit(name, attack, defense, type);
            case "Terran":
                return new TerranUnit(name, attack, defense, type);
            case "Zerg":
                return new ZergUnit(name, attack, defense, type);
            default:
                throw new IllegalArgumentException("해당하는 종족이 존재하지 않습니다.");
        }
    }
}
