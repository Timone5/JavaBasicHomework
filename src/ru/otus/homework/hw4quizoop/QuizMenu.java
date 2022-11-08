package ru.otus.homework.hw4quizoop;

import java.util.Scanner;

public class QuizMenu {
    QuizLogic quiz = new QuizLogic();

    public static String menu =
            """
                    1. Начать тест
                    2. Показать вопросы
                    3. Выйти
                    """;

    public void menuApp() {
        hello();
        System.out.println(menu);
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> quiz.startQuiz();
                case 2 -> quiz.getQuestions();
                case 3 -> exit = true;
                default -> System.out.println("Введено некорректное значение");
            }
        } while (!exit);
    }

    public void hello() {
        System.out.println("Приветствую!\nВыберите нужный пункт меню: ");
    }
}