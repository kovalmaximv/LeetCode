package Array.Medium;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
// Medium
// Problem: 2

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<>();
        generate(candidates, new LinkedList<>(), 0, res, target, 0);

        return res;
    }

    private void generate(int[] candidates, List<Integer> tempRes, int tempSum, List<List<Integer>> result, int target, int start) {
        if (tempSum > target){
            return;
        } else if (tempSum == target) {
            if (tempRes.size() != 0) {
                result.add(new LinkedList<>(tempRes));
            }
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempRes.add(candidates[i]);
                generate(candidates, tempRes, tempSum + candidates[i], result, target, i);
                tempRes.remove(tempRes.size() - 1);
            }
        }
    }
}
