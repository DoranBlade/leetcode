package easy.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-23
 */
public class ReverseTest {

    @Test
    public void reverseList() {
        int[] input = new int[]{1, 2, 4, 5};
        ListNode listNode = ListNode.create(input);
        ListNode result = new Reverse().reverseList(listNode);
    }
}