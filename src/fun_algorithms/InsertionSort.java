package fun_algorithms;

public class InsertionSort {

    public static void sort(int[] numbersArray){
        for (int i = 1; i < numbersArray.length; i++){
            int currentValue = numbersArray[i];
            int pointer = i-1;
            while (pointer >= 0 &&


                // Solange
                numbersArray[pointer] > currentValue ){

                numbersArray[pointer + 1] = numbersArray[pointer];
                pointer--;

            }
            numbersArray[pointer+1] = currentValue;
        }

    }
}
