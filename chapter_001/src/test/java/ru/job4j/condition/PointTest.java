package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 12;
        int x2 = 23;
        int j1 = 45;
        int j2 = 20;
        double expected = 33.13;
        Point point = new Point(x1, x2);
        Point point1 = new Point(j1, j2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}
