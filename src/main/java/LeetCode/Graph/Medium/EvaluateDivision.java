package LeetCode.Graph.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Graph graph = new Graph();
        double[] res = new double[queries.size()];

        for (int i = 0; i < equations.size(); i++) {
            List<String> equ = equations.get(i);
            graph.addEdge(equ.get(0), equ.get(1), values[i]);
            graph.addEdge(equ.get(1), equ.get(0), 1 / values[i]);
        }

        for (int i = 0; i < queries.size(); i++) {
            String from = queries.get(i).get(0);
            String to = queries.get(i).get(1);
            if (graph.neighbors.containsKey(from) && graph.neighbors.containsKey(to)) {
                res[i] = graph.bfs(from, to);
            } else {
                res[i] = -1.0;
            }
        }

        return res;
    }

    class Graph {
        Map<String, Map<String, Double>> neighbors;
        Map<String, Map<String, Double>> memo;

        Graph() {
            neighbors = new HashMap<>();
            memo = new HashMap<>();
        }

        void addEdge(String from, String to, Double edgeWeight) {
            if (!neighbors.containsKey(from)) {
                neighbors.put(from, new HashMap<>());
            }
            neighbors.get(from).put(to, edgeWeight);
        }

        double bfs(String from, String to) {
            if (!memo.containsKey(from)) {
                memo.put(from, new HashMap<>());
            }

            if (memo.get(from).containsKey(to)) {
                return memo.get(from).get(to);
            }

            Set<String> visited = new HashSet<>();
            visited.add(from);
            Queue<String> vertexQueue = new LinkedList<>();
            Queue<Double> edgesQueue = new LinkedList<>();
            vertexQueue.add(from);
            edgesQueue.add(1.0);

            while (vertexQueue.size() != 0) {
                String vertex = vertexQueue.poll();
                Double path = edgesQueue.poll();
                for (Map.Entry<String, Double> neighbor: neighbors.get(vertex).entrySet()) {
                    if (!visited.contains(neighbor.getKey())) {
                        vertexQueue.add(neighbor.getKey());
                        edgesQueue.add(path * neighbor.getValue());
                        memo.get(from).put(neighbor.getKey(), path * neighbor.getValue());
                        visited.add(neighbor.getKey());
                    }
                    if (neighbor.getKey().equals(to)) {
                        return path * neighbor.getValue();
                    }
                }
            }

            return -1;
        }
    }
}
