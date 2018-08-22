package easy.array;

public class Test {

    @org.junit.Test
    public void name() {
        int res = count(3);
        int res1 = count1(10);
        int res2 = count2(5);
    }

    public int count(int i) {
        if (i == 0) {
            return 0;
        }
        return count(i - 1) * 2 + 1;
    }

    public int count1(int i) {
        if (i == 0) {
            return 1;
        }
        return i * count1(i - 1);
    }

    public int count2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return count2(n - 1) + count2(n - 2);
    }
}
