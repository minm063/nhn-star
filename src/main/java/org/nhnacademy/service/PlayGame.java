package org.nhnacademy.service;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.nhnacademy.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayGame {
    private static final Logger logger = LoggerFactory.getLogger(PlayGame.class);
    private static Random random;
    private static Scanner scanner;

    public static void playGame() {
        scanner = new Scanner(System.in);
        random = new Random();

        logger.info("3가지 종족 중 하나를 선택하세요.(0. Terran\t 1. Protos \t 2. Zerg)");
        User user = new User(pickSpecies());
        User computer = new User(random.nextInt(3));

        while (true) {
            print(user, computer);

            int userUnitIndex;
            int computerUnitIndex;
            logger.info("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요.");
            do {
                userUnitIndex = (inputAttack(user.getSize()));
            } while (userUnitIndex == -1);
            do {
                computerUnitIndex = (inputDefense(computer.getSize()));
            } while (computerUnitIndex == -1);

            try {
                if (userTurn(userUnitIndex, computerUnitIndex, user, computer)) {
                    break;
                }
                if (computerTurn(user, computer)) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                logger.warn(e.getMessage());
            }

        }
    }

    private static boolean userTurn(int userUnitIndex, int computerUnitIndex, User user, User computer) {
        // user가 공격
        logger.info("유저의 공격 : {} -> {}", user.getUnitInList(userUnitIndex).getUnitName(), computer.getUnitInList(computerUnitIndex).getUnitName());

        Attack.attack(user.getUnitInList(userUnitIndex), computer.getUnitInList(computerUnitIndex), computer);

        if (computer.defenseCheck()) {
            print(user, computer);
            logger.info("승리했습니다! 게임을 종료합니다.");
            return true;
        }
        return false;
    }

    private static boolean computerTurn(User user, User computer) {
        // 컴퓨터가 공격
        int defenseIndex = random.nextInt(user.getSize());
        int attackIndex = random.nextInt(computer.getSize());

        logger.info("컴퓨터의 공격 : {} -> {}",
                computer.getUnitInList(attackIndex).getUnitName(), user.getUnitInList(defenseIndex).getUnitName());

        Attack.attack(computer.getUnitInList(attackIndex), user.getUnitInList(defenseIndex), user);
        if (user.defenseCheck()) {
            print(user, computer);
            logger.info("패배했습니다! 게임을 종료합니다.");
            return true;
        }
        return false;
    }

    private static int inputAttack(int unitSize) {
        try {
            int attack = scanner.nextInt();
            if (attack >= unitSize || attack < 0) {
                throw new IllegalArgumentException("범위에서 벗어났습니다.");
            }
            return attack;
        } catch (IllegalArgumentException e) {
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
        logger.info("적군 : {}", computer.getSpecies());
        computer.printUnit();
        logger.info("아군 : {}", user.getSpecies());
        user.printUnit();
    }

    private static int pickSpecies() {
        int speciesNumber = 0;
        try {
            speciesNumber = scanner.nextInt();
            if (speciesNumber < 0 || speciesNumber > 3) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            logger.warn("범위 내에서 종족을 선택하세요. 입력값은 정수입니다.");
            scanner.nextLine();
            pickSpecies();
        }
        return speciesNumber;
    }

}
