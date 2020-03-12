package ru.job4j.calculator;

/**
 * @author Nikolai Goltsov
 */
public class Fit {
    /**
     * Метод расчитывает идеальный вес для мужчины
     *
     * @param height Входной параметра роста
     * @return Возвращает идеальный вес
     */
    public static double manWeight(double height) {
        double value = (height - 100) * 1.15;
        return value;
    }
    /**
     *Метод расчитывает идеальный вес для женщины
     * @param height Входной параметр роста
     * @return Возвращает идеальный вес
     */
    public static double womanWeight(double height) {
        double value = (height - 110) * 1.15;
        return value;
    }

    /**
     * Проверка методов путем ввода роста человека в параметр метода.
     * @param args
     */
    public static void main(String[] args) {
        double man = manWeight(175);
        System.out.println("Man 175 is " + man);
        double woman = womanWeight(175);
        System.out.println("Woman 175 is " + woman);
    }
}
