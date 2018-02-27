package easy.linkedlist;

import easy.string.ValidPalindRome;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-26
 */
public class ValidPalindRomaTest {

    @Test
    public void isPolindroma() {
        ValidPalindRome instance = new ValidPalindRome();
        String input1 = "charr;ahc";
        String input2 = "charr;aac";
        String input3 = "0P";
        assertThat(instance.isPalindrome(input1), CoreMatchers.is(true));
        assertThat(instance.isPalindrome(input2), CoreMatchers.is(false));
        assertThat(instance.isPalindrome(input3), CoreMatchers.is(false));
    }
}