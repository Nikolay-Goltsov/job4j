package ru.job4j.encapsulation;

public class Gonfig {
    private String name;
    private int position;
    public String[] properties;

    public Gonfig(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    public String search(String key) {
        return key;
    }
}
