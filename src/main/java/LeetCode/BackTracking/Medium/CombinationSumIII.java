package LeetCode.BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/
// Easy
// Problem: 1

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solver(res, new ArrayList<>(), 1, n, k);
        return res;
    }

    public void solver(List<List<Integer>> res, List<Integer> partRes, int start, int n, int k) {
        if (n == 0 && partRes.size() == k) {
            res.add(new ArrayList<>(partRes));
            return;
        }
        for (int i = start; i <= 9; i++) {
            partRes.add(i);
            solver(res, partRes, i + 1, n - i, k);
            partRes.remove(partRes.size() - 1);
        }
    }
}
