package ru.otus.homework.hw8test.test;

import ru.otus.homework.hw8test.game.GameWinnerPrinter;
import ru.otus.homework.hw8test.game.Player;

public class GameWinnerConsolePrinterStub implements GameWinnerPrinter {
    Player winner;

    @Override
    public void printWinner(Player winner) {
        this.winner = winner;
    }

    public Player getWinner() {
        return winner;
    }
}