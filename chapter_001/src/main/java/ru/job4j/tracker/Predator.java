package ru.job4j.tracker;

public class Predator extends Animal {
    /**
     * Конструктор по умочанию. Выводит название класса.
     */
    public Predator() {
        super();
        System.out.println("class Predator");
    }

    /**
     * Конструктор принимает на вход вид животного
     *
     * @param name вид животного.
     */
    public Predator(String name) {
        super(name);
    }
}
