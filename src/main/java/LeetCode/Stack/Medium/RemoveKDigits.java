package LeetCode.Stack.Medium;

// https://leetcode.com/problems/remove-k-digits/

import java.util.Stack;

public class RemoveKDigits {
    /*
     * Если нужно убрать только 1 цифру, то мы пойдем слева направо и уберем первую цифру, которая больше, чем
     * ее правый сосед.
     *
     * Если нужно убрать N цифр, то мы сделаем так N раз. Но это долго.
     *
     * Чтобы это ускорить, будем идти слева направо и собирать новую строку в стеке и удалять из стека, если новая
     * цифра меньше чем верхушка стека, то убираем до тех пор, пока это условие выполняется.
     */
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && stack.size() > 0 && num.charAt(i) < stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
