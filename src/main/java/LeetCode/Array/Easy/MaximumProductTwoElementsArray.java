package LeetCode.Array.Easy;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Easy
// Problem: 0

public class MaximumProductTwoElementsArray {
    public int maxProduct(int[] nums) {
        if (nums.length < 2) return 0;
        int max1, max2;
        if (nums[0] > nums[1]) {
            max1 = nums[0] - 1;
            max2 = nums[1] - 1;
        } else {
            max1 = nums[1] - 1;
            max2 = nums[0] - 1;
        }


        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - 1 > max1) {
                max2 = max1;
                max1 = nums[i] - 1;
            } else if (nums[i] - 1 > max2) {
                max2 = nums[i] - 1;
            }
        }

        return max1 * max2;
    }
}
