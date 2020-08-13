package LeetCode.Strings.Easy;

// https://leetcode.com/problems/split-a-string-in-balanced-strings/
// Easy
// Not a problem

/*
Можно обойтись одной переменной rlCount и делать +1 если R и -1 если L. Когда rlCount == 0, делать pairCount++.
 */
public class SplitBalancedString {
    public static int countOfBalancedSubstring(String balancedString) {
        int lCount = 0;
        int rCount = 0;
        int pairCount = 0;

        for (int i = 0; i < balancedString.length(); i++) {
            if (balancedString.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }

            if (lCount == rCount) {
                pairCount++;
                lCount = 0;
                rCount = 0;
            }
        }

        return pairCount;
    }
}
