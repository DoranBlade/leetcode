package array;

/**
 *
 * created by eric on 18-2-15
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 相等的两个值异或为0
            res ^= nums[i];
        }
        return res;
    }
}
