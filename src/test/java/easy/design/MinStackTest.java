package easy.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {


    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min1 = minStack.getMin();
        minStack.pop();
        int top = minStack.top();
        int min2 = minStack.getMin();
    }
}