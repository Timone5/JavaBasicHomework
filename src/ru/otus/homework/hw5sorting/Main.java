package ru.otus.homework.hw5sorting;

public class Main {
    public static void main(String[] args) {
        final int size = 1000;

        SortingAlgorithms list = new SortingAlgorithms(size);
        list.printArrayList();
        list.bubbleSort();
        list.defaultSort();
    }
}