package Strings.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/add-strings/
// Easy
// Good solution

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int k = Math.max(num1.length(), num2.length()) + 1;
        char[] ans = new char[k + 1];
        Arrays.fill(ans, ' ');

        int i = num1.length() - 1, j = num2.length() - 1;
        boolean rem = false;

        while (i >= 0 && j >= 0) {
            char num = (char) (num1.charAt(i) + num2.charAt(j) - '0');

            if (rem) {
                num++;
                rem = false;
            }

            if (num > '9') {
                num -= 10;
                rem = true;
            }

            ans[k--] = num;

            i--; j--;
        }

        while(i >= 0) {
            char num = num1.charAt(i);

            if (rem) {
                num++;
                rem = false;
            }
            if (num > '9') {
                num -= 10;
                rem = true;
            }
            ans[k--] = num;
            i--;
        }

        while(j >= 0) {
            char num = num2.charAt(j);

            if (rem) {
                num++;
                rem = false;
            }
            if (num > '9') {
                num -= 10;
                rem = true;
            }
            ans[k--] = num;
            j--;
        }

        if (rem) {
            ans[k] = '1';
        }

        return String.valueOf(ans).trim();
    }
}
