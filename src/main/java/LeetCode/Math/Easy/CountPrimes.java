package LeetCode.Math.Easy;

// https://leetcode.com/problems/count-primes/
// Easy
// Problem: 0

public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean[] primes = new boolean[n];
        primes[1] = true;
        int count = n-2;

        for (int i = 2; i * i < n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    if (!primes[j]) {
                        primes[j] = true;
                        count--;
                    }
                }
            }
        }

        return count;
    }
}
