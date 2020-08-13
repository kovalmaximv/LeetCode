package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generate(nums, new ArrayList<>(), result);
        return result;
    }

    private void generate(int[] nums, List<Integer> tempRes, List<List<Integer>> result) {
        if (nums.length == tempRes.size() && tempRes.size() != 0) {
            result.add(tempRes);
        } else {
            for (int num : nums) {
                if (!tempRes.contains(num)) {
                    List<Integer> tempCopy = new ArrayList<>(tempRes);
                    tempCopy.add(num);
                    generate(nums, tempCopy, result);
                }
            }
        }
    }
}
