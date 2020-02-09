package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;


        // проверить. что массив word имеет последние элементы одинаковые с post
//        for (int i = word.length-1; i >= 0; i--) {
//                if (post[i] != word[i]) {
//                    result = false;
//                    break;
//                }
//            }

        for (int endPost = post.length - 1, endWord = word.length - 1; endPost < endWord; endPost--, endWord--) {
            if (endPost < 0) {
                break;
            }
            if (post[endPost] != word[endWord]) {
                result = false;
                break;
            }

        }

        return result;
    }
}
