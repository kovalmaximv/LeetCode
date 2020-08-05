import Graph.Medium.CourseSchedule;

public class Main {
    public static void main(String[] args) {
        CourseSchedule task = new CourseSchedule();
        System.out.println(task.canFinish(3, new int[][]{{0,1}, {0,2}, {1,2}}));
    }
}
