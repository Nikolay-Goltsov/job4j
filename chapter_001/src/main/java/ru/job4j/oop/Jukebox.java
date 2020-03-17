package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть неуклюже...");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи...");
        } else if (position != 1 & position != 2) {
            System.out.println("No CD");
        }
    }
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(4);
    }
}
