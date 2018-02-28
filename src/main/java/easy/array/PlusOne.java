package easy.array;

import java.util.Stack;

/**
 * created by eric on 18-2-28
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int next = 0;
        int i = digits.length - 1;
        Stack<Integer> stack = new Stack<>();
        while (i >= 0){
            if (i == digits.length - 1) {
                next++;
            }
            if (digits[i] + next > 9) {
                stack.push((digits[i] + next) % 10);
                next = 1;
            } else {
                stack.push(digits[i] + next);
                next = 0;
            }
            if (i == 0 && next == 1) {
                stack.push(1);
            }
            i--;
        }
        int[] res = new int[stack.size()];
        for (int j = 0; stack.size() > 0; j++) {
            res[j] = stack.pop();
        }
        return res;
    }
}
