package LeetCode.Stack.Medium;

import java.util.LinkedList;
import java.util.List;

public class CheckWordValidAfterSubstitutions {
    public boolean isValid(String S) {
        List<Character> stack = new LinkedList<>();
        for(int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'c') {
                if (stack.size() < 2) {
                    return false;
                }
                if (stack.get(stack.size() - 1) == 'b' && stack.get(stack.size() - 2) == 'a') {
                    stack.remove(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                }
            } else {
                stack.add(S.charAt(i));
            }
        }

        return stack.size() == 0;
    }
}
