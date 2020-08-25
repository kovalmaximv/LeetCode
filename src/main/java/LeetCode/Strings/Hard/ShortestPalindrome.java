package LeetCode.Strings.Hard;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        if(s.length()<=1) return s;
        String new_s = s+"#"+new StringBuilder(s).reverse().toString();
        int[] table = new int[new_s.length()];

        for (int i = 1; i < table.length; i++) {
            if (new_s.charAt(i) == new_s.charAt(table[i-1])) {
                table[i] = table[i - 1] + 1;
            } else {
                int index = table[i - 1];

                while (index > 0 && new_s.charAt(i) != new_s.charAt(index)) {
                    index = table[index - 1];
                }

                if (new_s.charAt(i) == new_s.charAt(index)) {
                    index++;
                }

                table[i] = index;
            }
        }

        return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
    }
}
