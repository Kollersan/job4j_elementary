package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To64Then7dot21() {
        double expected = 7.21;
        Point a = new Point(0, 0);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84To15Then7dot07() {
        double expected = 7.07;
        Point a = new Point(8, 4);
        Point b = new Point(1, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15To43Then3dot60() {
        double expected = 3.60;
        Point a = new Point(1, 5);
        Point b = new Point(4, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}