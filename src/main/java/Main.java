import HashTable.Medium.ValidSudoku;
import Tree.Medium.TimeNeededInformAllEmployees;

public class Main {
    public static void main(String[] args) {
        TimeNeededInformAllEmployees task = new TimeNeededInformAllEmployees();
        System.out.println(task.numOfMinutes(6,
                2,
                new int[]{2,2,-1,2,2,2},
                new int[]{0,0,1,0,0,0})
        );
    }
}
