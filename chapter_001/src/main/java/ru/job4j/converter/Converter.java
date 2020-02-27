package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRubles(int value) {
        return value * 60;
    }

    public static int euroToRubles(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(256);
        int dollar = rubleToDollar(256);
        int rubles = euroToRubles(256);
        int rublesD = dollarToRubles(256);
        System.out.println("256 rubles are " + euro + " euro.");
        System.out.println("256 rubles are " + dollar + " dollar.");
        System.out.println("256 euro are " + rubles + " rubles.");
        System.out.println("256 dollar are " + rublesD + " rubles.");

        //Testing code
        int in = 256;
        int out = rubleToEuro(in);
        int expected = 3;
        boolean passed = expected == out;
        out = rubleToDollar(in);
        expected = 4;
        boolean passed1 = expected == out;
        out = euroToRubles(in);
        expected = 179250;
        boolean passed2 = expected == out;
        out = dollarToRubles(in);
        expected = 15360;
        boolean passed3 = expected == out;
        System.out.println("256 rubles are 3. Test result : " + passed);
        System.out.println("256 rubles are 4. Test result : " + passed1);
        System.out.println("256 euro are  17920. Test result : " + passed2);
        System.out.println("256 dollar are 15360. Test result : " + passed3);
    }
}
