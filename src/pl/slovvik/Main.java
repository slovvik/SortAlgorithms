package pl.slovvik;

import pl.slovvik.algorithms.*;

import static pl.slovvik.algorithm.Algorithm.createArray;

public class Main {

    public static void main(String[] args) {
        int[] array = createArray(1_000_00, 0, 100);
//        show(array);

        System.out.println("\nWait, I am sorting...");

        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
//        bubbleSort.show();
        bubbleSort.showDoneTime();
        bubbleSort.isSorted();

        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.sort();
//        selectionSort.show();
        selectionSort.showDoneTime();
        selectionSort.isSorted();

        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.sort();
//        insertionSort.show();
        insertionSort.showDoneTime();
        insertionSort.isSorted();

        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort();
//        mergeSort.show();
        mergeSort.showDoneTime();
        mergeSort.isSorted();

        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
//        quickSort.show();
        quickSort.showDoneTime();
        quickSort.isSorted();

        HeapSort heapSort = new HeapSort(array);
        heapSort.sort();
//        heapSort.show();
        heapSort.showDoneTime();
        heapSort.isSorted();
    }
}
