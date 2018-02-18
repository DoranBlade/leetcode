package easy.array;

/**
 * 最大收益
 * created by eric on 18-2-16
 */
public class BestTimeBuyAndSell {

    /**
     * 贪心算法
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }

}
