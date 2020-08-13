package LeetCode.Tree.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/time-needed-to-inform-all-employees/
// Medium
// Problem: 1

public class TimeNeededInformAllEmployees {
    int maximumTime = 0;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int[] times = new int[n];
        Arrays.fill(times, -1);
        for (int i = 0; i < n; i++) {
            if (times[i] == -1) {
                walkManagers(manager, times, informTime, i);
            }
        }
        return maximumTime;
    }

    private int walkManagers(int[] manager, int[] times, int[] informTime, int i) {
        if (times[i] > -1) {
            return times[i];
        }
        if (manager[i] == -1) {
            times[i] = 0;
            return 0;
        }

        int time = walkManagers(manager, times, informTime, manager[i]) + informTime[manager[i]];
        times[i] = time;
        if (time > maximumTime) {
            maximumTime = time;
        }
        return time;
    }
}
