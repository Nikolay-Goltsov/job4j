package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery bat = new Battery(10);
        Battery batTab = new Battery(23);
        System.out.println("Bat load: " + bat.load + ", batTab: " + batTab.load);
        bat.exchange(batTab);
        System.out.println("Bat load: " + bat.load + ", batTab: " + batTab.load);
    }

}
