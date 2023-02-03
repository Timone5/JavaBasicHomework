package ru.otus.homework.finalproject;

public class BTC implements SelectCurrency {
    @Override
    public String getCurrency(long number) {
        if (number == 1)
            return "биткоин";
        else if (number > 0 && number < 5)
            return "биткоина";
        return "биткоинов";
    }
}