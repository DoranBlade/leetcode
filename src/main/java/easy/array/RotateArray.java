package easy.array;

/**
 * created by eric on 18-2-15
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums.length < 2 || k <= 0) {
            return;
        }
        if (k >= nums.length) {
            rotate(nums,k % nums.length);
            return;
        }
        // 缓存翻转的后半部分数据
        int[] temp = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length; i++) {
            temp[j++] = nums[i];
        }
        // 前部分翻转到后面
        for (int i = nums.length; i > k;) {
            i--;
            nums[i] = nums[i - k];
        }
        // 后半部分翻转到前面
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
