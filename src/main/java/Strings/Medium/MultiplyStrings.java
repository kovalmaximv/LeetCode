package Strings.Medium;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        String ans = "0";

        for(int j = num2.length() - 1, dim = 0; j > -1; j--, dim++) {
            ans = sum(ans, mul(num1, num2.charAt(j), dim));
        }

        return ans;
    }


    private String sum(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int rem = 0;

        for(int i = str1.length() - 1, j = str2.length() - 1; i > -1 || j > -1; i--, j--) {
            int nm1 = i >= 0 ? str1.charAt(i) - '0' : 0;
            int nm2 = j >= 0 ? str2.charAt(j) - '0' : 0;

            int nm = nm1 + nm2 + rem;
            rem = nm / 10;
            nm %= 10;

            sb.append(nm);
        }

        if (rem > 0) {
            sb.append(rem);
        }

        return sb.reverse().toString();
    }

    private String mul(String str, char c, int dim) {
        StringBuilder sb = new StringBuilder();
        int rem = 0;
        int mult = c - '0';

        for (int i = str.length() - 1; i > -1; i--) {
            int nm = (str.charAt(i) - '0') * mult + rem;
            rem = nm / 10;
            nm %= 10;
            sb.append(nm);
        }

        if (rem > 0) {
            sb.append(rem);
        }

        sb = sb.reverse();
        for(int i = 0; i < dim; i++) {
            sb.append(0);
        }

        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
