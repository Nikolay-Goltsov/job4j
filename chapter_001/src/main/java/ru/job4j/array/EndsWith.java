package ru.job4j.array;

/**
 * @author Nikolai Goltsov
 */
public class EndsWith {
    /**
     * Метод сравнивает сиволы с конца строки
     *
     * @param word входной массив со строкой
     * @param post массив с частью строки для сравнения.
     * @return Если post совпадает с окончанием строки из массива world, будет возвращено true.
     * int endPost и int endWorld указывают на длинну массивов, соответственно. С каждым прохода цикла for, их длинна уменьшается.
     * Тем самым проверяется кажтый символ строки.
     */
    public static boolean endsWith(char[] word, char[] post) {

        boolean result = true;
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
