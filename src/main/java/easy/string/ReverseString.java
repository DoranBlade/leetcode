package easy.string;

/**
 * 反转字符串
 * created by eric on 18-2-18
 */
public class ReverseString {

    public String reverseString(String s) {
        char[] source = s.toCharArray();
        char[] target = new char[source.length];
        for (int i = 0, j = source.length - 1; i < source.length; i++, j--) {
            target[j] = source[i];
        }
        return new String(target);
    }

    public String reverseString1(String s) {
        char[] source = s.toCharArray();
        int loopCount = source.length / 2;
        for (int i = 0; i < loopCount; i++) {
            char temp = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = temp;
        }
        return new String(source);
    }


}
