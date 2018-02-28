package easy.string;

/**
 * 实现字符串
 * created by eric on 18-2-21
 */
public class ImplementStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        boolean isContainer;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                isContainer = true;
                for (int j = i, k = 0; k < needle.length(); j++, k++) {
                    if (haystack.charAt(j) != needle.charAt(k)) {
                        isContainer = false;
                        break;
                    }
                }
                if (isContainer) {
                    return i;
                }
            }
        }
        return -1;
    }

}
