package pl.slovvik.algorithms;

import pl.slovvik.algorithm.Algorithm;

public class QuickSort extends Algorithm {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        run(() -> quickSort(0, getLength() - 1));
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[(low + high) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }
}
