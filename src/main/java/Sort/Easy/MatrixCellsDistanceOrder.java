package Sort.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/matrix-cells-in-distance-order/
// Easy
// Need solve with better solution
// Best solution

public class MatrixCellsDistanceOrder {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        int k = 0;

        List<int[]> cells = new ArrayList<>(); //Queue мб быстрее
        cells.add(new int[]{r0, c0});
        boolean[][] visited = new boolean[R][C];
        while(cells.size() != 0) {
            int[] cell = cells.get(0);
            if(cell[0] >= 0 && cell[0] < R && cell[1] >= 0 && cell[1] < C && !visited[cell[0]][cell[1]]) {
                ans[k++] = cell;
                visited[cell[0]][cell[1]] = true;

                cells.add(new int[]{cell[0], cell[1]+1});
                cells.add(new int[]{cell[0], cell[1]-1});
                cells.add(new int[]{cell[0]+1, cell[1]});
                cells.add(new int[]{cell[0]-1, cell[1]});
            }
            cells.remove(0);
        }

        return ans;
    }
}
