package ru.otus.homework.finalproject;

public class USDSelectCurrency implements SelectCurrency {
    @Override
    public String getCurrency(long number) {
        if (number == 1)
            return "доллар США";
        else if (number > 0 && number < 5)
            return "доллара США";
        return "долларов США";
    }
}
