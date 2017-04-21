package pl.slovvik;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Algorithm {

    private static double TO_GET_MILLISECONDS = 1_000_000;

    protected int[] array;
    double doneTime;

    public Algorithm(int[] array) {
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);
        this.array = copyArray;
    }

    public abstract void sort();

    public void run(Runnable algorithm) {
        long startTime = System.nanoTime();
        algorithm.run();
        long endTime = System.nanoTime();
        doneTime = ((endTime - startTime) / TO_GET_MILLISECONDS);
    }

    public void show() {
        System.out.println();
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void showTimeDone() {
        System.out.format("%nTime needed to sort by %s: %.4f%n", getClass().getSimpleName(), doneTime);
    }

    public int getLength() {
        return array.length;
    }

    public static void show(int[] array) {
        System.out.println();
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int arrayLength, int from, int to) {
        int[] array = new int[arrayLength];
        for (int element = 0; element < array.length; element++) {
            array[element] = ThreadLocalRandom.current().nextInt(from, to);
        }
        return array;
    }

    protected void swap(int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
