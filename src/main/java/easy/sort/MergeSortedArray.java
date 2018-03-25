package easy.sort;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int l = --m + --n + 1; l >= 0; l--) {
            if (m < 0) {
                nums1[l] = nums2[n--];
                continue;
            }
            if (n < 0) {
                nums1[l] = nums1[m--];
                continue;
            }
            if (nums1[m] >= nums2[n]) {
                nums1[l] = nums1[m--];
            } else {
                nums1[l] = nums2[n--];
            }
        }
    }
}
