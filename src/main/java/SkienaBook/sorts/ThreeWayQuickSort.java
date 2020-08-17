package SkienaBook.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeWayQuickSort {
    private int[] array;
    private int leftSubArray;
    private int rightSubArray;

    public ThreeWayQuickSort(int[] array) {
        this.array = array;
        leftSubArray = -1;
        rightSubArray = -1;
    }

    public int[] sort() {
        System.out.println(Arrays.toString(array));
        quickSort(0, array.length - 1);
        return array;
    }

    private void quickSort(int left, int right) {
        if (left < right) {
            partition(left, right);
            System.out.println(Arrays.toString(array));
            quickSort(left, leftSubArray - 1);
            quickSort(rightSubArray + 1, right);
        }
    }

    private void partition(int left, int right) {
        int pivot = array[right];
        System.out.println("pivot: " + pivot);
        int lowerIndex = left, groundIndex = right;
        int i = left;
        while (i <= groundIndex) {
            if (array[i] < pivot) {
                swap(i, lowerIndex);
                i++;
                lowerIndex++;
            } else if (array[i] > pivot) {
                swap(i, groundIndex);
                groundIndex--;
            } else {
                i++;
            }
        }
        leftSubArray = lowerIndex;
        rightSubArray = groundIndex - 1;
    }

    private void swap(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        ThreeWayQuickSort quickSort = new ThreeWayQuickSort(list.stream().mapToInt(x->x).toArray());
        System.out.println(Arrays.toString(quickSort.sort()));

        //quickSort = new ThreeWayQuickSort(new int[] {4, 5, 1, 3, 10, 7, 6});
        //System.out.println(Arrays.toString(quickSort.sort()));
    }
}
