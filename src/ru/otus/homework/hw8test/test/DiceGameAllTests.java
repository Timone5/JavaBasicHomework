package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.game.Player;

public class DiceGameAllTests {
    public static void main(String[] args) {
        new DiceImplTest1Range().diceRangeTest();
        new DiceImplTest2Draw().drawTest();
        new GameTest1Winner(new Player("Tim"), new Player("Peter"), 6, 3).winnerTest(new Player("Tim"));
        new GameTest2EqualPlayerNames().testEqualPlayerNames();
    }
}
