package org.nhnacademy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        logger.info("3가지 종족(Terran, Protos, Zerg) 중 하나를 선택하세요.");
//        try {
//            User user = new User(scanner.nextLine());
//            User computer = new User(random.nextInt(3));
//
//            while (true) {
//                List<Unit> userUnit = user.getUnits();
//                List<Unit> computerUnit = computer.getUnits();
//                print(user, computer);
//
//
//                logger.info("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요:");
//                int attack = scanner.nextInt();
//                int defense = scanner.nextInt();
//                if (defense >= computerUnit.size() || attack >= userUnit.size()) {
//                    logger.info("유닛 범위를 초과합니다. 다시 입력해주세요");
//                    continue;
//                }
//                // user가 공격
//                user.attack(computer.getUnits(), computerUnit.get(defense), userUnit.get(attack));
//                if (computer.defenseCheck()) {
//                    print(user, computer);
//                    logger.info("승리했습니다! 게임을 종료합니다.");
//                    break;
//                }
//                // 컴퓨터가 공격
//                defense = random.nextInt(userUnit.size());
//                attack = random.nextInt(computerUnit.size());
//                logger.info("컴퓨터의 공격 : {} -> {}",
//                        computerUnit.get(attack).getUnitName(), userUnit.get(defense).getUnitName());
//                computer.attack(user.getUnits(), userUnit.get(defense), computerUnit.get(attack));
//                if (user.defenseCheck()) {
//                    print(user, computer);
//                    logger.info("패배했습니다! 게임을 종료합니다.");
//                    break;
//                }
//            }
//        } catch (IllegalArgumentException e) {
//            logger.warn(e.getMessage());
//            //재귀로 다시 게임 시작
//        }
        PlayGame.playGame();
    }

//    private static void print(User user, User computer) {
//        List<Unit> userUnit = user.getUnits();
//        List<Unit> computerUnit = computer.getUnits();
//
//        logger.info("적군 : {}", computer.getSpecies());
//        for (int i = 0; i < computerUnit.size(); i++) {
//            logger.info("{}. {} (현재 방어력: {})",
//                    i, computerUnit.get(i).getUnitName(),
//                    computerUnit.get(i).getDefensePower());
//        }
////        IntStream.range(0, computer.getUnits().size()).forEach(index ->
//
//        logger.info("아군 : {}", user.getSpecies());
//        for (int i = 0; i < userUnit.size(); i++) {
//            logger.info("{}. {} (현재 방어력: {})",
//                    i, userUnit.get(i).getUnitName(),
//                    userUnit.get(i).getDefensePower());
//        }
////        IntStream.range(0, user.getUnits().size()).forEach(index ->
//    }
}
