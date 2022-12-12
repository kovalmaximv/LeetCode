package LeetCode.DynamicProgramming.Medium;

//https://leetcode.com/problems/minimum-path-sum/description/

public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) continue;

                int leftPosition = j > 0 ? grid[i][j - 1] : Integer.MAX_VALUE;
                int rightPosition = i > 0 ? grid[i - 1][j] : Integer.MAX_VALUE;

                grid[i][j] = Math.min(leftPosition, rightPosition) + grid[i][j];
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }

}
