import Array.Easy.TheKWeakestRowsInMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        TheKWeakestRowsInMatrix
                                .kWeakestRows(new int[][]{{1,1,1,0,0,0,0},{1,1,1,1,1,1,0},{0,0,0,0,0,0,0},{1,1,1,0,0,0,0},{1,1,1,1,1,1,1}}, 4)));
    }
}
