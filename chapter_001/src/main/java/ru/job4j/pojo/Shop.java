package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            //проверяем, что объект/ячейка не равен/на null.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Обнуляем ячейку с индексом 1");
        products[1] = null;

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            //проверяем, что объект/ячейка не равен/на null.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Присваеваем первой ячейки, значение второй. Вторую. обнуляем");
        products[1] = products[2];
        products[2] = null;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            //проверяем, что объект/ячейка не равен/на null.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Вызываем метод для удаления элемента по индексу 2");
        //Создаем объект
        Shop shop = new Shop();
        //Вызываем метод для удаления элемента по индексу
        shop.delite(products, 2);

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            //проверяем, что объект/ячейка не равен/на null.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public Product[] delite(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
