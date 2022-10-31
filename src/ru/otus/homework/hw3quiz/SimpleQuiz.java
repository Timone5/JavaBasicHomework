package ru.otus.homework.hw3quiz;

import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        int wrongCount = 0;


        String[] questions =
                {"В файл с каким расширением компилируется java-файл?",
                        "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                        "Какой применяется цикл, когда не известно количество итераций?"};


        String[] answers = {" 1. cs \n 2. java \n 3. class \n 4. exe",
                " 1. commit \n 2. push \n 3. clone \n 4. copy",
                " 1. while \n 2. for \n 3. loop"};

        int[] rightAnswers = {3, 3, 1};


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + "\n" + answers[i]);
            int answer = scanner.nextInt();
            if (answer == rightAnswers[i]) {
                ++correctCount;
                System.out.println("Правильно");
            } else {
                ++wrongCount;
                System.out.println("Неправильно");
            }

        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}