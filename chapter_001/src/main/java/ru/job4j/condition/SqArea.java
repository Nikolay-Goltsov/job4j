package ru.job4j.condition;
/*

p = 2 * (L + h); где L - длинна, h - высота.

L = h * k;

s = L * h; - формула для вычисления площади прямоугольника.

Пример.

Если p = 6, а k = 2, то площадь будет равно S = 2.

Если p = 4, а k = 1, то площадь будет равно S = 1.

Задание.

1. Создайте класс ru.job4j.condition.SqArea. Допишите метод square.
2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.

 */

public class SqArea {
    public static double square(int p, int k) {
// С математикой вашпе плохо(((
        int h = p / (2 * (k + 1));
        int s = h * k * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
