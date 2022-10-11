package LeetCode.Math.Medium;

// https://leetcode.com/problems/integer-to-roman/
// Medium

public class IntegerToRoman {

    // O(n)
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rimChars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(rimChars[i]);
            }
        }

        return sb.toString();
    }
}
