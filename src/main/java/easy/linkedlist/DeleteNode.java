package easy.linkedlist;

/**
 * 删除链表节点
 * created by eric on 18-2-23
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
