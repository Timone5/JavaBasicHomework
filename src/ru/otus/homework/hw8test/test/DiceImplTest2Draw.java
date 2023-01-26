package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.assertions.Assertions;
import ru.otus.homework.hw8test.game.Dice;
import ru.otus.homework.hw8test.game.DiceImpl;
import ru.otus.homework.hw8test.game.Game;
import ru.otus.homework.hw8test.game.Player;

public class DiceImplTest2Draw {
    private final Dice dice = new DiceImpl();

    public void drawTest() {
        String scenario = "Test for a draw";
        try {
            GameWinnerConsolePrinterStub gameWinnerConsolePrinterStub = new GameWinnerConsolePrinterStub();
            Game game = new Game(new DiceImplStub(), gameWinnerConsolePrinterStub);
            Player player = new Player("Tim");
            Player player1 = new Player("Peter");
            game.playGame(player, player1);
            Assertions.assertDraw("draw", gameWinnerConsolePrinterStub.getWinner());
            System.out.printf("\"%s\" passed.\n", scenario);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
