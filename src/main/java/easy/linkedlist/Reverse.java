package easy.linkedlist;

/**
 * 反转链表
 * created by eric on 18-2-23
 */
public class Reverse {

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = result;
            result = temp;
            head = head.next;
        }
        return result;
    }

}
