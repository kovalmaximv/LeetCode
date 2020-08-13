package LeetCode.Array.Easy;

// https://leetcode.com/problems/valid-mountain-array/
// Easy
// Not a problem

/*
Есть неплохое решение с двумя интовыми переменными, пока идем в гору, n++, пока спускаемся - тоже n++
Если в конце n == N-1, то return true
 */
public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        if (A.length < 3 || A[1] < A[0]) return false;

        boolean hasChanged = false;

        for (int i = 2; i < A.length; i++) {
            if(A[i] < A[i-1] && !hasChanged) {
                hasChanged = true;

                if (i + 1 < A.length && A[i+1] >= A[i]) {
                    return false;
                }
            } else {
                if(A[i] == A[i-1]) return false;
                if(A[i] < A[i-1] && !hasChanged) return false;
                if(A[i] > A[i-1] && hasChanged) return false;
            }
        }

        return hasChanged;
    }
}
