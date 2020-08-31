import LeetCode.Graph.Medium.EvaluateDivision;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EvaluateDivision task = new EvaluateDivision();
        System.out.println(Arrays.toString(task.calcEquation(
                List.of(List.of("a", "b"), List.of("b", "c")),
                new double[]{2.0, 3.0},
                List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"))
                ))
        );
    }
}
