package org.nhnacademy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeUnits {
    private static Random random;

    public static List<Unit> makeUnits(String species) {
        random = new Random();
        List<Unit> units = new ArrayList<>();

        switch (species.toLowerCase()) {
            case "terran":
                File file = new File("src/main/java/org/nhnacademy/terran");
                String[] terrans = file.list();
                try {
                    for (int i = 0; i < 5; i++) {
                        String unit = terrans[random.nextInt(terrans.length)];
                        // string을 클래스 객체로
                        Object o = Class.forName("org.nhnacademy.terran." + unit.replace(".java", ""))
                                .getDeclaredConstructor().newInstance();
                        // arrayList에 추가
                        units.add((Unit) o);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
                }
                return units;
            case "protos":
                file = new File("src/main/java/org/nhnacademy/protos");
                String[] protosList = file.list();
                try {
                    for (int i = 0; i < 4; i++) {
                        String unit = protosList[random.nextInt(protosList.length)];
                        // string을 클래스 객체로
                        Object o =
                                Class.forName("org.nhnacademy.protos." + unit.replace(".java", ""))
                                        .getDeclaredConstructor().newInstance();
                        // arrayList에 추가
                        units.add((Unit) o);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
                }
                return units;
            case "zerg":
                file = new File("src/main/java/org/nhnacademy/zerg");
                String[] zergList = file.list();
                try {
                    for (int i = 0; i < 8; i++) {
                        String unit = zergList[random.nextInt(zergList.length)];
                        // string을 클래스 객체로
                        Object o =
                                Class.forName("org.nhnacademy.zerg." + unit.substring(0, unit.length() - 5))
                                        .getDeclaredConstructor().newInstance();
                        // arrayList에 추가
                        units.add((Unit) o);
                    }
                } catch (Exception e) {
                    throw new RuntimeException("파일을 읽어오지 못했습니다.");
                }
                return units;
            default:
                throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
