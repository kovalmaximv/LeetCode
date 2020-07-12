package Strings.Easy;

//https://leetcode.com/problems/to-lower-case/
//Easy
//Not a problem

public class ToLowerCase {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    //withoutLowerCase
    public static String toLowerCaseWithoutLibraries(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] -= 'A' - 'a';
            }
        }

        return String.valueOf(arr);
    }
}
