package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];
    private Item[] itemsNotNull = new Item[items.length];

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
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                itemsNotNull[position] = items[index];
                position++;
            }
        }
        itemsNotNull = Arrays.copyOf(itemsNotNull, position);
        return itemsNotNull;
    }

    /**
     * Метод получения элементов из хранилища по имени
     *
     * @param key ключ для поиска
     */
    public Item[] findByName(String key) {

        return null;
    }

    /**
     * Метод получения элементов из хранилища по имени
     *
     * @param id индификатор для поиска
     */
    public Item findById(String id) {

        return null;
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
