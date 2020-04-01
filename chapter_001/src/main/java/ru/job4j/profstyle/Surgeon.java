package ru.job4j.profstyle;

public class Surgeon extends Doctor {
    private int number; // Отображает кольчество операций

    public Surgeon(String name, String surname, String education, String birthday, int number) {
        super(name, surname, education, birthday);
        this.number = number;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void heal(Pacient pacient) {
        super.heal(pacient);
    }

    /**
     * Метод описывает работу хирурга
     * @param pacient пациент которым занимается хирург
     */
    public void sewing(Pacient pacient) {

    }
}
