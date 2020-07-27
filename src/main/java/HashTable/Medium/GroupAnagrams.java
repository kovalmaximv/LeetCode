package HashTable.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/
// Medium
// Problem: 0

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> data = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);

            if (data.containsKey(sorted)) {
                data.get(sorted).add(str);
            } else {
                data.put(sorted, new ArrayList<>(){{
                    add(str);
                }});
            }
        }

        return new LinkedList<>(data.values());
    }
}
