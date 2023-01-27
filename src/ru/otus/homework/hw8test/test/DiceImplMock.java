package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.game.Dice;

public class DiceImplMock implements Dice {
    private int count = 0;

    @Override
    public int roll() {
        count++;
        if (count == 1) {
            return 6;
        }
        return 3;
    }
}