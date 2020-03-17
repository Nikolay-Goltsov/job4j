package ru.job4j.ru.job4j.oop;

public class Student {

    /**
     * @author Nikolai Goltsov
     * Класс описывает объект типа "студент" и его методы.
     */
    public void music(String lyrics) {
        System.out.println("I can sing a soug : " + lyrics);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe I can fly";
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();
    }
}
