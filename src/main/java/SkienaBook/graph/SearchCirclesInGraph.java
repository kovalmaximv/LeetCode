package SkienaBook.graph;

import java.io.FileNotFoundException;

public class SearchCirclesInGraph {
    public static void main(String[] args) throws FileNotFoundException {
        Graph graph = Graph.getGraphByFile("graph.txt");
        SearchCirclesInGraph circlesInGraph = new SearchCirclesInGraph();
        System.out.println(circlesInGraph.findCircle(graph)? "YES" : "NO");
    }

    public boolean findCircle(Graph graph) {
        DFS dfs = constructDFS();
        for (int i = 0; i < graph.vertexCount; i++) {
            dfs.dfs(graph, i);
            if (graph.finished) return true;
        }

        return false;
    }

    private DFS constructDFS() {
        return new DFS() {
            @Override
            public void processVertexEarly(Graph graph, int vertex) { }

            @Override
            public void processEdge(Graph graph, int vertexFrom, int vertexTo) {
                if (graph.parent[vertexTo] != vertexFrom && graph.parent[vertexFrom] != vertexTo) {
                    graph.finished = true;
                }
            }

            @Override
            public void processVertexLately(Graph graph, int vertex) { }
        };
    }
}
