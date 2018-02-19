package easy.string;

/**
 * 反转字符串
 * created by eric on 18-2-18
 */
public class ReverseString {

    /**
     * 使用一个其他数组来反序保存字符
     * T:O(n) S:O(n)
     *
     * @param s 输入字符
     * @return 结果
     */
    public String reverseString(String s) {
        char[] target = new char[s.length()];
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            target[j] = s.charAt(i);
        }
        return new String(target);
    }

    /**
     * 交换1/n-1, 2/n-2...元素
     * T:O(n/2) S:O(n)
     *
     * @param s 输入
     * @return 输出
     */
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
