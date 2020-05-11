package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод получения всех не null элементов из хранилища
     *
     * @param
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод получения элементов из хранилища по имени
     *
     * @param key ключ для поиска
     */
    public Item[] findByName(String key) {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод получения элементов из хранилища по имени
     * Подсмотрел в интернете. Работает.
     *
     * @param id индификатор для поиска
     */
    public Item findById(String id) {
        Item res = null;
        for (Item item : items) {
            if (item.getId() == (id)) {
                res = item;
                break;
            }
        }
        return res;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
