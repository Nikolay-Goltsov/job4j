package ru.job4j.array;

public class Matrix {
    public  static  int[][]multiple (int size){
        int [][] table = new  int[size][size];



            for (int i = 1; i < table.length; i++) {
                table[0][i] = i*1;
                for (int j = 1; j < table[0].length; j++) {



                    table[j][j] = j*1;


                }

            }

        return table;
    }


}
