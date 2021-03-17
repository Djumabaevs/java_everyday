package ExPackageFeb3;

import java.util.Arrays;

public class PracticeAlgorithms2 {
    public static void main(String[] args) {

        int[] array = new int[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        SSort(array);
        System.out.println(System.currentTimeMillis() - time);
    }
    private static void SSort(int[] a){
        for (int lastUnsortedIndex = a.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 0; i <= lastUnsortedIndex; i++){
                if(a[i] > a[largest]){
                    largest = i;
                }
            }
            swap(a,largest,lastUnsortedIndex);
        }
    }
    public static void swap(int[] a, int i, int j){
        if(i == j){
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
