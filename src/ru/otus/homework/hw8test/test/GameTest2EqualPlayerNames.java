package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.assertions.Assertions;
import ru.otus.homework.hw8test.game.Player;

public class GameTest2EqualPlayerNames {
    public void testEqualPlayerNames() {
        String scenario = "Test for equal player names";
        try {
            Player player = new Player("Tim");
            Player player1 = new Player("Tim");
            Assertions.assertEquals(player.toString(), player1.toString());
            System.out.printf("\"%s\" passed.%n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\".%n", scenario, e.getMessage());
        }
    }
}
