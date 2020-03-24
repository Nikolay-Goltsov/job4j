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

    @Test
    public void distance3d() {
        int x1 = 13;
        int x2 = 23;
        int j1 = 34;
        int j2 = 34;
        int z1 = 12;
        int z2 = 14;
        double expected = 23.34;
//        double out = Point.distance3d(Point x1);
//        Assert.assertEquals(expected, out, 0.01);

    }

}
