package LeetCode.Greedy.Medium;

// https://leetcode.com/problems/jump-game/description/

public class JumpGame {

    public boolean canJump(int[] nums) {
        int maxJump = 0, lastPoint = nums.length - 1;

        for (int i = 0; maxJump >= i && maxJump < lastPoint; i++) {
            maxJump = Math.max(i + nums[i], maxJump);
        }

        return maxJump >= lastPoint;
    }

}
