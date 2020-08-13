package LeetCode.Array.Easy;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// Easy
// Problem: 0

import java.util.LinkedList;
import java.util.List;

public class LuckyNumbersMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = findMinIndex(matrix[i]);
            if (findMaxIndex(matrix, minIndex) == i) {
                res.add(matrix[i][minIndex]);
            }
        }

        return res;
    }

    private int findMaxIndex(int[][] matrix, int row) {
        int max = -1, maxIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][row] > max) {
                max = matrix[i][row];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private int findMinIndex(int[] array) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
