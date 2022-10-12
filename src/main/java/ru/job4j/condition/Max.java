package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(four, max(first, second, third));
    }

    public static void main(String[] args) {
        int rsl = Max.max(10, 15);
        System.out.println(rsl);
        rsl = Max.max(10, 20, 15);
        System.out.println(rsl);
        rsl = Max.max(5, 19, 1, 17);
        System.out.println(rsl);
    }
}
