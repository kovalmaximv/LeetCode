package SkienaBook.graph;

import java.io.IOException;

public class ConnectedComponents {
    public static void main(String[] args) throws IOException {
        Graph graph = Graph.getGraphByFile("graph.txt");
        ConnectedComponents components = new ConnectedComponents();
        System.out.println(components.connectedComponents(graph));
    }

    public int connectedComponents(Graph graph) {
        int c = 0;
        BFS bfs = BFSFactoryMethod();

        for (int i = 0; i < graph.vertexCount; i++) {
            if (!graph.discovered[i]) {
                c++;
                bfs.bfs(graph, i);
            }
        }

        return c;
    }

    private BFS BFSFactoryMethod() {
        return new BFS() {
            @Override
            public void processVertexEarly(Graph graph, int vertex) {}

            @Override
            public void processEdge(Graph graph, int xVertex, int yVertex) {}

            @Override
            public void processVertexLately(Graph graph, int vertex) { }
        };
    }
}
