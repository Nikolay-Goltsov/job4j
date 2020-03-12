package ru.job4j.calculator;

/**
 * @author Nikolai Goltsov
 * Класс проверка взоимодействия методов.
 */
public class Size {
    /**
     * Метод, чего-то считает
     *
     * @param left  параметр получает значение переменной nike
     * @param right параметр получает значение переменной puma
     * @return Возвращает сумму переменных nike and puma
     */
    public int add(int left, int right) {
        int result = left + right;
        return result;
    }

    /**
     * Метод принемает значение от метода add и выводит его в консоль
     *
     * @param size параметр принемает на вход возвращаемое значение из метода add
     */
    public void info(int size) {
        System.out.println("Your size is: " + size);
    }

    public static void main(String[] args) {
        Size size = new Size();
        int nike = 10;
        int puma = 120;
        int value = size.add(nike, puma);
        size.info(value);
    }
}
