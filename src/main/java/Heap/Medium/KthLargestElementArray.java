package Heap.Medium;

import java.util.Arrays;

public class KthLargestElementArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
