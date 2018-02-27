package easy.string;

import java.util.Arrays;

/**
 * 判断变位词
 * created by eric on 18-2-26
 */
public class ValidAnagram {

    /**
     * 排序之后比较
     *
     * @param s1 第一个字符
     * @param s2 第二个字符
     * @return 结果
     */
    public boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    /**
     * 借助哈希表
     *
     * @param s 第一个字符
     * @param t 第二个字符
     * @return 结果
     */
    public boolean anagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] container = new int[26];
        for (int i = 0; i < s.length(); i++) {
            container[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            container[t.charAt(j) - 'a']--;
        }
        for (int k = 0; k < container.length; k++) {
            if (container[k] != 0) {
                return false;
            }
        }
        return true;
    }

}
