package easy.other;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        long total = 0;
        long arrayTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            arrayTotal += nums[i];
            total += i;
        }
        total += nums.length;
        return (int) (total - arrayTotal);
    }
}
