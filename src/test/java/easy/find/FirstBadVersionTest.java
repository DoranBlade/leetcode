package easy.find;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int res1 = firstBadVersion.firstBadVersion(2126753390);
        int res2 = firstBadVersion.firstBadVersion(91);

    }
}