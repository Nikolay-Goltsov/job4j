package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean prime = false;
        for (int i = 2; i <= n; i++) {
            if (n % 2 == 0 && n % n == 0) {
                break;
            }
            prime = true;
        }
        return prime;
    }
}
