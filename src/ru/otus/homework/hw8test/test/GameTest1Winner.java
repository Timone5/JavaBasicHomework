package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.assertions.Assertions;
import ru.otus.homework.hw8test.game.Player;

public class GameTest1Winner {
    private final Player player;
    private final Player player1;
    private final int diceResult;
    private final int diceResult1;

    public GameTest1Winner(Player player, Player player1, int diceResult, int diceResult1) {
        this.player = player;
        this.player1 = player1;
        this.diceResult = diceResult;
        this.diceResult1 = diceResult1;
    }

    public void winnerTest(Player exceptedWinner) {
        String scenario = "Test for a winner";
        //Player winner = (this.diceResult > this.diceResult1) ? this.player : this.player1;
        Player winner = (this.diceResult == diceResult1) ? null : (this.diceResult > this.diceResult1) ? this.player : this.player1;
        try {
            assert winner != null;
            Assertions.assertEquals(exceptedWinner.getName(), winner.getName());
            System.out.printf("\"%s\" passed. %s scored %d and %s scored %d.\n", scenario, player, diceResult, player1, diceResult1);
        } catch (AssertionError e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n.", scenario, e.getMessage());
        }
    }
}