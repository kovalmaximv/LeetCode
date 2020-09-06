import LeetCode.Stack.Easy.MinStack;

public class Main {
    public static void main(String[] args) {
        MinStack task = new MinStack();
        task.push(2);
        task.push(1);
        task.push(5);
        task.push(4);
        System.out.println(task.getMin());
        System.out.println(task.top());
        task.pop();
        System.out.println(task.getMin());
        System.out.println(task.top());
    }
}
