package ru.job4j.tracker;

public class Tiger extends Predator {
    /**
     * Конструктор по умочанию. Выводит название класса.
     */
    public Tiger() {
        System.out.println("class Tiger");
    }

    /**
     * Конструктор принимает на вход имя животного
     *
     * @param name имя животного.
     */
    public Tiger(String name) {
        super(name);

    }
}
