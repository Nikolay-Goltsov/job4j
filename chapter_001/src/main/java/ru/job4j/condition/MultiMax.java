package ru.job4j.condition;

/**
 * @author Nikolai Goltsov
 */
public class MultiMax {
    /**
     * Метод сравнивавет три числа и выводит максимальное
     *
     * @param first  Первое число
     * @param second Второе число
     * @param third  Третье число
     * @return Возвращат максимальное
     */
    public int max(int first, int second, int third) {
        int x = first > second ? first : second;
        int result = third > x ? third : x;
        return result;
    }
}
