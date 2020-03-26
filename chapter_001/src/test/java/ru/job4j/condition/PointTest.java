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

    @Test
    public void distance3d() {
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int y1 = 2;
        int y2 = 0;
        int y3 = 0;
        int z1 = 3;
        int z2 = 0;
        int z3 = 0;
        double expected = 3;
        Point point1 = new Point(x1, x2, x3);
        Point point2 = new Point(y1, y2, y3);
        Point point3 = new Point(z1, z2, z3);
        double out1 = point1.distance3d(point3);
        Assert.assertEquals(expected, out1, 0.01);
    }
}
