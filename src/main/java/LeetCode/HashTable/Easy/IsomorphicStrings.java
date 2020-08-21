package LeetCode.HashTable.Easy;

import java.util.HashMap;

// https://leetcode.com/problems/isomorphic-strings/
// Easy
// Problem: 0

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> data = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (data.containsKey(s.charAt(i))) {
                if (data.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                data.put(s.charAt(i), t.charAt(i));
            }
        }

        data = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (data.containsKey(t.charAt(i))) {
                if (data.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                data.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }
}
