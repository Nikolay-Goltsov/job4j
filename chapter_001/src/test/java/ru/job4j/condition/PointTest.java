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
        double expected = 27.31;
//        double out = Point.distance3d(x1, j1, x2, j2);
//        Assert.assertEquals(expected, out, 0.01);
    }
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        Point point = new Point(x1, x2);
        Point point1 = new Point(y1, y2);
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z2 = 0;


    }
}
