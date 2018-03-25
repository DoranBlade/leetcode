package easy.find;

public class FirstBadVersion extends VersionControl {

    private int lastBadVersion;
    private long maxVersion;
    private long minVersion;

    public int firstBadVersion(int n) {
        maxVersion = n;
        minVersion = 0;
        lastBadVersion = n;
        return find(n);
    }

    private int find(int n) {
        if (!isBadVersion(n) && lastBadVersion - n == 1) {
            return n + 1;
        }
        if (isBadVersion(n)) {
            maxVersion = n;
            lastBadVersion = n;
            return find((int) ((maxVersion + minVersion) / 2));
        } else {
            minVersion = n;
            return find((int) ((maxVersion + minVersion) / 2));
        }
    }
}
