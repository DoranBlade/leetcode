package easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-21
 */
public class ImplementStrTest {

    @Test
    public void strStr() {
        String hayStack = "mississippi";
        String needle = "issip";
        int index = new ImplementStr().strStr(hayStack, needle);
    }
}