package easy.array;

import easy.string.CountAndSay;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-26
 */
public class CountAndSayTest {

    @Test
    public void count() {
        CountAndSay instance = new CountAndSay();
        assertThat(instance.countAndSay(1), CoreMatchers.is("1"));
        assertThat(instance.countAndSay(2), CoreMatchers.is("11"));
        assertThat(instance.countAndSay(3), CoreMatchers.is("21"));
        assertThat(instance.countAndSay(4), CoreMatchers.is("1211"));
        assertThat(instance.countAndSay(5), CoreMatchers.is("111221"));
    }
}