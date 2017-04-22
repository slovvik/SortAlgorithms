package pl.slovvik.algorithms;

import pl.slovvik.algorithm.Algorithm;

public class BubbleSort extends Algorithm {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        run(() -> {
            for (int out = getLength() - 1; out > 1; out--) {
                for (int in = 0; in < out; in++) {
                    if ( array[in] > array[in + 1])
                        swap(in, in + 1);
                }
            }
        });
    }


}
