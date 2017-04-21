package pl.slovvik;

import static pl.slovvik.Algorithm.createArray;
import static pl.slovvik.Algorithm.show;

public class Main {

    public static void main(String[] args) {
        int[] array = createArray(1_000, 0, 100);
//        show(array);
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
//        bubbleSort.show();
        bubbleSort.showTimeDone();

        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.sort();
//        selectionSort.show();
        selectionSort.showTimeDone();

        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.sort();
//        insertionSort.show();
        insertionSort.showTimeDone();



    }
}
