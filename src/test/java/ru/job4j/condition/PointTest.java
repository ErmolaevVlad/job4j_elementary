package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when30To86Then7dot81() {
        Point a = new Point(3, 0);
        Point b = new Point(8, 6);
        double expected = 7.81;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, within(0.01));
    }

    @Test
    public void when26To71Then7dot07() {
        Point a = new Point(2, 6);
        Point b = new Point(7, 1);
        double expected = 7.07;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, within(0.01));
    }

    @Test
    public void when11To98Then10dot63() {
        Point a = new Point(1, 1);
        Point b = new Point(9, 8);
        double expected = 10.63;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, within(0.01));
    }
}
