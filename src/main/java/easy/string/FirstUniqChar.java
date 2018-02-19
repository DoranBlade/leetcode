package easy.string;

/**
 * 查找第一个不重复的字符
 * created by eric on 18-2-19
 */
public class FirstUniqChar {

    /**
     * 每个字符与其他字符比较,如果相等则不为唯一元素,返回该字符索引
     * T: O(n^2) S: O(0)
     *
     * @param s 输入字符
     * @return 结果
     */
    public int firstUniqChar(String s) {
        boolean hasDuplicate;
        for (int i = 0; i < s.length(); i++) {
            hasDuplicate = false;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (!hasDuplicate) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 空间换时间
     * 先扫描一遍获取字符出现的频率
     * 然后再扫描一遍获取第一个仅出现一次的字符索引
     * T:O(n) S:O(1)
     *
     * @param s 输入字符
     * @return 结果
     */
    public int firstUniqChar1(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
