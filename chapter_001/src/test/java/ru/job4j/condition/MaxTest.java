package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тест для метода max из класса Max
 *
 * @author Nikolai Goltsov
 */
public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax10To2Then10() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax2To20To4Then20() {
        int result = Max.max(2, 20, 4);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax25To15To19Then25() {
        int result = Max.max(25, 15, 19);
        assertThat(result, is(25));
    }
    @Test
    public void whenMax25To15To19To14Then25() {
        int result = Max.max(25, 15, 19, 14);
        assertThat(result, is(25));
    }
    @Test
    public void whenMax2To5To9To4Then9() {
        int result = Max.max(2, 5, 9, 4);
        assertThat(result, is(9));
    }
}
