package Strings.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/solution/
// #NEEDSOLUTION TODAY

public class LetterCombinationsPhoneNumber {
    Map<Integer, String[]> phone = new HashMap<>() {{
        put(2, new String[]{"a", "b", "c"});
        put(3, new String[]{"d", "e", "f"});
        put(4, new String[]{"g", "h", "i"});
        put(5, new String[]{"j", "k", "l"});
        put(6, new String[]{"m", "n", "o"});
        put(7, new String[]{"p", "q", "r", "s"});
        put(8, new String[]{"t", "u", "v"});
        put(9, new String[]{"w", "x", "y", "z"});
    }};
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        generateWords(digits, "", result);
        return result;
    }

    private void generateWords(String digits, String word, List<String> result) {
        if (digits.length() == 0) {
            if(word.length() != 0) {
                result.add(word);
            }
            return;
        }

        int num = digits.charAt(0) - '0';
        for(String letter : phone.get(num)) {
            generateWords(digits.substring(1), word + letter, result);
        }
    }
}
