package HashTable.Medium;

// https://leetcode.com/problems/valid-sudoku/
// Medium
// Problem: 1

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] xAxis = new int[9];
        int[] yAxis = new int[9];
        int[] cubes = new int[9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int cube_i = (j/3)*3 + (i/3);
                int byte_board = 1 << (board[i][j] - '0');
                if (
                    (xAxis[i] & byte_board) > 0 ||
                    (yAxis[j] & byte_board) > 0 ||
                    (cubes[cube_i] & byte_board) > 0
                ) {
                    return false;
                }

                xAxis[i] |= byte_board;
                yAxis[j] |= byte_board;
                cubes[cube_i] |= byte_board;
            }
        }

        return true;
    }
}
