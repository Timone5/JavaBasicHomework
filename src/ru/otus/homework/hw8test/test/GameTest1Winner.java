package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.assertions.Assertions;
import ru.otus.homework.hw8test.game.Game;
import ru.otus.homework.hw8test.game.Player;

public class GameTest1Winner {
    public void winnerTest() {
        String scenario = "Test for a winner";
        try {
            GameWinnerConsolePrinterStub winnerPrinter = new GameWinnerConsolePrinterStub();
            Game game = new Game(new DiceImplMock(), winnerPrinter);
            Player player = new Player("Tim");
            Player player1 = new Player("Peter");
            game.playGame(player, player1);
            Assertions.assertEquals(player, winnerPrinter.getWinner());
            System.out.printf("\"%s\" passed.\n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n.", scenario, e.getMessage());
        }
    }
}