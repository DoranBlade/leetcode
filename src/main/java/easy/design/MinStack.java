package easy.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinStack {

    private int[] container;
    private int caption;

    /** initialize your data structure here. */
    public MinStack() {
        container = new int[10];
        caption = -1;
    }

    public void push(int x) {
        caption++;
        if (caption >= container.length) {
            grow();
        }
        container[caption] = x;
    }

    public void pop() {
        caption--;
    }

    public int top() {
        return container[caption];
    }

    public int getMin() {
        int min = container[0];
        for (int i = 0; i <= caption; i++) {
            if (min > container[i]) {
                min = container[i];
            }
        }
        return min;
    }

    private void grow() {
        int currentLength = container.length;
        int[] target = new int[currentLength * 2];
        System.arraycopy(container, 0, target, 0, container.length);
        container = target;
    }
}
