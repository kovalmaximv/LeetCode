package Heap.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder());
        queue.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();

            int newStone = Math.abs(x - y);
            if (newStone != 0) {
                queue.add(newStone);
            }
        }
        if (queue.peek() == null) {
            return 0;
        } else {
            return queue.peek();
        }
    }
}
