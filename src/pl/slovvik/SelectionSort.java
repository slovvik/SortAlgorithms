package pl.slovvik;

public class SelectionSort extends Algorithm {

    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        run(() -> {
            for (int out = 0; out < getLength() - 1; out++) {
                int min = out;
                for (int in = out + 1; in < getLength(); in++) {
                    if (array[in] < array[min])
                        min = in;
                    swap(out, min);
                }
            }
        });
    }
}
