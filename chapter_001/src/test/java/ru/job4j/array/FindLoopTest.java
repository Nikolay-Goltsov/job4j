package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikolai Goltsov
 * Класс тестирующий метод (indexOf, из класса FindLoop) поиска индекса заданного элемента.
 * int[] input- входной массив
 * int value- переменная индекс которой надо найти
 * int start- номер индекса с которого начнется поиск.
 * int finish- номер индекса на котором поиск закончится.
 */
public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNot6() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 3, 10, 4};
        int value = 3;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind40() {
        int[] input = new int[]{5, 2, 10, 2, 40};
        int value = 40;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }
}
