package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class SortSelected {
    /**
     * Метод сортирует массив по минимальным элементам передвигая их по их индексам.
     * int min- получает минимальное элемент во всём массиве
     * int index- получет индекс элемента min
     * int temp- временная переменная которая хранить следующий элемент после минимального.
     * @param data входной не сортированный массив
     * @return Возвращает отсорированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length-1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
