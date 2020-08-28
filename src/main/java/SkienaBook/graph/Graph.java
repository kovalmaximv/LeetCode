package SkienaBook.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Graph {
    int vertexCount;
    List<List<Integer>> links;
    boolean[] processed;
    boolean[] discovered;
    int[] parent;
    boolean directed;
    boolean finished;
    int time;
    int[] entryTime;
    int[] finishTime;

    public static Graph getGraphByFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int vertexNum = Integer.parseInt(scanner.nextLine());
        Graph graph = new Graph(vertexNum);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int vertex = Integer.parseInt(line.substring(0, 1)) - 1;
            List<Integer> linkedVertex = Arrays
                    .stream(line.substring(2).split(","))
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .map(x -> x - 1)
                    .collect(Collectors.toList());
            graph.links.get(vertex).addAll(linkedVertex);
        }

        return graph;
    }

    private Graph(int vertexNum) {
        vertexCount = vertexNum;
        links = new ArrayList<>(vertexNum);
        processed = new boolean[vertexNum];
        discovered = new boolean[vertexNum];
        parent = new int[vertexNum];
        directed = false;
        finished = false;
        time = 0;
        entryTime = new int[vertexNum];
        finishTime = new int[vertexNum];

        for (int i = 0; i < vertexNum; i++) {
            parent[i] = -1;
            links.add(new ArrayList<>());
        }
    }
}
