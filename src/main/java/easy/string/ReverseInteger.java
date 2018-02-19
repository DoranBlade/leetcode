package easy.string;

/**
 * 反转数值
 * created by eric on 18-2-18
 */
public class ReverseInteger {

    /**
     * 转换成字符后反转,然后转换成数值
     * T:O(n/2) S:O(n)
     *
     * @param x 输入
     * @return 输出
     */
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
        return result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ? 0 : (int) result;
    }

    /**
     * 利用数值求余特性
     * 先求余个位,再求余十位,依次求余到最高位
     * T:O(n/10) S:O(1)
     *
     * @param x 输入
     * @return 输出
     */
    public int reverse1(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ? 0 : (int) result;
    }
}