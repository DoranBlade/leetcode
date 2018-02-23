package easy.linkedlist;

/**
 * 合并两个已排序的链表
 * created by eric on 18-2-23
 */
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode currentResultNode = null;
        while (l1 != null || l2 != null) {
            ListNode selectNode = compare(l1, l2);
            if (result == null) {
                result = new ListNode(selectNode.val);
                currentResultNode = result;
            } else {
                currentResultNode.next = new ListNode(selectNode.val);
                currentResultNode = currentResultNode.next;
            }
            if (l1 == selectNode) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        return result;
    }

    private ListNode compare(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }
        return l1.val > l2.val ? l2 : l1;
    }
}
