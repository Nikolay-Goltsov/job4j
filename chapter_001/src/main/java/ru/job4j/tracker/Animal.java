package ru.job4j.tracker;

public class Animal {
    private String name;
    public Animal() {
        System.out.println("class Animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
