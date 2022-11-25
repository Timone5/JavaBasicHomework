package ru.otus.homework.hw4quizoop;

import java.util.Scanner;

public class QuizLogic {

    public QuizLogic() {
        questions = new Question[]{
                new Question("В файл с каким расширением компилируется java-файл?", " 1. cs \n 2. java \n 3. class \n 4. exe", 3),
                new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?", " 1. commit \n 2. push \n 3. clone \n 4. copy", 3),
                new Question("Какой применяется цикл, когда не известно количество итераций?", " 1. while \n 2. for \n 3. loop", 1)
        };
    }

    private final Question[] questions;

    private int correctCount = 0;
    private int wrongCount = 0;

    public void startQuiz() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i].getQuestion() + "\n" + questions[i].getAnswerOption());
            int input = scan.nextInt();

            if (input == questions[i].getRightAnswer()) {
                correctCount++;
            } else {
                wrongCount++;
            }

        }
        printResult();
        correctCount = 0;
        wrongCount = 0;

        System.out.println("\nВозврат в меню...\n" + QuizMenu.menu);

    }

    public void printQuestions() {
        printArray(questions);
        System.out.println("\n" + "Возврат в меню...\n" + QuizMenu.menu);
    }

    public void printResult() {
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }


    public void printArray(Question[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getQuestion());
        }
    }
}