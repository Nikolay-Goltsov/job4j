package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double persent) {
        int year = 0;
        double credit = (amount * (persent / 100)) + amount;
        while (credit >= 0) {
            double ostatok = credit - salary;
            credit = ostatok + (ostatok * (persent / 100));
            year++;
        }
        return year;
    }

}
