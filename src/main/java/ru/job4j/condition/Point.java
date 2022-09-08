package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 0, 2, 5);
        System.out.println("result2 (1, 0) to (2, 5) " + result2);
        double result3 = Point.distance(0, 3, 6, 1);
        System.out.println("result3 (0, 3) to (6, 1) " + result3);
    }
}
