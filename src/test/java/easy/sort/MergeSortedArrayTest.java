package easy.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);

    }
}