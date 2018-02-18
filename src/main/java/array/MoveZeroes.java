package array;

/**
 * 数组排序
 * 零值放置到尾部
 * created by eric on 18-2-17
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;
        // 非零值前移
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        // 设置零值
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
