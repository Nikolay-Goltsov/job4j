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

    /**
     * @param first  Первое число
     * @param second Второе число
     * @param third  Третье число
     * @return Возращает максимальное число
     */
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     * @param first  Первое число
     * @param second Второе число
     * @param third  Третье число
     * @param fry    Четвертое число
     * @return Возращает максимальное число
     */
    public static int max(int first, int second, int third, int fry) {
        return max(first, max(second, third, fry));
    }
}
