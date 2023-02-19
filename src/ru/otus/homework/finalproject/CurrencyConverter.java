package ru.otus.homework.finalproject;

import java.util.Scanner;

public class CurrencyConverter {
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
            case RUB -> new RUBSelectCurrency();
            case USD -> new USDSelectCurrency();
            case GBP -> new GBPSelectCurrency();
            case BTC -> new BTCSelectCurrency();
        };
        return (number + " " + currencySelect.getCurrency(number));
    }
}