package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenArea() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 4);
        Point c = new Point(1, 2);
        Triangle triangle = new Triangle(a, b, c);
        double area = triangle.area();
        assertEquals(area, 0.99, 0.01);
    }

}
