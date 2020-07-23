package HashTable.Medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/valid-sudoku/
// Medium
// Problem: 0
// #NEEDSOLUTION: 23.07 (use byte)

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> xSet = new HashSet<>();
            Set<Character> ySet = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {
                if (!updateSet(xSet, board[i][j])) {
                    return false;
                }
                if (!updateSet(ySet, board[j][i])) {
                    return false;
                }

                if (i % 3 == 1 && j % 3 == 1) {
                    Set<Character> cubeSet = new HashSet<>();
                    for (int i0 = i - 1; i0 < i + 2; i0++) {
                        for (int j0 = j - 1; j0 < j + 2; j0++) {
                            if (!updateSet(cubeSet, board[i0][j0])) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    private boolean updateSet(Set<Character> set, Character character){
        if (character != '.') {
            if (set.contains(character)) {
                return false;
            }

            set.add(character);
        }
        return true;
    }
}
