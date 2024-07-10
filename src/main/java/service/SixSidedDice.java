package service;

import interfaces.Dice;

import java.util.Random;

public class SixSidedDice implements Dice {
    private final Random random = new Random();

    public int roll() {
        return random.nextInt(6) + 1;
    }
}
