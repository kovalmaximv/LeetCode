package LeetCode.Strings.Medium;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        generate("(", 1, 0, result, n);
        return result;
    }

    private void generate(String word, int lCount, int rCount, List<String> result, int count) {
        if (lCount == count && rCount == count && word.length() != 0) {
            result.add(word);
        } else {
            if (lCount < count) {
                generate(word + "(", lCount + 1, rCount, result, count);
            }
            if (rCount < lCount) {
                generate(word + ")", lCount, rCount + 1, result, count);
            }
        }
    }
}
