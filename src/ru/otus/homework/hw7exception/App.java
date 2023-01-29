package ru.otus.homework.hw7exception;

public class App {
    private String data;
    private final Resource resource;

    public App() {
        this.resource = new Resource();
    }

    public void read() {
        resource.readFile();
    }

    public void createFile(String name) throws Exception {
        Resource.createFile(name);
    }

    public void readFromResource() {
        resource.anyMethod();
    }
}
