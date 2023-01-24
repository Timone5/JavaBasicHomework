package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.assertions.Assertions;
import ru.otus.homework.hw8test.game.Dice;
import ru.otus.homework.hw8test.game.DiceImpl;

public class DiceImplTest2Draw {
    private final Dice dice = new DiceImpl();

    public void drawTest() {
        String scenario = "Test for a draw";
        int drawCount = 0;
        try {
            for (int i = 0; i < 10; i++) {
                Assertions.assertEquals(dice.roll(), dice.roll());
                ++drawCount;
            }
            System.out.printf("\"%s\" passed, total rolls: 10, including draws: %d.\n", scenario, drawCount);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\".%n", scenario, e.getMessage());
        }
    }
}
