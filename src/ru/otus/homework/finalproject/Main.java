package ru.otus.homework.finalproject;

import ru.otus.homework.finalproject.test.ConverterTest;

public class Main {
    public static void main(String[] args) {
        System.out.println(Converter.convertNumber(Currency.RUB));
        System.out.println(Converter.convertNumber(Currency.USD));
        System.out.println(Converter.convertNumber(Currency.GBP));
        System.out.println(Converter.convertNumber(Currency.BTC));

        System.out.println("\nТесты:");
        ConverterTest.testRUB();
        ConverterTest.testUSD();
        ConverterTest.testGBP();
        ConverterTest.testBTC();
    }
}
