package util;

/**
 * created by eric on 18-2-18
 */
public class SwapUtils {

    public static void swap(char[] source, int indexA, int indexB) {
        char t = source[indexA];
        source[indexA] = source[indexB];
        source[indexB] = t;
    }
}
