package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int rom) {
        boolean result = true;

        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board.length; j++) {
                if (board[1][j]!='X') {
                    result = false;
                    break;
                }
            }
        } return result;
    }
}
