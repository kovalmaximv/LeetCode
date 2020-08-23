package LeetCode.HashTable.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        set.add(n);
        while (n != 1) {
            n = divideAndSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int divideAndSum(int n) {
        int div = 0;
        int sum = 0;
        while (n != 0) {
            div = n % 10;
            n /= 10;
            sum += (div * div);
        }

        return sum;
    }
}
