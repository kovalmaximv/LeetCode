package LeetCode.Array.Easy;

public class CheckIfItIsStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        int xCoefficient = y1 - y2;
        int yCoefficient = x2 - x1;
        int xyCoefficient = x1*y2 - x2*y1;



        for (int i = 2; i < coordinates.length; i++) {
            if (xCoefficient*coordinates[i][0] + yCoefficient*coordinates[i][1] + xyCoefficient != 0) {
                return false;
            }
        }

        return true;
    }
}
