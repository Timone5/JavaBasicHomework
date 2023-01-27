package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.game.Dice;

import java.util.Random;

public class DiceImplStub implements Dice {
    @Override
    public int roll() {
        return new Random().nextInt(6) + 1;
    }
}