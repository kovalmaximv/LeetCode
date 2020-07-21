package Array.Medium;

// https://leetcode.com/problems/count-number-of-teams/
// Medium
// Problem: 3

public class CountNumberTeams {
    public int numTeams(int[] rating) {
        int res = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            int leftGrounder = 0, leftLower = 0;
            int rightGrounder = 0, rightLower = 0;
            for (int j = 0; j < rating.length; j++) {
                if (rating[j] < rating[i]) {
                    if (j < i) {
                        leftLower++;
                    } else {
                        rightLower++;
                    }
                } else if (rating[j] > rating[i]) {
                    if (j < i) {
                        leftGrounder++;
                    } else {
                        rightGrounder++;
                    }
                }
            }

            res += leftLower * rightGrounder + leftGrounder * rightLower;
        }

        return res;
    }
}
