package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        for (int i = 0; amount > 0; i++) {
            amount = amount + ((amount * percent) / 100) - salary;
            year++;
        }
        return year;
    }
}
