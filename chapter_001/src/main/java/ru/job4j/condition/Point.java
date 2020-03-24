package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор принимает на вход 2 значения
     *
     * @param first  координта x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор принемает на вход 3 параметра
     *
     * @param x координата x
     * @param y координата y
     * @param z коодината z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

//    public static double distance(int x1, int j1, int x2, int j2) {
//        return sqrt(pow((x1 - x2), 2) + pow((j1 - j2), 2));
//    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод высчитывает расстояние между 3 координатами
     *
     * @param that ???? Туплю я
     * @return значения расстояния
     */
    public  double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
