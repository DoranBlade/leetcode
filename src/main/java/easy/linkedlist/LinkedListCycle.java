package easy.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 检查链表是否有循环
 * created by eric on 18-2-23
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> references = new HashSet<>();
        while (head != null) {
            if (references.contains(head)) {
                return true;
            }
            references.add(head);
            head = head.next;
        }
        return false;
    }

}
