package HashTable.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/avoid-flood-in-the-city/
// Medium
// Problem: 2

public class AvoidFloodTheCity {
    public int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> lakesFullIndex = new HashMap<>();
        List<Integer> zeros = new LinkedList<>();

        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                if (lakesFullIndex.containsKey(rains[i])) {
                    boolean flag = false;
                    for (int j = 0; j < zeros.size(); j++) {
                        if (zeros.get(j) > lakesFullIndex.get(rains[i])) {
                            rains[zeros.get(j)] = rains[i];
                            lakesFullIndex.put(rains[i], i);
                            zeros.remove(j);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        return new int[]{};
                    }
                } else {
                    lakesFullIndex.put(rains[i], i);
                }
                rains[i] = -1;
            } else {
                zeros.add(i);
            }
        }

        if (zeros.size() > 0) {
            for (Integer zeroIndex: zeros) {
                rains[zeroIndex] = 1;
            }
        }

        return rains;
    }
}
