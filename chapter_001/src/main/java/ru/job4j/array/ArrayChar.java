package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] world, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length - 1; i++) {
//            for (int j = 0; j < world.length - 1; j++) {

                if (pref[i] == world[i]) {
                    result = true;
                }


                if (pref[i] != world[i]) {
                    result = false;
                    break;
                }

            }
//        }

        return result;
    }
}

