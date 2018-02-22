package easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-22
 */
public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] input = {"a"};
        String prefix = new LongestCommonPrefix().longestCommonPrefix(input);
    }
}