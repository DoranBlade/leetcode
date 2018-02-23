package easy.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-23
 */
public class MergeTwoSortedListTest {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = ListNode.create(new int[]{1, 2, 3});
        ListNode l2 = ListNode.create(new int[]{1, 3,4});
        ListNode res = new MergeTwoSortedList().mergeTwoLists(l1, l2);
    }
}