package ru.job4j.array;
//#2
public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        System.out.println("min= " +min);

        int index = FindLoop.indexOf(data, min, 0, data.length);
        System.out.println("min_2= " +min);
        System.out.println("index= " +index);
        return data;
    }
}
