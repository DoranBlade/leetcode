package easy.string;

/**
 * 实现字符转换成数值的atoi函数
 * created by eric on 18-2-26
 */
public class StringToInteger {

    public int myAtoi(String str) {
        str = str.trim();
        int seqIndex = -1;
        long res = 0;
        for(int i = 0; i < str.length(); i++) {
            if (isSeq(str.charAt(i)) && seqIndex == -1) {
                seqIndex = i;
                continue;
            }
            if (isSeq(str.charAt(i)) && seqIndex != -1) {
                return 0;
            }
            if (notNumber(str.charAt(i))) {
                break;
            }
            res = res * 10 + str.charAt(i) - '0';
            if (outIntRange(res)) {
                break;
            }
        }
        if (seqIndex != -1 && str.charAt(seqIndex) == '-') {
            res = 0 - res;
        }
        return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : res < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)res;
    }

    private boolean outIntRange(long res) {
        return res > (Integer.MAX_VALUE + 1L);
    }

    private boolean notNumber(char c) {
        return c > '9' || c < '0';
    }

    private boolean isSeq(char c) {
        return c == '-' || c == '+';
    }
}
