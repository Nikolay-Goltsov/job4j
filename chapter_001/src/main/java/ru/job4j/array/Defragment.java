package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class Defragment {
    /**
     * Метод compress упорядочивает ячейки массива. Пустые этементы помещаются в конец массива.
     * В переменную point записывается значение первой найденной пустой (ячейки со значением null) ячейки/
     * Цикл while работает пока пустая ячейка не будет заполнена/заменена на ячейку со значением.
     * Перемещение элементов происходит благодаря условию в цикле while.
     * Если найдена ячейка со значением, то ее значение записывается в ячейку с индексом point.
     * И найденная ячейка "зануляется",становится null.
     *
     * @param array Входной массив типа String с неупорядочными ячейками
     * @return Возвращает массив типа String c упорядочными ячейками.
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i + 1;
                while (point < array.length) {
                    if (array[point] != null) {
                        array[i] = array[point];
                        array[point] = null;
                        break;
                    }
                    point++;
                }
            }
        }
        return array;
    }

    /**
     * Проверка работы метода compress.
     * Подается неупорядоченный массив строк input.
     * Печатается неупорядоченный массив.
     * Через цикл for выводится упорядоченный массив.
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
