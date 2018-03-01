package easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 计算两个数组的交集
 * created by eric on 18-3-1
 */
public class IntersectionofTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        // 哈希表记录已经匹配了的索引
        Set<Integer> matched = new HashSet<>();
        // 快指针记录遍历位置,慢指针记录结果位置
        int slow = 0, fast = 0;
        // 指向长度较长的数组
        int[] longer, sorter, res;
        if (nums1.length >= nums2.length) {
            longer = nums1;
            sorter = nums2;
        } else {
            longer = nums2;
            sorter = nums1;
        }
        for (; fast < longer.length; fast++) {
            for (int i = 0; i < sorter.length; i++) {
                if (!matched.contains(i) && longer[fast] == sorter[i]) {
                    longer[slow++] = longer[fast];
                    matched.add(i);
                    break;
                }
            }
        }
        res = new int[slow];
        for (int j = 0; j < slow; j++) {
            res[j] = longer[j];
        }
        return res;
    }
}
