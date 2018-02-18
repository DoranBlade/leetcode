package easy.array;

import org.junit.Test;

/**
 * created by eric on 18-2-16
 */
public class RotateArrayTest {

    @Test
    public void rotate() {
        int[] source = {1, 2, 3};
        new RotateArray().rotate(source, 2);
    }
}