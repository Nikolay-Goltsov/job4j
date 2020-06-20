package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    private int ids = 1; // Переменная для ключа
    private int size = 0;
    /**
     * Указатель ячейки для новой заявки.
     */
//    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(ids++); // Присвоение ключа
        items[size++] = item;
        return item;
    }

    /**
     * Метод получения всех не null элементов из хранилища
     *
     * @param
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод получения элементов из хранилища по имени
     *
     * @param key ключ для поиска
     */
    public Item[] findByName(String key) {
        Item[] itemss = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = new Item(key);
            if (items[index].getName().equals(key)) {
                itemss[index] = item;
                count++;
            }
        }
        return Arrays.copyOf(itemss, count);
    }

    /**
     * Метод получения элементов из хранилища по имени
     * Подсмотрел в интернете. Работает.
     *
     * @param id индификатор для поиска
     */
//    public Item findById(String id) {
//        Item res = null;
//        for (Item item : items) {
////            if (item.getId() == (id)) {
////                res = item;
////                break;
////            }
//        }
//        return res;
//    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
//    private String generateId() {
//        Random rm = new Random();
//        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
//    }
//    private int indexId(int id) {
//        int rsl = -1;
//        for (int index = 0; index < size; index++) {
//            if (items[index].getId() == id) {
//                rsl = index;
//                break;
//            }
//        }
//        return rsl;
//    }
//
//
//    public boolean replace(int id, Item item) {
//
//        return true;
//    }
}
