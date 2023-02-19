package ru.otus.homework.finalproject.test;

import ru.otus.homework.finalproject.Currency;
import ru.otus.homework.finalproject.CurrencyConverter;
import ru.otus.homework.finalproject.assertions.Assertions;

public class ConverterTest {

    public static void testRUB() {
        String scenario = "\nПроверка на корректность конвертации числа в рубли РФ:";
        System.out.println(scenario);
        try {
            Assertions.assertEquals("0 рублей РФ", CurrencyConverter.convertNumber(Currency.RUB, 0L));
            Assertions.assertEquals("1 рубль РФ", CurrencyConverter.convertNumber(Currency.RUB, 1L));
            Assertions.assertEquals("2 рубля РФ", CurrencyConverter.convertNumber(Currency.RUB, 2L));
            Assertions.assertEquals("5 рублей РФ", CurrencyConverter.convertNumber(Currency.RUB, 5L));
            Assertions.assertEquals("100500 рублей РФ", CurrencyConverter.convertNumber(Currency.RUB, 100500L));
        } catch (AssertionError e) {
            System.err.println(scenario + " выдала ошибку " + e + "\n");
        }
    }

    public static void testUSD() {
        String scenario = "\nПроверка на корректность конвертации числа в доллары США:";
        System.out.println(scenario);
        try {
            Assertions.assertEquals("0 долларов США", CurrencyConverter.convertNumber(Currency.USD, 0L));
            Assertions.assertEquals("1 доллар США", CurrencyConverter.convertNumber(Currency.USD, 1L));
            Assertions.assertEquals("2 доллара США", CurrencyConverter.convertNumber(Currency.USD, 2L));
            Assertions.assertEquals("5 долларов США", CurrencyConverter.convertNumber(Currency.USD, 5L));
            Assertions.assertEquals("100500 долларов США", CurrencyConverter.convertNumber(Currency.USD, 100500L));
        } catch (AssertionError e) {
            System.err.println(scenario + " выдала ошибку " + e + "\n");
        }
    }

    public static void testGBP() {
        String scenario = "\nПроверка на корректность конвертации числа в фунты стерлингов:";
        System.out.println(scenario);
        try {
            Assertions.assertEquals("0 фунтов стерлингов", CurrencyConverter.convertNumber(Currency.GBP, 0L));
            Assertions.assertEquals("1 фунт стерлингов", CurrencyConverter.convertNumber(Currency.GBP, 1L));
            Assertions.assertEquals("2 фунта стерлингов", CurrencyConverter.convertNumber(Currency.GBP, 2L));
            Assertions.assertEquals("5 фунтов стерлингов", CurrencyConverter.convertNumber(Currency.GBP, 5L));
            Assertions.assertEquals("100500 фунтов стерлингов", CurrencyConverter.convertNumber(Currency.GBP, 100500L));
        } catch (AssertionError e) {
            System.err.println(scenario + " выдала ошибку " + e + "\n");
        }
    }

    public static void testBTC() {
        String scenario = "\nПроверка на корректность конвертации числа в биткоины:";
        System.out.println(scenario);
        try {
            Assertions.assertEquals("0 биткоинов", CurrencyConverter.convertNumber(Currency.BTC, 0L));
            Assertions.assertEquals("1 биткоин", CurrencyConverter.convertNumber(Currency.BTC, 1L));
            Assertions.assertEquals("2 биткоина", CurrencyConverter.convertNumber(Currency.BTC, 2L));
            Assertions.assertEquals("5 биткоинов", CurrencyConverter.convertNumber(Currency.BTC, 5L));
            Assertions.assertEquals("100500 биткоинов", CurrencyConverter.convertNumber(Currency.BTC, 100500L));
        } catch (AssertionError e) {
            System.err.println(scenario + " выдала ошибку " + e + "\n");
        }
    }
}
