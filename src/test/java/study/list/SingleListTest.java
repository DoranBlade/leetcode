package study.list;

import org.junit.Test;

public class SingleListTest {

    @Test
    public void test() {
        SingleList singleList = new SingleList();
        singleList.addAtHead(1);
        singleList.addAtTail(3);
        singleList.addAtIndex(1, 2);
        System.out.println(singleList.get(1));
        singleList.deleteAtIndex(1);
        System.out.println(singleList.get(1));
    }

}