package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-17
 */
public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
    }
}