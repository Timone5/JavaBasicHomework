package ru.otus.homework.hw4quizoop;

public class Question {
    private String question;
    private String answerOption;
    private int rightAnswer;

    public Question(String question, String answerOption, int rightAnswer) {
        this.question = question;
        this.answerOption = answerOption;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerOption() {
        return answerOption;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }
}
