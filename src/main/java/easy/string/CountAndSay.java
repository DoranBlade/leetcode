package easy.string;

/**
 * 计数
 * created by eric on 18-2-26
 */
public class CountAndSay {

    /**
     * 循环遍历方式
     *
     * @param n 计数次数
     * @return 结果
     */
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            res = countOperator(res);
        }
        return res.toString();
    }

    /**
     * 对一个输入数计数
     *
     * @param input 输入数
     * @return 计数结果
     */
    private StringBuilder countOperator(StringBuilder input) {
        int count = 1;
        StringBuilder res = new StringBuilder("");
        for (int j = 0; j < input.length(); j++) {
            if (j + 1 >= input.length() || input.charAt(j) != input.charAt(j + 1)) {
                res.append(count).append(input.charAt(j));
                count = 1;
                continue;
            }
            count++;
        }
        return res;
    }

}
