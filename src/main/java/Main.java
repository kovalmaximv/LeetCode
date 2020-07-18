import Sort.Easy.MatrixCellsDistanceOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] ans = MatrixCellsDistanceOrder.allCellsDistOrder(2, 3, 1, 2);

        Arrays.stream(ans).forEachOrdered(arr -> {
            System.out.println(Arrays.toString(arr));
        });

    }
}
