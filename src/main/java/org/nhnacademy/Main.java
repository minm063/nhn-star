package org.nhnacademy;

import org.nhnacademy.service.PlayGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        PlayGame.playGame();
    }
}
