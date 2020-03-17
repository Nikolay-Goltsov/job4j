package ru.job4j.ru.job4j.oop;

public class Student {

    /**
     * @author Nikolai Goltsov
     * Класс описывает объект типа "студент" и его методы.
     */
    public void music() {
        System.out.println("tram, pa, pam.");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.song();
        petya.music();
        petya.song();
        petya.music();
        petya.song();

    }
}
