package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CheckTest {
    /**
     * Класс тест для проверки метода mono из класса Check.
     * whenDataMonoByTrueThenTrue- подаем массив с одинаковыми элементами.
     * whenDataMonoByTrueThenFalse- подаем массив с разными элементами.
     *
     * @author Nikolay Goltsov
     */

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {

        boolean[] input = new boolean[]{true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}