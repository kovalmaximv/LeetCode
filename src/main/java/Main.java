import LeetCode.DynamicProgramming.Medium.HouseRobberII;
import LeetCode.Graph.Medium.MinimumHeightTrees;

public class Main {
    public static void main(String[] args) {
        MinimumHeightTrees task = new MinimumHeightTrees();
        System.out.println(task.findMinHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }
}
