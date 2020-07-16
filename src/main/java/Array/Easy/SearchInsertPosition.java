package Array.Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l0 = 0, r0 = nums.length;

        while (l0 < r0) {
            int middle = l0 + (r0 - l0) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] > target) {
                r0 = middle;
            } else {
                l0 = middle + 1;
            }
        }

        return l0;
    }
}
