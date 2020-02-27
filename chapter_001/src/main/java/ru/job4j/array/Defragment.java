package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i + 1; //указатель на не null ячейку.По факту указатель на пустую ячейку.
                //переместить первую не null ячейку
                while (point < array.length) { //работает пока пустая ячейка не заполнена
                    if (array[point] != null) {
                        array[i] = array[point]; //меням следующий элемент местами с пустым
                        array[point] = null; //очищаем ячейку
                        // тут надо вернутся на элемент назад
                        break;

                    }
                    point++;
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
