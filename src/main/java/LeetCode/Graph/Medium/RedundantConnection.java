package LeetCode.Graph.Medium;

// https://leetcode.com/problems/redundant-connection/
// Medium
// Problem: 2

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length * 2);

        int[] brokenEdge = null;
        for (int[] edge: edges) {
            if (!dsu.union(edge[0], edge[1])) {
                brokenEdge = edge;
            }
        }

        return brokenEdge;
    }

    class DSU {
        private int[] rank;
        private int[] parents;

        public DSU(int size) {
            rank = new int[size];
            parents = new int[size];
            for (int i = 0; i < size; i++) {
                parents[i] = i;
            }
        }

        public int find(int vertex) {
            while (vertex != parents[vertex]) {
                vertex = parents[vertex];
            }
            return vertex;
        }

        public boolean union(int x, int y) {
            int xr = find(x), yr = find(y);

            if (xr == yr) {
                return false;
            } else if (rank[xr] < rank[yr]) {
                parents[xr] = yr;
            } else if (rank[xr] > rank[yr]) {
                parents[yr] = xr;
            } else {
                parents[yr] = xr;
                rank[xr]++;
            }

            return true;
        }
    }
}
