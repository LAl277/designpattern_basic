package fun_algorithms;

public class SelectionSort {

    public static void sort(int[] unsorted) {

        for (int i = 0; i < unsorted.length - 1; i++) {
            int mitValue = unsorted[i];
            int minIndex = i;
            for (int j = i+1; j < unsorted.length; j++) {
                if (mitValue > unsorted[j]) {
                    mitValue = unsorted[j];
                    minIndex = j;
                }
            }

            unsorted[minIndex] = unsorted[i];
            unsorted[i] = mitValue;
        }
    }
}
