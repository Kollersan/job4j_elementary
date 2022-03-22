package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int multiple = 1;
        int result = 0;
        if (n == 0) {
            result = 1;
        }
        for (int count = 1; count <= n; count++) {
           multiple *= count;
           result = multiple;
        }
        return result;
    }
}
