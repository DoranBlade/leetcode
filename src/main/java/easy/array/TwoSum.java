package easy.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两个元素相加
 * created by eric on 18-2-13
 */
public class TwoSum {

    /**
     * 尝试所有的元素组合,匹配相加的结果
     * T:O(n^2) S:O(1)
     *
     * @param nums   输入
     * @param target 输入
     * @return 输出
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 通过哈希表保存扫描结果
     * T:O(n) S:(1)
     *
     * @param nums   输入
     * @param target 输入
     * @return 输出
     */
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> container = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (container.containsKey(target - nums[i])) {
                res[0] = container.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            container.put(nums[i], i);
        }
        return res;
    }
}
