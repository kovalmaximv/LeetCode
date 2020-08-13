package SkienaBook.sorts;

import java.util.Arrays;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }
    
    public int[] sort() {
        quicksort(0, array.length - 1);
        return array;
    }

    private void quicksort(int left, int right) {
        if (left < right) {
            int p = partition(left, right);
            quicksort(left, p - 1);
            quicksort(p + 1, right);
        }
    }

    private int partition(int left, int right) {
        int p = right; // Индекс опорной точки
        int firstHigh = left; // Индекс с которого начинается элементы больше опорного
        for (int i = left; i < right; i++) {
            if (array[i] < array[p]) {
                swap(i, firstHigh);
                firstHigh++;
            }
        }

        swap(firstHigh, p);
        return firstHigh;
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(new int[] {4, 5, 1, 3, 10, 7, 6});
        System.out.println(Arrays.toString(quickSort.sort()));

        quickSort = new QuickSort(new int[] {1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(quickSort.sort()));

        quickSort = new QuickSort(new int[] {1, 2, 1, 2, 1, 3, 2});
        System.out.println(Arrays.toString(quickSort.sort()));

        quickSort = new QuickSort(new int[] {});
        System.out.println(Arrays.toString(quickSort.sort()));

        quickSort = new QuickSort(new int[4]);
        System.out.println(Arrays.toString(quickSort.sort()));
    }
}
