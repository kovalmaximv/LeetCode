package LeetCode.DynamicProgramming.Medium;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] data = new int[n];
        Arrays.fill(data, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                data[j] = data[j - 1] + data[j];
            }
        }

        return data[n - 1];
    }
}
