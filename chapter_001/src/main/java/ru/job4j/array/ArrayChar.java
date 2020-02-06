package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] world, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            for (int j = 0; j < world.length; j++) {



                if (pref[i] != world[i]) {
                    result = false;
                    break;
                }

            }
        }

        return result;
    }
}

