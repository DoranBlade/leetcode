package easy.string;

/**
 * 查找字符数组元素的最长前缀
 * created by eric on 18-2-22
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0] == null || strs[0].length() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int prefixIndex = -1;
        while (true) {
            if (++prefixIndex >= strs[0].length()) {
                return result.toString();
            }
            char currentChar = strs[0].charAt(prefixIndex);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] == null || prefixIndex >= strs[i].length() || strs[i].charAt(prefixIndex) != currentChar) {
                    return result.toString();
                }
            }
            result.append(currentChar);
        }
    }
}
