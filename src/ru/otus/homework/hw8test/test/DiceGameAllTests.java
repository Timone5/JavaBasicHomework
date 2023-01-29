package ru.otus.homework.hw8test.test;

public class DiceGameAllTests {
    public static void main(String[] args) {
        new DiceImplTest1Range().diceRangeTest();
        new DiceImplTest2Draw().drawTest();
        new GameTest1Winner().winnerTest();
        new GameTest2EqualPlayerNames().testEqualPlayerNames();
    }
}
