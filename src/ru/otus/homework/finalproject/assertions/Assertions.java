package ru.otus.homework.finalproject.assertions;

public class Assertions {
    public static void assertEquals(String excepted, String actual) {
        if (!excepted.equals(actual)) {
            throw new AssertionError(excepted + "!= " + actual);
        } else {
            System.out.println((excepted + " == " + actual));
        }
    }
}
