package LeetCode.HashTable.Easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
// Easy
// Problem: 0

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
