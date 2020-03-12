package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class MatrixCheck {
    /**
     * Метод проверяет строки массива на наличие одинаковых символов в каждой ячкейке.
     *
     * @param board Входной массив с элементами
     * @param rom   шндекс строки в которой производится поиск
     * @return Если строка заполнена одинаковыми символами то возвращается true
     */
    public static boolean monoHorizontal(char[][] board, int rom) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[rom][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет столбцы массива на наличие одинаковых символов в каждой ячкейке.
     *
     * @param board  Входной массив с элементами
     * @param columm шндекс столбца в которой производится поиск
     * @return Если столбец заполнена одинаковыми символами то возвращается true
     */
    public static boolean monoVertical(char[][] board, int columm) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {

            if (board[i][columm] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет диогональ массива на наличие  одинаковых символов в каждой ячейке
     *
     * @param board входной массив с элементами
     * @return Если диогональ заполнена одинаковыми символами то возвращается true
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет наличие символа 'X' в каждой ячейке массива. По строчно, по столбцам.
     *
     * @param board Входной массив
     * @return Если в каждой ячейки строки или в каждой ячейке столбца содержится символ 'X', то возвращатеся true
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int countLine = 0;
        int countColumn = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'X') {
                        countLine++;
                    }
                    if (board[j][i] == 'X') {
                        countColumn++;
                    }
                }
                if (countColumn == board.length || countLine == board.length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
