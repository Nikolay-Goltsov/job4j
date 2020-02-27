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
        double exptcted = 27.31;
        double out = Point.distance(x1, j1, x2, j2);
        Assert.assertEquals(exptcted, out, 0.01);


    }
}
