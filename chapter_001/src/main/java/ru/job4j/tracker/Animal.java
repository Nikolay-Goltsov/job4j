package ru.job4j.tracker;

public class Animal {
    private String name;

    /**
     * Конструктор по умочанию. Выводит название класса.
     */
    public Animal() {
        super();
        System.out.println("class Animal");
    }


    public Animal(String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
      //  Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
