package ru.job4j.condition;

/*
Задание

1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
2. Доработайте метод main Добавьте в него вызов метода distance с различными параметрами точек.

Math.sqrt(a) - корень квадратный от a.
Math.pow(a, b) - возведение числа а в степень b.
 */
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

//        double x = Math.pow((x2-x1),2);
//        double j = Math.pow((y2-y1),2);
//        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = distance(12, 45, 23, 20);
        System.out.println("result (12, 45) to (23, 20) " + result);
    }
}
