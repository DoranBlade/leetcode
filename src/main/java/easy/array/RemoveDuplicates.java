package easy.array;

/**
 * 有序数组元素去重
 * created by eric on 18-2-12
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int newLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[newLength++] = nums[i];
            }
        }
        return newLength;
    }
}
