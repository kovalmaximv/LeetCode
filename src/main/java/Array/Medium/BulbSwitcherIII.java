package Array.Medium;

// https://leetcode.com/problems/bulb-switcher-iii/
// Medium
// Problem: 0

public class BulbSwitcherIII {
    public int numTimesAllBlue(int[] light) {
        int right = 0;

        int count = 0;
        for (int i = 0; i < light.length; i++) {
            right = Math.max(right, light[i]);
            if (right == i + 1) {
                count++;
            }
        }

        return count;
    }
}
