package ru.otus.homework.hw8test;

import ru.otus.homework.hw8test.game.*;

public class Demo {
    public static void main(String[] args) {
        Dice dice = new DiceImpl();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
        Game game = new Game(dice, winnerPrinter);
        game.playGame(new Player("Tim"), new Player("Peter"));
    }
}
