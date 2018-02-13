package array;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-13
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] r1 = twoSum.twoSum(new int[]{3,2,4}, 6);
        Assert.assertThat(r1[0], CoreMatchers.is(1));
        Assert.assertThat(r1[1], CoreMatchers.is(2));
    }

}