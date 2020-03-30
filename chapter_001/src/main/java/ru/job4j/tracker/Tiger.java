package ru.job4j.tracker;

public class Tiger extends Predator {
    public Tiger() {
        System.out.println("class Tiger");
    }

    public Tiger(String name) {
        super(name);
        Predator predator = new Predator();
        }
}
