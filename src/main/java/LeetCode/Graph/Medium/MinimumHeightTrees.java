package LeetCode.Graph.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/minimum-height-trees/
// Medium
// Problem: 2

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Set<Integer>> vertexNeighbors = new ArrayList<>(n);

        for (int i = 0; i < n; i++) vertexNeighbors.add(new HashSet<>());
        for (int[] edge: edges) {
            vertexNeighbors.get(edge[0]).add(edge[1]);
            vertexNeighbors.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new LinkedList();
        for (int i = 0; i < n; i++) {
            if (vertexNeighbors.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        while(n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new LinkedList<>();
            for (Integer leave: leaves) {
                Integer leaveNeighbor = vertexNeighbors.get(leave).iterator().next();
                vertexNeighbors.get(leaveNeighbor).remove(leave);
                if (vertexNeighbors.get(leaveNeighbor).size() == 1) {
                    newLeaves.add(leaveNeighbor);
                }
            }
            leaves = newLeaves;
        }

        return leaves;
    }
}
