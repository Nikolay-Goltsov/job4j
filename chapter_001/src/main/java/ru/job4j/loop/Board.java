package ru.job4j.loop;

public class Board {
    public static void pain(int width, int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("X");
                } else {System.out.print(" ");
                }}System.out.println();
        }}

    public static void main(String[] args) {
        pain(3, 3);
        pain(4, 4);
    }
}
