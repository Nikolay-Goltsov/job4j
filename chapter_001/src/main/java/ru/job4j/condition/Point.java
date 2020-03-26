package ru.job4j.condition;


public class Point {
    /**
     * Переменные координат
     */
    private int x;
    private int y;
    private int z;

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

    /**
     * Базовый конструктор, который принемает начальное состояние объекта
     *
     * @param x координата x
     * @param y коодината y
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**

     *
     * @param that
     * @return расстояние между точками
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    /**

     *
     * @param that
     * @return расстояние между точками
     */
    public double distance3d(Point that) {

        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
}
