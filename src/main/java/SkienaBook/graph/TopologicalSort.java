package SkienaBook.graph;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Stack;

public class TopologicalSort {
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws FileNotFoundException {
        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.topSort();
    }

    public void topSort() throws FileNotFoundException {
        Graph graph = Graph.getGraphByFile("graph.txt");
        DFS dfs = getDFS();

        for (int i = 0; i < graph.vertexCount; i++) {
            if (!graph.discovered[i]) {
                dfs.dfs(graph, i);
            }
        }


        Collections.reverse(stack);

        System.out.println(stack.toString());
    }

    private DFS getDFS() {
        return new DFS() {
            @Override
            public void processVertexEarly(Graph graph, int vertex) {}

            @Override
            public void processEdge(Graph graph, int vertexFrom, int vertexTo) {
                EdgeType edgeType = graph.getEdgeType(vertexFrom, vertexTo);
                if (edgeType == EdgeType.BACK) {
                    throw new RuntimeException("cycle in a graph");
                }
            }

            @Override
            public void processVertexLately(Graph graph, int vertex) {
                stack.add(vertex + 1);
            }
        };
    }
}
