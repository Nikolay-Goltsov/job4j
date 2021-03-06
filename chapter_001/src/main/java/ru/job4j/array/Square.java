package ru.job4j.array;

/**
 * @author  Nikolay Goltsov
 */
public class Square {
    /**
     *
     * @param bound входной число
     * @return Возвращает квадрат чисел от 0 до (выходного числа -1)
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
