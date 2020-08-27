package LeetCode.DynamicProgramming.Medium;

import java.util.Arrays;

public class HouseRobberII {
    int[] memo;
    int start;
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        start = 0;
        int result = rob(nums, nums.length - 2);

        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        start = 1;
        result = Math.max(result, rob(nums, nums.length - 1));

        return result;
    }

    private int rob(int[] nums, int i) {
        if (i < start) {
            return 0;
        }

        if (memo[i] >= 0) {
            return memo[i];
        }

        memo[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
        return memo[i];
    }
}
