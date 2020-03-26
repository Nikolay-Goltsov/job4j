package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 0;
        int x2 = 0;
        int j1 = 2;
        int j2 = 0;
        double expected = 2;
        Point point = new Point(x1, x2);
        Point point1 = new Point(j1, j2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}
