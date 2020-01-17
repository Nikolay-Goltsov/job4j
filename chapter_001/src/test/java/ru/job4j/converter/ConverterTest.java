package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 256;
        int expected = 3;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 259;
        int expected = 4;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void euroToRubles(){
        int in = 256;
        int expected =17920;
        int out = Converter.euroToRubles(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public  void dollarToRubles(){
        int in = 256;
        int expected = 15360;
        int out = Converter.dollarToRubles(in);
        Assert.assertEquals(expected,out);
    }




}