package ru.job4j.pojo;

/*
Задание
2. Создайте класс ru.job4j.pojo.Library и в нем метод main.

3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".

4. Выведите содержимое массива на консоль через цикл for + index.

5. Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.

6. Добавьте цикл с выводом книг с именем "Clean code".
 */
public class Library {
    public static void main(String[] args) {
        Book book = new Book("Букварь", 34);
        Book book1 = new Book("Владыка Марса", 640);
        Book book2 = new Book("Гепорболоид инженера Гарина", 450);
        Book book3 = new Book("Clean code", 0);
        Book[] lib = new Book[4];
        lib[0] = book;
        lib[1] = book1;
        lib[2] = book2;
        lib[3] = book3;

        for (int index = 0; index < lib.length; index++) {
            Book libress = lib[index];
            System.out.println(libress.getName() + " - " + libress.getCount());
        }
        System.out.println();
        System.out.println("Raker Book!!!");
        lib[0] = lib[3];
        lib[3] = book;
        for (int index = 0; index < lib.length; index++) {
            Book libress = lib[index];
            System.out.println(libress.getName() + " - " + libress.getCount());
        }
        System.out.println();
        System.out.println("Search Book");
        for (int index = 0; index < lib.length; index++) {
            Book libress = lib[index];
            if (libress.getName().equals("Clean code")) {
                System.out.println(libress.getName() + " - " + libress.getCount());
            }
        }
    }
}
