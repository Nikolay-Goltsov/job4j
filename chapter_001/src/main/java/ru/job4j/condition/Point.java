package ru.job4j.condition;


public class Point {
    /**
     * Переменные координат
     */
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор принимает на вход 2 значения
     *
     * @param first  координта x
     * @param second координата y
     */
    /**
     * Базовый конструктор, который принемает начальное состояние объекта
     *
     * @param first  координата x
     * @param second коодината y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**
     * Метод принемает на вход объект типа Point
     *
     * @param that
     * @return расстояние между точками
     */
    public double distance3d(Point that) {

        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
}
