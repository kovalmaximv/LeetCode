package LeetCode.Math.Medium;

import java.util.Stack;

public class ReverseInteger {
    public int reverse(int x) {
        Stack<Integer> stack = new Stack<>();
        int sign = x > 0 ? 1 : -1;
        x = x > 0 ? x : -x;

        while (x > 0) {
            stack.push(x % 10);
            x /= 10;
        }

        int ans = 0;
        int k = 1;

        while(!stack.isEmpty()) {
            long newValue = ans;
            newValue += (long) k * stack.pop();
            if (newValue > Integer.MAX_VALUE) {
                return 0;
            }
            ans = (int) newValue;
            k *= 10;
        }

        return ans * sign;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(12345));
    }
}
