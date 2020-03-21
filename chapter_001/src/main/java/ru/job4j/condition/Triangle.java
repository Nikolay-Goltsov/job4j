package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        if (this.exist(a, b, c)) {
            double p = (a + b + c) / 2;
//            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));// так мы расчитывали площадь треугольника ранее.
            rsl = -1;
        }
        return rsl;

    }

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}

