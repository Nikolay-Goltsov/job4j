package ru.job4j.pojo;

import java.util.Date;

/*
Создайте класс ru.job4j.pojo.College с методом main. В методе main создайте объект Student и заполните поля через set. Добавьте вывод на консоль объекта student через методы get.
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Ivanov Ivan Ivanivich");
        student.setGrupp("CipIa");
      // Создание студента через конструктор
        Student student1 = new Student("Vasilev", "Vasilii", "Vasilevich");
        student1.setGrupp("Music");

        System.out.println(student.getStudent() + " grupp " + student.getGrupp());
        //Вывод студента через конструктор
        System.out.println(student1.getF() + " " + student1.getName() + " " + student1.getOt() + " grupp " + student1.getGrupp());
            }
}
