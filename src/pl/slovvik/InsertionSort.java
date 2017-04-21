package pl.slovvik;

public class InsertionSort extends Algorithm {

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        run(() -> {
            for (int out = 1; out < getLength(); out++) {
                int moved = array[out];
                int in = out;
                while (in > 0 && array[in - 1] >= moved) {
                    array[in] = array[in - 1];
                    in--;
                }
                array[in] = moved;
            }
        });
    }
}
