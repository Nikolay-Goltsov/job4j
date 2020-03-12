package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class FindLoop {
    /**
     * Метод занимается поиском индекса заданного элемента
     *
     * @param data Входной массив
     * @param el   Переменная, индекс, которой требуется найти
     * @return возвращает найденнный индекс заданного элемета, или -1.
     */
    public int indexOf(int[] data, int el) {

        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод занимается поиском индекса заданного элемента в указанном диапазоне
     *
     * @param data   Входной массив
     * @param el     Переменная, индекс которой требуется найти
     * @param start  постумаемый номер индекса с которого требуется начать поиск
     * @param finish поступаемы номер индекса с после которого поиск следует прекратить.
     * @return возвращает найденнный индекс заданного элемета, или -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
