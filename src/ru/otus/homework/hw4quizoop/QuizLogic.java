package ru.otus.homework.hw4quizoop;

import java.util.Scanner;

public class QuizLogic {
    private final String[] questions =
            {"В файл с каким расширением компилируется java-файл?",
                    "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                    "Какой применяется цикл, когда не известно количество итераций?"};

    private final String[] answers =
            {" 1. cs \n 2. java \n 3. class \n 4. exe",
                    " 1. commit \n 2. push \n 3. clone \n 4. copy",
                    " 1. while \n 2. for \n 3. loop"};

    private final int[] rightAnswers = {3, 3, 1};

    private int correctCount = 0;
    private int wrongCount = 0;

    public void startQuiz() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i] + "\n" + answers[i]);
            int input = scan.nextInt();

            if (input == rightAnswers[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }

        }
        getResult();
        correctCount = 0;
        wrongCount = 0;

        System.out.println("\nВозврат в меню...\n" + QuizMenu.menu);

    }

    public void getQuestions() {
        printArray(questions);
        System.out.println("\n" + "Возврат в меню...\n" + QuizMenu.menu);
    }

    public void getResult() {
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }


    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}