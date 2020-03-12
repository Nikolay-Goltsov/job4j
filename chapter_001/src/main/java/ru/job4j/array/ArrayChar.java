package ru.job4j.array;

/**
 * @author Nikolay Goltsov
 */

public class ArrayChar {
    /**
     * Метод потучает на вход 2 массива, и делает их сравнение посимвольно
     *
     * @param world Начальный массив
     * @param pref  Конечный массив
     * @return Если символы отличаются то метод меняеть возвращаемое значение на false.
     */
    public static boolean startsWith(char[] world, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != world[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

