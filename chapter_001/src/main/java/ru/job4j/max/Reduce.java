package ru.job4j.max;

/**
 * Класс....
 */
public class Reduce {
    private int[] array;

    /**
     * Метод принимает на вхох массив чисел
     * @param array Массив числел типа int
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Метод печатает массив типа int
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
