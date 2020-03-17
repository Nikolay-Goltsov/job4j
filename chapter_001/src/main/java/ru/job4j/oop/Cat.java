package ru.job4j.oop;

public class Cat {
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat kitana = new Cat();
        Cat mursyk = new Cat();
        String say = kitana.sound();
        System.out.println("Kitana says " + say);
    }
}
