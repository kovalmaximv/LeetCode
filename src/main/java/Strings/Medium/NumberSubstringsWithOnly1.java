package Strings.Medium;

public class NumberSubstringsWithOnly1 {
    public int numSub(String s) {
        int count = 0, res = 0;
        char[] data = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (data[i] == '1') {
                count++;
            } else {
                res += ((((1.0 + count) / 2) * count) % (1e9 + 7));
                count = 0;
            }
        }

        if(count > 0) {
            res += ((((1.0 + count) / 2) * count) % (1e9 + 7));
        }

        return res;
    }
}
