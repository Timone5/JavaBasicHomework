package ru.otus.homework.hw7exception;

public class Main {
    public static void main(String[] args) throws Exception {
        App app = new App();

        System.out.println("Case 1. Print error");
        app.read();
        System.out.println("--------------------------------------------------");

        System.out.println("Case 2. Rethrow");
        app.createFile("file.txt");
        System.out.println("--------------------------------------------------");

        System.out.println("Case 3. App will stop");
        app.readFromResource();
        System.out.println("--------------------------------------------------\n" +
                "P.S: we won't see this string because the app has stopped.");
    }
}
