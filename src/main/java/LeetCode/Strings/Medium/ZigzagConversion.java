package LeetCode.Strings.Medium;

// https://leetcode.com/problems/zigzag-conversion/

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> builder = new ArrayList<>();

        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            builder.add(new StringBuilder());
        }

        boolean goinDown = false;
        int i = 0;

        for(Character ch: s.toCharArray()) {
            builder.get(i).append(ch);

            if (i == 0 || i == builder.size() - 1) goinDown = !goinDown;

            i = goinDown ? i + 1 : i - 1;
        }

        StringBuilder answer = new StringBuilder();
        for (StringBuilder b: builder) {
            answer.append(b);
        }

        return answer.toString();
    }
}
