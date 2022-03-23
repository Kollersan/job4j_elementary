package ru.job4j.loop;

public class CheckPrimeNumber {
    @SuppressWarnings("checkstyle:SimplifyBooleanReturn")
    public static boolean check(int number) {
        boolean a = false;
        if (number == 2) {
            a = true;
        }
        for (int i = 2; i <= (number - 1); i++) {
            if ((number % i) == 0) {
                a = false;
                break;
            }
            a = true;
        }
        return a;
    }
}
