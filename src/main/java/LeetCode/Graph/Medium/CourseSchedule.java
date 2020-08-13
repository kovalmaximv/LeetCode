package LeetCode.Graph.Medium;

import java.util.ArrayList;

// https://leetcode.com/problems/course-schedule/
// Medium
// Problem: 2

public class CourseSchedule {
    private ArrayList<Integer>[] data;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        data = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++) {
            data[i] = new ArrayList<>();
        }
        for (int[] pair: prerequisites) {
            data[pair[1]].add(pair[0]);
        }

        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visited, i)){
                return false;
            }
        }

        return true;
    }

    private boolean dfs(boolean[] visited, int vertex) {
        if (visited[vertex]) {
            return false;
        }

        visited[vertex] = true;
        for (int i = 0; i < data[vertex].size(); i++) {
            if (!dfs(visited, data[vertex].get(i))) {
                return false;
            }
        }
        visited[vertex] = false;

        return true;
    }
}
