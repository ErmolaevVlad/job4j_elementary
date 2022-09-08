package ru.job4j.calculator;

import java.util.SortedMap;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionAndDiv(double first, double second) {
        return subtraction(first, second) + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + subtraction(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равер: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равер: " + subtractionAndDiv(10, 20));
        System.out.println("Результат расчета равер: " + sumAll(10, 20));
    }
}
