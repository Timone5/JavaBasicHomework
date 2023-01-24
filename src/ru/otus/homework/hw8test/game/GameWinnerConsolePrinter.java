package ru.otus.homework.hw8test.game;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf("Winner: %s%n", winner.getName());
    }
}
