package ru.job4j.condition;
/*
4.4. Максимум из трех чисел[#223361]
Внутри метода max нужно сравнить попарно первое со вторым и максимум из них сравнить с третьим числом.
В методе нужно использовать несколько раз тернарный оператор условия.
 */
public class MultiMax {
    public  int max(int first, int second, int third){
        int x = 0;
        if (first>second){
             x=first;
        }else {
            x=second;
        }


        if (third>x){
            x=third;
        }else {
            return x;
        }

       int result= x;



      return result;
    }
}
