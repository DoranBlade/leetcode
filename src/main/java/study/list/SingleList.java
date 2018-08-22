package study.list;

public class SingleList {

    private SinglyListNode header;

    public SingleList() {
        this.header = new SinglyListNode(-1);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        SinglyListNode current = header;
        for (int i = 0; i <= index; i ++) {
            if (current == null) {
                break;
            }
            current = current.next;
        }
        return current != null ? current.val : -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        SinglyListNode firstNode = header.next;
        header.next = new SinglyListNode(val);
        header.next.next = firstNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new SinglyListNode(val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        SinglyListNode current = header;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        if (current == null) {
            return;
        }
        SinglyListNode temp = current.next;
        current.next = new SinglyListNode(val);
        current.next.next = temp;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        SinglyListNode current = header;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }
        current.next = current.next != null ? current.next.next : null;
    }

}

class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
}
