package LeetCode.Array.Easy;

public class TwoSumIIInputArraySorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = binarySearch(numbers, target - numbers[i]);
            if (j != -1 && j != i) {
                return new int[] {Math.min(i,j) + 1, Math.max(i,j) + 1};
            }
        }

        return null;
    }

    private int binarySearch(int[] arr, int num) {
        int l0 = 0, r0 = arr.length - 1;
        int mid;

        while (l0 <= r0) {
            mid = l0 + (r0 - l0) / 2;
            if (arr[mid] < num) {
                l0 = mid + 1;
            } else if (arr[mid] > num) {
                r0 = mid - 1;
            } else {
                return mid;
            }
        }

        return l0;
    }
}
