package ru.otus.homework.hw7exception;

public class DataSource implements AutoCloseable {
    public DataSource() {
        System.out.println(connect());
    }

    @Override
    public void close() {
        System.out.println("Connection closed.");
    }

    public String connect() {
        return "Connection opened.";
    }
}
