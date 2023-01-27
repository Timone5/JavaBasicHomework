package ru.otus.homework.hw7exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resource {
    public void readFile() {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found.");
            fileNotFoundException.printStackTrace(System.out);
        }
    }

    public static void createFile(String name) throws Exception {
        try {
            File file = new File(name);
            file.createNewFile();
            System.out.println("Creating a new file.");
            throw new Exception("Oops!");
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void anyMethod() {
        try (DataSource dataSource = new DataSource()) {
            throw new Error("Fatal error!");
        } catch (Error e) {
            System.err.println("Fatal error!");
            throw e;
        } finally {
            System.out.println("Finally");
        }
    }
}
