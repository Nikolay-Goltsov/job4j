package ru.job4j.condition;

/**
 * Метод для нахождения максимального числа из 2х чисел.
 *
 * @author Nikolai Goltsov
 */
public class Max {
    /**
     * @param left  Первое число
     * @param right Второе число
     * @return Возращает максимальное число
     */
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(first, temp);
    }
}
