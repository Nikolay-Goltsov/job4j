package ru.job4j.pojo;

import java.util.Date;

/*
Задание.

1. Создайте модель данных - Студент. ru.job4j.pojo.Student.

2. В модели должны быть поля: ФИО, группа, дата поступления.

3. Сгенерируйте аксессоры для этих полей.
 */
public class Student {
    private String student;
    private String grupp;
    private Date date;

    //переменный для реализации через конструктор
    private String f;
    private String name;
    private String ot;

    //реализация через конструктор
    public Student(String f, String name, String ot) {
        this.f = f;
        this.name = name;
        this.ot = ot;
    }

    // Конструктор по умолчанию
    public Student() {

    }

    public String getF() {
        return f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }
// конец реализации через конструктор

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getGrupp() {
        return grupp;
    }

    public void setGrupp(String grupp) {
        this.grupp = grupp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
