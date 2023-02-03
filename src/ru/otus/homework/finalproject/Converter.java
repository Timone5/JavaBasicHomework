package ru.otus.homework.finalproject;

import java.util.Scanner;

public class Converter {
    public static String convertNumber(Currency currency, long number) {
        return getString(currency, number);
    }

    public static String convertNumber(Currency currency) {
        System.out.printf("Введите число (%s):\n", currency);
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        return getString(currency, number);
    }

    private static String getString(Currency currency, long number) {
        SelectCurrency currencySelect = switch (currency) {
            case RUB -> new RUB();
            case USD -> new USD();
            case GBP -> new GBP();
            case BTC -> new BTC();
        };
        return (number + " " + currencySelect.getCurrency(number));
    }
}