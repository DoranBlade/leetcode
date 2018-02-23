package easy.linkedlist;

/**
 * 链表节点
 * created by eric on 18-2-23
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode create(int[] source) {
        if (source.length == 0) {
            return null;
        }
        ListNode result = new ListNode(source[0]);
        ListNode currentNode = result;
        for (int i = 1; i < source.length; i++) {
            ListNode node = new ListNode(source[i]);
            currentNode.next = node;
            currentNode = currentNode.next;
        }
        return result;
    }
}
