package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class MinArr {
    /**
     * Метод для моиска минимального значения в массиве
     *
     * @param array массив этементов типа int
     * @return возвращает минимальное значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
