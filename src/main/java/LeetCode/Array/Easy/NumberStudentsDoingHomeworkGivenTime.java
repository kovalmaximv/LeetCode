package LeetCode.Array.Easy;

// https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

public class NumberStudentsDoingHomeworkGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                counter++;
            }
        }

        return counter;
    }
}
