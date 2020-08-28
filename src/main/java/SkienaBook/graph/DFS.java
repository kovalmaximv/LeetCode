package SkienaBook.graph;

public abstract class DFS {
    public void dfs(Graph graph, int vertex) {
        if (graph.finished) return;

        graph.discovered[vertex] = true;
        graph.time++;
        graph.entryTime[vertex] = graph.time;

        processVertexEarly(graph, vertex);
        for(int vertexChild: graph.links.get(vertex)) {
            if (!graph.discovered[vertexChild]) {
                graph.parent[vertexChild] = vertex;
                processEdge(graph, vertex, vertexChild);
                dfs(graph, vertexChild);
            } else if (!graph.processed[vertexChild] || graph.directed) {
                processEdge(graph, vertex, vertexChild);
            }
            if (graph.finished) return;
        }
        processVertexLately(graph, vertex);
        graph.time++;
        graph.finishTime[vertex] = graph.time;
        graph.processed[vertex] = true;
    }

    public abstract void processVertexEarly(Graph graph, int vertex);

    public abstract void processEdge(Graph graph, int vertexFrom, int vertexTo);

    public abstract void processVertexLately(Graph graph, int vertex);
}
