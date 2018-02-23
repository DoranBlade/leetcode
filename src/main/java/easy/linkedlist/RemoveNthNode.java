package easy.linkedlist;

/**
 * 从尾部开始删除指定位置的节点
 * created by eric on 18-2-23
 */
public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 获取链表长度
        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            length++;
        }

        if (length < n || n < 0) {
            return head;
        }
        if (length == n) {
            return head.next;
        }
        // 跳转到被删除节点的前一个节点
        currentNode = head;
        for (int i = 0; i < length - n - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }
}
