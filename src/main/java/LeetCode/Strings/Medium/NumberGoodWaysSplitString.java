package LeetCode.Strings.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
// Medium
// Problem: 0
// #NEEDSOULTION 02.08

public class NumberGoodWaysSplitString {
    public int numSplits(String s) {
        Set<Character> setLeft = new HashSet<>();
        Map<Character, Integer> setRight = toMap(s);

        int count = 0;
        for (char character: s.toCharArray()) {
            setLeft.add(character);

            int newCount = setRight.get(character) - 1;
            if (newCount <= 0) {
                setRight.remove(character);
            } else {
                setRight.put(character, newCount);
            }
            if (setLeft.size() == setRight.keySet().size()) {
                count++;
            }
        }

        return count;
    }

    private Map<Character, Integer> toMap(String string) {
        Map<Character, Integer> res = new HashMap<>();
        for(char character: string.toCharArray()) {
            if (res.containsKey(character)) {
                res.put(character, res.get(character) + 1);
            } else {
                res.put(character, 1);
            }
        }

        return res;
    }
}
