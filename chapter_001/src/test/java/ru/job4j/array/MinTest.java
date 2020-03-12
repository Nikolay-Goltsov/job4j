package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Nikolai Goltsov
 * Класс тест для проверки метода findMin из класcа MinArr
 * На вход методу findMin передаем массив типа int
 */
public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(MinArr.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void lastMin() {
        assertThat(MinArr.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test
    public void middleMin() {
        assertThat(MinArr.findMin(new int[]{10, 2, 5}), is(2));
    }

}
