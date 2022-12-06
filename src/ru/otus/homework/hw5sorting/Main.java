package ru.otus.homework.hw5sorting;

public class Main {
    public static void main(String[] args) {
        final int size = 1000;

        SortingAlgorithms list = new SortingAlgorithms(size);
        System.out.print("Initial ArrayList: ");
        list.printArrayList();
        System.out.println();
        list.bubbleSort();
        System.out.println();
        list.defaultSort();
    }
}