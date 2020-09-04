package LeetCode.Array.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/next-permutation/
// Medium
// Problem: 1

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i == -1) {
            Arrays.sort(nums);
        } else {
            Arrays.sort(nums, i + 1, nums.length);
            int k = i + 1;
            while (nums[i] >= nums[k]) {
                k++;
            }
            swap (nums, i, k);
        }
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
