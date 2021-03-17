package ExPackageFeb3;

import java.util.Arrays;

public class PracticeAlgorithms3 {
    public static void main(String[] args) {
        int[] array = new int[300_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
       // System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        ISort(array);
        System.out.println(System.currentTimeMillis() - time);


    }

    private static void ISort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
    }
}

