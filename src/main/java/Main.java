import HashTable.Medium.AvoidFloodTheCity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AvoidFloodTheCity task = new AvoidFloodTheCity();
        System.out.println(Arrays.toString(task.avoidFlood(
                new int[]{2,3,0,0,3,1,0,1,0,2,2}
        )));
    }
}
