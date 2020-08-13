package LeetCode.Stack.Medium;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/design-a-stack-with-increment-operation/
// Medium
// Problem: 1

public class DesignStackWithIncrementOperation {
    class CustomStack {
        int[] stack;
        int cursor;

        public CustomStack(int maxSize) {
            cursor = -1;
            stack = new int[maxSize];
        }

        public void push(int x) {
            if (cursor < stack.length - 1) {
                stack[++cursor] = x;
            }
        }

        public int pop() {
            if(cursor > -1) {
                return stack[cursor--];
            }
            return -1;
        }

        public void increment(int k, int val) {
            for(int i = 0; i < k && i <= cursor; i++) {
                stack[i] += val;
            }
        }
    }
}
