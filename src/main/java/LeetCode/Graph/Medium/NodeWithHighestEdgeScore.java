package LeetCode.Graph.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// https://leetcode.com/problems/node-with-highest-edge-score/

public class NodeWithHighestEdgeScore {
    public int edgeScore(int[] edges) {
        Map<Integer, Long> data = new HashMap<>();
        Long maxSize = 0L;
        Integer maxEdge = -1;

        for (int i = 0; i < edges.length; i++) {
            data.put(edges[i], data.getOrDefault(edges[i], 0L) + i);
        }

        for (Integer key: data.keySet()) {
            if (data.get(key) > maxSize) {
                maxSize = data.get(key);
                maxEdge = key;
            } else if (Objects.equals(data.get(key), maxSize)) {
                if (key < maxEdge) {
                    maxEdge = key;
                }
            }
        }

        return maxEdge;
    }

    public static void main(String[] args) {
        NodeWithHighestEdgeScore nodeWithHighestEdgeScore = new NodeWithHighestEdgeScore();
        System.out.println(nodeWithHighestEdgeScore.edgeScore(new int[]
                {25,27,27,21,39,30,38,17,36,23,23,2,34,39,11,36,15,29,35,36,39,3,30,29,33,0,33,21,41,21,36,36,35,35,19,36,42,19,28,11,44,11,30,6,11}
        ));
    }
}
