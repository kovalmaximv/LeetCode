package HashTable.Easy;

// https://leetcode.com/problems/find-common-characters/
// Easy
// Problem: 0

import java.util.LinkedList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int[] data = new int[26];

        String firstWord = A[0];
        for (int i = 0; i < firstWord.length(); i++) {
            char character = firstWord.charAt(i);
            data[character - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            String word = A[i];
            int[] freq = new int[26];
            for (int j = 0; j < word.length(); j++) {
                char character = word.charAt(j);
                freq[character - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (freq[j] < data[j]) {
                    data[j] = freq[j];
                }
            }
        }

        List<String> res = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (data[i] > 0) {
                for (int j = 0; j < data[i]; j++) {
                    res.add(String.valueOf((char) ('a' + i)));
                }
            }
        }

        return res;
    }
}
