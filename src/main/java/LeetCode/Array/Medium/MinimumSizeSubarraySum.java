package LeetCode.Array.Medium;

// https://leetcode.com/problems/minimum-size-subarray-sum/
// Medium
// Problem: 2

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int j = 0, sum = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= s) {
                min = Integer.min(min, i - j + 1);
                sum -= nums[j++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
