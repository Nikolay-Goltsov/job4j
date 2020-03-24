package ru.job4j.calculator;

/**
 * Class Calculator. Приметивный калькулятор, для начала.
 *
 * @author Goltsov Nikolay
 * @since ...01.20г.
 */
public class Calculator {
    /**
     * Метед считает и выводит сумму чисел
     *
     * @param first  Первое число
     * @param second Второе число
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Метед считает и выводит деление чисел (первое на второе)
     *
     * @param first  Первое число
     * @param second Второе число
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Метед считает и выводит произведение чисел
     *
     * @param first  Первое число
     * @param second Второе число
     */
    public static void mulriply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Метед считает и выводит разность чисел (от первого вычитается второе)
     *
     * @param first  Первое число
     * @param second Второе число
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Главный класс для запуска программы.
     * Проверка созданных методов.
     * Примечание- методы выводят информацию в консоль.
     * Конструктор вывод строки в консоль.
     */

    public static void main(String[] args) {

        add(3, 2);
        div(4, 5);
        mulriply(4, 5);
        subtract(3, 5);
    }
}
