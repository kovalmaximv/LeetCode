package LeetCode.DynamicProgramming.Easy;

// https://leetcode.com/problems/house-robber/
// Easy
// Problem: 2

import java.util.Arrays;

public class HouseRobber {
    int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return rob(nums, nums.length - 1);
    }

    private int rob(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }

        if (memo[i] >= 0) {
            return memo[i];
        }

        memo[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        return memo[i];
    }
}
