package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Length = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Length = " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Pavel";
        names[2] = "Petr";
        names[3] = "Vlad";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
