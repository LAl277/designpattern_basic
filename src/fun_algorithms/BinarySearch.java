package fun_algorithms;

public class BinarySearch {

    public static int search(int[] array, int gesucht) {
        int links = 0;
        int rechts = array.length - 1;

        while (links <= rechts) {
            int mitte = (links + rechts) / 2;

            if (array[mitte] == gesucht) {
                return mitte;
            }
            if (array[mitte] < gesucht) {
                links = mitte + 1; // Rechts weitersuchen
            } else {
                rechts = mitte - 1; // Links weitersuchen
            }
        }
        return -1; //
    }
}
