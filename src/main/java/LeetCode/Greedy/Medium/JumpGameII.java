package LeetCode.Greedy.Medium;

// https://leetcode.com/problems/jump-game-ii/description/

public class JumpGameII {

    public int jump(int[] nums) {
        int jumps = 0, maxFurthest = 0, currentJumpFurthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxFurthest = Math.max(i + nums[i], maxFurthest);

            if (i == currentJumpFurthest) {
                jumps++;
                currentJumpFurthest = maxFurthest;

                if (maxFurthest >= nums.length) {
                    break;
                }
            }
        }

        return jumps;
    }

}
