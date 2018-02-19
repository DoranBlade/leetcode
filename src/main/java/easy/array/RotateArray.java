package easy.array;

/**
 * created by eric on 18-2-15
 */
public class RotateArray {


    public void rotate1(int[] nums, int k) {
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = copy[i];
        }
    }

}
