package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean prime = true;
        prime = n != 1;
        for (int i = 2; i <= n / 2; i++) {
            int temp = n % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
