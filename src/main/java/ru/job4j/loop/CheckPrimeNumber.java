package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean a = number >= 2;
        for (int i = 2; i <= (number - 1); i++) {
            if ((number % i) == 0) {
                a = false;
                break;
            }
        }
        return a;
    }
}
