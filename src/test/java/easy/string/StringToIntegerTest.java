package easy.string;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-26
 */
public class StringToIntegerTest {

    @Test
    public void atoi() {
        String input1 = "-1245ada0";
        String input2 = "12345a541";
        String input3 = "a48fes";
        StringToInteger instance = new StringToInteger();
        assertThat(instance.myAtoi(input1), CoreMatchers.is(-1245));
        assertThat(instance.myAtoi(input2), CoreMatchers.is(12345));
        assertThat(instance.myAtoi(input3), CoreMatchers.is(0));
    }
}