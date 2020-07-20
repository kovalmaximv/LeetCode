package Math.Easy;

import java.util.Arrays;

public class SmallestRange {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int diff = A[A.length - 1] - A[0];
        diff -= 2*K;

        return Math.max(diff, 0);
    }
}
