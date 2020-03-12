package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class MinDiapason {
    /**
     *Метод ищет минимальное число в заданном диапазоне.
     * @param array Входной массив типа int
     * @param start Индекс начала поиска
     * @param finish индекс окончания поиска
     * @return Возвращает минимальное число из диапазона поиска.
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
