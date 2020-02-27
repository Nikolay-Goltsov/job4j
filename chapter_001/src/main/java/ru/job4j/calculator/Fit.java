package ru.job4j.calculator;

/*
Задание.

1. Реализуйте методы manWeight и womanWeight. Нужно дописать код, чтобы методы возвращали идеальный вес для мужчины и женщины.
Вместо -1D вам нужно написать формулу.
Добавьте в метод main демонстрацию работы методов.

Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
 */
public class Fit {
    public static double manWeight(double height) {
        double value = (height - 100) * 1.15;
        return value;
    }


    public static double womanWeight(double height) {
        double value = (height - 110) * 1.15;
        return value;
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        System.out.println("Man 175 is " + man);

        double woman = womanWeight(175);
        System.out.println("Woman 175 is " + woman);
    }
}
