package easy.string;

/**
 * 反转数值
 * created by eric on 18-2-18
 */
public class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = false;
        long param = x;
        if (x < 0) {
            isNegative = true;
            param = -param;
        }
        char[] source = String.valueOf(param).toCharArray();
        int loopCount = source.length / 2;
        for (int i = 0; i < loopCount; i++) {
            char temp = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = temp;
        }
        long result = Long.valueOf(new String(source));
        if (isNegative) {
            result = 0 - result;
        }
        return result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE ? (int) result : 0;
    }
}
