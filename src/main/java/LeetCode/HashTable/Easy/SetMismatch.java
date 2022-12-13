package LeetCode.HashTable.Easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, sum2 = 0, doubledValue = 0, runner = 0;
        Set<Integer> setNums = new HashSet<>();

        for (int num : nums) {
            if (setNums.contains(num)) {
                doubledValue = num;
            } else {
                setNums.add(num);
            }

            runner++;
            sum += runner;
            sum2 += num;
        }

        return new int[] { doubledValue, sum - sum2 + doubledValue };
    }
}
