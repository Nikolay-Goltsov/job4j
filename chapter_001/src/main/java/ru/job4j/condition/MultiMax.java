package ru.job4j.condition;

public class MultiMax {
    public  int max(int first, int second, int third){
        //int x = 0;
        int x = first>second? first:second;
      //  if (first>second){
        //     x=first;
        //}else {
          //  x=second;
        //}
        int result = third>x?third:x;
        //if (third>x){
         //   x=third;
       // }
           return result;

    }
}
