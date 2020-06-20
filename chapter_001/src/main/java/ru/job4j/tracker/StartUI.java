package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Iwan"));
        tracker.add(new Item("Nikolas"));
        System.out.println(tracker.findById(1));
        System.out.println(tracker.findById(2));






    }
}
