package fun_algorithms;

public class FunAlgorithmMain {

    public static void main(String[] args) {

        int [] numberArray;

        // BubbleSort
        numberArray = new int[]{30, 25, 40, 35, 20};
        BubbleSort.sort(numberArray);
        print(numberArray);

        // InsertionSort
        numberArray = new int[]{7, 3, 10, 2, 5};
        InsertionSort.sort(numberArray);
        print(numberArray);

        // SelectionSort
        numberArray = new int[]{4, 5, 1, 2, 3};
        SelectionSort.sort(numberArray);
        print(numberArray);

        // BinarySearch
        numberArray = new int[]{1, 4, 5, 7, 14, 21,  28, 44, 51};
        int target = 28;
        int indexOfTarget = BinarySearch.search(numberArray, target);
        System.out.println(target + " hat den Index: " + indexOfTarget);





    }
    private static void print(int[] sortedList) {
        for (int i : sortedList) {
            System.out.print(i + " ");
        }
        System.out.println("\n*******************************");
    }

}
