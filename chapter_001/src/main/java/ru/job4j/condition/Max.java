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
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fry) {
        int temp = max(first, second);
        int temp2 = max(third, fry);
        return max(first, max(second, third, fry));
    }
}
