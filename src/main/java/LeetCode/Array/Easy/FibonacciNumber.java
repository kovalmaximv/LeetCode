package LeetCode.Array.Easy;

public class FibonacciNumber {
    public static int fib(int N) {
        if (N < 2) return N;

        int fMinusOne = 1, fMinusTwo = 0, fCurrent = 1;

        for(int i = 1; i < N; i++) {
            fCurrent = fMinusOne + fMinusTwo;
            fMinusTwo = fMinusOne;
            fMinusOne = fCurrent;
        }

        return fCurrent;
    }
}
