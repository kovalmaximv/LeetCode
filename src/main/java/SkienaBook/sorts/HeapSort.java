package SkienaBook.HeapSort;

import java.util.Arrays;

public class HeapSort {

    int[] array;
    int n;

    public HeapSort(int[] array) {
        this.array = array;
        this.n = array.length;
    }

    public int[] heapSort() {
        if (n == 0) {
            return array;
        }

        for (int i = n/2; i >= 0; i--) {
            bubbleUp(i);
        }

        while (n > 0) {
            swap(0, --n);
            bubbleUp(0);
        }

        return array;
    }

    private void bubbleUp(int parent) {
        int maxIndex = parent;
        int maxValue = array[parent];
        for (int i = 1; i < 3; i++) {
            int childIndex = parent * 2 + i;
            if (childIndex < n && array[childIndex] > maxValue) {
                maxIndex = childIndex;
                maxValue = array[childIndex];
            }
        }

        if (maxIndex != parent) {
            swap(parent, maxIndex);
            bubbleUp(maxIndex);
        }

    }

    private void swap(int indexParent, int indexChild) {
        int temp = array[indexParent];
        array[indexParent] = array[indexChild];
        array[indexChild] = temp;
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort(new int[] {4, 5, 1, 3, 10, 7, 6});
        System.out.println(Arrays.toString(heapSort.heapSort()));

        heapSort = new HeapSort(new int[] {1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(heapSort.heapSort()));

        heapSort = new HeapSort(new int[] {1, 2, 1, 2, 1, 3, 2});
        System.out.println(Arrays.toString(heapSort.heapSort()));

        heapSort = new HeapSort(new int[] {});
        System.out.println(Arrays.toString(heapSort.heapSort()));

        heapSort = new HeapSort(new int[4]);
        System.out.println(Arrays.toString(heapSort.heapSort()));
    }
}
