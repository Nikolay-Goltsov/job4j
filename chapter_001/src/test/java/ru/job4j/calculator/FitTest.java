package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Nikolay Goltssov
 * Класс тест для проверки методов  manWeight и womanWeight из класса Fit
 */
public class FitTest {
    @Test
    public void manWeight() {
        double man = 175;
        double expected = 86.25;
        double out = Fit.manWeight(man);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double woman = 175;
        double expected = 74.75;
        double out = Fit.womanWeight(woman);
        Assert.assertEquals(expected, out, 0.1);
    }
}
