package DynamicProgramming.Hard;

// https://leetcode.com/problems/stone-game-iv/
// Hard
// Problem: 2

public class StoneGameIV {
    public boolean winnerSquareGame(int n) {
        Boolean[] data = new Boolean[n + 1];
        data[0] = false;
        return recursion(data, n);
    }

    private boolean recursion(Boolean[] data, int n) {
        if (data[n] != null) {
            return data[n];
        }

        for (int i = (int) Math.sqrt(n); i > 0; i--) {
            if (!recursion(data, n - (i * i))) {
                data[n] = true;
                return data[n];
            }
        }

        data[n] = false;
        return data[n];
    }
}
