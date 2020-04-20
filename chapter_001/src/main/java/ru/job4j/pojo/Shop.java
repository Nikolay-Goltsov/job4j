package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

//        for (int index = 0; index < products.length; index++) {
//            Product product = products[index];
//            //проверяем, что объект/ячейка не равен/на null.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//        System.out.println();
//        System.out.println("Обнуляем ячейку с индексом 1");
        //products[1] = null;

//        for (int index = 0; index < products.length; index++) {
//            Product product = products[index];
//            //проверяем, что объект/ячейка не равен/на null.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//        System.out.println();
//        System.out.println("Присваеваем первой ячейки, значение второй. Вторую. обнуляем");
//        products[1] = products[2];
//        products[2] = null;
//        for (int index = 0; index < products.length; index++) {
//            Product product = products[index];
//            //проверяем, что объект/ячейка не равен/на null.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
        System.out.println();
        System.out.println("Вызываем метод для удаления элемента по индексу");

        Shop shop = new Shop();
        shop.delite(products, 1);
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

    /*
    Посмотреть код Defragment!!!!
    Задание.

    1. Необходимо сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.

    Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.

    products[index] = products[index + 1];

    После цикла нужно поставить на последнее место в массиве null, чтобы последний
     и предпоследний элементы не дублировались

    products[products.lenght - 1] = null;
    2. Добавьте демонстрацию работы примера в метод main.

     */
    public Product[] delite(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            while (index < products.length) {
                if (products[index] != null) {
                    products[index] = products[index + 1];
                    products[index] = null;
                    break;
                }
//                index++;
            }

        }





        return products;
}
}
