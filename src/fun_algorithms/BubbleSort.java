package fun_algorithms;

public class BubbleSort {

    public static void sort(int[] unsorted){
        int temp = 0;
        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < unsorted.length - i - 1; j++) {

                if (unsorted[j] > unsorted[j + 1]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
    }
}
