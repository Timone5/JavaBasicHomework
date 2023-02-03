package ru.otus.homework.finalproject;

public class RUB implements SelectCurrency {
    @Override
    public String getCurrency(long number) {
        if (number == 1)
            return "рубль РФ";
        else if (number > 0 && number < 5)
            return "рубля РФ";
        return "рублей РФ";
    }
}
