package LeetCode.Graph.Medium;

// https://leetcode.com/problems/clone-graph/
// Medium
// Problem: 1

public class CloneGraph {
    /*
    public Node cloneGraph(Node node) {
        List<Integer> list = new ArrayList<>();
        list.contains()

        Map<Node, Node> discoveredNode = new HashMap<>();

        Queue<Node> clonedQueue = new LinkedList<>();
        Queue<Node> originalQueue = new LinkedList<>();

        Node clonedRoot = new Node(node.val);
        clonedQueue.add(clonedRoot);
        originalQueue.add(node);

        while (originalQueue.size() != 0) {
            Node originalNode = originalQueue.poll();
            Node clonedNode = clonedQueue.poll();

            for (Node neighbor: originalNode.neighbors) {
                if (!discoveredNode.containsKey(neighbor)) {
                    originalQueue.add(neighbor);
                    Node clone = new Node(neighbor.val);
                    clonedQueue.add(clone);
                    clonedNode.neighbors.add(clone);

                    discoveredNode.put(neighbor, clone);
                } else {

                    discoveredNode.get(neighbor)
                }
            }
        }

        return clonedRoot;
    }
     */
}
