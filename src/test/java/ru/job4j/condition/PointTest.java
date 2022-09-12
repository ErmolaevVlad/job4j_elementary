package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30To86Then7dot81() {
        int x1 = 3;
        int y1 = 0;
        int x2 = 8;
        int y2 = 6;
        double expected = 7.81;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26To71Then7dot07() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 7;
        int y2 = 1;
        double expected = 7.07;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To98Then10dot63() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 9;
        int y2 = 8;
        double expected = 10.63;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}