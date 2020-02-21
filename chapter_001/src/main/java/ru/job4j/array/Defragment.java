package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;//указатель на не null ячейку.По факту указатель на пустую ячейку.
                //переместить первую не null ячейку
                while (array[point] == null) {// работает пока пустая ячейка не заполнена
                    i++;//увеличиваем индекс для проверки следующего элемента
                    array[point] = array[i]; //меням следующий элемент местами с пустым
                    array[i] = null;//очищаем ячейку
                    // тут надо вернутся на элемент назад
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
