package ru.job4j.profstyle;

public class Test {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ivan", "Ivanov", "01.01.20");
        Dentist dentist = new Dentist("Was", "Nikmen", "Hatd", "02.02.54", "12", "Cooll");
        System.out.println(dentist.getName());
        dentist.heal(pacient);

    }
}
