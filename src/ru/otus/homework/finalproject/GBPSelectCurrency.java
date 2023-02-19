package ru.otus.homework.finalproject;

public class GBPSelectCurrency implements SelectCurrency {
    @Override
    public String getCurrency(long number) {
        if (number == 1) return "фунт стерлингов";
        else if (number > 0 && number < 5) return "фунта стерлингов";
        return "фунтов стерлингов";
    }
}
