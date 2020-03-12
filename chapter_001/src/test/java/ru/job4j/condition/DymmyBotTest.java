package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тест для проверки Минибота из класса DimmyBot.
 * Задаем простые вопросы и сверяем их с ответами
 *
 * @author Nikolai Goltsov
 */
public class DymmyBotTest {
    @Test
    public void whenGreetBot() {
        assertThat(DymmyBot.answer("Привет, Бот."),
                is("Привет, умник"));
    }

    @Test
    public void whenByeBot() {
        assertThat(DymmyBot.answer("Пока."),
                is("До скорой встречи."));
    }

    @Test
    public void whenUnknownBot() {
        assertThat(DymmyBot.answer("Почем соль, братцы?!"),
                is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}
