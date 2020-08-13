package SkienaBook.Tasks;

import java.util.Stack;

public class BracketResolver {
    public boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (character == ')') {
                if (stack.size() == 0 || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else {
                stack.add(character);
            }

        }

        return stack.size() == 0;
    }


    public static void main(String... args) {
        BracketResolver bracketResolver = new BracketResolver();
        System.out.println(bracketResolver.checkBracket("()(()())"));
    }
}
