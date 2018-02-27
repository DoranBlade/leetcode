package easy.string;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-26
 */
public class ValidAnagramTest {

    @Test
    public void anagram() {
        ValidAnagram instance  = new ValidAnagram();
        assertThat(instance.anagram("car", "tar"), CoreMatchers.is(false)); ;
        assertThat(instance.anagram("anagram", "naagram"), CoreMatchers.is(true));
    }

    @Test
    public void anagram1() {
        ValidAnagram instance  = new ValidAnagram();
        assertThat(instance.anagram1("car", "tar"), CoreMatchers.is(false)); ;
        assertThat(instance.anagram1("anagram", "naagram"), CoreMatchers.is(true));
        assertThat(instance.anagram1("", ""), CoreMatchers.is(true));
    }
}