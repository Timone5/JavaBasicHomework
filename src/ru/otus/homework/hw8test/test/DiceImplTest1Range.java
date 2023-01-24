package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.game.Dice;
import ru.otus.homework.hw8test.game.DiceImpl;

public class DiceImplTest1Range {
    private final Dice dice = new DiceImpl();

    public void diceRangeTest() {
        String scenario = "Test for out of range of a dice [1; 6]";

        try {
            for (int i = 0; i < 3; i++) {
                int diceValue = dice.roll();
                boolean diceValueIsOk = (diceValue >= 1 && diceValue <= 6);
                if (diceValueIsOk) {
                    System.out.printf("\"%s\" passed. Value: %d.\n", scenario, diceValue);
                } else {
                    throw new RuntimeException(scenario + " not passed. Value " + diceValue + " is out of range.");
                }
            }
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n.", scenario, e.getMessage());
        }
    }
}
