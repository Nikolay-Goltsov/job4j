package ru.job4j.array;

//#2
public class SortSelected {
    public static int[] sort(int[] data) {


        for (int i = 0; i < data.length; i++) {

            int min = MinDiapason.findMin(data, i, data.length);// минимальный элемент
            int index = FindLoop.indexOf(data, min, i, data.length);//Ищем индекс
//           if (index<min) {
               int temp = data[i];
               data[i] = data[index];
               data[index] = temp;
           }
//        }
        return data;
    }
}
