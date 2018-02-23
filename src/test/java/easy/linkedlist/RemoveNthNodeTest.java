package easy.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-23
 */
public class RemoveNthNodeTest {

    @Test
    public void removeNthFromEnd() {
        int[] input = new int[]{1};
        ListNode listNode = ListNode.create(input);
        ListNode result = new RemoveNthNode().removeNthFromEnd(listNode, 1);
    }
}