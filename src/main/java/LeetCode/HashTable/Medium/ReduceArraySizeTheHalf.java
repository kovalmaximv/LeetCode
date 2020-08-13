package LeetCode.HashTable.Medium;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ReduceArraySizeTheHalf {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int count = 0;
        Integer sum = 0;
        List<Map.Entry<Integer, Integer>> collect = map.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()))
                .collect(Collectors.toList());

        for (Map.Entry<Integer, Integer> entry : collect) {
            sum += entry.getValue();
            count++;
            if (sum >= arr.length / 2) {
                break;
            }
        }

        return count;
    }
}
