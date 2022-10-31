package ru.otus.homework.hw3quiz;

import java.util.Scanner;

public class QuizV2 {
    public static void main(String[] args) {

        int correctCount = 0;
        int wrongCount = 0;

        Scanner scanner = new Scanner(System.in);

        Object[][][] questionsAnswers = new Object[3][3][3];

        questionsAnswers[0][0][0] = "В файл с каким расширением компилируется java-файл?";
        questionsAnswers[0][0][1] = "С помощью какой команды git можно получить полную копию удаленного репозитория?";
        questionsAnswers[0][0][2] = "Какой применяется цикл, когда не известно количество итераций?";


        questionsAnswers[1][0][0] = " 1. cs \n 2. java \n 3. class \n 4. exe";
        questionsAnswers[1][0][1] = " 1. commit \n 2. push \n 3. clone \n 4. copy";
        questionsAnswers[1][0][2] = " 1. while \n 2. for \n 3. loop";


        questionsAnswers[2][0][0] = 3;
        questionsAnswers[2][0][1] = 3;
        questionsAnswers[2][0][2] = 1;


        for (int i = 0; i < questionsAnswers.length; i++) {
            System.out.println(questionsAnswers[0][0][i] + "\n" + questionsAnswers[1][0][i]);

            System.out.print("Ваш ответ: ");
            int usersAnswer = scanner.nextInt();


            if (usersAnswer == (Integer) questionsAnswers[2][0][i]) {
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