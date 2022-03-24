package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] y = new int[5];
        for (int index = 0; index < y.length; index++) {
            y[index] = index * 2 + 3;
        }
        for (int prntindex = 0; prntindex < y.length; prntindex++) {
            System.out.println(y[prntindex]);
        }
    }
}