package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double rls = Math.sqrt(five);
        return rls;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
