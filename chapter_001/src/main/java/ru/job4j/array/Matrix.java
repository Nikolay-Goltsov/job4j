package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class Matrix {
    /**
     * Метод для создания классической таблицы умножения, на основе матрицы.
     *
     * @param size переменная указывающая размер матрицы.
     * @return Возвращает полученную матрицу
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
