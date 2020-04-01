package ru.job4j.profstyle;

public class Programmer extends Engeneer {
    private String skill; // Отображает навык работы
    private String algoritm; // Умениие работать с алгоритмами

    public Programmer(String name, String surname, String education, String birthday, String skill, String algoritm) {
        super(name, surname, education, birthday);
        this.skill = skill;
        this.algoritm = algoritm;
    }

    @Override
    public String getName() {
        return super.getName();
    }


}
