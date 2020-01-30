package ru.job4j.calculator;

/*
* Class Calculator. Приметивный калькулятор, для начала.
* @author Goltsov
* @since ...01.20г.

*/
public class Calculator {

    public static  void add (double first, double second){
        double result = first+second;
        System.out.println( first +" + "+ second+" = "+result);
    }
    public static  void div (double first, double second){
        double result = first/second;
        System.out.println( first +" / "+ second+" = "+result);
    }

    public static  void mulriply (double first, double second){
        double result = first*second;
        System.out.println( first +" * "+ second+" = "+result);
    }
    public static  void subtract (double first, double second){
        double result = first-second;
        System.out.println( first +" - "+ second+" = "+result);
    }
/*
* Главный класс для запуска программы.
* Проверк созданных методов.
* Примечание- методы выводят информацию в консоль.
* Конструктор вывод строки в консоль.
* @param arg - args.
* */


    public static void main(String[] args) {

        add(3,2);
        div(4,5);
        mulriply(4,5);
        subtract(3,5);
    }
}
