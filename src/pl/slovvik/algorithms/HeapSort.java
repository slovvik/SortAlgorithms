package pl.slovvik.algorithms;

import pl.slovvik.algorithm.Algorithm;

public class HeapSort extends Algorithm {

    private int elements;

    public HeapSort(int[] array) {
        super(array);
        elements = array.length - 1;
    }

    @Override
    public void sort() {
        run(() -> {
            buildHeap();
            for (int i = elements; i > 0; i--) {
                swap(0, i);
                elements = elements - 1;
                maxHeap(array, 0);
            }
        });
    }

    private void buildHeap() {
        for (int i = elements / 2; i >= 0; i--) {
            maxHeap(array, i);
        }
    }

    private void maxHeap(int[] array, int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int largest = i;
        if ((left <= elements) && (array[left] > array[i]))
            largest = left;
        if ((right <= elements) && (array[right] > array[largest]))
            largest = right;
        if (largest != i) {
            swap(i, largest);
            maxHeap(array, largest);
        }
    }
}
