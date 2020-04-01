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
    }

    public static void main(String[] args) {

        Tiger tiger = new Tiger(); // Вызов базового конструктора класса по умолчанию, который вызываект все конструкторы по умолчанию до класса родителя(Animal).
        Tiger tiger1 = new Tiger("Han"); // Вызов конструктора из класса Tiger с параметрами
        Predator predator = new Predator("Cat"); // Вызов конструктора из класса Predator с параметрами
    }
}
