package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikolay Goltsov
 * Класс тест для тестирования метода startsWith из класса ArrayChar
 * world - Начальный массив. Массив,который сравнивают.
 * pref - Конечный массив. Массив, с которым сравнивают.
 */

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'о'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}
