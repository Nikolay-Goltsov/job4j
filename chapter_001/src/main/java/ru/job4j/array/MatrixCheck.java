package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int rom) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[rom][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int columm) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][columm] != 'X') {
                    result = false;
                }
            }
        }
        return result;
    }
}
