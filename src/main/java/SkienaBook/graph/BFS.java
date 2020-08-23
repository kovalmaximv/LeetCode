package SkienaBook.graph;

import java.util.LinkedList;
import java.util.Queue;

public abstract class BFS {
    public void bfs(Graph graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        int vertex; // текущая вершина

        graph.discovered[start] = true;
        queue.add(start);

        while (queue.size() != 0) {
            vertex = queue.poll();
            processVertexEarly(graph, vertex);
            graph.processed[vertex] = true;
            for (Integer linkedVertex: graph.links.get(vertex)) {
                if (!graph.processed[linkedVertex] || graph.directed) {
                    processEdge(graph, vertex, linkedVertex);
                }
                if (!graph.discovered[linkedVertex]) {
                    graph.discovered[linkedVertex] = true;
                    queue.add(linkedVertex);
                    graph.parent[linkedVertex] = vertex;
                }
            }
            processVertexLately(graph, vertex);
        }
    }

    public abstract void processVertexEarly(Graph graph, int vertex);

    public abstract void processEdge(Graph graph, int xVertex, int yVertex);

    public abstract void processVertexLately(Graph graph, int vertex);
}
