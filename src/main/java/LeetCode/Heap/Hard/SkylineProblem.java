package LeetCode.Heap.Hard;

// https://leetcode.com/problems/the-skyline-problem/
// Hard
// Problem: 3

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SkylineProblem {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        TreeMap<Integer, Integer> availableHeights = new TreeMap<>();
        List<List<Integer>> result = new ArrayList<>(buildings.length);

        int N = buildings.length;
        if (N == 0) {
            return result;
        }

        Event[] criticalDots = new Event[N*2];
        for(int i = 0; i < N; i++) {
            criticalDots[i*2] = new Event(buildings[i][0], buildings[i][2], false);
            criticalDots[i*2+1] = new Event(buildings[i][1], buildings[i][2], true);
        }

        Arrays.sort(criticalDots);
        int lastHeight = 0;
        availableHeights.put(0, 1);
        for (int i = 0, j; i < N*2; i = j) {
            j = i;
            while (j < N*2 && criticalDots[i].x == criticalDots[j].x) {
                if (criticalDots[j].closing) {
                    int count = availableHeights.get(criticalDots[j].height);
                    if (count == 1) {
                        availableHeights.remove(criticalDots[j].height);
                    } else {
                        availableHeights.put(criticalDots[j].height, count - 1);
                    }
                } else {
                    Integer count = availableHeights.get(criticalDots[j].height);
                    if (count == null) {
                        availableHeights.put(criticalDots[j].height, 1);
                    } else {
                        availableHeights.put(criticalDots[j].height, count + 1);
                    }
                }
                j++;
            }

            int x = criticalDots[i].x;
            int height = availableHeights.lastKey();
            if (height != lastHeight) {
                lastHeight = height;
                result.add(List.of(x, height));
            }
        }

        return result;
    }
}

class Event implements Comparable<Event> {
    int x, height;
    boolean closing;

    public Event(int x, int height, boolean closing) {
        this.x = x;
        this.height = height;
        this.closing = closing;
    }

    @Override
    public int compareTo(Event other) {
        return other.x != this.x ? Integer.compare(this.x, other.x) : Boolean.compare(this.closing, other.closing);
    }
}
