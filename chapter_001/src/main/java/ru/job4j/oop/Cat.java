package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat kitana = new Cat();
        Cat mursyk = new Cat();
        String say = kitana.sound();
        kitana.giveNick("Kitana");
        System.out.println("There are kitana's food");
        kitana.eat("milk");
        kitana.show();
        System.out.println("Kitana says " + say);
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("chili");
        gav.show();
        System.out.println("There are black's food");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fich");
        black.show();


    }
}
