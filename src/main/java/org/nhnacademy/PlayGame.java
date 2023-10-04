package org.nhnacademy;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayGame {
    private static final Logger logger = LoggerFactory.getLogger(PlayGame.class);
    private static Random random;
    private static Scanner scanner;

    public static void playGame() {
        scanner = new Scanner(System.in);
        random = new Random();
        int attack;
        int defense;

        logger.info("3가지 종족 중 하나를 선택하세요.(0. Terran\t 1. Protos \t 2. Zerg)");
        try {
            User user = new User(scanner.nextInt());
            User computer = new User(random.nextInt(3));

            while (true) {
                List<Unit> userUnit = user.getUnits();
                List<Unit> computerUnit = computer.getUnits();
                print(user, computer);


                do {
                    logger.info("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요:");
                    logger.info("공격 : ");
                    attack = inputAttack(userUnit.size());
                    scanner.nextLine();
                    logger.info("방어 : ");
                    defense = inputDefense(computerUnit.size());
                    scanner.nextLine();
                } while (attack==-1 || defense==-1);

                // user가 공격
                Attack.attack(computer.getUnits(), computerUnit.get(defense), userUnit.get(attack));
                if (computer.defenseCheck()) {
                    print(user, computer);
                    logger.info("승리했습니다! 게임을 종료합니다.");
                    break;
                }
                // 컴퓨터가 공격
                defense = random.nextInt(userUnit.size());
                attack = random.nextInt(computerUnit.size());
                logger.info("컴퓨터의 공격 : {} -> {}",
                        computerUnit.get(attack).getUnitName(), userUnit.get(defense).getUnitName());
                Attack.attack(user.getUnits(), userUnit.get(defense), computerUnit.get(attack));
                if (user.defenseCheck()) {
                    print(user, computer);
                    logger.info("패배했습니다! 게임을 종료합니다.");
                    break;
                }

            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            logger.warn("out of range");
            //재귀로 다시 게임 시작
            scanner.nextLine();
            playGame();
        }

    }

    private static int inputAttack(int unitSize) {
        try {
            int attack = scanner.nextInt();
            if (attack >= unitSize || attack < 0) {
                throw new InputMismatchException();
            }
            return attack;
        } catch (InputMismatchException e) {
            logger.warn("out of range");
            return -1;
        }
    }
    private static int inputDefense(int unitSize) {
        try {
            int defense = scanner.nextInt();
            if (defense >= unitSize || defense < 0) {
                throw new InputMismatchException();
            }
            return defense;
        } catch (InputMismatchException e) {
            logger.warn("out of range");
            return -1;
        }
    }

    private static void print(User user, User computer) {
        List<Unit> userUnit = user.getUnits();
        List<Unit> computerUnit = computer.getUnits();

        logger.info("적군 : {}", computer.getSpecies());
        for (int i = 0; i < computerUnit.size(); i++) {
            logger.info("{}. {} (현재 방어력: {})",
                    i, computerUnit.get(i).getUnitName(),
                    computerUnit.get(i).getDefensePower());
        }
//        IntStream.range(0, computer.getUnits().size()).forEach(index ->

        logger.info("아군 : {}", user.getSpecies());
        for (int i = 0; i < userUnit.size(); i++) {
            logger.info("{}. {} (현재 방어력: {})",
                    i, userUnit.get(i).getUnitName(),
                    userUnit.get(i).getDefensePower());
        }
//        IntStream.range(0, user.getUnits().size()).forEach(index ->
    }

}
