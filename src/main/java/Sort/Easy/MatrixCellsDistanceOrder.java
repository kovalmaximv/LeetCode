package Sort.Easy;

import java.util.Arrays;

// https://leetcode.com/problems/matrix-cells-in-distance-order/
// Easy
// Need solve with better solution
// #NEEDSOLUTION 20.07

public class MatrixCellsDistanceOrder {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R*C][2];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ans[i*C + j] = new int[] {i,j};
            }
        }

        Arrays.sort(ans, (a, b) -> {
            int difA = Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            int difB = Math.abs(b[0] - r0) + Math.abs(b[1] - c0);

            return difA - difB;
        });

        return ans;
    }
}
