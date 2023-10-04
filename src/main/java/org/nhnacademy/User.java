package org.nhnacademy;

import java.util.ArrayList;
import java.util.List;

public class User {
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

    public List<Unit> getUnits() {
        return units;
    }

    // 싸움
//    public void attack(List<Unit> defenseList, Unit defenseUnit, Unit attackUnit) {
//        if (defenseUnit instanceof HighAttack && !(attackUnit instanceof HighAttack)) {
//            return;
//        }
//        defenseUnit.attackDefensePower(attackUnit.getAttackPower());
//        if (defenseUnit.getDefensePower() <= 0) {
//            defenseList.remove(defenseUnit);
//        }
//    }

    // null인지 전체 체크
    public boolean defenseCheck() {
        return units.isEmpty();
    }

    /**
     * Terran을 선택하면 5개의 유닛이 무작위로 생성됩니다.
     * Protos를 선택하면 4개의 유닛이 무작위로 생성됩니다.
     * Zerg를 선택하면 8개의 유닛이 무작위로 생성됩니다.
     */
//    private void makeUnits() {
//        units = new ArrayList<>();
//        switch (species.toLowerCase()) {
//            case "terran":
//                File file = new File("src/main/java/org/nhnacademy/terran");
//                String[] terrans = file.list();
//                random = new Random();
//                try {
//                    for (int i = 0; i < 5; i++) {
//                        String unit = terrans[random.nextInt(terrans.length)];
//                        // string을 클래스 객체로
//                        Object o = Class.forName("org.nhnacademy.terran." + unit.replace(".java", ""))
//                                .getDeclaredConstructor().newInstance();
//                        // arrayList에 추가
//                        units.add((Unit) o);
//                    }
//                } catch (Exception e) {
//                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
//                }
//                break;
//            case "protos":
//                file = new File("src/main/java/org/nhnacademy/protos");
//                String[] protosList = file.list();
//                random = new Random();
//                try {
//                    for (int i = 0; i < 4; i++) {
//                        String unit = protosList[random.nextInt(protosList.length)];
//                        // string을 클래스 객체로
//                        Object o =
//                                Class.forName("org.nhnacademy.protos." + unit.replace(".java", ""))
//                                        .getDeclaredConstructor().newInstance();
//                        // arrayList에 추가
//                        units.add((Unit) o);
//                    }
//                } catch (Exception e) {
//                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
//                }
//                break;
//            case "zerg":
//                file = new File("src/main/java/org/nhnacademy/zerg");
//                String[] zergList = file.list();
//                random = new Random();
//                try {
//                    for (int i = 0; i < 8; i++) {
//                        String unit = zergList[random.nextInt(zergList.length)];
//                        // string을 클래스 객체로
//                        Object o =
//                                Class.forName("org.nhnacademy.zerg." + unit.substring(0, unit.length() - 5))
//                                        .getDeclaredConstructor().newInstance();
//                        // arrayList에 추가
//                        units.add((Unit) o);
//                    }
//                } catch (Exception e) {
//                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("잘못된 입력입니다.");
//        }
//    }
}
