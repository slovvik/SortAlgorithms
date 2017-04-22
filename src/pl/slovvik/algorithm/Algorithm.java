package pl.slovvik.algorithm;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Algorithm {

    private static double TO_GET_MILLISECONDS = 1_000_000;

    protected int[] array;
    double doneTime;

    public abstract void sort();

    public Algorithm(int[] array) {
        this.array = copyArray(array);
    }

    public static void show(int[] array) {
        System.out.println("\n" + Arrays.toString(array));
    }

    public static int[] createArray(int arrayLength, int from, int to) {
        int[] array = new int[arrayLength];
        for (int element = 0; element < array.length; element++) {
            array[element] = ThreadLocalRandom.current().nextInt(from, to);
        }
        return array;
    }

    public void show() {
        System.out.println("\n" + Arrays.toString(array));
    }

    public void isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("\nArray is NOT sorted correctly");
                return;
            }
        }
        System.out.println("\nArray is sorted correctly.");
    }

    public void showDoneTime() {
        System.out.format("%nTime needed to sort by %s: %.4f milliseconds.", getClass().getSimpleName(), doneTime);
    }

    protected void run(Runnable algorithm) {
        long startTime = System.nanoTime();
        algorithm.run();
        long endTime = System.nanoTime();
        doneTime = ((endTime - startTime) / TO_GET_MILLISECONDS);
    }

    protected int getLength() {
        return array.length;
    }

    protected void swap(int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    protected int[] copyArray(int[] source) {
        int[] copiedArray = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            copiedArray[i] = source[i];
        }
        return copiedArray;
    }
}
