package pl.slovvik.algorithms;

import pl.slovvik.algorithm.Algorithm;

public class MergeSort extends Algorithm {

    private int[] workArray;

    public MergeSort(int[] array) {
        super(array);
        this.workArray = copyArray(array);
    }

    @Override
    public void sort() {
        run(() -> mergeSort(0, getLength() - 1));
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            workArray[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (workArray[i] <= workArray[j]) {
                array[k] = workArray[i];
                i++;
            } else {
                array[k] = workArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = workArray[i];
            k++;
            i++;
        }
    }
}
