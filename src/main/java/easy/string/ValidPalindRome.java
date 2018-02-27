package easy.string;

/**
 * 验证回文字符串
 * created by eric on 18-2-26
 */
public class ValidPalindRome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() -  1;
        while (left <= right) {
            if (!wordAndNumber(s.charAt(left))) {
                left++;
                continue;
            }
            if (!wordAndNumber(s.charAt(right))) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean wordAndNumber(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
