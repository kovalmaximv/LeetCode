package Array.Medium;

// https://leetcode.com/problems/container-with-most-water/
// Medium
// PROBLEM-SOLUTION

import java.util.Set;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, maxarea = 0;

        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxarea;
    }

}