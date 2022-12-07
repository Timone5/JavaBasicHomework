package ru.otus.homework.hw5sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortingAlgorithms {
    private final List<Integer> list = new ArrayList<>();
    private final List<Integer> list2;
    private final int size;

    public SortingAlgorithms(int size) {
        this.size = size;
        arrayInit(this.list);
        this.list2 = new ArrayList<>(this.list);
    }

    private void arrayInit(List<Integer> array) {
        for (int i = 0; i < this.size; i++) {
            int x = (int) (Math.random() * size);
            array.add(x);
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void bubbleSort() {
        System.out.println("Before Bubble sort: ");
        printArrayList();
        Date startDate = new Date();
        for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < list.size() - 1 - j; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        Date endDate = new Date();
        System.out.println("After Bubble sort: ");
        printArrayList();
        System.out.println("Bubble sorting algorithm: " + (endDate.getTime() - startDate.getTime()) + " ms");
    }


    public void defaultSort() {
        System.out.println("Before Default sort: ");
        printArrayList2();
        Date startDate = new Date();
        Collections.sort(list2);
        Date endDate = new Date();
        System.out.println("After Default sort: ");
        printArrayList2();
        System.out.println("Default sorting algorithm: " + (endDate.getTime() - startDate.getTime()) + " ms");
    }

    public void printArrayList() {
        System.out.println(getList());
    }

    public void printArrayList2() {
        System.out.println(getList2());
    }

}