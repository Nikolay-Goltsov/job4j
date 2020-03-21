package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public static double distance(int x1, int j1, int x2, int j2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((j1 - j2), 2));
    }

    public  double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
