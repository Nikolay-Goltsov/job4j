package ru.job4j.tracker;


public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


//    public Item() {
//        System.out.println("load item");
//    }
//    public static void main(String[] args) {
//        Item item = new Item();
//
//    }


}
