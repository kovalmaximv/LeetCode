package LeetCode.Stack.Medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/validate-stack-sequences/description/

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int cursorPush = 0, cursorPop = 0;

        List<Integer> stack = new ArrayList<>();

        stack.add(pushed[cursorPush++]);

        while (cursorPop < popped.length) {
            if (stack.size() > 0 && stack.get(stack.size() - 1) == popped[cursorPop]) {
                cursorPop++;
                stack.remove(stack.size() - 1);
            } else {
                if (cursorPush >= pushed.length) {
                    return false;
                }
                stack.add(pushed[cursorPush++]);
            }
        }

        return cursorPop == popped.length && cursorPush == pushed.length;
    }

}
