package easy.linkedlist;

import java.util.Stack;

/**
 * 验证链表是否是回文的
 * created by eric on 18-2-28
 */
public class Palindrome {

    private ListNode temp;

    public boolean isPalindrome(ListNode head) {
        temp = head;
        return isPalindromeList(head);
    }

    private boolean isPalindromeList(ListNode node) {
        if (node == null) {
            return true;
        }
        boolean result = isPalindromeList(node.next) && (node.val == temp.val);
        temp = temp.next;
        return result;
    }

    /**
     * 使用快慢指针记录记录中心位置, 遍历过程中将前半部分节点存入栈中
     *
     * @param head 起始节点
     * @return 结果
     */
    public boolean isPalindrome1(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            stack.push(slow);
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (stack.pop().val != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
