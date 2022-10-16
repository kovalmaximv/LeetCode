package LeetCode.Strings.Medium;

// https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {
    private int maxLen, lmax;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            assumePall(i, i, s); // odd
            assumePall(i, i + 1, s); // even
        }

        return s.substring(lmax, lmax + maxLen);
    }

    /*
     * Считаем, что l и r - центр паллиндрома.
     * Для случая четного паллиндрома, l == r. Для нечетного l < r на 1.
     * Отходим в разные стороны от центра и находим длину максимального паллиндрома из этой точки
     */
    private void assumePall(int l, int r, String s) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }

        if (r - l - 1 > maxLen) {
            maxLen = r - l - 1;
            lmax = l + 1;
        }
    }
}
