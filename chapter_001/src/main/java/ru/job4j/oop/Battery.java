package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
    }

    public static void main(String[] args) {
        Battery bat = new Battery(10);
        System.out.println("Bat load: " + bat.load);
        bat.exchange(bat);
        System.out.println("Bat load: " + bat.load);
        bat.exchange(bat);
        System.out.println("Bat load: " + bat.load);
    }

}
