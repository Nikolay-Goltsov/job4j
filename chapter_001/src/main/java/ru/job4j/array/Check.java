package ru.job4j.array;

/**
 * @author Nikolay Goltsov
 */
public class Check {
    /**
     * @param data Входной массив c элементами
     *             temp- временная переменная для хранения значения
     * @return Если элементы не одинаковые, возвращаемое значение меняется на false
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean temp = data[0];
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
