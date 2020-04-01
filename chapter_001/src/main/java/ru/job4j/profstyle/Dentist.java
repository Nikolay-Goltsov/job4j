package ru.job4j.profstyle;

public class Dentist extends Doctor {
    private String experience; // Отображает стаж сотрудника
    private String skill; // Отображает опыт в работе

    public Dentist(String name, String surname, String education, String birthday, String experience, String skill) {
        super(name, surname, education, birthday);
        this.experience = experience;
        this.skill = skill;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Метод возвращает диагноз пациента
     *
     * @param pacient
     */
    public void heal(Pacient pacient) {
        super.heal(pacient);

    }

    /**
     * Метод описывает процедуру сверления
     * @param pacient пациент которым занимается дантист
     */
    public void drill(Pacient pacient) {

    }


}
