package Array.Easy;

// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
// Easy
// Not optimal
// Вернуться 17.07 для оптимального решения ~ N*log^2(k)

import java.util.PriorityQueue;

public class TheKWeakestRowsInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        //int[0] - count of num in array, int[1] - index
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);

        for(int i = 0; i < mat.length; i++) {
            queue.add(new int[]{countOfNum(mat[i]), i});

            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] answer = new int[k];

        while (k > 0) {
            answer[--k] = queue.poll()[1];
        }

        return answer;
    }

    private int countOfNum(int[] array) {
        int l0 = 0, r0 = array.length;

        while (l0 < r0) {
            int middle = l0 + (r0 - l0) / 2;
            if (array[middle] == 1) {
                l0 = middle + 1;
            } else {
                r0 = middle;
            }
        }

        return l0;
    }
}
