package SkienaBook.sorts;

import java.util.Arrays;

public class MergeSort {

    int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public int[] mergeSort() {
        mergeSort(0, array.length - 1);
        return array;
    }

    private void mergeSort(int l, int r) {
        if (l < r) {
            int middle = l + (r - l) / 2;
            mergeSort(l, middle);
            mergeSort(middle + 1, r);
            merge(l, middle, r);
        }
    }

    private void merge(int l, int middle, int r) {
        int[] leftSubArray = new int[middle - l + 1];
        int[] rightSubArray = new int[r - middle];

        for (int i = l, k = 0; i <= middle; i++, k++) {
            leftSubArray[k] = array[i];
        }
        for (int i = middle + 1, k = 0; i <= r; i++, k++) {
            rightSubArray[k] = array[i];
        }

        int i = 0, j = 0, index = l;
        while (i < leftSubArray.length && j < rightSubArray.length) {
            if (Math.min(leftSubArray[i], rightSubArray[j]) == leftSubArray[i]) {
                array[index++] = leftSubArray[i++];
            } else {
                array[index++] = rightSubArray[j++];
            }
        }

        while (i < leftSubArray.length) {
            array[index++] = leftSubArray[i++];
        }
        while (j < rightSubArray.length) {
            array[index++] = rightSubArray[j++];
        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(new int[] {4, 5, 1, 3, 10, 7, 6});
        System.out.println(Arrays.toString(mergeSort.mergeSort()));

        mergeSort = new MergeSort(new int[] {1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(mergeSort.mergeSort()));

        mergeSort = new MergeSort(new int[] {1, 2, 1, 2, 1, 3, 2});
        System.out.println(Arrays.toString(mergeSort.mergeSort()));

        mergeSort = new MergeSort(new int[] {});
        System.out.println(Arrays.toString(mergeSort.mergeSort()));

        mergeSort = new MergeSort(new int[4]);
        System.out.println(Arrays.toString(mergeSort.mergeSort()));
    }
}
